package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/reduceWhile", JSImport.Namespace)
@js.native
object srcReduceWhileMod extends js.Object {
  def default[T, TResult](predicate: js.Function2[/* acc */ TResult, /* elem */ T, Boolean]): js.Any = js.native
  def default[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult]
  ): js.Any = js.native
  def default[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult
  ): js.Function1[/* list */ js.Array[T], TResult] = js.native
  def default[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    list: js.Array[T]
  ): TResult = js.native
}

