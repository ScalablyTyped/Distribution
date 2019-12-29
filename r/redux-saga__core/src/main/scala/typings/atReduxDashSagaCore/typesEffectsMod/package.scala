package typings.atReduxDashSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesEffectsMod {
  import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.`@@redux-sagaSlashSELF_CANCELLATION`
  import typings.atReduxDashSagaCore.typesMod.FlushableChannel
  import typings.redux.reduxMod.Action
  import typings.std.Parameters
  import typings.typescriptDashTuple.libMod.Reverse

  type ActionChannelEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'ACTION_CHANNEL', ActionChannelEffectDescriptor> */ js.Any
  type AllButLast[L /* <: js.Array[_] */] = Reverse[Tail[Reverse[L]]]
  type AllEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffect<'ALL', T> */ js.Any
  type AllEffectDescriptor[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffectDescriptor<T> */ js.Any
  type CallEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CALL', CallEffectDescriptor> */ js.Any
  type CancelEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CANCEL', CancelEffectDescriptor> */ js.Any
  type CancelEffectDescriptor = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any) | (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ]) | SELF_CANCELLATION
  type CancelledEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CANCELLED', CancelledEffectDescriptor> */ js.Any
  type CancelledEffectDescriptor = js.Object
  type ChannelPutEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'PUT', ChannelPutEffectDescriptor<T>> */ js.Any
  type ChannelTakeEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'TAKE', ChannelTakeEffectDescriptor<T>> */ js.Any
  type CpsEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CPS', CallEffectDescriptor> */ js.Any
  type CpsFunctionParameters[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = AllButLast[Parameters[Fn]]
  type FlushEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'FLUSH', FlushEffectDescriptor<T>> */ js.Any
  type FlushEffectDescriptor[T] = FlushableChannel[T]
  type ForkEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'FORK', ForkEffectDescriptor> */ js.Any
  type GetContextEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'GET_CONTEXT', GetContextEffectDescriptor> */ js.Any
  type GetContextEffectDescriptor = String
  type HelperWorkerParameters[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = Parameters[Fn] | AllButLast[Parameters[Fn]]
  type JoinEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'JOIN', JoinEffectDescriptor> */ js.Any
  type JoinEffectDescriptor = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any) | (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ])
  type PutEffect[A /* <: Action[_] */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'PUT', PutEffectDescriptor<A>> */ js.Any
  type RaceEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffect<'RACE', T> */ js.Any
  type RaceEffectDescriptor[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffectDescriptor<T> */ js.Any
  type SELF_CANCELLATION = `@@redux-sagaSlashSELF_CANCELLATION`
  type SelectEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'SELECT', SelectEffectDescriptor> */ js.Any
  type SetContextEffect[C /* <: js.Object */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'SET_CONTEXT', SetContextEffectDescriptor<C>> */ js.Any
  type SetContextEffectDescriptor[C /* <: js.Object */] = C
  type Tail[L /* <: js.Array[_] */] = js.Any
  type TakeEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'TAKE', TakeEffectDescriptor> */ js.Any
}
