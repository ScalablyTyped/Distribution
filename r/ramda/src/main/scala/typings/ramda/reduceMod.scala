package typings.ramda

import typings.ramda.toolsMod.Reduced
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/reduce", JSImport.Namespace)
@js.native
object reduceMod extends js.Object {
  def default[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], TResult] = js.native
  def default[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]], acc: TResult): js.Function1[/* list */ js.Array[T], TResult] = js.native
  def default[T, TResult](
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]],
    acc: TResult,
    list: js.Array[T]
  ): TResult = js.native
}

