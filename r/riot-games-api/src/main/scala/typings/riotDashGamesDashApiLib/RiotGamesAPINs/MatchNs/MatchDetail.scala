package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchDetail extends js.Object {
  var mapId: scala.Double
  var matchCreation: scala.Double
  var matchId: scala.Double
  var matchMode: java.lang.String
  var matchType: java.lang.String
  var matchVersion: java.lang.String
  var participantIdentities: js.Array[ParticipantIdentity]
  var participants: js.Array[Participant]
  var plateformId: java.lang.String
  var queueType: java.lang.String
  var region: java.lang.String
  var season: java.lang.String
  var teams: js.Array[Team]
  var timeline: Timeline
}

object MatchDetail {
  @scala.inline
  def apply(
    mapId: scala.Double,
    matchCreation: scala.Double,
    matchId: scala.Double,
    matchMode: java.lang.String,
    matchType: java.lang.String,
    matchVersion: java.lang.String,
    participantIdentities: js.Array[ParticipantIdentity],
    participants: js.Array[Participant],
    plateformId: java.lang.String,
    queueType: java.lang.String,
    region: java.lang.String,
    season: java.lang.String,
    teams: js.Array[Team],
    timeline: Timeline
  ): MatchDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mapId")(mapId)
    __obj.updateDynamic("matchCreation")(matchCreation)
    __obj.updateDynamic("matchId")(matchId)
    __obj.updateDynamic("matchMode")(matchMode)
    __obj.updateDynamic("matchType")(matchType)
    __obj.updateDynamic("matchVersion")(matchVersion)
    __obj.updateDynamic("participantIdentities")(participantIdentities)
    __obj.updateDynamic("participants")(participants)
    __obj.updateDynamic("plateformId")(plateformId)
    __obj.updateDynamic("queueType")(queueType)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("season")(season)
    __obj.updateDynamic("teams")(teams)
    __obj.updateDynamic("timeline")(timeline)
    __obj.asInstanceOf[MatchDetail]
  }
}

