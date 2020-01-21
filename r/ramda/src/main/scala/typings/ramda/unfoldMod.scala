package typings.ramda

import typings.ramda.ramdaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/unfold", JSImport.Namespace)
@js.native
object unfoldMod extends js.Object {
  @JSName("default")
  def default_false[T, TResult](fn: js.Function1[/* seed */ T, (js.Tuple2[TResult, T]) | `false`]): js.Function1[/* seed */ T, js.Array[TResult]] = js.native
  @JSName("default")
  def default_false[T, TResult](fn: js.Function1[/* seed */ T, (js.Tuple2[TResult, T]) | `false`], seed: T): js.Array[TResult] = js.native
}

