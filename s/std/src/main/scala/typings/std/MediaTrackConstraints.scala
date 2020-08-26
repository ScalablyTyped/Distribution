package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackConstraints extends MediaTrackConstraintSet {
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.native
}

object MediaTrackConstraints {
  @scala.inline
  def apply(): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraints]
  }
  @scala.inline
  implicit class MediaTrackConstraintsOps[Self <: MediaTrackConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvancedVarargs(value: MediaTrackConstraintSet*): Self = this.set("advanced", js.Array(value :_*))
    @scala.inline
    def setAdvanced(value: js.Array[MediaTrackConstraintSet]): Self = this.set("advanced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvanced: Self = this.set("advanced", js.undefined)
  }
  
}

