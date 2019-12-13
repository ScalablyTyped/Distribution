package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/composeP", JSImport.Namespace)
@js.native
object srcComposePMod extends js.Object {
  def default[V0, T1](fn0: js.Function1[/* x0 */ V0, js.Promise[T1]]): js.Function1[/* x0 */ V0, js.Promise[T1]] = js.native
  def default[V0, T1, T2](fn1: js.Function1[/* x */ T1, js.Promise[T2]], fn0: js.Function1[/* x0 */ V0, js.Promise[T1]]): js.Function1[/* x0 */ V0, js.Promise[T2]] = js.native
  def default[V0, T1, T2, T3](
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn0: js.Function1[/* x */ V0, js.Promise[T1]]
  ): js.Function1[/* x */ V0, js.Promise[T3]] = js.native
  def default[V0, T1, T2, T3, T4](
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn0: js.Function1[/* x */ V0, js.Promise[T1]]
  ): js.Function1[/* x */ V0, js.Promise[T4]] = js.native
  def default[V0, T1, T2, T3, T4, T5](
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn0: js.Function1[/* x */ V0, js.Promise[T1]]
  ): js.Function1[/* x */ V0, js.Promise[T5]] = js.native
  def default[V0, T1, T2, T3, T4, T5, T6](
    fn5: js.Function1[/* x */ T5, js.Promise[T6]],
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn0: js.Function1[/* x */ V0, js.Promise[T1]]
  ): js.Function1[/* x */ V0, js.Promise[T6]] = js.native
}

