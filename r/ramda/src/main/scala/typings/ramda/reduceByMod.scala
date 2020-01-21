package typings.ramda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/reduceBy", JSImport.Namespace)
@js.native
object reduceByMod extends js.Object {
  def default[T, TResult](valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult]): js.Any = js.native
  def default[T, TResult](valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult], acc: TResult): js.Any = js.native
  def default[T, TResult](
    valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    keyFn: js.Function1[/* elem */ T, String]
  ): js.Function1[/* list */ js.Array[T], StringDictionary[TResult]] = js.native
  def default[T, TResult](
    valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    keyFn: js.Function1[/* elem */ T, String],
    list: js.Array[T]
  ): StringDictionary[TResult] = js.native
}

