package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarOptions extends js.Object {
  var backgroundColor: js.UndefOr[Color] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object NavigationBarOptions {
  @scala.inline
  def apply(backgroundColor: Color = null, visible: js.UndefOr[Boolean] = js.undefined): NavigationBarOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarOptions]
  }
}

