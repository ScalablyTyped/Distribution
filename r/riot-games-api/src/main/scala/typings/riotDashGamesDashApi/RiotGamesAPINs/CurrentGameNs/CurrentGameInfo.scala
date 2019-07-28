package typings.riotDashGamesDashApi.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentGameInfo extends js.Object {
  var bannedChampion: js.Array[BannedChampion]
  var gameId: Double
  var gameLength: Double
  var gameMode: Double
  var gameQueueConfigId: Double
  var gameStartTime: Double
  var gameType: String
  var mapId: Double
  var observers: Observer
  var participants: js.Array[CurrentGameParticipant]
  var platformId: String
}

object CurrentGameInfo {
  @scala.inline
  def apply(
    bannedChampion: js.Array[BannedChampion],
    gameId: Double,
    gameLength: Double,
    gameMode: Double,
    gameQueueConfigId: Double,
    gameStartTime: Double,
    gameType: String,
    mapId: Double,
    observers: Observer,
    participants: js.Array[CurrentGameParticipant],
    platformId: String
  ): CurrentGameInfo = {
    val __obj = js.Dynamic.literal(bannedChampion = bannedChampion, gameId = gameId, gameLength = gameLength, gameMode = gameMode, gameQueueConfigId = gameQueueConfigId, gameStartTime = gameStartTime, gameType = gameType, mapId = mapId, observers = observers, participants = participants, platformId = platformId)
  
    __obj.asInstanceOf[CurrentGameInfo]
  }
}

