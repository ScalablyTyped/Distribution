package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpec extends StObject {
  
  /**
    * The defaults for backends.
    */
  var backendDefaults: js.UndefOr[Input[VirtualNodeSpecBackendDefaults]] = js.undefined
  
  /**
    * The backends to which the virtual node is expected to send outbound traffic.
    */
  var backends: js.UndefOr[Input[js.Array[Input[VirtualNodeSpecBackend]]]] = js.undefined
  
  /**
    * The listeners from which the virtual node is expected to receive inbound traffic.
    */
  var listener: js.UndefOr[Input[VirtualNodeSpecListener]] = js.undefined
  
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Input[VirtualNodeSpecLogging]] = js.undefined
  
  /**
    * The service discovery information for the virtual node.
    */
  var serviceDiscovery: js.UndefOr[Input[VirtualNodeSpecServiceDiscovery]] = js.undefined
}
object VirtualNodeSpec {
  
  inline def apply(): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpec]
  }
  
  extension [Self <: VirtualNodeSpec](x: Self) {
    
    inline def setBackendDefaults(value: Input[VirtualNodeSpecBackendDefaults]): Self = StObject.set(x, "backendDefaults", value.asInstanceOf[js.Any])
    
    inline def setBackendDefaultsUndefined: Self = StObject.set(x, "backendDefaults", js.undefined)
    
    inline def setBackends(value: Input[js.Array[Input[VirtualNodeSpecBackend]]]): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    inline def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    inline def setBackendsVarargs(value: Input[VirtualNodeSpecBackend]*): Self = StObject.set(x, "backends", js.Array(value :_*))
    
    inline def setListener(value: Input[VirtualNodeSpecListener]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    inline def setLogging(value: Input[VirtualNodeSpecLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setServiceDiscovery(value: Input[VirtualNodeSpecServiceDiscovery]): Self = StObject.set(x, "serviceDiscovery", value.asInstanceOf[js.Any])
    
    inline def setServiceDiscoveryUndefined: Self = StObject.set(x, "serviceDiscovery", js.undefined)
  }
}
