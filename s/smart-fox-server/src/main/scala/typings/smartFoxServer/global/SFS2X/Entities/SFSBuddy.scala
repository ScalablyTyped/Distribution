package typings.smartFoxServer.global.SFS2X.Entities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Entities.SFSBuddy")
@js.native
class SFSBuddy protected ()
  extends typings.smartFoxServer.SFS2X.Entities.SFSBuddy {
  /**
    * Creates a new SFSBuddy instance.
    * @param {number}  id        The buddy id.
    * @param {string}  name      The buddy name.
    * @param {boolean} [isBlocked=false] If true, the buddy is blocked by the current user.
    * @param {boolean} [isTemp=false]    If true, the buddy is just temporary in the current user's buddy list.
    */
  def this(id: Double, name: String) = this()
  def this(id: Double, name: String, isBlocked: Boolean) = this()
  def this(id: Double, name: String, isBlocked: js.UndefOr[scala.Nothing], isTemp: Boolean) = this()
  def this(id: Double, name: String, isBlocked: Boolean, isTemp: Boolean) = this()
}
