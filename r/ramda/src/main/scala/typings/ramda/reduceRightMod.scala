package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/reduceRight", JSImport.Namespace)
@js.native
object reduceRightMod extends js.Object {
  def default[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], TResult] = js.native
  def default[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult], acc: TResult): js.Function1[/* list */ js.Array[T], TResult] = js.native
  def default[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult], acc: TResult, list: js.Array[T]): TResult = js.native
}

