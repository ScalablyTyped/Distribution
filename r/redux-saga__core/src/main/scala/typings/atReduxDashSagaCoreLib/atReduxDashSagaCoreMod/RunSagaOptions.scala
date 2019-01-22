package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

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
  var onError: js.UndefOr[js.Function2[/* error */ nodeLib.Error, /* errorInfo */ ErrorInfo, scala.Unit]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
}

