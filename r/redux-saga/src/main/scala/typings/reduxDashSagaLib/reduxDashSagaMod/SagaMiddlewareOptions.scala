package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SagaMiddlewareOptions[C /* <: js.Object */] extends js.Object {
  var context: js.UndefOr[C] = js.undefined
  var emitter: js.UndefOr[js.Function1[/* emit */ Emit[reduxLib.reduxMod.Action[_]], Emit[_]]] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]] = js.undefined
  var sagaMonitor: js.UndefOr[Monitor] = js.undefined
}

