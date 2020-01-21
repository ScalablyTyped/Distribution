package typings.ramda

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/test", JSImport.Namespace)
@js.native
object testMod extends js.Object {
  def default(regexp: RegExp): js.Function1[/* str */ String, Boolean] = js.native
  def default(regexp: RegExp, str: String): Boolean = js.native
}

