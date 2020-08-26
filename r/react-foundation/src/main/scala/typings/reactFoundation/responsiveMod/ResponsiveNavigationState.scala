package typings.reactFoundation.responsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveNavigationState extends js.Object {
  var isTitleBarVisible: Boolean = js.native
  var isTopBarVisible: Boolean = js.native
}

object ResponsiveNavigationState {
  @scala.inline
  def apply(isTitleBarVisible: Boolean, isTopBarVisible: Boolean): ResponsiveNavigationState = {
    val __obj = js.Dynamic.literal(isTitleBarVisible = isTitleBarVisible.asInstanceOf[js.Any], isTopBarVisible = isTopBarVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveNavigationState]
  }
  @scala.inline
  implicit class ResponsiveNavigationStateOps[Self <: ResponsiveNavigationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsTitleBarVisible(value: Boolean): Self = this.set("isTitleBarVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTopBarVisible(value: Boolean): Self = this.set("isTopBarVisible", value.asInstanceOf[js.Any])
  }
  
}

