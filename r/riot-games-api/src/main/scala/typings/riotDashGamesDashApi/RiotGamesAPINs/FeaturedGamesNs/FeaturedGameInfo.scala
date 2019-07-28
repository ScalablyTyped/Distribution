package typings.riotDashGamesDashApi.RiotGamesAPINs.FeaturedGamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturedGameInfo extends js.Object {
  var bannedChampions: js.Array[BannedChampion]
  var gameId: Double
  var gameLength: Double
  var gameMode: String
  var gameQueueConfigId: Double
  var gameStartTime: Double
  var gameType: String
  var mapId: Double
  var observers: Observer
  var participants: js.Array[Participant]
  var plateformId: String
}

object FeaturedGameInfo {
  @scala.inline
  def apply(
    bannedChampions: js.Array[BannedChampion],
    gameId: Double,
    gameLength: Double,
    gameMode: String,
    gameQueueConfigId: Double,
    gameStartTime: Double,
    gameType: String,
    mapId: Double,
    observers: Observer,
    participants: js.Array[Participant],
    plateformId: String
  ): FeaturedGameInfo = {
    val __obj = js.Dynamic.literal(bannedChampions = bannedChampions, gameId = gameId, gameLength = gameLength, gameMode = gameMode, gameQueueConfigId = gameQueueConfigId, gameStartTime = gameStartTime, gameType = gameType, mapId = mapId, observers = observers, participants = participants, plateformId = plateformId)
  
    __obj.asInstanceOf[FeaturedGameInfo]
  }
}

