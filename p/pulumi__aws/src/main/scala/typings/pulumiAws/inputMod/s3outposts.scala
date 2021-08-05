package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3outposts {
  
  trait EndpointNetworkInterface extends StObject {
    
    /**
      * Identifier of the Elastic Network Interface (ENI).
      */
    var networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointNetworkInterface {
    
    inline def apply(): EndpointNetworkInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointNetworkInterface]
    }
    
    extension [Self <: EndpointNetworkInterface](x: Self) {
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    }
  }
}
