package typings.reactNavigationStack.vendorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackHeaderInterpolatedStyle extends js.Object {
  /**
    * Interpolated style for the header background.
    */
  var backgroundStyle: js.UndefOr[js.Any] = js.native
  /**
    * Interpolated style for the left button (usually the back button).
    */
  var leftButtonStyle: js.UndefOr[js.Any] = js.native
  /**
    * Interpolated style for the label of the left button (back button label).
    */
  var leftLabelStyle: js.UndefOr[js.Any] = js.native
  /**
    * Interpolated style for the right button.
    */
  var rightButtonStyle: js.UndefOr[js.Any] = js.native
  /**
    * Interpolated style for the header title text.
    */
  var titleStyle: js.UndefOr[js.Any] = js.native
}

object StackHeaderInterpolatedStyle {
  @scala.inline
  def apply(): StackHeaderInterpolatedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackHeaderInterpolatedStyle]
  }
  @scala.inline
  implicit class StackHeaderInterpolatedStyleOps[Self <: StackHeaderInterpolatedStyle] (val x: Self) extends AnyVal {
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
    def setBackgroundStyle(value: js.Any): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundStyle: Self = this.set("backgroundStyle", js.undefined)
    @scala.inline
    def setLeftButtonStyle(value: js.Any): Self = this.set("leftButtonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftButtonStyle: Self = this.set("leftButtonStyle", js.undefined)
    @scala.inline
    def setLeftLabelStyle(value: js.Any): Self = this.set("leftLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftLabelStyle: Self = this.set("leftLabelStyle", js.undefined)
    @scala.inline
    def setRightButtonStyle(value: js.Any): Self = this.set("rightButtonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightButtonStyle: Self = this.set("rightButtonStyle", js.undefined)
    @scala.inline
    def setTitleStyle(value: js.Any): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
  }
  
}

