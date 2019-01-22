package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

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
  var onError: js.UndefOr[js.Function2[/* error */ nodeLib.Error, /* errorInfo */ ErrorInfo, scala.Unit]] = js.undefined
  /**
    * If a Saga Monitor is provided, the middleware will deliver monitoring
    * events to the monitor.
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
}

