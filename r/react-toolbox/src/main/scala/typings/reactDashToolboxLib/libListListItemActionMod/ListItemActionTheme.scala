package typings
package reactDashToolboxLib.libListListItemActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionTheme extends js.Object {
  /**
    * Used for each action element (left/right).
    */
  var itemAction: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemActionTheme {
  @scala.inline
  def apply(itemAction: java.lang.String = null): ListItemActionTheme = {
    val __obj = js.Dynamic.literal()
    if (itemAction != null) __obj.updateDynamic("itemAction")(itemAction)
    __obj.asInstanceOf[ListItemActionTheme]
  }
}

