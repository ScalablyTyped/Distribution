package typings
package reduxDashLoggerLib.reduxDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelObject extends js.Object {
  var action: js.UndefOr[java.lang.String | scala.Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[java.lang.String | scala.Boolean | ErrorToString] = js.undefined
  var nextState: js.UndefOr[java.lang.String | scala.Boolean | StateToString] = js.undefined
  var prevState: js.UndefOr[java.lang.String | scala.Boolean | StateToString] = js.undefined
}

object LevelObject {
  @scala.inline
  def apply(
    action: java.lang.String | scala.Boolean | ActionToString = null,
    error: java.lang.String | scala.Boolean | ErrorToString = null,
    nextState: java.lang.String | scala.Boolean | StateToString = null,
    prevState: java.lang.String | scala.Boolean | StateToString = null
  ): LevelObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (nextState != null) __obj.updateDynamic("nextState")(nextState.asInstanceOf[js.Any])
    if (prevState != null) __obj.updateDynamic("prevState")(prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelObject]
  }
}

