package typings.riotDashApiDashNodejs

import typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.API
import typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e
import typings.riotDashGamesDashApi.RiotGamesAPI.Champion.ChampionDto
import typings.riotDashGamesDashApi.RiotGamesAPI.Champion.ChampionListDto
import typings.riotDashGamesDashApi.RiotGamesAPI.ChampionMastery.ChampionMasteryDto
import typings.riotDashGamesDashApi.RiotGamesAPI.CurrentGame.CurrentGameInfo
import typings.riotDashGamesDashApi.RiotGamesAPI.FeaturedGames.FeaturedGames
import typings.riotDashGamesDashApi.RiotGamesAPI.Game.RecentGamesDto
import typings.riotDashGamesDashApi.RiotGamesAPI.League.LeagueDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.ItemDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.ItemListDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.LanguageStringsDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.MapDataDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.MasteryDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.MasteryListDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.RealmDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.RuneDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.RuneListDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.SummonerSpellDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.SummonerSpellListDto
import typings.riotDashGamesDashApi.RiotGamesAPI.LolStatus.Shard
import typings.riotDashGamesDashApi.RiotGamesAPI.Match.MatchDetail
import typings.riotDashGamesDashApi.RiotGamesAPI.MatchList.MatchList
import typings.riotDashGamesDashApi.RiotGamesAPI.Stats.PlayerStatsSummaryListDto
import typings.riotDashGamesDashApi.RiotGamesAPI.Stats.RankedStatsDto
import typings.riotDashGamesDashApi.RiotGamesAPI.Summoner.MasteryPagesDto
import typings.riotDashGamesDashApi.RiotGamesAPI.Summoner.RunePagesDto
import typings.riotDashGamesDashApi.RiotGamesAPI.Summoner.SummonerDto
import typings.riotDashGamesDashApi.RiotGamesAPI.Team.TeamDto
import typings.riotDashGamesDashApi.RiotGamesAPI.TournamentProvider.LobbyEventDto
import typings.riotDashGamesDashApi.RiotGamesAPI.TournamentProvider.TournamentCodeDto
import typings.riotDashGamesDashApi.RiotGamesAPI.TournamentProvider.TournamentCodeParameters
import typings.riotDashGamesDashApi.RiotGamesAPI.TournamentProvider.TournamentCodeUpdateParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot-api-nodejs", JSImport.Namespace)
@js.native
object riotDashApiDashNodejsMod extends js.Object {
  @js.native
  class API protected () extends js.Object {
    def this(ApiKeys: js.Array[String]) = this()
    var ApiKey: js.Any = js.native
    var ApiKeys: js.Any = js.native
    /**
      * get the API Key that is used for the requests
      * @return    {string}    the current API Key
      */
    def getCurrentApiKey(): String = js.native
    /**
      * Send a request to the Riot Games Api and return a formatted json via a callback
      * @param     {string}    url         request url
      * @param     {string}    method      method(post / put / get)
      * @param     {[type]}    data        body parameters
      * @param     {(JSON}     callback    callback function with formatted JSON
      */
    def getJSON(url: String, method: String, data: js.Any): js.Promise[_] = js.native
    def request(url: String, method: String, data: js.Any): js.Promise[_] = js.native
    def request(url: String, method: String, data: js.Any, prop: String): js.Promise[_] = js.native
    /**
      * set the API Keys
      * @param    {string[]}    ApiKeys    the API Keys
      */
    def setApikeys(ApiKeys: js.Array[String]): Unit = js.native
    /**
      * Change the Api Key for the next requests
      */
    /* private */ def switchApiKey(): js.Any = js.native
  }
  
  @js.native
  class ClassicAPI protected () extends API {
    /**
      * ClassicAPI Constructor
      * @param     {string[]}    ApiKeys    API Keys for the requests
      * @param     {region_e}    region     region where you want to send requests
      */
    def this(ApiKeys: js.Array[String], region: region_e) = this()
    var region: js.Any = js.native
    /**
      * get Challengers Teams in 3x3
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getChallengers_3x3(): js.Promise[LeagueDto] = js.native
    /**
      * get Challengers Teams in 5x5
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getChallengers_5x5(): js.Promise[LeagueDto] = js.native
    /**
      * get Challengers in SOLO Queue
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getChallengers_SOLO(): js.Promise[LeagueDto] = js.native
    /**
      * get the champion for a given id
      * @param     {number}                               id          the champion id
      * @param     {RiotGamesAPI.Champion.ChampionDto}    callback    data callback
      */
    def getChampionById(id: Double): js.Promise[ChampionDto] = js.native
    /**
      * get Champion mastery of a player for a given champion ID
      * @param     {number}                                             summonerId    summoner ID
      * @param     {number}                                             championId    Champion ID
      * @param     {RiotGamesAPI.ChampionMastery.ChampionMasteryDto}    callback      data callback
      */
    def getChampionMastery(summonerId: Double, championId: Double): js.Promise[ChampionMasteryDto] = js.native
    /**
      * get all champion masteries for a given summoner
      * @param     {number}                                               summonerId    Summoner ID
      * @param     {[RiotGamesAPI.ChampionMastery.ChampionMasteryDto]}    callback      data callback
      */
    def getChampionMasteryBySummoner(summonerId: Double): js.Promise[js.Array[ChampionMasteryDto]] = js.native
    /**
      * get the mastery score of a summoner
      * @param     {number}    summonerId    Summoner ID
      * @param     {number}    callback      Mastery Score
      */
    def getChampionMasteryScore(summonerId: Double): js.Promise[Double] = js.native
    /**
      * get all champions of league of legends
      * @param     {RiotGamesAPI.Champion.ChampionListDto}    callback    data callback
      */
    def getChampions(): js.Promise[ChampionListDto] = js.native
    /**
      * get the current game infos for a given summoner ID
      * @param     {number}                                      summonerId    Summoner ID
      * @param     {RiotGamesAPI.CurrentGame.CurrentGameInfo}    callback      data callback
      */
    def getCurrentGame(summonerId: Double): js.Promise[CurrentGameInfo] = js.native
    /**
      * get the featured games
      * @param     {RiotGamesAPI.FeaturedGames.FeaturedGames}    callback    data callback
      */
    def getFeaturedGame(): js.Promise[FeaturedGames] = js.native
    /**
      * get the free to play champions
      * @param     {RiotGamesAPI.Champion.ChampionListDto}    callback    data callback
      */
    def getFreeToPlayChampions(): js.Promise[ChampionListDto] = js.native
    /**
      * Get League infos of a summoner
      * @param     {number}                             summonerId    Summoner ID
      * @param     {RiotGamesAPI.League.LeagueDto[]}    callback      data callback
      */
    def getLeagueBySummonerId(summonerId: Double): js.Promise[js.Array[LeagueDto]] = js.native
    /**
      * get League infos of a summoner
      * @param     {number}                             summonerId    Summoner ID
      * @param     {RiotGamesAPI.League.LeagueDto[]}    callback      data callback
      */
    def getLeagueBySummonerIdEntry(summonerId: Double): js.Promise[js.Array[LeagueDto]] = js.native
    /**
      * get league infos by team
      * @param     {string}                             teamId      Team ID
      * @param     {RiotGamesAPI.League.LeagueDto[]}    callback    data callback
      */
    def getLeagueByTeamId(teamId: String): js.Promise[js.Array[LeagueDto]] = js.native
    /**
      * get league infos by team
      * @param     {string}                             teamId      Team ID
      * @param     {RiotGamesAPI.League.LeagueDto[]}    callback    data callback
      */
    def getLeagueByTeamIdEntry(teamId: String): js.Promise[js.Array[LeagueDto]] = js.native
    /**
      * get Master Teams in 3x3
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getMasters_3x3(): js.Promise[LeagueDto] = js.native
    /**
      * get Master Teams in 5x5
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getMasters_5x5(): js.Promise[LeagueDto] = js.native
    /**
      * get Masters in Solo Queue
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getMasters_SOLO(): js.Promise[LeagueDto] = js.native
    /**
      * get match infos for a given match ID
      * @param     {number}                            matchId     Match ID
      * @param     {RiotGamesAPI.Match.MatchDetail}    callback    data callback
      */
    def getMatch(matchId: Double): js.Promise[MatchDetail] = js.native
    /**
      * get match by ID in a tournament
      * @param     {number}                            matchId     Match ID
      * @param     {RiotGamesAPI.Match.MatchDetail}    callback    data callback
      */
    def getMatchForTournament(matchId: Double): js.Promise[MatchDetail] = js.native
    /**
      * get all matches for a given tournament code
      * @param     {string}      tournamentCode    Tournament Code
      * @param     {number[]}    callback          data callback
      */
    def getMatchIdsByTournamentCode(tournamentCode: String): js.Promise[js.Array[Double]] = js.native
    /**
      * get match list of a summoner
      * @param     {number}                              summonerId    Summoner ID
      * @param     {RiotGamesAPI.MatchList.MatchList}    callback      data callback
      */
    def getMatchList(summonerId: Double): js.Promise[MatchList] = js.native
    /**
      * get the recents games for a given Summoner ID
      * @param     {number}                              summonerId    Summoner ID
      * @param     {RiotGamesAPI.Game.RecentGamesDto}    callback      data callback
      */
    def getRecentGames(summonerId: Double): js.Promise[RecentGamesDto] = js.native
    /**
      * get the region where send send request
      * @return    {region_e}    the current region
      */
    def getRegion(): region_e = js.native
    /**
      * get ranked stats of summoner
      * @param     {number}                               summonerId    Summoner ID
      * @param     {RiotGamesAPI.Stats.RankedStatsDto}    callback      data callback
      */
    def getStatsRanked(summonerId: Double): js.Promise[RankedStatsDto] = js.native
    /**
      * get summary ranked stats of summoner
      * @param     {number}                                          summonerId    Summoner ID
      * @param     {RiotGamesAPI.Stats.PlayerStatsSummaryListDto}    callback      data callback
      */
    def getStatsSummary(summonerId: Double): js.Promise[PlayerStatsSummaryListDto] = js.native
    /**
      * get league of legends status
      * @param     {RiotGamesAPI.LolStatus.Shard[]}    callback    data callback
      */
    def getStatus(): js.Promise[js.Array[Shard]] = js.native
    /**
      * get status for a given region
      * @param     {region_e}                        region      region
      * @param     {RiotGamesAPI.LolStatus.Shard}    callback    data callback
      */
    def getStatusByRegion(region: region_e): js.Promise[Shard] = js.native
    /**
      * get summoner infos by summoner ID
      * @param     {number}                               summonerId    Summoner ID
      * @param     {RiotGamesAPI.Summoner.SummonerDto}    callback      data callback
      */
    def getSummonerById(summonerId: Double): js.Promise[SummonerDto] = js.native
    /**
      * get summoner infos by Summoner Name
      * @param     {string}                               summonerName    Summoner Name
      * @param     {RiotGamesAPI.Summoner.SummonerDto}    callback        data callback
      */
    def getSummonerByName(summonerName: String): js.Promise[SummonerDto] = js.native
    /**
      * get masteries of a summoner
      * @param     {number}                                   summonerId    Summoner ID
      * @param     {RiotGamesAPI.Summoner.MasteryPagesDto}    callback      data callback
      */
    def getSummonerMasteries(summonerId: Double): js.Promise[MasteryPagesDto] = js.native
    /**
      * get the Summoner Name of a summoner ID
      * @param     {number}    summonerId    Summoner ID
      * @param     {string}    callback      data callback
      */
    def getSummonerName(summonerId: Double): js.Promise[String] = js.native
    /**
      * get the runes of a summoner
      * @param     {number}                                summonerId    Summoner ID
      * @param     {RiotGamesAPI.Summoner.RunePagesDto}    callback      data callback
      */
    def getSummonerRunes(summonerId: Double): js.Promise[RunePagesDto] = js.native
    /**
      * get Team infos by Team ID
      * @param     {string}                       teamId      Team ID
      * @param     {RiotGamesAPI.Team.TeamDto}    callback    data callback
      */
    def getTeamById(teamId: String): js.Promise[TeamDto] = js.native
    /**
      * get teams of a summoner
      * @param     {number}                         summonerId    Summoner ID
      * @param     {RiotGamesAPI.Team.TeamDto[]}    callback      data callback
      */
    def getTeamsBySummoner(summonerId: Double): js.Promise[js.Array[TeamDto]] = js.native
    /**
      * get The 3 best champion masteries
      * @param     {[type]}                                               summonerId    Summoner ID
      * @param     {[RiotGamesAPI.ChampionMastery.ChampionMasteryDto]}    callback      data callback
      */
    def getTopChampionMastery(summonerId: js.Any): js.Promise[js.Array[ChampionMasteryDto]] = js.native
    /**
      * Edit the consts for a valid url for the riot games api
      * @param     {string}    unparsedURL    the URL to parse
      * @return    {string}                   the Parsed URL
      */
    def parseURL(unparsedURL: String): String = js.native
    /**
      * set the region where you want to send requests
      * @param    {region_e}    region    the region
      */
    def setRegion(region: region_e): Unit = js.native
    /**
      * get data by champion ID
      * @param     {number}                                    championsId    Champion ID
      * @param     {RiotGamesAPI.LolStaticData.ChampionDto}    callback       data callback
      */
    def staticDataChampionById(championsId: Double): js.Promise[typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.ChampionDto] = js.native
    /**
      * get Champions (static data)
      * @param     {RiotGamesAPI.LolStaticData.ChampionListDto}    callback    data callback
      */
    def staticDataChampions(): js.Promise[typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData.ChampionListDto] = js.native
    /**
      * Get item infos by ID
      * @param     {number}                                itemId      item ID
      * @param     {RiotGamesAPI.LolStaticData.ItemDto}    callback    data callback
      */
    def staticDataItemById(itemId: Double): js.Promise[ItemDto] = js.native
    /**
      * get League of Legends Items
      * @param     {RiotGamesAPI.LolStaticData.ItemListDto}    callback    data callback
      */
    def staticDataItems(): js.Promise[ItemListDto] = js.native
    /**
      * get league of legends languages
      * @param     {string[]}    callback    data callback
      */
    def staticDataLanguages(): js.Promise[js.Array[String]] = js.native
    /**
      * get league of legends languages
      * @param     {RiotGamesAPI.LolStaticData.LanguageStringsDto}    callback    data callback
      */
    def staticDataLanguagesStrings(): js.Promise[LanguageStringsDto] = js.native
    /**
      * get Map data
      * @param     {RiotGamesAPI.LolStaticData.MapDataDto}    callback    data callback
      */
    def staticDataMap(): js.Promise[MapDataDto] = js.native
    /**
      * get all masteries
      * @param     {RiotGamesAPI.LolStaticData.MasteryListDto}    callback    data callback
      */
    def staticDataMastery(): js.Promise[MasteryListDto] = js.native
    /**
      * get data by mastery ID
      * @param     {number}                                   masteryId    Mastery ID
      * @param     {RiotGamesAPI.LolStaticData.MasteryDto}    callback     data callback
      */
    def staticDataMasteryById(masteryId: Double): js.Promise[MasteryDto] = js.native
    def staticDataRealm(): js.Promise[RealmDto] = js.native
    /**
      * get rune by Rune ID
      * @param     {number}                                runeId      Rune ID
      * @param     {RiotGamesAPI.LolStaticData.RuneDto}    callback    data callback
      */
    def staticDataRuneById(runeId: Double): js.Promise[RuneDto] = js.native
    /**
      * get all runes
      * @param     {RiotGamesAPI.LolStaticData.RuneListDto}    callback    data callback
      */
    def staticDataRunes(): js.Promise[RuneListDto] = js.native
    /**
      * get summoner spell by summoner spell ID
      * @param     {number}                                         summonerSpellId    Summoner spell ID
      * @param     {RiotGamesAPI.LolStaticData.SummonerSpellDto}    callback           data callback
      */
    def staticDataSummonSpellById(summonerSpellId: Double): js.Promise[SummonerSpellDto] = js.native
    /**
      * get all summoner spells
      * @param     {RiotGamesAPI.LolStaticData.SummonerSpellListDto}    callback    data callback
      */
    def staticDataSummonerSpells(): js.Promise[SummonerSpellListDto] = js.native
    /**
      * get league of legends  versions
      * @param     {string[]}    callback    data callback
      */
    def staticDataVersion(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  class TournamentAPI protected () extends API {
    def this(apiKeys: String*) = this()
    /**
      * create tournament Codes for a given tournament
      * @param     {number}                                                      tournamentId    the ID of the tournament
      * @param     {number}                                                      count           Number of codes you want
      * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeParameters}    params          Tournament Code parameters
      * @param     {number[]}                                                    callback        Tournaments Codes                                                                    [description]
      */
    def createTournamentCodes(tournamentId: Double, count: Double, params: TournamentCodeParameters): js.Promise[js.Array[Double]] = js.native
    /**
      * edit the tournament Code parameters for a given tournament Code
      * @param     {string}                                                            tournamentCode    Tournament Code to update
      * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeUpdateParameters}    params            parameters to edit
      * @param     {(}                                                                 callback          callback if succes
      */
    def editTournamentByCode(tournamentCode: String, params: TournamentCodeUpdateParameters): js.Promise[js.Function0[Unit]] = js.native
    /**
      * get the lobby envents for a given tournament Code
      * @param     {string}                                           tournamentCode    the tournament code to get the lobby events
      * @param     {RiotGamesAPI.TournamentProvider.LobbyEventDto}    callback          lobby events
      */
    def getLobbyEventByCode(tournamentCode: String): js.Promise[LobbyEventDto] = js.native
    /**
      * get tournament infos for a given tournament code
      * @param     {string}                                               tournamentCode    Tournament Code
      * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeDto}    callback          Tournament Infos
      */
    def getTournamentByCode(tournamentCode: String): js.Promise[TournamentCodeDto] = js.native
    /**
      * Register a new tournament provider
      * @param     {region_e}    region      region where you want to register the provider
      * @param     {string}      url         url of callback for the POST notifications
      * @param     {number}      callback    returns  the tounament provider ID
      */
    def registerProvider(region: region_e, url: String): js.Promise[Double] = js.native
    /**
      * Register a new tournament
      * @param     {string}    name          Name of tournament
      * @param     {number}    providerId    Provider ID
      * @param     {number}    callback      returns the tournament ID
      */
    def registerTournament(name: String, providerId: Double): js.Promise[Double] = js.native
  }
  
  @js.native
  sealed trait region_e extends js.Object
  
  val BASE_URL: String = js.native
  val URL_1_2: String = js.native
  val URL_1_3: String = js.native
  val URL_1_4: String = js.native
  val URL_2_2: String = js.native
  val URL_2_4: String = js.native
  val URL_2_5: String = js.native
  @js.native
  object region_e extends js.Object {
    @js.native
    sealed trait BR extends region_e
    
    @js.native
    sealed trait EUNE extends region_e
    
    @js.native
    sealed trait EUW extends region_e
    
    @js.native
    sealed trait KR extends region_e
    
    @js.native
    sealed trait LAN extends region_e
    
    @js.native
    sealed trait LAS extends region_e
    
    @js.native
    sealed trait NA extends region_e
    
    @js.native
    sealed trait OCE extends region_e
    
    @js.native
    sealed trait PBE extends region_e
    
    @js.native
    sealed trait RU extends region_e
    
    @js.native
    sealed trait TR extends region_e
    
    /* 0 */ val BR: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.BR with Double = js.native
    /* 1 */ val EUNE: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.EUNE with Double = js.native
    /* 2 */ val EUW: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.EUW with Double = js.native
    /* 3 */ val KR: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.KR with Double = js.native
    /* 4 */ val LAN: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.LAN with Double = js.native
    /* 5 */ val LAS: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.LAS with Double = js.native
    /* 6 */ val NA: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.NA with Double = js.native
    /* 7 */ val OCE: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.OCE with Double = js.native
    /* 10 */ val PBE: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.PBE with Double = js.native
    /* 9 */ val RU: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.RU with Double = js.native
    /* 8 */ val TR: typings.riotDashApiDashNodejs.riotDashApiDashNodejsMod.region_e.TR with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[region_e with Double] = js.native
  }
  
}

