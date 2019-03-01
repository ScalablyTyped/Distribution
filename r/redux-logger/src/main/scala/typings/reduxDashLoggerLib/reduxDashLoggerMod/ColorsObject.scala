package typings
package reduxDashLoggerLib.reduxDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsObject extends js.Object {
  var action: js.UndefOr[scala.Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[scala.Boolean | ErrorToString] = js.undefined
  var nextState: js.UndefOr[scala.Boolean | StateToString] = js.undefined
  var prevState: js.UndefOr[scala.Boolean | StateToString] = js.undefined
  var title: js.UndefOr[scala.Boolean | ActionToString] = js.undefined
}

object ColorsObject {
  @scala.inline
  def apply(
    action: scala.Boolean | ActionToString = null,
    error: scala.Boolean | ErrorToString = null,
    nextState: scala.Boolean | StateToString = null,
    prevState: scala.Boolean | StateToString = null,
    title: scala.Boolean | ActionToString = null
  ): ColorsObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (nextState != null) __obj.updateDynamic("nextState")(nextState.asInstanceOf[js.Any])
    if (prevState != null) __obj.updateDynamic("prevState")(prevState.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsObject]
  }
}

