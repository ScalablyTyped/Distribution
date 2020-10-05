package typings.reactNavigationStack.vendorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackCardInterpolatedStyle extends js.Object {
  /**
    * Interpolated style for the view representing the card.
    */
  var cardStyle: js.UndefOr[js.Any] = js.native
  /**
    * Interpolated style for the container view wrapping the card.
    */
  var containerStyle: js.UndefOr[js.Any] = js.native
  /**
    * Interpolated style for the view representing the semi-transparent overlay below the card.
    */
  var overlayStyle: js.UndefOr[js.Any] = js.native
  /**
    * Interpolated style representing the card shadow.
    */
  var shadowStyle: js.UndefOr[js.Any] = js.native
}

object StackCardInterpolatedStyle {
  @scala.inline
  def apply(): StackCardInterpolatedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackCardInterpolatedStyle]
  }
  @scala.inline
  implicit class StackCardInterpolatedStyleOps[Self <: StackCardInterpolatedStyle] (val x: Self) extends AnyVal {
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
    def setCardStyle(value: js.Any): Self = this.set("cardStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardStyle: Self = this.set("cardStyle", js.undefined)
    @scala.inline
    def setContainerStyle(value: js.Any): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setOverlayStyle(value: js.Any): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setShadowStyle(value: js.Any): Self = this.set("shadowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowStyle: Self = this.set("shadowStyle", js.undefined)
  }
  
}

