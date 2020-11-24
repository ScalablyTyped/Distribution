package typings.smartFoxServer.global.SFS2X.Requests.System

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.ExtensionRequest")
@js.native
class ExtensionRequest protected ()
  extends typings.smartFoxServer.SFS2X.Requests.System.ExtensionRequest {
  /**
    * Creates a new ExtensionRequest instance.
    * @param {string}           extCmd The name of the command which identifies an action that should be executed by the server-side Extension.
    * @param {Object}           {params=null} An object containing custom data to be sent to the Extension. Can be null if no data needs to be sent.
    * @param {Entities.SFSRoom} {room=null}   If null, the specified command is sent to the current Zone server-side Extension; if not null, the command is sent to the server-side Extension attached to the passed Room.
    */
  def this(extCmd: String) = this()
  def this(extCmd: String, params: js.Object) = this()
  def this(extCmd: String, params: js.UndefOr[scala.Nothing], room: SFSRoom) = this()
  def this(extCmd: String, params: js.Object, room: SFSRoom) = this()
}
