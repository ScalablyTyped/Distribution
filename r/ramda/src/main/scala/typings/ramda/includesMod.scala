package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/includes", JSImport.Namespace)
@js.native
object includesMod extends js.Object {
  def default(s: String): js.Function1[/* list */ js.Array[String] | String, Boolean] = js.native
  def default(s: String, list: String): Boolean = js.native
  def default(s: String, list: js.Array[String]): Boolean = js.native
  def default[T](target: T): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def default[T](target: T, list: js.Array[T]): Boolean = js.native
}

