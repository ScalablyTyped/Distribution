package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * current-game-v1.0
  */
object CurrentGame {
  
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
  
  trait CurrentGameInfo extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: CurrentGameInfo](x: Self) {
      
      inline def setBannedChampion(value: js.Array[BannedChampion]): Self = StObject.set(x, "bannedChampion", value.asInstanceOf[js.Any])
      
      inline def setBannedChampionVarargs(value: BannedChampion*): Self = StObject.set(x, "bannedChampion", js.Array(value :_*))
      
      inline def setGameId(value: Double): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
      
      inline def setGameLength(value: Double): Self = StObject.set(x, "gameLength", value.asInstanceOf[js.Any])
      
      inline def setGameMode(value: Double): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
      
      inline def setGameQueueConfigId(value: Double): Self = StObject.set(x, "gameQueueConfigId", value.asInstanceOf[js.Any])
      
      inline def setGameStartTime(value: Double): Self = StObject.set(x, "gameStartTime", value.asInstanceOf[js.Any])
      
      inline def setGameType(value: String): Self = StObject.set(x, "gameType", value.asInstanceOf[js.Any])
      
      inline def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      inline def setObservers(value: Observer): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setParticipants(value: js.Array[CurrentGameParticipant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      inline def setParticipantsVarargs(value: CurrentGameParticipant*): Self = StObject.set(x, "participants", js.Array(value :_*))
      
      inline def setPlatformId(value: String): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentGameParticipant extends StObject {
    
    var bot: Boolean
    
    var championId: Double
    
    var masteries: js.Array[Mastery]
    
    var profileIconId: Double
    
    var runes: js.Array[Rune]
    
    var spell1Id: Double
    
    var spell2Id: Double
    
    var summonerId: Double
    
    var summonerName: String
    
    var teamId: Double
  }
  object CurrentGameParticipant {
    
    inline def apply(
      bot: Boolean,
      championId: Double,
      masteries: js.Array[Mastery],
      profileIconId: Double,
      runes: js.Array[Rune],
      spell1Id: Double,
      spell2Id: Double,
      summonerId: Double,
      summonerName: String,
      teamId: Double
    ): CurrentGameParticipant = {
      val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], championId = championId.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentGameParticipant]
    }
    
    extension [Self <: CurrentGameParticipant](x: Self) {
      
      inline def setBot(value: Boolean): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
      
      inline def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      inline def setMasteries(value: js.Array[Mastery]): Self = StObject.set(x, "masteries", value.asInstanceOf[js.Any])
      
      inline def setMasteriesVarargs(value: Mastery*): Self = StObject.set(x, "masteries", js.Array(value :_*))
      
      inline def setProfileIconId(value: Double): Self = StObject.set(x, "profileIconId", value.asInstanceOf[js.Any])
      
      inline def setRunes(value: js.Array[Rune]): Self = StObject.set(x, "runes", value.asInstanceOf[js.Any])
      
      inline def setRunesVarargs(value: Rune*): Self = StObject.set(x, "runes", js.Array(value :_*))
      
      inline def setSpell1Id(value: Double): Self = StObject.set(x, "spell1Id", value.asInstanceOf[js.Any])
      
      inline def setSpell2Id(value: Double): Self = StObject.set(x, "spell2Id", value.asInstanceOf[js.Any])
      
      inline def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
      
      inline def setSummonerName(value: String): Self = StObject.set(x, "summonerName", value.asInstanceOf[js.Any])
      
      inline def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mastery extends StObject {
    
    var masterId: Double
    
    var rank: Double
  }
  object Mastery {
    
    inline def apply(masterId: Double, rank: Double): Mastery = {
      val __obj = js.Dynamic.literal(masterId = masterId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mastery]
    }
    
    extension [Self <: Mastery](x: Self) {
      
      inline def setMasterId(value: Double): Self = StObject.set(x, "masterId", value.asInstanceOf[js.Any])
      
      inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
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
  
  trait Rune extends StObject {
    
    var count: Double
    
    var runeId: Double
  }
  object Rune {
    
    inline def apply(count: Double, runeId: Double): Rune = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], runeId = runeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rune]
    }
    
    extension [Self <: Rune](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setRuneId(value: Double): Self = StObject.set(x, "runeId", value.asInstanceOf[js.Any])
    }
  }
}
