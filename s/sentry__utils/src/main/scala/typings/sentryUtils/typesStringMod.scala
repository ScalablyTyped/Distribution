package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStringMod {
  
  @JSImport("@sentry/utils/types/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeStringForRegex(regexString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeStringForRegex")(regexString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isMatchingPattern(value: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingPattern(value: String, pattern: String, requireExactStringMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], requireExactStringMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingPattern(value: String, pattern: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingPattern(value: String, pattern: js.RegExp, requireExactStringMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], requireExactStringMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def safeJoin(input: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeJoin")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def safeJoin(input: js.Array[Any], delimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeJoin")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def snipLine(line: String, colno: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("snipLine")(line.asInstanceOf[js.Any], colno.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringMatchesSomePattern(testString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatchesSomePattern")(testString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def stringMatchesSomePattern(testString: String, patterns: js.Array[String | js.RegExp]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringMatchesSomePattern")(testString.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def stringMatchesSomePattern(testString: String, patterns: js.Array[String | js.RegExp], requireExactStringMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringMatchesSomePattern")(testString.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], requireExactStringMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def stringMatchesSomePattern(testString: String, patterns: Unit, requireExactStringMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringMatchesSomePattern")(testString.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], requireExactStringMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def truncate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def truncate(str: String, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
}
