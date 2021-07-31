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
    
    @scala.inline
    def apply(networkInterfaceId: String): EndpointNetworkInterface = {
      val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointNetworkInterface]
    }
    
    @scala.inline
    implicit class EndpointNetworkInterfaceMutableBuilder[Self <: EndpointNetworkInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    }
  }
}
