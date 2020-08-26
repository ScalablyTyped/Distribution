package typings.ramda

import typings.ramda.toolsMod.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/includes", JSImport.Namespace)
@js.native
object includesMod extends js.Object {
  def default(__ : Placeholder): js.Function2[/* list */ js.Array[String] | String, /* s */ String, Boolean] = js.native
  def default(__ : Placeholder, list: String): js.Function1[/* s */ String, Boolean] = js.native
  def default(__ : Placeholder, list: js.Array[String]): js.Function1[/* s */ String, Boolean] = js.native
  def default(s: String): js.Function1[/* list */ js.Array[String] | String, Boolean] = js.native
  def default(s: String, list: String): Boolean = js.native
  def default(s: String, list: js.Array[String]): Boolean = js.native
  def default[T](target: T): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def default[T](target: T, list: js.Array[T]): Boolean = js.native
  @JSName("default")
  def default_T[T](__ : Placeholder): js.Function2[/* list */ js.Array[T], /* target */ T, Boolean] = js.native
  @JSName("default")
  def default_T[T](__ : Placeholder, list: js.Array[T]): js.Function1[/* target */ T, Boolean] = js.native
}

