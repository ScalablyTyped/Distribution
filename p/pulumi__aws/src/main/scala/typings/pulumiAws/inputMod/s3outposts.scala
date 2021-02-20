package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3outposts {
  
  @js.native
  trait EndpointNetworkInterface extends StObject {
    
    /**
      * Identifier of the Elastic Network Interface (ENI).
      */
    var networkInterfaceId: js.UndefOr[Input[String]] = js.native
  }
  object EndpointNetworkInterface {
    
    @scala.inline
    def apply(): EndpointNetworkInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointNetworkInterface]
    }
    
    @scala.inline
    implicit class EndpointNetworkInterfaceMutableBuilder[Self <: EndpointNetworkInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    }
  }
}
