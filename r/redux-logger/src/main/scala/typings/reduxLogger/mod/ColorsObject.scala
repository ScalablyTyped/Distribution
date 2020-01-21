package typings.reduxLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsObject extends js.Object {
  var action: js.UndefOr[Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[Boolean | ErrorToString] = js.undefined
  var nextState: js.UndefOr[Boolean | StateToString] = js.undefined
  var prevState: js.UndefOr[Boolean | StateToString] = js.undefined
  var title: js.UndefOr[Boolean | ActionToString] = js.undefined
}

object ColorsObject {
  @scala.inline
  def apply(
    action: Boolean | ActionToString = null,
    error: Boolean | ErrorToString = null,
    nextState: Boolean | StateToString = null,
    prevState: Boolean | StateToString = null,
    title: Boolean | ActionToString = null
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

