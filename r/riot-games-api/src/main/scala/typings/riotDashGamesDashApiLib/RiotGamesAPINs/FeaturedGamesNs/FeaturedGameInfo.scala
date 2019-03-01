package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.FeaturedGamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturedGameInfo extends js.Object {
  var bannedChampions: js.Array[BannedChampion]
  var gameId: scala.Double
  var gameLength: scala.Double
  var gameMode: java.lang.String
  var gameQueueConfigId: scala.Double
  var gameStartTime: scala.Double
  var gameType: java.lang.String
  var mapId: scala.Double
  var observers: Observer
  var participants: js.Array[Participant]
  var plateformId: java.lang.String
}

object FeaturedGameInfo {
  @scala.inline
  def apply(
    bannedChampions: js.Array[BannedChampion],
    gameId: scala.Double,
    gameLength: scala.Double,
    gameMode: java.lang.String,
    gameQueueConfigId: scala.Double,
    gameStartTime: scala.Double,
    gameType: java.lang.String,
    mapId: scala.Double,
    observers: Observer,
    participants: js.Array[Participant],
    plateformId: java.lang.String
  ): FeaturedGameInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bannedChampions")(bannedChampions)
    __obj.updateDynamic("gameId")(gameId)
    __obj.updateDynamic("gameLength")(gameLength)
    __obj.updateDynamic("gameMode")(gameMode)
    __obj.updateDynamic("gameQueueConfigId")(gameQueueConfigId)
    __obj.updateDynamic("gameStartTime")(gameStartTime)
    __obj.updateDynamic("gameType")(gameType)
    __obj.updateDynamic("mapId")(mapId)
    __obj.updateDynamic("observers")(observers)
    __obj.updateDynamic("participants")(participants)
    __obj.updateDynamic("plateformId")(plateformId)
    __obj.asInstanceOf[FeaturedGameInfo]
  }
}

