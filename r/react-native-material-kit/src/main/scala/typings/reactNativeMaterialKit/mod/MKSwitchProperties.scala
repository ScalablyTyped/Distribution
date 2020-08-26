package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNativeMaterialKit.anon.Checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKSwitchProperties extends TouchableWithoutFeedbackProps {
  var checked: js.UndefOr[Boolean] = js.native
  var offColor: js.UndefOr[String] = js.native
  var onCheckedChange: js.UndefOr[js.Function1[/* opts */ Checked, Unit]] = js.native
  var onColor: js.UndefOr[String] = js.native
  var rippleAniDuration: js.UndefOr[Double] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var thumbAniDuration: js.UndefOr[Double] = js.native
  var thumbOffColor: js.UndefOr[String] = js.native
  var thumbOnColor: js.UndefOr[String] = js.native
  var thumbRadius: js.UndefOr[Double] = js.native
  var trackLength: js.UndefOr[Double] = js.native
  var trackSize: js.UndefOr[Double] = js.native
}

object MKSwitchProperties {
  @scala.inline
  def apply(): MKSwitchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSwitchProperties]
  }
  @scala.inline
  implicit class MKSwitchPropertiesOps[Self <: MKSwitchProperties] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setOffColor(value: String): Self = this.set("offColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffColor: Self = this.set("offColor", js.undefined)
    @scala.inline
    def setOnCheckedChange(value: /* opts */ Checked => Unit): Self = this.set("onCheckedChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCheckedChange: Self = this.set("onCheckedChange", js.undefined)
    @scala.inline
    def setOnColor(value: String): Self = this.set("onColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnColor: Self = this.set("onColor", js.undefined)
    @scala.inline
    def setRippleAniDuration(value: Double): Self = this.set("rippleAniDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleAniDuration: Self = this.set("rippleAniDuration", js.undefined)
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    @scala.inline
    def setThumbAniDuration(value: Double): Self = this.set("thumbAniDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbAniDuration: Self = this.set("thumbAniDuration", js.undefined)
    @scala.inline
    def setThumbOffColor(value: String): Self = this.set("thumbOffColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbOffColor: Self = this.set("thumbOffColor", js.undefined)
    @scala.inline
    def setThumbOnColor(value: String): Self = this.set("thumbOnColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbOnColor: Self = this.set("thumbOnColor", js.undefined)
    @scala.inline
    def setThumbRadius(value: Double): Self = this.set("thumbRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbRadius: Self = this.set("thumbRadius", js.undefined)
    @scala.inline
    def setTrackLength(value: Double): Self = this.set("trackLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackLength: Self = this.set("trackLength", js.undefined)
    @scala.inline
    def setTrackSize(value: Double): Self = this.set("trackSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackSize: Self = this.set("trackSize", js.undefined)
  }
  
}

