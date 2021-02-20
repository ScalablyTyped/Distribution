package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Versions extends StObject {
  
  /**
    * The SSH protocol version supported by the remote party.
    */
  var protocol: String = js.native
  
  /**
    * The software name and version used by the remote party.
    */
  var software: String = js.native
}
object Versions {
  
  @scala.inline
  def apply(protocol: String, software: String): Versions = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
    __obj.asInstanceOf[Versions]
  }
  
  @scala.inline
  implicit class VersionsMutableBuilder[Self <: Versions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftware(value: String): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
  }
}
