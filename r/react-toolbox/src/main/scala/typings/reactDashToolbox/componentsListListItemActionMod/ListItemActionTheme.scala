package typings.reactDashToolbox.componentsListListItemActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionTheme extends js.Object {
  /**
    * Used for each action element (left/right).
    */
  var itemAction: js.UndefOr[String] = js.undefined
}

object ListItemActionTheme {
  @scala.inline
  def apply(itemAction: String = null): ListItemActionTheme = {
    val __obj = js.Dynamic.literal()
    if (itemAction != null) __obj.updateDynamic("itemAction")(itemAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemActionTheme]
  }
}

