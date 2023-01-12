package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UNIXConnectionDetails extends StObject {
  
  var socketPath: String
}
object UNIXConnectionDetails {
  
  inline def apply(socketPath: String): UNIXConnectionDetails = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UNIXConnectionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UNIXConnectionDetails] (val x: Self) extends AnyVal {
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
