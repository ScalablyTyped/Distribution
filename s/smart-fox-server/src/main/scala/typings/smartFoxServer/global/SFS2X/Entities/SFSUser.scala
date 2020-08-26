package typings.smartFoxServer.global.SFS2X.Entities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.SFSUser")
@js.native
class SFSUser protected ()
  extends typings.smartFoxServer.SFS2X.Entities.SFSUser {
  /**
    * Creates a new SFSUser instance.
    * @param {number}  id     The user id.
    * @param {string}  name   The user name.
    * @param {boolean} [isItMe=false] If true, the user being created corresponds to the current client.
    */
  def this(id: Double, name: String) = this()
  def this(id: Double, name: String, isItMe: Boolean) = this()
}

