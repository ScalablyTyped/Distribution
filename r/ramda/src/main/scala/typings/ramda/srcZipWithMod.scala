package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/zipWith", JSImport.Namespace)
@js.native
object srcZipWithMod extends js.Object {
  def default[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult]): js.Function2[/* list1 */ js.Array[T], /* list2 */ js.Array[U], js.Array[TResult]] = js.native
  def default[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult], list1: js.Array[T]): js.Function1[/* list2 */ js.Array[U], js.Array[TResult]] = js.native
  def default[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult], list1: js.Array[T], list2: js.Array[U]): js.Array[TResult] = js.native
}

