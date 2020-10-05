package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchableHighlightProps extends TouchableWithoutFeedbackProps {
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  /**
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called immediately after the underlay is shown
    */
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The color of the underlay that will show through when the touch is active.
    */
  var underlayColor: js.UndefOr[ColorValue] = js.native
}

object TouchableHighlightProps {
  @scala.inline
  def apply(): TouchableHighlightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableHighlightProps]
  }
  @scala.inline
  implicit class TouchableHighlightPropsOps[Self <: TouchableHighlightProps] (val x: Self) extends AnyVal {
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    @scala.inline
    def setOnHideUnderlay(value: () => Unit): Self = this.set("onHideUnderlay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
    @scala.inline
    def setOnShowUnderlay(value: () => Unit): Self = this.set("onShowUnderlay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    @scala.inline
    def setUnderlayColor(value: ColorValue): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
  
}

