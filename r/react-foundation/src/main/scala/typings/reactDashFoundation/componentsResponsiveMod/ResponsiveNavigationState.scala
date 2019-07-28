package typings.reactDashFoundation.componentsResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveNavigationState extends js.Object {
  var isTitleBarVisible: Boolean
  var isTopBarVisible: Boolean
}

object ResponsiveNavigationState {
  @scala.inline
  def apply(isTitleBarVisible: Boolean, isTopBarVisible: Boolean): ResponsiveNavigationState = {
    val __obj = js.Dynamic.literal(isTitleBarVisible = isTitleBarVisible, isTopBarVisible = isTopBarVisible)
  
    __obj.asInstanceOf[ResponsiveNavigationState]
  }
}

