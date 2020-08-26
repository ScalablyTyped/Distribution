package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.reactNativeWebrtcStrings.environment
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackConstraints extends js.Object {
  var facingMode: user | environment = js.native
  var mandatory: MandatoryMedia = js.native
  var optional: js.Array[MediaSources] = js.native
}

object MediaTrackConstraints {
  @scala.inline
  def apply(facingMode: user | environment, mandatory: MandatoryMedia, optional: js.Array[MediaSources]): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal(facingMode = facingMode.asInstanceOf[js.Any], mandatory = mandatory.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackConstraints]
  }
  @scala.inline
  implicit class MediaTrackConstraintsOps[Self <: MediaTrackConstraints] (val x: Self) extends AnyVal {
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
    def setFacingMode(value: user | environment): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMandatory(value: MandatoryMedia): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalVarargs(value: MediaSources*): Self = this.set("optional", js.Array(value :_*))
    @scala.inline
    def setOptional(value: js.Array[MediaSources]): Self = this.set("optional", value.asInstanceOf[js.Any])
  }
  
}

