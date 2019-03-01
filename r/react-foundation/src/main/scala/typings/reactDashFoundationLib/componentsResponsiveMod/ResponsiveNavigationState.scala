package typings
package reactDashFoundationLib.componentsResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveNavigationState extends js.Object {
  var isTitleBarVisible: scala.Boolean
  var isTopBarVisible: scala.Boolean
}

object ResponsiveNavigationState {
  @scala.inline
  def apply(isTitleBarVisible: scala.Boolean, isTopBarVisible: scala.Boolean): ResponsiveNavigationState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isTitleBarVisible")(isTitleBarVisible)
    __obj.updateDynamic("isTopBarVisible")(isTopBarVisible)
    __obj.asInstanceOf[ResponsiveNavigationState]
  }
}

