package typings.sqlFormatter

import typings.sqlFormatter.libSrcFormatOptionsMod.CommaPosition
import typings.sqlFormatter.libSrcFormatOptionsMod.IndentStyle
import typings.sqlFormatter.libSrcFormatOptionsMod.KeywordCase
import typings.sqlFormatter.libSrcFormatOptionsMod.LogicalOperatorNewline
import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.PlainQuoteType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlFormatterStrings {
  
  @js.native
  sealed trait $ extends StObject
  inline def $: $ = "$".asInstanceOf[$]
  
  @js.native
  sealed trait `@` extends StObject
  inline def `@`: `@` = "@".asInstanceOf[`@`]
  
  @js.native
  sealed trait `ApostropheApostrophe-bs`
    extends StObject
       with PlainQuoteType
  inline def `ApostropheApostrophe-bs`: `ApostropheApostrophe-bs` = "''-bs".asInstanceOf[`ApostropheApostrophe-bs`]
  
  @js.native
  sealed trait `ApostropheApostrophe-qq`
    extends StObject
       with PlainQuoteType
  inline def `ApostropheApostrophe-qq`: `ApostropheApostrophe-qq` = "''-qq".asInstanceOf[`ApostropheApostrophe-qq`]
  
  @js.native
  sealed trait `ApostropheApostrophe-qq-bs`
    extends StObject
       with PlainQuoteType
  inline def `ApostropheApostrophe-qq-bs`: `ApostropheApostrophe-qq-bs` = "''-qq-bs".asInstanceOf[`ApostropheApostrophe-qq-bs`]
  
  @js.native
  sealed trait `ApostropheApostrophe-raw`
    extends StObject
       with PlainQuoteType
  inline def `ApostropheApostrophe-raw`: `ApostropheApostrophe-raw` = "''-raw".asInstanceOf[`ApostropheApostrophe-raw`]
  
  @js.native
  sealed trait ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe
    extends StObject
       with PlainQuoteType
  inline def ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe: ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe = "'''..'''".asInstanceOf[ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe]
  
  @js.native
  sealed trait Colon extends StObject
  inline def Colon: Colon = ":".asInstanceOf[Colon]
  
  @js.native
  sealed trait DollarDollar
    extends StObject
       with PlainQuoteType
  inline def DollarDollar: DollarDollar = "$$".asInstanceOf[DollarDollar]
  
  @js.native
  sealed trait GraveaccentGraveaccent
    extends StObject
       with PlainQuoteType
  inline def GraveaccentGraveaccent: GraveaccentGraveaccent = "``".asInstanceOf[GraveaccentGraveaccent]
  
  @js.native
  sealed trait LeftcurlybracketRightcurlybracket
    extends StObject
       with PlainQuoteType
  inline def LeftcurlybracketRightcurlybracket: LeftcurlybracketRightcurlybracket = "{}".asInstanceOf[LeftcurlybracketRightcurlybracket]
  
  @js.native
  sealed trait Questionmark extends StObject
  inline def Questionmark: Questionmark = "?".asInstanceOf[Questionmark]
  
  @js.native
  sealed trait `QuotationmarkQuotationmark-bs`
    extends StObject
       with PlainQuoteType
  inline def `QuotationmarkQuotationmark-bs`: `QuotationmarkQuotationmark-bs` = "\"\"-bs".asInstanceOf[`QuotationmarkQuotationmark-bs`]
  
  @js.native
  sealed trait `QuotationmarkQuotationmark-qq`
    extends StObject
       with PlainQuoteType
  inline def `QuotationmarkQuotationmark-qq`: `QuotationmarkQuotationmark-qq` = "\"\"-qq".asInstanceOf[`QuotationmarkQuotationmark-qq`]
  
  @js.native
  sealed trait `QuotationmarkQuotationmark-qq-bs`
    extends StObject
       with PlainQuoteType
  inline def `QuotationmarkQuotationmark-qq-bs`: `QuotationmarkQuotationmark-qq-bs` = "\"\"-qq-bs".asInstanceOf[`QuotationmarkQuotationmark-qq-bs`]
  
  @js.native
  sealed trait `QuotationmarkQuotationmark-raw`
    extends StObject
       with PlainQuoteType
  inline def `QuotationmarkQuotationmark-raw`: `QuotationmarkQuotationmark-raw` = "\"\"-raw".asInstanceOf[`QuotationmarkQuotationmark-raw`]
  
  @js.native
  sealed trait QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark
    extends StObject
       with PlainQuoteType
  inline def QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark: QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark = "\"\"\"..\"\"\"".asInstanceOf[QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark]
  
  @js.native
  sealed trait `[]`
    extends StObject
       with PlainQuoteType
  inline def `[]`: `[]` = "[]".asInstanceOf[`[]`]
  
  @js.native
  sealed trait after
    extends StObject
       with CommaPosition
       with LogicalOperatorNewline
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait before
    extends StObject
       with CommaPosition
       with LogicalOperatorNewline
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait lower
    extends StObject
       with KeywordCase
  inline def lower: lower = "lower".asInstanceOf[lower]
  
  @js.native
  sealed trait open extends StObject
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait preserve
    extends StObject
       with KeywordCase
  inline def preserve: preserve = "preserve".asInstanceOf[preserve]
  
  @js.native
  sealed trait qApostropheApostrophe
    extends StObject
       with PlainQuoteType
  inline def qApostropheApostrophe: qApostropheApostrophe = "q''".asInstanceOf[qApostropheApostrophe]
  
  @js.native
  sealed trait standard
    extends StObject
       with IndentStyle
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait tabular
    extends StObject
       with CommaPosition
  inline def tabular: tabular = "tabular".asInstanceOf[tabular]
  
  @js.native
  sealed trait tabularLeft
    extends StObject
       with IndentStyle
  inline def tabularLeft: tabularLeft = "tabularLeft".asInstanceOf[tabularLeft]
  
  @js.native
  sealed trait tabularRight
    extends StObject
       with IndentStyle
  inline def tabularRight: tabularRight = "tabularRight".asInstanceOf[tabularRight]
  
  @js.native
  sealed trait upper
    extends StObject
       with KeywordCase
  inline def upper: upper = "upper".asInstanceOf[upper]
}
