package typings.smartFoxServer.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomExtension extends StObject {
  
  /** @type {string} Returns the fully qualified name of the main class of the Extension. */
  var className: String = js.native
  
  /** @type {string} Returns the name of the Extension to be attached to the Room. */
  var id: String = js.native
  
  /** @type {string} Sets the name of an optional properties file that should be loaded on the server-side during the Extension initialization. */
  var propertiesFile: String = js.native
}
object RoomExtension {
  
  @scala.inline
  def apply(className: String, id: String, propertiesFile: String): RoomExtension = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], propertiesFile = propertiesFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomExtension]
  }
  
  @scala.inline
  implicit class RoomExtensionMutableBuilder[Self <: RoomExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesFile(value: String): Self = StObject.set(x, "propertiesFile", value.asInstanceOf[js.Any])
  }
}
