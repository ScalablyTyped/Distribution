package typings.sentryUtils

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("@sentry/utils/dist/string", "isMatchingPattern")
  @js.native
  def isMatchingPattern(value: String, pattern: String): Boolean = js.native
  @JSImport("@sentry/utils/dist/string", "isMatchingPattern")
  @js.native
  def isMatchingPattern(value: String, pattern: RegExp): Boolean = js.native
  
  @JSImport("@sentry/utils/dist/string", "safeJoin")
  @js.native
  def safeJoin(input: js.Array[_]): String = js.native
  @JSImport("@sentry/utils/dist/string", "safeJoin")
  @js.native
  def safeJoin(input: js.Array[_], delimiter: String): String = js.native
  
  @JSImport("@sentry/utils/dist/string", "snipLine")
  @js.native
  def snipLine(line: String, colno: Double): String = js.native
  
  @JSImport("@sentry/utils/dist/string", "truncate")
  @js.native
  def truncate(str: String): String = js.native
  @JSImport("@sentry/utils/dist/string", "truncate")
  @js.native
  def truncate(str: String, max: Double): String = js.native
}
