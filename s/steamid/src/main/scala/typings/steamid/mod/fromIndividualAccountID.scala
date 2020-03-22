package typings.steamid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steamid", "fromIndividualAccountID")
@js.native
object fromIndividualAccountID extends js.Object {
  def apply(accountid: String): SteamID = js.native
  /**
    * Create an individual SteamID in the public universe given an accountid
    * @param accountid - The user's account ID
    */
  def apply(accountid: Double): SteamID = js.native
}

