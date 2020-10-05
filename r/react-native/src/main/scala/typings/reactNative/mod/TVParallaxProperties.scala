package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVParallaxProperties extends js.Object {
  /**
    * If true, parallax effects are enabled.  Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to 1.0
    */
  var magnification: js.UndefOr[Double] = js.native
  /**
    * Defaults to 0.3
    */
  var pressDelay: js.UndefOr[Double] = js.native
  /**
    * Defaults to 0.3
    */
  var pressDuration: js.UndefOr[Double] = js.native
  /**
    * Defaults to 1.0
    */
  var pressMagnification: js.UndefOr[Double] = js.native
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceX: js.UndefOr[Double] = js.native
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceY: js.UndefOr[Double] = js.native
  /**
    * Defaults to 0.05.
    */
  var tiltAngle: js.UndefOr[Double] = js.native
}

object TVParallaxProperties {
  @scala.inline
  def apply(): TVParallaxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TVParallaxProperties]
  }
  @scala.inline
  implicit class TVParallaxPropertiesOps[Self <: TVParallaxProperties] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMagnification(value: Double): Self = this.set("magnification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagnification: Self = this.set("magnification", js.undefined)
    @scala.inline
    def setPressDelay(value: Double): Self = this.set("pressDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressDelay: Self = this.set("pressDelay", js.undefined)
    @scala.inline
    def setPressDuration(value: Double): Self = this.set("pressDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressDuration: Self = this.set("pressDuration", js.undefined)
    @scala.inline
    def setPressMagnification(value: Double): Self = this.set("pressMagnification", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressMagnification: Self = this.set("pressMagnification", js.undefined)
    @scala.inline
    def setShiftDistanceX(value: Double): Self = this.set("shiftDistanceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftDistanceX: Self = this.set("shiftDistanceX", js.undefined)
    @scala.inline
    def setShiftDistanceY(value: Double): Self = this.set("shiftDistanceY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftDistanceY: Self = this.set("shiftDistanceY", js.undefined)
    @scala.inline
    def setTiltAngle(value: Double): Self = this.set("tiltAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiltAngle: Self = this.set("tiltAngle", js.undefined)
  }
  
}

