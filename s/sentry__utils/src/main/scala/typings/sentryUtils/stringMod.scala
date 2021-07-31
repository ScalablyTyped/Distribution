package typings.sentryUtils

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("@sentry/utils/dist/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isMatchingPattern(value: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isMatchingPattern(value: String, pattern: RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def safeJoin(input: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeJoin")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def safeJoin(input: js.Array[js.Any], delimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeJoin")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def snipLine(line: String, colno: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("snipLine")(line.asInstanceOf[js.Any], colno.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def truncate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def truncate(str: String, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
}
