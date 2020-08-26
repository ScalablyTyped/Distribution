package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchableOpacityProps extends TouchableWithoutFeedbackProps {
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    * Defaults to 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.native
}

object TouchableOpacityProps {
  @scala.inline
  def apply(): TouchableOpacityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableOpacityProps]
  }
  @scala.inline
  implicit class TouchableOpacityPropsOps[Self <: TouchableOpacityProps] (val x: Self) extends AnyVal {
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
  }
  
}

