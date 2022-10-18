package typings.sqlFormatter

import org.scalablytyped.runtime.Instantiable1
import typings.sqlFormatter.libSrcFormatOptionsMod.CommaPosition
import typings.sqlFormatter.libSrcFormatOptionsMod.FormatOptions
import typings.sqlFormatter.libSrcFormatOptionsMod.IndentStyle
import typings.sqlFormatter.libSrcFormatOptionsMod.KeywordCase
import typings.sqlFormatter.libSrcFormatOptionsMod.LogicalOperatorNewline
import typings.sqlFormatter.libSrcFormatterFormatterMod.default
import typings.sqlFormatter.libSrcFormatterParamsMod.ParamItems
import typings.sqlFormatter.libSrcLexerTokenMod.TokenType
import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.ParamTypes
import typings.sqlFormatter.libSrcParserGrammarMod._NearleySymbol
import typings.sqlFormatter.libSrcSqlFormatterMod.SqlLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bigquery extends StObject
  
  trait Key extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object Key {
    
    inline def apply(text: String): Key = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Literal
    extends StObject
       with _NearleySymbol {
    
    var literal: Any
  }
  object Literal {
    
    inline def apply(literal: Any): Literal = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
    
    extension [Self <: Literal](x: Self) {
      
      inline def setLiteral(value: Any): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<sql-formatter.sql-formatter/lib/src/FormatOptions.FormatOptions> */
  trait PartialFormatOptions extends StObject {
    
    var commaPosition: js.UndefOr[CommaPosition] = js.undefined
    
    var denseOperators: js.UndefOr[Boolean] = js.undefined
    
    var expressionWidth: js.UndefOr[Double] = js.undefined
    
    var indentStyle: js.UndefOr[IndentStyle] = js.undefined
    
    var keywordCase: js.UndefOr[KeywordCase] = js.undefined
    
    var language: js.UndefOr[SqlLanguage | (Instantiable1[/* cfg */ FormatOptions, default])] = js.undefined
    
    var linesBetweenQueries: js.UndefOr[Double] = js.undefined
    
    var logicalOperatorNewline: js.UndefOr[LogicalOperatorNewline] = js.undefined
    
    var newlineBeforeSemicolon: js.UndefOr[Boolean] = js.undefined
    
    var paramTypes: js.UndefOr[ParamTypes] = js.undefined
    
    var params: js.UndefOr[ParamItems | js.Array[String]] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    var tabulateAlias: js.UndefOr[Boolean] = js.undefined
    
    var useTabs: js.UndefOr[Boolean] = js.undefined
  }
  object PartialFormatOptions {
    
    inline def apply(): PartialFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFormatOptions]
    }
    
    extension [Self <: PartialFormatOptions](x: Self) {
      
      inline def setCommaPosition(value: CommaPosition): Self = StObject.set(x, "commaPosition", value.asInstanceOf[js.Any])
      
      inline def setCommaPositionUndefined: Self = StObject.set(x, "commaPosition", js.undefined)
      
      inline def setDenseOperators(value: Boolean): Self = StObject.set(x, "denseOperators", value.asInstanceOf[js.Any])
      
      inline def setDenseOperatorsUndefined: Self = StObject.set(x, "denseOperators", js.undefined)
      
      inline def setExpressionWidth(value: Double): Self = StObject.set(x, "expressionWidth", value.asInstanceOf[js.Any])
      
      inline def setExpressionWidthUndefined: Self = StObject.set(x, "expressionWidth", js.undefined)
      
      inline def setIndentStyle(value: IndentStyle): Self = StObject.set(x, "indentStyle", value.asInstanceOf[js.Any])
      
      inline def setIndentStyleUndefined: Self = StObject.set(x, "indentStyle", js.undefined)
      
      inline def setKeywordCase(value: KeywordCase): Self = StObject.set(x, "keywordCase", value.asInstanceOf[js.Any])
      
      inline def setKeywordCaseUndefined: Self = StObject.set(x, "keywordCase", js.undefined)
      
      inline def setLanguage(value: SqlLanguage | (Instantiable1[/* cfg */ FormatOptions, default])): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLinesBetweenQueries(value: Double): Self = StObject.set(x, "linesBetweenQueries", value.asInstanceOf[js.Any])
      
      inline def setLinesBetweenQueriesUndefined: Self = StObject.set(x, "linesBetweenQueries", js.undefined)
      
      inline def setLogicalOperatorNewline(value: LogicalOperatorNewline): Self = StObject.set(x, "logicalOperatorNewline", value.asInstanceOf[js.Any])
      
      inline def setLogicalOperatorNewlineUndefined: Self = StObject.set(x, "logicalOperatorNewline", js.undefined)
      
      inline def setNewlineBeforeSemicolon(value: Boolean): Self = StObject.set(x, "newlineBeforeSemicolon", value.asInstanceOf[js.Any])
      
      inline def setNewlineBeforeSemicolonUndefined: Self = StObject.set(x, "newlineBeforeSemicolon", js.undefined)
      
      inline def setParamTypes(value: ParamTypes): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
      
      inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
      
      inline def setParams(value: ParamItems | js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setTabulateAlias(value: Boolean): Self = StObject.set(x, "tabulateAlias", value.asInstanceOf[js.Any])
      
      inline def setTabulateAliasUndefined: Self = StObject.set(x, "tabulateAlias", js.undefined)
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
    }
  }
  
  trait Raw extends StObject {
    
    var raw: String
    
    var start: Double
    
    var text: String
    
    var `type`: TokenType
  }
  object Raw {
    
    inline def apply(raw: String, start: Double, text: String, `type`: TokenType): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    extension [Self <: Raw](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Test
    extends StObject
       with _NearleySymbol {
    
    def test(token: Any): Boolean
  }
  object Test {
    
    inline def apply(test: Any => Boolean): Test = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[Test]
    }
    
    extension [Self <: Test](x: Self) {
      
      inline def setTest(value: Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  trait Text extends StObject {
    
    var text: String
    
    var `type`: TokenType
  }
  object Text {
    
    inline def apply(text: String, `type`: TokenType): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("''-bs")
    var `ApostropheApostrophe-bs`: String
    
    @JSName("''-qq")
    var `ApostropheApostrophe-qq`: String
    
    @JSName("''-qq-bs")
    var `ApostropheApostrophe-qq-bs`: String
    
    @JSName("''-raw")
    var `ApostropheApostrophe-raw`: String
    
    @JSName("'''..'''")
    var ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe: String
    
    @JSName("$$")
    var DollarDollar: String
    
    @JSName("``")
    var GraveaccentGraveaccent: String
    
    @JSName("{}")
    var LeftcurlybracketRightcurlybracket: String
    
    @JSName("\"\"-bs")
    var `QuotationmarkQuotationmark-bs`: String
    
    @JSName("\"\"-qq")
    var `QuotationmarkQuotationmark-qq`: String
    
    @JSName("\"\"-qq-bs")
    var `QuotationmarkQuotationmark-qq-bs`: String
    
    @JSName("\"\"-raw")
    var `QuotationmarkQuotationmark-raw`: String
    
    @JSName("\"\"\"..\"\"\"")
    var QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark: String
    
    var `[]`: String
    
    @JSName("q''")
    var qApostropheApostrophe: String
  }
  object _empty {
    
    inline def apply(
      `ApostropheApostrophe-bs`: String,
      `ApostropheApostrophe-qq`: String,
      `ApostropheApostrophe-qq-bs`: String,
      `ApostropheApostrophe-raw`: String,
      ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe: String,
      DollarDollar: String,
      GraveaccentGraveaccent: String,
      LeftcurlybracketRightcurlybracket: String,
      `QuotationmarkQuotationmark-bs`: String,
      `QuotationmarkQuotationmark-qq`: String,
      `QuotationmarkQuotationmark-qq-bs`: String,
      `QuotationmarkQuotationmark-raw`: String,
      QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark: String,
      `[]`: String,
      qApostropheApostrophe: String
    ): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("''-bs")(`ApostropheApostrophe-bs`.asInstanceOf[js.Any])
      __obj.updateDynamic("''-qq")(`ApostropheApostrophe-qq`.asInstanceOf[js.Any])
      __obj.updateDynamic("''-qq-bs")(`ApostropheApostrophe-qq-bs`.asInstanceOf[js.Any])
      __obj.updateDynamic("''-raw")(`ApostropheApostrophe-raw`.asInstanceOf[js.Any])
      __obj.updateDynamic("'''..'''")(ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe.asInstanceOf[js.Any])
      __obj.updateDynamic("$$")(DollarDollar.asInstanceOf[js.Any])
      __obj.updateDynamic("``")(GraveaccentGraveaccent.asInstanceOf[js.Any])
      __obj.updateDynamic("{}")(LeftcurlybracketRightcurlybracket.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"-bs")(`QuotationmarkQuotationmark-bs`.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"-qq")(`QuotationmarkQuotationmark-qq`.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"-qq-bs")(`QuotationmarkQuotationmark-qq-bs`.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"-raw")(`QuotationmarkQuotationmark-raw`.asInstanceOf[js.Any])
      __obj.updateDynamic("\"\"\"..\"\"\"")(QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark.asInstanceOf[js.Any])
      __obj.updateDynamic("[]")(`[]`.asInstanceOf[js.Any])
      __obj.updateDynamic("q''")(qApostropheApostrophe.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def `setApostropheApostrophe-bs`(value: String): Self = StObject.set(x, "''-bs", value.asInstanceOf[js.Any])
      
      inline def `setApostropheApostrophe-qq`(value: String): Self = StObject.set(x, "''-qq", value.asInstanceOf[js.Any])
      
      inline def `setApostropheApostrophe-qq-bs`(value: String): Self = StObject.set(x, "''-qq-bs", value.asInstanceOf[js.Any])
      
      inline def `setApostropheApostrophe-raw`(value: String): Self = StObject.set(x, "''-raw", value.asInstanceOf[js.Any])
      
      inline def setApostropheApostropheApostropheDotDotApostropheApostropheApostrophe(value: String): Self = StObject.set(x, "'''..'''", value.asInstanceOf[js.Any])
      
      inline def setDollarDollar(value: String): Self = StObject.set(x, "$$", value.asInstanceOf[js.Any])
      
      inline def setGraveaccentGraveaccent(value: String): Self = StObject.set(x, "``", value.asInstanceOf[js.Any])
      
      inline def setLeftcurlybracketRightcurlybracket(value: String): Self = StObject.set(x, "{}", value.asInstanceOf[js.Any])
      
      inline def setQApostropheApostrophe(value: String): Self = StObject.set(x, "q''", value.asInstanceOf[js.Any])
      
      inline def `setQuotationmarkQuotationmark-bs`(value: String): Self = StObject.set(x, "\"\"-bs", value.asInstanceOf[js.Any])
      
      inline def `setQuotationmarkQuotationmark-qq`(value: String): Self = StObject.set(x, "\"\"-qq", value.asInstanceOf[js.Any])
      
      inline def `setQuotationmarkQuotationmark-qq-bs`(value: String): Self = StObject.set(x, "\"\"-qq-bs", value.asInstanceOf[js.Any])
      
      inline def `setQuotationmarkQuotationmark-raw`(value: String): Self = StObject.set(x, "\"\"-raw", value.asInstanceOf[js.Any])
      
      inline def setQuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark(value: String): Self = StObject.set(x, "\"\"\"..\"\"\"", value.asInstanceOf[js.Any])
      
      inline def `set[]`(value: String): Self = StObject.set(x, "[]", value.asInstanceOf[js.Any])
    }
  }
}
