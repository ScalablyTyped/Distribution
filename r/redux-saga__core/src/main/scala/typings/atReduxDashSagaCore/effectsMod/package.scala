package typings.atReduxDashSagaCore

import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.FlushableChannel
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.ACTION_CHANNEL
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.ALL
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.CALL
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.CANCEL
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.CANCELLED
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.CPS
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.FLUSH
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.FORK
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.GET_CONTEXT
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.JOIN
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.PUT
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.RACE
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.SELECT
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.SET_CONTEXT
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.TAKE
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.`@@redux-saga/SELF_CANCELLATION`
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.CombinatorEffect
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.CombinatorEffectDescriptor
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.SimpleEffect
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Task
import typings.redux.reduxMod.Action
import typings.std.Parameters
import typings.typescriptDashTuple.libMod.Reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object effectsMod {
  type ActionChannelEffect = SimpleEffect[ACTION_CHANNEL, ActionChannelEffectDescriptor]
  type AllButLast[L /* <: js.Array[_] */] = Reverse[Tail[Reverse[L]]]
  type AllEffect[T] = CombinatorEffect[ALL, T]
  type AllEffectDescriptor[T] = CombinatorEffectDescriptor[T]
  type CallEffect = SimpleEffect[CALL, CallEffectDescriptor]
  type CancelEffect = SimpleEffect[CANCEL, CancelEffectDescriptor]
  type CancelEffectDescriptor = Task | js.Array[Task] | SELF_CANCELLATION
  type CancelledEffect = SimpleEffect[CANCELLED, CancelledEffectDescriptor]
  type CancelledEffectDescriptor = js.Object
  type ChannelPutEffect[T] = SimpleEffect[PUT, ChannelPutEffectDescriptor[T]]
  type ChannelTakeEffect[T] = SimpleEffect[TAKE, ChannelTakeEffectDescriptor[T]]
  type CpsEffect = SimpleEffect[CPS, CallEffectDescriptor]
  type CpsFunctionParameters[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = AllButLast[Parameters[Fn]]
  type FlushEffect[T] = SimpleEffect[FLUSH, FlushEffectDescriptor[T]]
  type FlushEffectDescriptor[T] = FlushableChannel[T]
  type ForkEffect = SimpleEffect[FORK, ForkEffectDescriptor]
  type GetContextEffect = SimpleEffect[GET_CONTEXT, GetContextEffectDescriptor]
  type GetContextEffectDescriptor = String
  type HelperWorkerParameters[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = Parameters[Fn] | AllButLast[Parameters[Fn]]
  type JoinEffect = SimpleEffect[JOIN, JoinEffectDescriptor]
  type JoinEffectDescriptor = Task | js.Array[Task]
  type PutEffect[A /* <: Action[_] */] = SimpleEffect[PUT, PutEffectDescriptor[A]]
  type RaceEffect[T] = CombinatorEffect[RACE, T]
  type RaceEffectDescriptor[T] = CombinatorEffectDescriptor[T]
  type SELF_CANCELLATION = `@@redux-saga/SELF_CANCELLATION`
  type SelectEffect = SimpleEffect[SELECT, SelectEffectDescriptor]
  type SetContextEffect[C /* <: js.Object */] = SimpleEffect[SET_CONTEXT, SetContextEffectDescriptor[C]]
  type SetContextEffectDescriptor[C /* <: js.Object */] = C
  type Tail[L /* <: js.Array[_] */] = js.Any
  type TakeEffect = SimpleEffect[TAKE, TakeEffectDescriptor]
}
