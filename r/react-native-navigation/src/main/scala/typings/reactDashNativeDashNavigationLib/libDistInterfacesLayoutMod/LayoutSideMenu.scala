package typings
package reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutSideMenu extends js.Object {
  /**
    * Set the center view
    */
  var center: Layout[js.Object]
  /**
    * Set ID of the stack so you can use Navigation.mergeOptions to
    * update options
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the left side bar
    */
  var left: js.UndefOr[LayoutStackChildren] = js.undefined
  /**
    * Set the bottom tabs options
    */
  var options: js.UndefOr[reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options] = js.undefined
  /**
    * Set the right side bar
    */
  var right: js.UndefOr[LayoutStackChildren] = js.undefined
}

object LayoutSideMenu {
  @scala.inline
  def apply(
    center: Layout[js.Object],
    id: java.lang.String = null,
    left: LayoutStackChildren = null,
    options: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options = null,
    right: LayoutStackChildren = null
  ): LayoutSideMenu = {
    val __obj = js.Dynamic.literal(center = center)
    if (id != null) __obj.updateDynamic("id")(id)
    if (left != null) __obj.updateDynamic("left")(left)
    if (options != null) __obj.updateDynamic("options")(options)
    if (right != null) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[LayoutSideMenu]
  }
}

