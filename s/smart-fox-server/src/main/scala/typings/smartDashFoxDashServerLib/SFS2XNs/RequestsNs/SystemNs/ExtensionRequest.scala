package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.ExtensionRequest")
@js.native
class ExtensionRequest protected () extends js.Object {
  /**
                   * Creates a new ExtensionRequest instance.
                   * @param {string}           extCmd The name of the command which identifies an action that should be executed by the server-side Extension.
                   * @param {Object}           {params=null} An object containing custom data to be sent to the Extension. Can be null if no data needs to be sent.
                   * @param {Entities.SFSRoom} {room=null}   If null, the specified command is sent to the current Zone server-side Extension; if not null, the command is sent to the server-side Extension attached to the passed Room.
                   */
  def this(extCmd: java.lang.String) = this()
  /**
                   * Creates a new ExtensionRequest instance.
                   * @param {string}           extCmd The name of the command which identifies an action that should be executed by the server-side Extension.
                   * @param {Object}           {params=null} An object containing custom data to be sent to the Extension. Can be null if no data needs to be sent.
                   * @param {Entities.SFSRoom} {room=null}   If null, the specified command is sent to the current Zone server-side Extension; if not null, the command is sent to the server-side Extension attached to the passed Room.
                   */
  def this(extCmd: java.lang.String, params: js.Object) = this()
  /**
                   * Creates a new ExtensionRequest instance.
                   * @param {string}           extCmd The name of the command which identifies an action that should be executed by the server-side Extension.
                   * @param {Object}           {params=null} An object containing custom data to be sent to the Extension. Can be null if no data needs to be sent.
                   * @param {Entities.SFSRoom} {room=null}   If null, the specified command is sent to the current Zone server-side Extension; if not null, the command is sent to the server-side Extension attached to the passed Room.
                   */
  def this(extCmd: java.lang.String, params: js.Object, room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom) = this()
}

