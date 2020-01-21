package typings.safeRegex

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("safe-regex", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(re: String): Boolean = js.native
  def apply(re: String, opts: AnonLimit): Boolean = js.native
  def apply(re: RegExp): Boolean = js.native
  def apply(re: RegExp, opts: AnonLimit): Boolean = js.native
}

