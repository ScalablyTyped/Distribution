package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantTimelineData extends js.Object {
  var tenToTwenty: Double = js.native
  var thirtyToEnd: Double = js.native
  var twentyToThirty: Double = js.native
  var zeroToTen: Double = js.native
}

object ParticipantTimelineData {
  @scala.inline
  def apply(tenToTwenty: Double, thirtyToEnd: Double, twentyToThirty: Double, zeroToTen: Double): ParticipantTimelineData = {
    val __obj = js.Dynamic.literal(tenToTwenty = tenToTwenty.asInstanceOf[js.Any], thirtyToEnd = thirtyToEnd.asInstanceOf[js.Any], twentyToThirty = twentyToThirty.asInstanceOf[js.Any], zeroToTen = zeroToTen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantTimelineData]
  }
  @scala.inline
  implicit class ParticipantTimelineDataOps[Self <: ParticipantTimelineData] (val x: Self) extends AnyVal {
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
    def setTenToTwenty(value: Double): Self = this.set("tenToTwenty", value.asInstanceOf[js.Any])
    @scala.inline
    def setThirtyToEnd(value: Double): Self = this.set("thirtyToEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwentyToThirty(value: Double): Self = this.set("twentyToThirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setZeroToTen(value: Double): Self = this.set("zeroToTen", value.asInstanceOf[js.Any])
  }
  
}

