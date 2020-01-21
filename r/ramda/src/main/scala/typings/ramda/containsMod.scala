package typings.ramda

import typings.ramda.toolsMod.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/contains", JSImport.Namespace)
@js.native
object containsMod extends js.Object {
  def default(__ : Placeholder): js.Function2[/* list */ String, /* a */ String, Boolean] = js.native
  def default(__ : Placeholder, list: String): js.Function1[/* a */ String, Boolean] = js.native
  def default(a: String): js.Function1[/* list */ String, Boolean] = js.native
  def default(a: String, list: String): Boolean = js.native
  def default[T](__ : Placeholder, list: js.Array[T]): js.Function1[/* a */ T, Boolean] = js.native
  def default[T](a: T): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def default[T](a: T, list: js.Array[T]): Boolean = js.native
  @JSName("default")
  def default_T[T](__ : Placeholder): js.Function2[/* list */ js.Array[T], /* a */ T, Boolean] = js.native
}

