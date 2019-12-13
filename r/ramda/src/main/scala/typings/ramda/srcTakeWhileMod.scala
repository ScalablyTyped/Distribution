package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/takeWhile", JSImport.Namespace)
@js.native
object srcTakeWhileMod extends js.Object {
  def default[T](fn: js.Function1[/* x */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def default[T](fn: js.Function1[/* x */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
}

