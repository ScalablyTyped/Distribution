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
    val __obj = js.Dynamic.literal(tenToTwenty = tenToTwenty, thirtyToEnd = thirtyToEnd, twentyToThirty = twentyToThirty, zeroToTen = zeroToTen)
  
    __obj.asInstanceOf[ParticipantTimelineData]
  }
}

