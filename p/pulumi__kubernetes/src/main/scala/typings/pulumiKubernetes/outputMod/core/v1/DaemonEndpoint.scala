package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonEndpoint contains information about a single Daemon endpoint.
  */
trait DaemonEndpoint extends StObject {
  
  /**
    * Port number of the given endpoint.
    */
  var Port: Double
}
object DaemonEndpoint {
  
  inline def apply(Port: Double): DaemonEndpoint = {
    val __obj = js.Dynamic.literal(Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonEndpoint]
  }
  
  extension [Self <: DaemonEndpoint](x: Self) {
    
    inline def setPort(value: Double): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
