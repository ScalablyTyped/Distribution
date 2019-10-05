package typings.atReduxDashSagaCore.typesEffectsMod

import typings.atReduxDashSagaCore.typesMod.TakeableChannel
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", "throttle")
@js.native
object throttle extends js.Object {
  def apply[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def apply[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def apply[A /* <: Action[_] */](
    ms: Double,
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def apply[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def apply[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def apply[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
}

