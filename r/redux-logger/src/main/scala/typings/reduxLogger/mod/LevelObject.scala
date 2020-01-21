package typings.reduxLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelObject extends js.Object {
  var action: js.UndefOr[String | Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[String | Boolean | ErrorToString] = js.undefined
  var nextState: js.UndefOr[String | Boolean | StateToString] = js.undefined
  var prevState: js.UndefOr[String | Boolean | StateToString] = js.undefined
}

object LevelObject {
  @scala.inline
  def apply(
    action: String | Boolean | ActionToString = null,
    error: String | Boolean | ErrorToString = null,
    nextState: String | Boolean | StateToString = null,
    prevState: String | Boolean | StateToString = null
  ): LevelObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (nextState != null) __obj.updateDynamic("nextState")(nextState.asInstanceOf[js.Any])
    if (prevState != null) __obj.updateDynamic("prevState")(prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelObject]
  }
}

