package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Versions extends StObject {
  
  /**
    * The SSH protocol version supported by the remote party.
    */
  var protocol: String
  
  /**
    * The software name and version used by the remote party.
    */
  var software: String
}
object Versions {
  
  inline def apply(protocol: String, software: String): Versions = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
    __obj.asInstanceOf[Versions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Versions] (val x: Self) extends AnyVal {
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setSoftware(value: String): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
  }
}
