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
    val __obj = js.Dynamic.literal(bannedChampions = bannedChampions, gameId = gameId, gameLength = gameLength, gameMode = gameMode, gameQueueConfigId = gameQueueConfigId, gameStartTime = gameStartTime, gameType = gameType, mapId = mapId, observers = observers, participants = participants, plateformId = plateformId)
  
    __obj.asInstanceOf[FeaturedGameInfo]
  }
}

