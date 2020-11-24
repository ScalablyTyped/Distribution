package typings.safeRegex

import typings.safeRegex.anon.Limit
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("safe-regex", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(re: String): Boolean = js.native
  def apply(re: String, opts: Limit): Boolean = js.native
  def apply(re: RegExp): Boolean = js.native
  def apply(re: RegExp, opts: Limit): Boolean = js.native
}
