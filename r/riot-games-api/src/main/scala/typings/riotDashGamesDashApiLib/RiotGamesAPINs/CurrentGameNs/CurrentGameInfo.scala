package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentGameInfo extends js.Object {
  var bannedChampion: js.Array[BannedChampion]
  var gameId: scala.Double
  var gameLength: scala.Double
  var gameMode: scala.Double
  var gameQueueConfigId: scala.Double
  var gameStartTime: scala.Double
  var gameType: java.lang.String
  var mapId: scala.Double
  var observers: Observer
  var participants: js.Array[CurrentGameParticipant]
  var platformId: java.lang.String
}

object CurrentGameInfo {
  @scala.inline
  def apply(
    bannedChampion: js.Array[BannedChampion],
    gameId: scala.Double,
    gameLength: scala.Double,
    gameMode: scala.Double,
    gameQueueConfigId: scala.Double,
    gameStartTime: scala.Double,
    gameType: java.lang.String,
    mapId: scala.Double,
    observers: Observer,
    participants: js.Array[CurrentGameParticipant],
    platformId: java.lang.String
  ): CurrentGameInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bannedChampion")(bannedChampion)
    __obj.updateDynamic("gameId")(gameId)
    __obj.updateDynamic("gameLength")(gameLength)
    __obj.updateDynamic("gameMode")(gameMode)
    __obj.updateDynamic("gameQueueConfigId")(gameQueueConfigId)
    __obj.updateDynamic("gameStartTime")(gameStartTime)
    __obj.updateDynamic("gameType")(gameType)
    __obj.updateDynamic("mapId")(mapId)
    __obj.updateDynamic("observers")(observers)
    __obj.updateDynamic("participants")(participants)
    __obj.updateDynamic("platformId")(platformId)
    __obj.asInstanceOf[CurrentGameInfo]
  }
}

