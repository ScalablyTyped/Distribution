package typings.riotGamesApi.RiotGamesAPI.CurrentGame

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
    val __obj = js.Dynamic.literal(bannedChampion = bannedChampion.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameLength = gameLength.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameQueueConfigId = gameQueueConfigId.asInstanceOf[js.Any], gameStartTime = gameStartTime.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], platformId = platformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentGameInfo]
  }
}

