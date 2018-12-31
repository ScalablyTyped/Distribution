package typings
package riotDashApiDashNodejsLib.riotDashApiDashNodejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot-api-nodejs", "TournamentAPI")
@js.native
class TournamentAPI protected () extends API {
  def this(apiKeys: java.lang.String*) = this()
  /**
    * create tournament Codes for a given tournament
    * @param     {number}                                                      tournamentId    the ID of the tournament
    * @param     {number}                                                      count           Number of codes you want
    * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeParameters}    params          Tournament Code parameters
    * @param     {number[]}                                                    callback        Tournaments Codes                                                                    [description]
    */
  def createTournamentCodes(
    tournamentId: scala.Double,
    count: scala.Double,
    params: riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs.TournamentCodeParameters
  ): js.Promise[js.Array[scala.Double]] = js.native
  /**
    * edit the tournament Code parameters for a given tournament Code
    * @param     {string}                                                            tournamentCode    Tournament Code to update
    * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeUpdateParameters}    params            parameters to edit
    * @param     {(}                                                                 callback          callback if succes
    */
  def editTournamentByCode(
    tournamentCode: java.lang.String,
    params: riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs.TournamentCodeUpdateParameters
  ): js.Promise[js.Function0[scala.Unit]] = js.native
  /**
    * get the lobby envents for a given tournament Code
    * @param     {string}                                           tournamentCode    the tournament code to get the lobby events
    * @param     {RiotGamesAPI.TournamentProvider.LobbyEventDto}    callback          lobby events
    */
  def getLobbyEventByCode(tournamentCode: java.lang.String): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs.LobbyEventDto] = js.native
  /**
    * get tournament infos for a given tournament code
    * @param     {string}                                               tournamentCode    Tournament Code
    * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeDto}    callback          Tournament Infos
    */
  def getTournamentByCode(tournamentCode: java.lang.String): js.Promise[riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs.TournamentCodeDto] = js.native
  /**
    * Register a new tournament provider
    * @param     {region_e}    region      region where you want to register the provider
    * @param     {string}      url         url of callback for the POST notifications
    * @param     {number}      callback    returns  the tounament provider ID
    */
  def registerProvider(region: region_e, url: java.lang.String): js.Promise[scala.Double] = js.native
  /**
    * Register a new tournament
    * @param     {string}    name          Name of tournament
    * @param     {number}    providerId    Provider ID
    * @param     {number}    callback      returns the tournament ID
    */
  def registerTournament(name: java.lang.String, providerId: scala.Double): js.Promise[scala.Double] = js.native
}

