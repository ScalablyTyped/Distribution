package typings.riotApiNodejs.mod

import typings.riotGamesApi.RiotGamesAPI.TournamentProvider.LobbyEventDto
import typings.riotGamesApi.RiotGamesAPI.TournamentProvider.TournamentCodeDto
import typings.riotGamesApi.RiotGamesAPI.TournamentProvider.TournamentCodeParameters
import typings.riotGamesApi.RiotGamesAPI.TournamentProvider.TournamentCodeUpdateParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot-api-nodejs", "TournamentAPI")
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
  def registerProvider(region: regionE, url: String): js.Promise[Double] = js.native
  /**
    * Register a new tournament
    * @param     {string}    name          Name of tournament
    * @param     {number}    providerId    Provider ID
    * @param     {number}    callback      returns the tournament ID
    */
  def registerTournament(name: String, providerId: Double): js.Promise[Double] = js.native
}

