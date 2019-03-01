package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemCenterElement extends js.Object {
  var primaryText: java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  var secondaryText: js.UndefOr[java.lang.String] = js.undefined
  var tertiaryText: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemCenterElement {
  @scala.inline
  def apply(
    primaryText: java.lang.String | reactLib.reactMod.Global.JSXNs.Element,
    secondaryText: java.lang.String = null,
    tertiaryText: java.lang.String = null
  ): ListItemCenterElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText)
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText)
    __obj.asInstanceOf[ListItemCenterElement]
  }
}

