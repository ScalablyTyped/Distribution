package typings.riotDashGamesDashApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticipantTimelineData extends js.Object {
  var tenToTwenty: Double
  var thirtyToEnd: Double
  var twentyToThirty: Double
  var zeroToTen: Double
}

object ParticipantTimelineData {
  @scala.inline
  def apply(tenToTwenty: Double, thirtyToEnd: Double, twentyToThirty: Double, zeroToTen: Double): ParticipantTimelineData = {
    val __obj = js.Dynamic.literal(tenToTwenty = tenToTwenty.asInstanceOf[js.Any], thirtyToEnd = thirtyToEnd.asInstanceOf[js.Any], twentyToThirty = twentyToThirty.asInstanceOf[js.Any], zeroToTen = zeroToTen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParticipantTimelineData]
  }
}

