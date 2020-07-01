package typings.rcTabs.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsLocale extends js.Object {
  var addAriaLabel: js.UndefOr[String] = js.undefined
  var dropdownAriaLabel: js.UndefOr[String] = js.undefined
  var removeAriaLabel: js.UndefOr[String] = js.undefined
}

object TabsLocale {
  @scala.inline
  def apply(addAriaLabel: String = null, dropdownAriaLabel: String = null, removeAriaLabel: String = null): TabsLocale = {
    val __obj = js.Dynamic.literal()
    if (addAriaLabel != null) __obj.updateDynamic("addAriaLabel")(addAriaLabel.asInstanceOf[js.Any])
    if (dropdownAriaLabel != null) __obj.updateDynamic("dropdownAriaLabel")(dropdownAriaLabel.asInstanceOf[js.Any])
    if (removeAriaLabel != null) __obj.updateDynamic("removeAriaLabel")(removeAriaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsLocale]
  }
}

