package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotInstanceRequestNetworkInterface extends StObject {
  
  /**
    * Whether or not to delete the network interface on instance termination. Defaults to `false`. Currently, the only valid value is `false`, as this is only supported when creating new network interfaces when launching an instance.
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The integer index of the network interface attachment. Limited by instance type.
    */
  var deviceIndex: Double
  
  /**
    * The ID of the network interface to attach.
    */
  var networkInterfaceId: String
}
object SpotInstanceRequestNetworkInterface {
  
  inline def apply(deviceIndex: Double, networkInterfaceId: String): SpotInstanceRequestNetworkInterface = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestNetworkInterface]
  }
  
  extension [Self <: SpotInstanceRequestNetworkInterface](x: Self) {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setDeviceIndex(value: Double): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
  }
}
