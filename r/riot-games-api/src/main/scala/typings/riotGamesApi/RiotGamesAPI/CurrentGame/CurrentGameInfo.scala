package typings.riotGamesApi.RiotGamesAPI.CurrentGame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentGameInfo extends js.Object {
  
  var bannedChampion: js.Array[BannedChampion] = js.native
  
  var gameId: Double = js.native
  
  var gameLength: Double = js.native
  
  var gameMode: Double = js.native
  
  var gameQueueConfigId: Double = js.native
  
  var gameStartTime: Double = js.native
  
  var gameType: String = js.native
  
  var mapId: Double = js.native
  
  var observers: Observer = js.native
  
  var participants: js.Array[CurrentGameParticipant] = js.native
  
  var platformId: String = js.native
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
  
  @scala.inline
  implicit class CurrentGameInfoOps[Self <: CurrentGameInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBannedChampionVarargs(value: BannedChampion*): Self = this.set("bannedChampion", js.Array(value :_*))
    
    @scala.inline
    def setBannedChampion(value: js.Array[BannedChampion]): Self = this.set("bannedChampion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameId(value: Double): Self = this.set("gameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameLength(value: Double): Self = this.set("gameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameMode(value: Double): Self = this.set("gameMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameQueueConfigId(value: Double): Self = this.set("gameQueueConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameStartTime(value: Double): Self = this.set("gameStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameType(value: String): Self = this.set("gameType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapId(value: Double): Self = this.set("mapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservers(value: Observer): Self = this.set("observers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: CurrentGameParticipant*): Self = this.set("participants", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: js.Array[CurrentGameParticipant]): Self = this.set("participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformId(value: String): Self = this.set("platformId", value.asInstanceOf[js.Any])
  }
}
