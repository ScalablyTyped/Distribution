package typings.reduxSagaCore.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SagaMiddlewareOptions[C /* <: js.Object */] extends js.Object {
  /**
    * Initial value of the saga's context.
    */
  var context: js.UndefOr[C] = js.undefined
  /**
    * Allows you to intercept any effect, resolve it on your own and pass to the
    * next middleware.
    */
  var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.undefined
  /**
    * If provided, the middleware will call it with uncaught errors from Sagas.
    * useful for sending uncaught exceptions to error tracking services.
    */
  var onError: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
  /**
    * If a Saga Monitor is provided, the middleware will deliver monitoring
    * events to the monitor.
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
}

object SagaMiddlewareOptions {
  @scala.inline
  def apply[C](
    context: C = null,
    effectMiddlewares: js.Array[EffectMiddleware] = null,
    onError: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit = null,
    sagaMonitor: SagaMonitor = null
  ): SagaMiddlewareOptions[C] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (effectMiddlewares != null) __obj.updateDynamic("effectMiddlewares")(effectMiddlewares.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (sagaMonitor != null) __obj.updateDynamic("sagaMonitor")(sagaMonitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SagaMiddlewareOptions[C]]
  }
}

