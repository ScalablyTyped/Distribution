package typings.reactNavigationMaterialBottomTabs.materialBottomTabViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var tabBarColor: js.UndefOr[String] = js.undefined
  var tabBarColorDark: js.UndefOr[String] = js.undefined
  var tabBarColorLight: js.UndefOr[String] = js.undefined
  var tabBarVisible: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    tabBarColor: String = null,
    tabBarColorDark: String = null,
    tabBarColorLight: String = null,
    tabBarVisible: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (tabBarColor != null) __obj.updateDynamic("tabBarColor")(tabBarColor.asInstanceOf[js.Any])
    if (tabBarColorDark != null) __obj.updateDynamic("tabBarColorDark")(tabBarColorDark.asInstanceOf[js.Any])
    if (tabBarColorLight != null) __obj.updateDynamic("tabBarColorLight")(tabBarColorLight.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarVisible)) __obj.updateDynamic("tabBarVisible")(tabBarVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

