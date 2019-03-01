package typings
package reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutBottomTabsChildren extends js.Object {
  /**
    * Set component
    */
  var component: js.UndefOr[LayoutComponent[js.Object]] = js.undefined
  /**
    * Set stack
    */
  var stack: js.UndefOr[LayoutStack] = js.undefined
}

object LayoutBottomTabsChildren {
  @scala.inline
  def apply(component: LayoutComponent[js.Object] = null, stack: LayoutStack = null): LayoutBottomTabsChildren = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[LayoutBottomTabsChildren]
  }
}

