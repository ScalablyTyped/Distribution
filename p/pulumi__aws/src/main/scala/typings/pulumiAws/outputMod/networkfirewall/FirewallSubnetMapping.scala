package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallSubnetMapping extends StObject {
  
  /**
    * The unique identifier for the subnet.
    */
  var subnetId: String
}
object FirewallSubnetMapping {
  
  inline def apply(subnetId: String): FirewallSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallSubnetMapping]
  }
  
  extension [Self <: FirewallSubnetMapping](x: Self) {
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
