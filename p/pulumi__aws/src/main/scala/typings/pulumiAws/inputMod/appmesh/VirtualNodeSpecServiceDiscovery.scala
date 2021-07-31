package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecServiceDiscovery extends StObject {
  
  /**
    * Specifies any AWS Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[Input[VirtualNodeSpecServiceDiscoveryAwsCloudMap]] = js.undefined
  
  /**
    * Specifies the DNS service name for the virtual node.
    */
  var dns: js.UndefOr[Input[VirtualNodeSpecServiceDiscoveryDns]] = js.undefined
}
object VirtualNodeSpecServiceDiscovery {
  
  @scala.inline
  def apply(): VirtualNodeSpecServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscovery]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecServiceDiscoveryMutableBuilder[Self <: VirtualNodeSpecServiceDiscovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsCloudMap(value: Input[VirtualNodeSpecServiceDiscoveryAwsCloudMap]): Self = StObject.set(x, "awsCloudMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsCloudMapUndefined: Self = StObject.set(x, "awsCloudMap", js.undefined)
    
    @scala.inline
    def setDns(value: Input[VirtualNodeSpecServiceDiscoveryDns]): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
  }
}
