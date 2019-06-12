package typings
package atReduxDashSagaCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object effectsMod {
  type ActionChannelEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.ACTION_CHANNEL, 
    ActionChannelEffectDescriptor
  ]
  type AllButLast[L /* <: js.Array[_] */] = typescriptDashTupleLib.libMod.Reverse[Tail[typescriptDashTupleLib.libMod.Reverse[L]]]
  type AllEffect[T] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.CombinatorEffect[atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.ALL, T]
  type AllEffectDescriptor[T] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.CombinatorEffectDescriptor[T]
  type CallEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.CALL, CallEffectDescriptor]
  type CancelEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.CANCEL, 
    CancelEffectDescriptor
  ]
  type CancelEffectDescriptor = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task | js.Array[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task] | SELF_CANCELLATION
  type CancelledEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.CANCELLED, 
    CancelledEffectDescriptor
  ]
  type CancelledEffectDescriptor = js.Object
  type ChannelPutEffect[T] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.PUT, 
    ChannelPutEffectDescriptor[T]
  ]
  type ChannelTakeEffect[T] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.TAKE, 
    ChannelTakeEffectDescriptor[T]
  ]
  type CpsEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.CPS, CallEffectDescriptor]
  type CpsFunctionParameters[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = AllButLast[stdLib.Parameters[Fn]]
  type FlushEffect[T] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.FLUSH, 
    FlushEffectDescriptor[T]
  ]
  type FlushEffectDescriptor[T] = atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.FlushableChannel[T]
  type ForkEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.FORK, ForkEffectDescriptor]
  type GetContextEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.GET_CONTEXT, 
    GetContextEffectDescriptor
  ]
  type GetContextEffectDescriptor = java.lang.String
  type HelperWorkerParameters[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = stdLib.Parameters[Fn] | AllButLast[stdLib.Parameters[Fn]]
  type JoinEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.JOIN, JoinEffectDescriptor]
  type JoinEffectDescriptor = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task | js.Array[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task]
  type PutEffect[A /* <: reduxLib.reduxMod.Action[_] */] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.PUT, PutEffectDescriptor[A]]
  type RaceEffect[T] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.CombinatorEffect[atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.RACE, T]
  type RaceEffectDescriptor[T] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.CombinatorEffectDescriptor[T]
  type SELF_CANCELLATION = atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.`@@redux-saga/SELF_CANCELLATION`
  type SelectEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.SELECT, 
    SelectEffectDescriptor
  ]
  type SetContextEffect[C /* <: js.Object */] = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[
    atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.SET_CONTEXT, 
    SetContextEffectDescriptor[C]
  ]
  type SetContextEffectDescriptor[C /* <: js.Object */] = C
  type Tail[L /* <: js.Array[_] */] = js.Any
  type TakeEffect = atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.SimpleEffect[atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.TAKE, TakeEffectDescriptor]
}
