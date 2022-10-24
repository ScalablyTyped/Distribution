package typings.sqlFormatter

import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.IdentChars
import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.QuoteType
import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.VariableType
import typings.sqlFormatter.sqlFormatterStrings.LeftcurlybracketRightcurlybracket
import typings.sqlFormatter.sqlFormatterStrings.`[]`
import typings.sqlFormatter.sqlFormatterStrings.close
import typings.sqlFormatter.sqlFormatterStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcLexerRegexFactoryMod {
  
  @JSImport("sql-formatter/lib/src/lexer/regexFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def identifier(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("identifier")().asInstanceOf[js.RegExp]
  inline def identifier(specialChars: IdentChars): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(specialChars.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def identifierPattern(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("identifierPattern")().asInstanceOf[String]
  inline def identifierPattern(param0: IdentChars): String = ^.asInstanceOf[js.Dynamic].applyDynamic("identifierPattern")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lineComment(lineCommentTypes: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("lineComment")(lineCommentTypes.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def operator(operators: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("operator")(operators.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def parameter(paramTypes: js.Array[String], pattern: String): js.UndefOr[js.RegExp] = (^.asInstanceOf[js.Dynamic].applyDynamic("parameter")(paramTypes.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.RegExp]]
  
  inline def parenthesis(kind: open | close): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("parenthesis")(kind.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def parenthesis(kind: open | close, extraParens: js.Array[`[]` | LeftcurlybracketRightcurlybracket]): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("parenthesis")(kind.asInstanceOf[js.Any], extraParens.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  object quotePatterns {
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.$$")
    @js.native
    def $: String = js.native
    
    inline def $_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.'''..'''")
    @js.native
    def Apostrophe: String = js.native
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.''-bs")
    @js.native
    def ApostropheBs: String = js.native
    
    inline def ApostropheBs_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("''-bs")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.''-qq")
    @js.native
    def ApostropheQq: String = js.native
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.''-qq-bs")
    @js.native
    def ApostropheQqBs: String = js.native
    
    inline def ApostropheQqBs_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("''-qq-bs")(x.asInstanceOf[js.Any])
    
    inline def ApostropheQq_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("''-qq")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.''-raw")
    @js.native
    def ApostropheRaw: String = js.native
    
    inline def ApostropheRaw_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("''-raw")(x.asInstanceOf[js.Any])
    
    inline def Apostrophe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("'''..'''")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.``")
    @js.native
    def Graveaccent: String = js.native
    
    inline def Graveaccent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("``")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.{}")
    @js.native
    def Leftcurlybracket: String = js.native
    
    inline def Leftcurlybracket_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("{}")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.[]")
    @js.native
    val `[`: String = js.native
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.\"\"\"..\"\"\"")
    @js.native
    def _empty: String = js.native
    
    inline def _empty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\"\"\"..\"\"\"")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.\"\"-bs")
    @js.native
    def bs: String = js.native
    
    inline def bs_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\"\"-bs")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.q''")
    @js.native
    def q: String = js.native
    
    inline def q_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q''")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.\"\"-qq")
    @js.native
    def qq: String = js.native
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.\"\"-qq-bs")
    @js.native
    def qqBs: String = js.native
    
    inline def qqBs_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\"\"-qq-bs")(x.asInstanceOf[js.Any])
    
    inline def qq_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\"\"-qq")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-formatter/lib/src/lexer/regexFactory", "quotePatterns.\"\"-raw")
    @js.native
    def raw: String = js.native
    
    inline def raw_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\"\"-raw")(x.asInstanceOf[js.Any])
  }
  
  inline def reservedWord(reservedKeywords: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("reservedWord")(reservedKeywords.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def reservedWord(reservedKeywords: js.Array[String], identChars: IdentChars): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("reservedWord")(reservedKeywords.asInstanceOf[js.Any], identChars.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  inline def string(quoteTypes: js.Array[QuoteType]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(quoteTypes.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def stringPattern(quoteTypes: js.Array[QuoteType]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringPattern")(quoteTypes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def variable(varTypes: js.Array[VariableType]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(varTypes.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
}
