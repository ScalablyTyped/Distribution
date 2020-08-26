package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderStyle extends js.Object {
  var lowerTrackColor: js.UndefOr[String] = js.native
  var upperTrackColor: js.UndefOr[String] = js.native
}

object SliderStyle {
  @scala.inline
  def apply(): SliderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderStyle]
  }
  @scala.inline
  implicit class SliderStyleOps[Self <: SliderStyle] (val x: Self) extends AnyVal {
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
    def setLowerTrackColor(value: String): Self = this.set("lowerTrackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerTrackColor: Self = this.set("lowerTrackColor", js.undefined)
    @scala.inline
    def setUpperTrackColor(value: String): Self = this.set("upperTrackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperTrackColor: Self = this.set("upperTrackColor", js.undefined)
  }
  
}

