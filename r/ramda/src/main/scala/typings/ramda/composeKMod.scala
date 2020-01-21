package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/composeK", JSImport.Namespace)
@js.native
object composeKMod extends js.Object {
  def default[V0, T1](fn0: js.Function1[/* x0 */ V0, js.Array[T1]]): js.Function1[/* x0 */ V0, js.Array[T1]] = js.native
  def default[V0, T1, T2](fn1: js.Function1[/* x */ T1, js.Array[T2]], fn0: js.Function1[/* x0 */ V0, js.Array[T1]]): js.Function1[/* x0 */ V0, js.Array[T2]] = js.native
  def default[V0, T1, T2, T3](
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn0: js.Function1[/* x */ V0, js.Array[T1]]
  ): js.Function1[/* x */ V0, js.Array[T3]] = js.native
  def default[V0, T1, T2, T3, T4](
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn0: js.Function1[/* x */ V0, js.Array[T1]]
  ): js.Function1[/* x */ V0, js.Array[T4]] = js.native
  def default[V0, T1, T2, T3, T4, T5](
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn0: js.Function1[/* x */ V0, js.Array[T1]]
  ): js.Function1[/* x */ V0, js.Array[T5]] = js.native
  def default[V0, T1, T2, T3, T4, T5, T6](
    fn5: js.Function1[/* x */ T5, js.Array[T6]],
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn0: js.Function1[/* x */ V0, js.Array[T1]]
  ): js.Function1[/* x */ V0, js.Array[T6]] = js.native
}

