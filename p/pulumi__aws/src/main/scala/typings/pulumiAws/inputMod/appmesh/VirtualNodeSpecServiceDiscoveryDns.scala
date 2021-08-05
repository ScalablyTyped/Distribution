package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecServiceDiscoveryDns extends StObject {
  
  /**
    * The DNS host name for your virtual node.
    */
  var hostname: Input[String]
}
object VirtualNodeSpecServiceDiscoveryDns {
  
  inline def apply(hostname: Input[String]): VirtualNodeSpecServiceDiscoveryDns = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscoveryDns]
  }
  
  extension [Self <: VirtualNodeSpecServiceDiscoveryDns](x: Self) {
    
    inline def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
  }
}
