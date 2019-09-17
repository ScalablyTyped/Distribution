package typings.atReduxDashSagaCore.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunSagaOptions[A, S] extends js.Object {
  /**
    * See docs for `channel`
    */
  var channel: js.UndefOr[PredicateTakeableChannel[A]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * Used to fulfill `put` effects.
    *
    * @param output argument provided by the Saga to the `put` Effect
    */
  var dispatch: js.UndefOr[js.Function1[/* output */ A, _]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.undefined
  /**
    * Used to fulfill `select` and `getState` effects
    */
  var getState: js.UndefOr[js.Function0[S]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var onError: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
}

object RunSagaOptions {
  @scala.inline
  def apply[A, S](
    channel: PredicateTakeableChannel[A] = null,
    context: js.Object = null,
    dispatch: /* output */ A => _ = null,
    effectMiddlewares: js.Array[EffectMiddleware] = null,
    getState: () => S = null,
    onError: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit = null,
    sagaMonitor: SagaMonitor = null
  ): RunSagaOptions[A, S] = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction1(dispatch))
    if (effectMiddlewares != null) __obj.updateDynamic("effectMiddlewares")(effectMiddlewares)
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (sagaMonitor != null) __obj.updateDynamic("sagaMonitor")(sagaMonitor)
    __obj.asInstanceOf[RunSagaOptions[A, S]]
  }
}

