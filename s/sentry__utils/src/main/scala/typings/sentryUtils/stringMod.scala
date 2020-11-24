package typings.sentryUtils

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  
  def isMatchingPattern(value: String, pattern: String): Boolean = js.native
  def isMatchingPattern(value: String, pattern: RegExp): Boolean = js.native
  
  def safeJoin(input: js.Array[_]): String = js.native
  def safeJoin(input: js.Array[_], delimiter: String): String = js.native
  
  def snipLine(line: String, colno: Double): String = js.native
  
  def truncate(str: String): String = js.native
  def truncate(str: String, max: Double): String = js.native
}
