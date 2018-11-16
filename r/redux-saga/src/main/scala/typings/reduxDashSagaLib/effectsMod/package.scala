package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object effectsMod {
  type ActionType = java.lang.String | scala.Double | js.Symbol
  type AllEffectDescriptor = GenericAllEffectDescriptor[Effect]
  type CallEffectFn[F /* <: js.Function */] = F | (js.Tuple2[js.Any, F]) | reduxDashSagaLib.Anon_Fn[F]
  type CallEffectNamedFn[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.CallEffectNamedFn with js.Any */, Name /* <: java.lang.String */] = (js.Tuple2[C, Name]) | (reduxDashSagaLib.Anon_FnContext[Name, C])
  type CancelEffectDescriptor = reduxDashSagaLib.reduxDashSagaMod.Task | SELF_CANCELLATION
  type Effect = RootEffect | TakeEffect | ChannelTakeEffect[js.Any] | PutEffect[js.Any] | ChannelPutEffect[js.Any] | AllEffect | RaceEffect | CallEffect | CpsEffect | ForkEffect | JoinEffect | CancelEffect | SelectEffect | ActionChannelEffect | CancelledEffect | FlushEffect[js.Any] | GetContextEffect | SetContextEffect[js.Any]
  type FlushEffectDescriptor[T] = reduxDashSagaLib.reduxDashSagaMod.Channel[T]
  type Func0 = js.Function0[js.Any]
  type Func1[T1] = js.Function1[/* arg1 */ T1, js.Any]
  type Func2[T1, T2] = js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Any]
  type Func3[T1, T2, T3] = js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Any]
  type Func4[T1, T2, T3, T4] = js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Any]
  type Func5[T1, T2, T3, T4, T5] = js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* arg5 */ T5, js.Any]
  type Func6Rest[T1, T2, T3, T4, T5, T6] = js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* repeated */js.Any, 
    js.Any
  ]
  type GenericAllEffectDescriptor[T] = js.Array[T] | ScalablyTyped.runtime.StringDictionary[T]
  type GetContextEffectDescriptor = java.lang.String
  type HelperFunc0[A] = js.Function1[/* action */ A, js.Any]
  type HelperFunc1[A, T1] = js.Function2[/* arg1 */ T1, /* action */ A, js.Any]
  type HelperFunc2[A, T1, T2] = js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* action */ A, js.Any]
  type HelperFunc3[A, T1, T2, T3] = js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* action */ A, js.Any]
  type HelperFunc4[A, T1, T2, T3, T4] = js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* action */ A, js.Any]
  type HelperFunc5[A, T1, T2, T3, T4, T5] = js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* action */ A, 
    js.Any
  ]
  type HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6] = js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ js.Any, 
    /* repeated */js.Any, 
    js.Any
  ]
  type JoinEffectDescriptor = reduxDashSagaLib.reduxDashSagaMod.Task
  type Pattern = SubPattern | js.Array[SubPattern]
  type RaceEffectDescriptor = GenericRaceEffectDescriptor[Effect]
  type SELF_CANCELLATION = reduxDashSagaLib.reduxDashSagaLibStrings.`@@redux-saga/SELF_CANCELLATION`
  type SetContextEffectDescriptor[C /* <: js.Object */] = C
  type SubPattern = ActionType | reduxDashSagaLib.reduxDashSagaMod.Predicate[reduxLib.reduxMod.Action[js.Any]] | StringableActionCreator[reduxLib.reduxMod.Action[js.Any]]
}
