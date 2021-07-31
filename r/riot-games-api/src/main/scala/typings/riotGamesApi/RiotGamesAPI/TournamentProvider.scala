package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * tournament-provider-v1
  */
object TournamentProvider {
  
  trait LobbyEventDto extends StObject {
    
    var eventType: String
    
    var summonerId: String
    
    var timestamp: String
  }
  object LobbyEventDto {
    
    @scala.inline
    def apply(eventType: String, summonerId: String, timestamp: String): LobbyEventDto = {
      val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LobbyEventDto]
    }
    
    @scala.inline
    implicit class LobbyEventDtoMutableBuilder[Self <: LobbyEventDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummonerId(value: String): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait LobbyEventDtoWrapper extends StObject {
    
    var eventList: js.Array[LobbyEventDto]
  }
  object LobbyEventDtoWrapper {
    
    @scala.inline
    def apply(eventList: js.Array[LobbyEventDto]): LobbyEventDtoWrapper = {
      val __obj = js.Dynamic.literal(eventList = eventList.asInstanceOf[js.Any])
      __obj.asInstanceOf[LobbyEventDtoWrapper]
    }
    
    @scala.inline
    implicit class LobbyEventDtoWrapperMutableBuilder[Self <: LobbyEventDtoWrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventList(value: js.Array[LobbyEventDto]): Self = StObject.set(x, "eventList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventListVarargs(value: LobbyEventDto*): Self = StObject.set(x, "eventList", js.Array(value :_*))
    }
  }
  
  trait ProviderRegistrationParameters extends StObject {
    
    var region: String
    
    var url: String
  }
  object ProviderRegistrationParameters {
    
    @scala.inline
    def apply(region: String, url: String): ProviderRegistrationParameters = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderRegistrationParameters]
    }
    
    @scala.inline
    implicit class ProviderRegistrationParametersMutableBuilder[Self <: ProviderRegistrationParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SummonerIdParams extends StObject {
    
    var participants: js.Array[Double]
  }
  object SummonerIdParams {
    
    @scala.inline
    def apply(participants: js.Array[Double]): SummonerIdParams = {
      val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any])
      __obj.asInstanceOf[SummonerIdParams]
    }
    
    @scala.inline
    implicit class SummonerIdParamsMutableBuilder[Self <: SummonerIdParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParticipants(value: js.Array[Double]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipantsVarargs(value: Double*): Self = StObject.set(x, "participants", js.Array(value :_*))
    }
  }
  
  trait TournamentCodeDto extends StObject {
    
    var code: String
    
    var id: Double
    
    var lobbyName: String
    
    var map: String
    
    var metaData: String
    
    var participants: js.Array[Double]
    
    var password: String
    
    var pickType: String
    
    var providerId: Double
    
    var region: String
    
    var spectators: String
    
    var teamSize: Double
    
    var tournamentId: Double
  }
  object TournamentCodeDto {
    
    @scala.inline
    def apply(
      code: String,
      id: Double,
      lobbyName: String,
      map: String,
      metaData: String,
      participants: js.Array[Double],
      password: String,
      pickType: String,
      providerId: Double,
      region: String,
      spectators: String,
      teamSize: Double,
      tournamentId: Double
    ): TournamentCodeDto = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lobbyName = lobbyName.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], spectators = spectators.asInstanceOf[js.Any], teamSize = teamSize.asInstanceOf[js.Any], tournamentId = tournamentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TournamentCodeDto]
    }
    
    @scala.inline
    implicit class TournamentCodeDtoMutableBuilder[Self <: TournamentCodeDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLobbyName(value: String): Self = StObject.set(x, "lobbyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaData(value: String): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipants(value: js.Array[Double]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipantsVarargs(value: Double*): Self = StObject.set(x, "participants", js.Array(value :_*))
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickType(value: String): Self = StObject.set(x, "pickType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderId(value: Double): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectators(value: String): Self = StObject.set(x, "spectators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamSize(value: Double): Self = StObject.set(x, "teamSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTournamentId(value: Double): Self = StObject.set(x, "tournamentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TournamentCodeParameters extends StObject {
    
    var allowedSummonerIds: SummonerIdParams
    
    var mapType: String
    
    var metadata: String
    
    var pickType: String
    
    var spectatorType: String
    
    var teamSize: Double
  }
  object TournamentCodeParameters {
    
    @scala.inline
    def apply(
      allowedSummonerIds: SummonerIdParams,
      mapType: String,
      metadata: String,
      pickType: String,
      spectatorType: String,
      teamSize: Double
    ): TournamentCodeParameters = {
      val __obj = js.Dynamic.literal(allowedSummonerIds = allowedSummonerIds.asInstanceOf[js.Any], mapType = mapType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], spectatorType = spectatorType.asInstanceOf[js.Any], teamSize = teamSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[TournamentCodeParameters]
    }
    
    @scala.inline
    implicit class TournamentCodeParametersMutableBuilder[Self <: TournamentCodeParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedSummonerIds(value: SummonerIdParams): Self = StObject.set(x, "allowedSummonerIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapType(value: String): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickType(value: String): Self = StObject.set(x, "pickType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectatorType(value: String): Self = StObject.set(x, "spectatorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamSize(value: Double): Self = StObject.set(x, "teamSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait TournamentCodeUpdateParameters extends StObject {
    
    var allowedParticipants: String
    
    var mapType: String
    
    var pickType: String
    
    var spectatorType: String
  }
  object TournamentCodeUpdateParameters {
    
    @scala.inline
    def apply(allowedParticipants: String, mapType: String, pickType: String, spectatorType: String): TournamentCodeUpdateParameters = {
      val __obj = js.Dynamic.literal(allowedParticipants = allowedParticipants.asInstanceOf[js.Any], mapType = mapType.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], spectatorType = spectatorType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TournamentCodeUpdateParameters]
    }
    
    @scala.inline
    implicit class TournamentCodeUpdateParametersMutableBuilder[Self <: TournamentCodeUpdateParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedParticipants(value: String): Self = StObject.set(x, "allowedParticipants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapType(value: String): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickType(value: String): Self = StObject.set(x, "pickType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectatorType(value: String): Self = StObject.set(x, "spectatorType", value.asInstanceOf[js.Any])
    }
  }
  
  trait TournamentRegistrationParameters extends StObject {
    
    var name: String
    
    var providerId: Double
  }
  object TournamentRegistrationParameters {
    
    @scala.inline
    def apply(name: String, providerId: Double): TournamentRegistrationParameters = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TournamentRegistrationParameters]
    }
    
    @scala.inline
    implicit class TournamentRegistrationParametersMutableBuilder[Self <: TournamentRegistrationParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderId(value: Double): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    }
  }
}
