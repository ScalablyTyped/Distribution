package typings.redux.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyAction
  extends Action[js.Any]
     with // Allows any extra properties to be defined in an action.
/* extraProps */ StringDictionary[js.Any]

object AnyAction {
  @scala.inline
  def apply(
    `type`: js.Any,
    StringDictionary: // Allows any extra properties to be defined in an action.
  /* extraProps */ StringDictionary[js.Any] = null
  ): AnyAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnyAction]
  }
}

