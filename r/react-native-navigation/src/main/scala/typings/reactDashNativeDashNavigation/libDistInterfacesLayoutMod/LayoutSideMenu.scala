package typings.reactDashNativeDashNavigation.libDistInterfacesLayoutMod

import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.Options
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
  var id: js.UndefOr[String] = js.undefined
  /**
    * Set the left side bar
    */
  var left: js.UndefOr[LayoutStackChildren] = js.undefined
  /**
    * Set the bottom tabs options
    */
  var options: js.UndefOr[Options] = js.undefined
  /**
    * Set the right side bar
    */
  var right: js.UndefOr[LayoutStackChildren] = js.undefined
}

object LayoutSideMenu {
  @scala.inline
  def apply(
    center: Layout[js.Object],
    id: String = null,
    left: LayoutStackChildren = null,
    options: Options = null,
    right: LayoutStackChildren = null
  ): LayoutSideMenu = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutSideMenu]
  }
}

