package typings.ramda

import typings.ramda.toolsMod.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/has", JSImport.Namespace)
@js.native
object hasMod extends js.Object {
  def default(s: String): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def default[T](__ : Placeholder): js.Function2[/* obj */ T, /* s */ String, Boolean] = js.native
  def default[T](__ : Placeholder, obj: T): js.Function1[/* s */ String, Boolean] = js.native
  def default[T](s: String, obj: T): Boolean = js.native
}

