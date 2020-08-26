package typings.reactNativeElements.mod

import typings.reactNative.mod.TouchableWithoutFeedbackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleProps extends TouchableWithoutFeedbackProps {
  var activeScale: js.UndefOr[Double] = js.native
  var defaultNumber: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var pressInFriction: js.UndefOr[Double] = js.native
  var pressInTension: js.UndefOr[Double] = js.native
  var pressOutFriction: js.UndefOr[Double] = js.native
  var pressOutTension: js.UndefOr[Double] = js.native
  var tension: js.UndefOr[Double] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}

object ScaleProps {
  @scala.inline
  def apply(): ScaleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleProps]
  }
  @scala.inline
  implicit class ScalePropsOps[Self <: ScaleProps] (val x: Self) extends AnyVal {
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
    def setActiveScale(value: Double): Self = this.set("activeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveScale: Self = this.set("activeScale", js.undefined)
    @scala.inline
    def setDefaultNumber(value: Double): Self = this.set("defaultNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNumber: Self = this.set("defaultNumber", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setPressInFriction(value: Double): Self = this.set("pressInFriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressInFriction: Self = this.set("pressInFriction", js.undefined)
    @scala.inline
    def setPressInTension(value: Double): Self = this.set("pressInTension", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressInTension: Self = this.set("pressInTension", js.undefined)
    @scala.inline
    def setPressOutFriction(value: Double): Self = this.set("pressOutFriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressOutFriction: Self = this.set("pressOutFriction", js.undefined)
    @scala.inline
    def setPressOutTension(value: Double): Self = this.set("pressOutTension", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressOutTension: Self = this.set("pressOutTension", js.undefined)
    @scala.inline
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
  }
  
}

