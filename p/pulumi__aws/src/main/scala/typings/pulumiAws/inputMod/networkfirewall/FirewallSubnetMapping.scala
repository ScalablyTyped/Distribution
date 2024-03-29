package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallSubnetMapping extends StObject {
  
  /**
    * The unique identifier for the subnet.
    */
  var subnetId: Input[String]
}
object FirewallSubnetMapping {
  
  inline def apply(subnetId: Input[String]): FirewallSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallSubnetMapping]
  }
  
  extension [Self <: FirewallSubnetMapping](x: Self) {
    
    inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
