package typings.smartFoxServer.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomExtension extends js.Object {
  /** @type {string} Returns the fully qualified name of the main class of the Extension. */
  var className: String
  /** @type {string} Returns the name of the Extension to be attached to the Room. */
  var id: String
  /** @type {string} Sets the name of an optional properties file that should be loaded on the server-side during the Extension initialization. */
  var propertiesFile: String
}

object RoomExtension {
  @scala.inline
  def apply(className: String, id: String, propertiesFile: String): RoomExtension = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], propertiesFile = propertiesFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomExtension]
  }
}

