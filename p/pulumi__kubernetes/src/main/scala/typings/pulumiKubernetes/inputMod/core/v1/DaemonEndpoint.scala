package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var Port: Input[Double]
}
object DaemonEndpoint {
  
  inline def apply(Port: Input[Double]): DaemonEndpoint = {
    val __obj = js.Dynamic.literal(Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonEndpoint]
  }
  
  extension [Self <: DaemonEndpoint](x: Self) {
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
