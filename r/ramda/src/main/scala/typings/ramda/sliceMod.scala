package typings.ramda

import typings.ramda.anon.FnCallBList
import typings.ramda.anon.FnCallList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/slice", JSImport.Namespace)
@js.native
object sliceMod extends js.Object {
  def default(a: Double): FnCallBList = js.native
  def default(a: Double, b: Double): FnCallList = js.native
  def default(a: Double, b: Double, list: String): String = js.native
  def default[T](a: Double, b: Double, list: js.Array[T]): js.Array[T] = js.native
}

