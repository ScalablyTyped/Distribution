package typings.safeDashRegex

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("safe-regex", JSImport.Namespace)
@js.native
object safeDashRegexMod extends js.Object {
  def apply(re: String): Boolean = js.native
  def apply(re: String, opts: Anon_Limit): Boolean = js.native
  def apply(re: RegExp): Boolean = js.native
  def apply(re: RegExp, opts: Anon_Limit): Boolean = js.native
}

