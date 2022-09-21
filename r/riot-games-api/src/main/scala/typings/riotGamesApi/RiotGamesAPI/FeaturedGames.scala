package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * featured-games-v1.0
  */
object FeaturedGames {
  
  trait BannedChampion extends StObject {
    
    var championId: Double
    
    var pickTurn: Double
    
    var teamId: Double
  }
  object BannedChampion {
    
    inline def apply(championId: Double, pickTurn: Double, teamId: Double): BannedChampion = {
      val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], pickTurn = pickTurn.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BannedChampion]
    }
    
    extension [Self <: BannedChampion](x: Self) {
      
      inline def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      inline def setPickTurn(value: Double): Self = StObject.set(x, "pickTurn", value.asInstanceOf[js.Any])
      
      inline def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeaturedGameInfo extends StObject {
    
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
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(bannedChampions = bannedChampions.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameLength = gameLength.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameQueueConfigId = gameQueueConfigId.asInstanceOf[js.Any], gameStartTime = gameStartTime.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], plateformId = plateformId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeaturedGameInfo]
    }
    
    extension [Self <: FeaturedGameInfo](x: Self) {
      
      inline def setBannedChampions(value: js.Array[BannedChampion]): Self = StObject.set(x, "bannedChampions", value.asInstanceOf[js.Any])
      
      inline def setBannedChampionsVarargs(value: BannedChampion*): Self = StObject.set(x, "bannedChampions", js.Array(value*))
      
      inline def setGameId(value: Double): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
      
      inline def setGameLength(value: Double): Self = StObject.set(x, "gameLength", value.asInstanceOf[js.Any])
      
      inline def setGameMode(value: String): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
      
      inline def setGameQueueConfigId(value: Double): Self = StObject.set(x, "gameQueueConfigId", value.asInstanceOf[js.Any])
      
      inline def setGameStartTime(value: Double): Self = StObject.set(x, "gameStartTime", value.asInstanceOf[js.Any])
      
      inline def setGameType(value: String): Self = StObject.set(x, "gameType", value.asInstanceOf[js.Any])
      
      inline def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      inline def setObservers(value: Observer): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setParticipants(value: js.Array[Participant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      inline def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "participants", js.Array(value*))
      
      inline def setPlateformId(value: String): Self = StObject.set(x, "plateformId", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeaturedGames extends StObject {
    
    var clientRefreshInterval: Double
    
    var gameList: js.Array[FeaturedGameInfo]
  }
  object FeaturedGames {
    
    inline def apply(clientRefreshInterval: Double, gameList: js.Array[FeaturedGameInfo]): typings.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames = {
      val __obj = js.Dynamic.literal(clientRefreshInterval = clientRefreshInterval.asInstanceOf[js.Any], gameList = gameList.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames]
    }
    
    extension [Self <: typings.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames](x: Self) {
      
      inline def setClientRefreshInterval(value: Double): Self = StObject.set(x, "clientRefreshInterval", value.asInstanceOf[js.Any])
      
      inline def setGameList(value: js.Array[FeaturedGameInfo]): Self = StObject.set(x, "gameList", value.asInstanceOf[js.Any])
      
      inline def setGameListVarargs(value: FeaturedGameInfo*): Self = StObject.set(x, "gameList", js.Array(value*))
    }
  }
  
  trait Observer extends StObject {
    
    var encryptionKey: String
  }
  object Observer {
    
    inline def apply(encryptionKey: String): Observer = {
      val __obj = js.Dynamic.literal(encryptionKey = encryptionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Participant extends StObject {
    
    var bot: Boolean
    
    var championId: Double
    
    var profileIconId: Double
    
    var spell1Id: Double
    
    var spell2Id: Double
    
    var summonerName: String
    
    var teamId: Double
  }
  object Participant {
    
    inline def apply(
      bot: Boolean,
      championId: Double,
      profileIconId: Double,
      spell1Id: Double,
      spell2Id: Double,
      summonerName: String,
      teamId: Double
    ): Participant = {
      val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], championId = championId.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Participant]
    }
    
    extension [Self <: Participant](x: Self) {
      
      inline def setBot(value: Boolean): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
      
      inline def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      inline def setProfileIconId(value: Double): Self = StObject.set(x, "profileIconId", value.asInstanceOf[js.Any])
      
      inline def setSpell1Id(value: Double): Self = StObject.set(x, "spell1Id", value.asInstanceOf[js.Any])
      
      inline def setSpell2Id(value: Double): Self = StObject.set(x, "spell2Id", value.asInstanceOf[js.Any])
      
      inline def setSummonerName(value: String): Self = StObject.set(x, "summonerName", value.asInstanceOf[js.Any])
      
      inline def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
}
