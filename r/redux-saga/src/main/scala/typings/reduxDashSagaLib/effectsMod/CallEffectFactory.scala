package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallEffectFactory[R] extends js.Object {
  def apply(fn: CallEffectFn[Func0]): R = js.native
  def apply[T1](fn: CallEffectFn[Func1[T1]], arg1: T1): R = js.native
  def apply[T1, T2](fn: CallEffectFn[Func2[T1, T2]], arg1: T1, arg2: T2): R = js.native
  def apply[T1, T2, T3](fn: CallEffectFn[Func3[T1, T2, T3]], arg1: T1, arg2: T2, arg3: T3): R = js.native
  def apply[T1, T2, T3, T4](fn: CallEffectFn[Func4[T1, T2, T3, T4]], arg1: T1, arg2: T2, arg3: T3, arg4: T4): R = js.native
  def apply[T1, T2, T3, T4, T5](fn: CallEffectFn[Func5[T1, T2, T3, T4, T5]], arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): R = js.native
  def apply[T1, T2, T3, T4, T5, T6](
    fn: CallEffectFn[Func6Rest[T1, T2, T3, T4, T5, T6]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): R = js.native
}

