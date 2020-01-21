package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/scan", JSImport.Namespace)
@js.native
object scanMod extends js.Object {
  def default[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], js.Array[TResult]] = js.native
  def default[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _], acc: TResult): js.Function1[/* list */ js.Array[T], js.Array[TResult]] = js.native
  def default[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _], acc: TResult, list: js.Array[T]): js.Array[TResult] = js.native
}

