package typings.smartFoxServer.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.RoomExtension")
@js.native
class RoomExtension protected () extends js.Object {
  /**
    * Creates a new RoomExtension instance.
    * @param {string} id        The name of the Extension as deployed on the server; it's the name of the folder containing the Extension classes inside the main [sfs2x-install-folder]/SFS2X/extensions folder.
    * @param {string} className The fully qualified name of the main class of the Extension.
    */
  def this(id: String, className: String) = this()
  /** @type {string} Returns the fully qualified name of the main class of the Extension. */
  var className: String = js.native
  /** @type {string} Returns the name of the Extension to be attached to the Room. */
  var id: String = js.native
  /** @type {string} Sets the name of an optional properties file that should be loaded on the server-side during the Extension initialization. */
  var propertiesFile: String = js.native
}

