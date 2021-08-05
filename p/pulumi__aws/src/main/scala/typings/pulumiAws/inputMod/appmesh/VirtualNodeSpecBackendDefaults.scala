package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendDefaults extends StObject {
  
  /**
    * The default client policy for virtual service backends. See above for details.
    */
  var clientPolicy: js.UndefOr[Input[VirtualNodeSpecBackendDefaultsClientPolicy]] = js.undefined
}
object VirtualNodeSpecBackendDefaults {
  
  inline def apply(): VirtualNodeSpecBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaults]
  }
  
  extension [Self <: VirtualNodeSpecBackendDefaults](x: Self) {
    
    inline def setClientPolicy(value: Input[VirtualNodeSpecBackendDefaultsClientPolicy]): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
  }
}
