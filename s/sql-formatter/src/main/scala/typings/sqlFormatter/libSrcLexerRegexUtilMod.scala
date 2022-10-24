package typings.sqlFormatter

import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.PrefixedQuoteType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcLexerRegexUtilMod {
  
  @JSImport("sql-formatter/lib/src/lexer/regexUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sql-formatter/lib/src/lexer/regexUtil", "WHITESPACE_REGEX")
  @js.native
  val WHITESPACE_REGEX: js.RegExp = js.native
  
  inline def escapeRegExp(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegExp")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def patternToRegex(pattern: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("patternToRegex")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def prefixesPattern(param0: PrefixedQuoteType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixesPattern")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toCaseInsensitivePattern(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCaseInsensitivePattern")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def withDashes(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withDashes")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
}
