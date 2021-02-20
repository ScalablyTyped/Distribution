package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * featured-games-v1.0
  */
object FeaturedGames {
  
  @js.native
  trait BannedChampion extends StObject {
    
    var championId: Double = js.native
    
    var pickTurn: Double = js.native
    
    var teamId: Double = js.native
  }
  object BannedChampion {
    
    @scala.inline
    def apply(championId: Double, pickTurn: Double, teamId: Double): BannedChampion = {
      val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], pickTurn = pickTurn.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BannedChampion]
    }
    
    @scala.inline
    implicit class BannedChampionMutableBuilder[Self <: BannedChampion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickTurn(value: Double): Self = StObject.set(x, "pickTurn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeaturedGameInfo extends StObject {
    
    var bannedChampions: js.Array[BannedChampion] = js.native
    
    var gameId: Double = js.native
    
    var gameLength: Double = js.native
    
    var gameMode: String = js.native
    
    var gameQueueConfigId: Double = js.native
    
    var gameStartTime: Double = js.native
    
    var gameType: String = js.native
    
    var mapId: Double = js.native
    
    var observers: Observer = js.native
    
    var participants: js.Array[Participant] = js.native
    
    var plateformId: String = js.native
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
      val __obj = js.Dynamic.literal(bannedChampions = bannedChampions.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameLength = gameLength.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameQueueConfigId = gameQueueConfigId.asInstanceOf[js.Any], gameStartTime = gameStartTime.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], plateformId = plateformId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeaturedGameInfo]
    }
    
    @scala.inline
    implicit class FeaturedGameInfoMutableBuilder[Self <: FeaturedGameInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBannedChampions(value: js.Array[BannedChampion]): Self = StObject.set(x, "bannedChampions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBannedChampionsVarargs(value: BannedChampion*): Self = StObject.set(x, "bannedChampions", js.Array(value :_*))
      
      @scala.inline
      def setGameId(value: Double): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameLength(value: Double): Self = StObject.set(x, "gameLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameMode(value: String): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameQueueConfigId(value: Double): Self = StObject.set(x, "gameQueueConfigId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameStartTime(value: Double): Self = StObject.set(x, "gameStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameType(value: String): Self = StObject.set(x, "gameType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservers(value: Observer): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipants(value: js.Array[Participant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "participants", js.Array(value :_*))
      
      @scala.inline
      def setPlateformId(value: String): Self = StObject.set(x, "plateformId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeaturedGames extends StObject {
    
    var clientRefreshInterval: Double = js.native
    
    var gameList: js.Array[FeaturedGameInfo] = js.native
  }
  object FeaturedGames {
    
    @scala.inline
    def apply(clientRefreshInterval: Double, gameList: js.Array[FeaturedGameInfo]): typings.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames = {
      val __obj = js.Dynamic.literal(clientRefreshInterval = clientRefreshInterval.asInstanceOf[js.Any], gameList = gameList.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames]
    }
    
    @scala.inline
    implicit class FeaturedGamesMutableBuilder[Self <: typings.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientRefreshInterval(value: Double): Self = StObject.set(x, "clientRefreshInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameList(value: js.Array[FeaturedGameInfo]): Self = StObject.set(x, "gameList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameListVarargs(value: FeaturedGameInfo*): Self = StObject.set(x, "gameList", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Observer extends StObject {
    
    var encryptionKey: String = js.native
  }
  object Observer {
    
    @scala.inline
    def apply(encryptionKey: String): Observer = {
      val __obj = js.Dynamic.literal(encryptionKey = encryptionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Participant extends StObject {
    
    var bot: Boolean = js.native
    
    var championId: Double = js.native
    
    var profileIconId: Double = js.native
    
    var spell1Id: Double = js.native
    
    var spell2Id: Double = js.native
    
    var summonerName: String = js.native
    
    var teamId: Double = js.native
  }
  object Participant {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ParticipantMutableBuilder[Self <: Participant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBot(value: Boolean): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileIconId(value: Double): Self = StObject.set(x, "profileIconId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell1Id(value: Double): Self = StObject.set(x, "spell1Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell2Id(value: Double): Self = StObject.set(x, "spell2Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummonerName(value: String): Self = StObject.set(x, "summonerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
}
