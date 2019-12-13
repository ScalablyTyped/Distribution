package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/apply", JSImport.Namespace)
@js.native
object srcApplyMod extends js.Object {
  def default[T, TResult](fn: js.Function2[/* arg0 */ T, /* repeated */ T, TResult]): js.Function1[/* args */ js.Array[_], TResult] = js.native
  def default[T, U, TResult](fn: js.Function2[/* arg0 */ T, /* repeated */ T, TResult], args: js.Array[U]): TResult = js.native
}

