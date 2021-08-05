package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeAddress contains information for the node's address.
  */
trait NodeAddress extends StObject {
  
  /**
    * The node address.
    */
  var address: Input[String]
  
  /**
    * Node address type, one of Hostname, ExternalIP or InternalIP.
    */
  var `type`: Input[String]
}
object NodeAddress {
  
  inline def apply(address: Input[String], `type`: Input[String]): NodeAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAddress]
  }
  
  extension [Self <: NodeAddress](x: Self) {
    
    inline def setAddress(value: Input[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
