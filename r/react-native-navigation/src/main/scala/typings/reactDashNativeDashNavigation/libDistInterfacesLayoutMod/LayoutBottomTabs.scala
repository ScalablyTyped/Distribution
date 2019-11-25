package typings.reactDashNativeDashNavigation.libDistInterfacesLayoutMod

import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutBottomTabs extends js.Object {
  /**
    * Set the children screens
    */
  var children: js.UndefOr[js.Array[LayoutBottomTabsChildren]] = js.undefined
  /**
    * Set ID of the stack so you can use Navigation.mergeOptions to
    * update options
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Set the bottom tabs options
    */
  var options: js.UndefOr[Options] = js.undefined
}

object LayoutBottomTabs {
  @scala.inline
  def apply(children: js.Array[LayoutBottomTabsChildren] = null, id: String = null, options: Options = null): LayoutBottomTabs = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutBottomTabs]
  }
}

