package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunSagaOptions[A, S] extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var dispatch: js.UndefOr[js.Function1[/* input */ A, _]] = js.undefined
  var getState: js.UndefOr[js.Function0[S]] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]] = js.undefined
  var sagaMonitor: js.UndefOr[Monitor] = js.undefined
  var subscribe: js.UndefOr[reduxDashSagaLib.Subscribe[A]] = js.undefined
}

