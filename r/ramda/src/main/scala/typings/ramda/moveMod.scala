package typings.ramda

import typings.ramda.anon.FnCallToList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/move", JSImport.Namespace)
@js.native
object moveMod extends js.Object {
  def default(from: Double): FnCallToList = js.native
  def default(from: Double, to: Double): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def default[T](from: Double, to: Double, list: js.Array[T]): js.Array[T] = js.native
}

