package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Channel extends js.Object {
  def apply[T](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc0[T]
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](pattern: reduxDashSagaLib.effectsMod.Pattern, worker: reduxDashSagaLib.effectsMod.HelperFunc0[A]): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[T, T1](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc1[T, T1],
    arg1: T1
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[A, T1](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc1[A, T1],
    arg1: T1
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[T, T1, T2](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc2[T, T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[A, T1, T2](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc2[A, T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[T, T1, T2, T3](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc3[T, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[A, T1, T2, T3](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc3[A, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[T, T1, T2, T3, T4](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc4[T, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[A, T1, T2, T3, T4](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc4[A, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[T, T1, T2, T3, T4, T5](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc5[T, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[A, T1, T2, T3, T4, T5](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[T, T1, T2, T3, T4, T5, T6](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc6Rest[T, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def apply[A, T1, T2, T3, T4, T5, T6](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
}

