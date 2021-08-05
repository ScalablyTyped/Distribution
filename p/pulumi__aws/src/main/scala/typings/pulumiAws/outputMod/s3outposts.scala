package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3outposts {
  
  trait EndpointNetworkInterface extends StObject {
    
    /**
      * Identifier of the Elastic Network Interface (ENI).
      */
    var networkInterfaceId: String
  }
  object EndpointNetworkInterface {
    
    inline def apply(networkInterfaceId: String): EndpointNetworkInterface = {
      val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointNetworkInterface]
    }
    
    extension [Self <: EndpointNetworkInterface](x: Self) {
      
      inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    }
  }
}
