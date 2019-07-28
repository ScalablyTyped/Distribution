package typings.reactDashToolbox.libTabsTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabTheme extends js.Object {
  /**
    * Added to the navigation tab element in case it's active.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Added to the navigation tab element in case it's disabled.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Added to the navigation tab element in case it's hidden.
    */
  var hidden: js.UndefOr[String] = js.undefined
  /**
    * Added to the navigation tab element in case it's active.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Class added when icon is set.
    */
  var withIcon: js.UndefOr[String] = js.undefined
  /**
    * Class added when label is set.
    */
  var withText: js.UndefOr[String] = js.undefined
}

object TabTheme {
  @scala.inline
  def apply(
    active: String = null,
    disabled: String = null,
    hidden: String = null,
    label: String = null,
    withIcon: String = null,
    withText: String = null
  ): TabTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (label != null) __obj.updateDynamic("label")(label)
    if (withIcon != null) __obj.updateDynamic("withIcon")(withIcon)
    if (withText != null) __obj.updateDynamic("withText")(withText)
    __obj.asInstanceOf[TabTheme]
  }
}

