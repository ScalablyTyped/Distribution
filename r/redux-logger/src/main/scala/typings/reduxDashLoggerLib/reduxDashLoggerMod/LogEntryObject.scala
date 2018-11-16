package typings
package reduxDashLoggerLib.reduxDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LogEntryObject extends js.Object {
  var action: js.UndefOr[java.lang.String | scala.Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var nextState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var prevState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var started: js.UndefOr[scala.Double] = js.undefined
  var startedTime: js.UndefOr[stdLib.Date] = js.undefined
  var took: js.UndefOr[scala.Double] = js.undefined
}

