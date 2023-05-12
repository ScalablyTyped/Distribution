package typings.smartFoxServer.global.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.RoomExtension")
@js.native
open class RoomExtension protected ()
  extends StObject
     with typings.smartFoxServer.SFS2X.Requests.RoomExtension {
  /**
    * Creates a new RoomExtension instance.
    * @param {string} id        The name of the Extension as deployed on the server; it's the name of the folder containing the Extension classes inside the main [sfs2x-install-folder]/SFS2X/extensions folder.
    * @param {string} className The fully qualified name of the main class of the Extension.
    */
  def this(id: String, className: String) = this()
  
  /** Returns the fully qualified name of the main class of the Extension. */
  /* CompleteClass */
  var className: String = js.native
  
  /** Returns the name of the Extension to be attached to the Room. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Sets the name of an optional properties file that should be loaded on the server-side during the Extension initialization. */
  /* CompleteClass */
  var propertiesFile: String = js.native
}
