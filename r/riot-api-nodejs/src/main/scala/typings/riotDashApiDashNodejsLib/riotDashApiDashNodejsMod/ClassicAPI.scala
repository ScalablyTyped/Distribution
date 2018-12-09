package typings
package riotDashApiDashNodejsLib.riotDashApiDashNodejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot-api-nodejs", "ClassicAPI")
@js.native
class ClassicAPI protected () extends API {
  /**
          * ClassicAPI Constructor
          * @param     {string[]}    ApiKeys    API Keys for the requests
          * @param     {region_e}    region     region where you want to send requests
          */
  def this(ApiKeys: js.Array[java.lang.String], region: region_e) = this()
  var region: js.Any = js.native
  /**
          * get Challengers Teams in 3x3
          * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
          */
  def getChallengers_3x3(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto] = js.native
  /**
          * get Challengers Teams in 5x5
          * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
          */
  def getChallengers_5x5(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto] = js.native
  /**
          * get Challengers in SOLO Queue
          * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
          */
  def getChallengers_SOLO(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto] = js.native
  /**
          * get the champion for a given id
          * @param     {number}                               id          the champion id
          * @param     {RiotGamesAPI.Champion.ChampionDto}    callback    data callback
          */
  def getChampionById(id: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.ChampionNs.ChampionDto] = js.native
  /**
          * get Champion mastery of a player for a given champion ID
          * @param     {number}                                             summonerId    summoner ID
          * @param     {number}                                             championId    Champion ID
          * @param     {RiotGamesAPI.ChampionMastery.ChampionMasteryDto}    callback      data callback
          */
  def getChampionMastery(summonerId: scala.Double, championId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.ChampionMasteryNs.ChampionMasteryDto] = js.native
  /**
          * get all champion masteries for a given summoner
          * @param     {number}                                               summonerId    Summoner ID
          * @param     {[RiotGamesAPI.ChampionMastery.ChampionMasteryDto]}    callback      data callback
          */
  def getChampionMasteryBySummoner(summonerId: scala.Double): js.Promise[
    js.Array[riotDashGamesDashApiLib.RiotGamesAPINs.ChampionMasteryNs.ChampionMasteryDto]
  ] = js.native
  /**
          * get the mastery score of a summoner
          * @param     {number}    summonerId    Summoner ID
          * @param     {number}    callback      Mastery Score
          */
  def getChampionMasteryScore(summonerId: scala.Double): js.Promise[scala.Double] = js.native
  /**
          * get all champions of league of legends
          * @param     {RiotGamesAPI.Champion.ChampionListDto}    callback    data callback
          */
  def getChampions(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.ChampionNs.ChampionListDto] = js.native
  /**
          * get the current game infos for a given summoner ID
          * @param     {number}                                      summonerId    Summoner ID
          * @param     {RiotGamesAPI.CurrentGame.CurrentGameInfo}    callback      data callback
          */
  def getCurrentGame(summonerId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.CurrentGameNs.CurrentGameInfo] = js.native
  /**
          * get the featured games
          * @param     {RiotGamesAPI.FeaturedGames.FeaturedGames}    callback    data callback
          */
  def getFeaturedGame(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.FeaturedGamesNs.FeaturedGames] = js.native
  /**
          * get the free to play champions
          * @param     {RiotGamesAPI.Champion.ChampionListDto}    callback    data callback
          */
  def getFreeToPlayChampions(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.ChampionNs.ChampionListDto] = js.native
  /**
          * Get League infos of a summoner
          * @param     {number}                             summonerId    Summoner ID
          * @param     {RiotGamesAPI.League.LeagueDto[]}    callback      data callback
          */
  def getLeagueBySummonerId(summonerId: scala.Double): js.Promise[js.Array[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto]] = js.native
  /**
          * get League infos of a summoner
          * @param     {number}                             summonerId    Summoner ID
          * @param     {RiotGamesAPI.League.LeagueDto[]}    callback      data callback
          */
  def getLeagueBySummonerIdEntry(summonerId: scala.Double): js.Promise[js.Array[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto]] = js.native
  /**
          * get league infos by team
          * @param     {string}                             teamId      Team ID
          * @param     {RiotGamesAPI.League.LeagueDto[]}    callback    data callback
          */
  def getLeagueByTeamId(teamId: java.lang.String): js.Promise[js.Array[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto]] = js.native
  /**
          * get league infos by team
          * @param     {string}                             teamId      Team ID
          * @param     {RiotGamesAPI.League.LeagueDto[]}    callback    data callback
          */
  def getLeagueByTeamIdEntry(teamId: java.lang.String): js.Promise[js.Array[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto]] = js.native
  /**
          * get Master Teams in 3x3
          * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
          */
  def getMasters_3x3(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto] = js.native
  /**
          * get Master Teams in 5x5
          * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
          */
  def getMasters_5x5(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto] = js.native
  /**
          * get Masters in Solo Queue
          * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
          */
  def getMasters_SOLO(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs.LeagueDto] = js.native
  /**
          * get match infos for a given match ID
          * @param     {number}                            matchId     Match ID
          * @param     {RiotGamesAPI.Match.MatchDetail}    callback    data callback
          */
  def getMatch(matchId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs.MatchDetail] = js.native
  /**
          * get match by ID in a tournament
          * @param     {number}                            matchId     Match ID
          * @param     {RiotGamesAPI.Match.MatchDetail}    callback    data callback
          */
  def getMatchForTournament(matchId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs.MatchDetail] = js.native
  /**
          * get all matches for a given tournament code
          * @param     {string}      tournamentCode    Tournament Code
          * @param     {number[]}    callback          data callback
          */
  def getMatchIdsByTournamentCode(tournamentCode: java.lang.String): js.Promise[js.Array[scala.Double]] = js.native
  /**
          * get match list of a summoner
          * @param     {number}                              summonerId    Summoner ID
          * @param     {RiotGamesAPI.MatchList.MatchList}    callback      data callback
          */
  def getMatchList(summonerId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.MatchListNs.MatchList] = js.native
  /**
          * get the recents games for a given Summoner ID
          * @param     {number}                              summonerId    Summoner ID
          * @param     {RiotGamesAPI.Game.RecentGamesDto}    callback      data callback
          */
  def getRecentGames(summonerId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.GameNs.RecentGamesDto] = js.native
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
  def getStatsRanked(summonerId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.StatsNs.RankedStatsDto] = js.native
  /**
          * get summary ranked stats of summoner
          * @param     {number}                                          summonerId    Summoner ID
          * @param     {RiotGamesAPI.Stats.PlayerStatsSummaryListDto}    callback      data callback
          */
  def getStatsSummary(summonerId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.StatsNs.PlayerStatsSummaryListDto] = js.native
  /**
          * get league of legends status
          * @param     {RiotGamesAPI.LolStatus.Shard[]}    callback    data callback
          */
  def getStatus(): js.Promise[js.Array[riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs.Shard]] = js.native
  /**
          * get status for a given region
          * @param     {region_e}                        region      region
          * @param     {RiotGamesAPI.LolStatus.Shard}    callback    data callback
          */
  def getStatusByRegion(region: region_e): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs.Shard] = js.native
  /**
          * get summoner infos by summoner ID
          * @param     {number}                               summonerId    Summoner ID
          * @param     {RiotGamesAPI.Summoner.SummonerDto}    callback      data callback
          */
  def getSummonerById(summonerId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs.SummonerDto] = js.native
  /**
          * get summoner infos by Summoner Name
          * @param     {string}                               summonerName    Summoner Name
          * @param     {RiotGamesAPI.Summoner.SummonerDto}    callback        data callback
          */
  def getSummonerByName(summonerName: java.lang.String): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs.SummonerDto] = js.native
  /**
          * get masteries of a summoner
          * @param     {number}                                   summonerId    Summoner ID
          * @param     {RiotGamesAPI.Summoner.MasteryPagesDto}    callback      data callback
          */
  def getSummonerMasteries(summonerId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs.MasteryPagesDto] = js.native
  /**
          * get the Summoner Name of a summoner ID
          * @param     {number}    summonerId    Summoner ID
          * @param     {string}    callback      data callback
          */
  def getSummonerName(summonerId: scala.Double): js.Promise[java.lang.String] = js.native
  /**
          * get the runes of a summoner
          * @param     {number}                                summonerId    Summoner ID
          * @param     {RiotGamesAPI.Summoner.RunePagesDto}    callback      data callback
          */
  def getSummonerRunes(summonerId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs.RunePagesDto] = js.native
  /**
          * get Team infos by Team ID
          * @param     {string}                       teamId      Team ID
          * @param     {RiotGamesAPI.Team.TeamDto}    callback    data callback
          */
  def getTeamById(teamId: java.lang.String): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.TeamNs.TeamDto] = js.native
  /**
          * get teams of a summoner
          * @param     {number}                         summonerId    Summoner ID
          * @param     {RiotGamesAPI.Team.TeamDto[]}    callback      data callback
          */
  def getTeamsBySummoner(summonerId: scala.Double): js.Promise[js.Array[riotDashGamesDashApiLib.RiotGamesAPINs.TeamNs.TeamDto]] = js.native
  /**
          * get The 3 best champion masteries
          * @param     {[type]}                                               summonerId    Summoner ID
          * @param     {[RiotGamesAPI.ChampionMastery.ChampionMasteryDto]}    callback      data callback
          */
  def getTopChampionMastery(summonerId: js.Any): js.Promise[
    js.Array[riotDashGamesDashApiLib.RiotGamesAPINs.ChampionMasteryNs.ChampionMasteryDto]
  ] = js.native
  /**
          * Edit the consts for a valid url for the riot games api
          * @param     {string}    unparsedURL    the URL to parse
          * @return    {string}                   the Parsed URL
          */
  def parseURL(unparsedURL: java.lang.String): java.lang.String = js.native
  /**
          * set the region where you want to send requests
          * @param    {region_e}    region    the region
          */
  def setRegion(region: region_e): scala.Unit = js.native
  /**
          * get data by champion ID
          * @param     {number}                                    championsId    Champion ID
          * @param     {RiotGamesAPI.LolStaticData.ChampionDto}    callback       data callback
          */
  def staticDataChampionById(championsId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.ChampionDto] = js.native
  /**
          * get Champions (static data)
          * @param     {RiotGamesAPI.LolStaticData.ChampionListDto}    callback    data callback
          */
  def staticDataChampions(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.ChampionListDto] = js.native
  /**
          * Get item infos by ID
          * @param     {number}                                itemId      item ID
          * @param     {RiotGamesAPI.LolStaticData.ItemDto}    callback    data callback
          */
  def staticDataItemById(itemId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.ItemDto] = js.native
  /**
          * get League of Legends Items
          * @param     {RiotGamesAPI.LolStaticData.ItemListDto}    callback    data callback
          */
  def staticDataItems(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.ItemListDto] = js.native
  /**
          * get league of legends languages
          * @param     {string[]}    callback    data callback
          */
  def staticDataLanguages(): js.Promise[js.Array[java.lang.String]] = js.native
  /**
          * get league of legends languages
          * @param     {RiotGamesAPI.LolStaticData.LanguageStringsDto}    callback    data callback
          */
  def staticDataLanguagesStrings(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.LanguageStringsDto] = js.native
  /**
          * get Map data
          * @param     {RiotGamesAPI.LolStaticData.MapDataDto}    callback    data callback
          */
  def staticDataMap(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.MapDataDto] = js.native
  /**
          * get all masteries
          * @param     {RiotGamesAPI.LolStaticData.MasteryListDto}    callback    data callback
          */
  def staticDataMastery(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.MasteryListDto] = js.native
  /**
          * get data by mastery ID
          * @param     {number}                                   masteryId    Mastery ID
          * @param     {RiotGamesAPI.LolStaticData.MasteryDto}    callback     data callback
          */
  def staticDataMasteryById(masteryId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.MasteryDto] = js.native
  def staticDataRealm(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.RealmDto] = js.native
  /**
          * get rune by Rune ID
          * @param     {number}                                runeId      Rune ID
          * @param     {RiotGamesAPI.LolStaticData.RuneDto}    callback    data callback
          */
  def staticDataRuneById(runeId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.RuneDto] = js.native
  /**
          * get all runes
          * @param     {RiotGamesAPI.LolStaticData.RuneListDto}    callback    data callback
          */
  def staticDataRunes(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.RuneListDto] = js.native
  /**
          * get summoner spell by summoner spell ID
          * @param     {number}                                         summonerSpellId    Summoner spell ID
          * @param     {RiotGamesAPI.LolStaticData.SummonerSpellDto}    callback           data callback
          */
  def staticDataSummonSpellById(summonerSpellId: scala.Double): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.SummonerSpellDto] = js.native
  /**
          * get all summoner spells
          * @param     {RiotGamesAPI.LolStaticData.SummonerSpellListDto}    callback    data callback
          */
  def staticDataSummonerSpells(): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs.SummonerSpellListDto] = js.native
  /**
          * get league of legends  versions
          * @param     {string[]}    callback    data callback
          */
  def staticDataVersion(): js.Promise[js.Array[java.lang.String]] = js.native
}

