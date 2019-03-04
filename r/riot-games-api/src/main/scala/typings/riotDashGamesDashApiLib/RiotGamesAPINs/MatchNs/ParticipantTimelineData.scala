package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticipantTimelineData extends js.Object {
  var tenToTwenty: scala.Double
  var thirtyToEnd: scala.Double
  var twentyToThirty: scala.Double
  var zeroToTen: scala.Double
}

object ParticipantTimelineData {
  @scala.inline
  def apply(
    tenToTwenty: scala.Double,
    thirtyToEnd: scala.Double,
    twentyToThirty: scala.Double,
    zeroToTen: scala.Double
  ): ParticipantTimelineData = {
    val __obj = js.Dynamic.literal(tenToTwenty = tenToTwenty, thirtyToEnd = thirtyToEnd, twentyToThirty = twentyToThirty, zeroToTen = zeroToTen)
  
    __obj.asInstanceOf[ParticipantTimelineData]
  }
}

