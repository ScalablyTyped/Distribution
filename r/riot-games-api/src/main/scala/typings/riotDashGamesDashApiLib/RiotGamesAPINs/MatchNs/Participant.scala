package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Participant extends js.Object {
  var championId: scala.Double
  var highestAchievedSeasonTier: java.lang.String
  var masteries: js.Array[Mastery]
  var participantId: scala.Double
  var runes: js.Array[Rune]
  var spell1Id: scala.Double
  var spell2Id: scala.Double
  var stats: ParticipantStats
  var teamId: scala.Double
  var timeline: ParticipantTimeline
}

