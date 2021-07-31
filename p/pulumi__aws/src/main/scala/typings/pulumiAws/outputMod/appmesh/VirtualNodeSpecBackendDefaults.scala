package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendDefaults extends StObject {
  
  /**
    * The default client policy for virtual service backends. See above for details.
    */
  var clientPolicy: js.UndefOr[VirtualNodeSpecBackendDefaultsClientPolicy] = js.undefined
}
object VirtualNodeSpecBackendDefaults {
  
  @scala.inline
  def apply(): VirtualNodeSpecBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaults]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsMutableBuilder[Self <: VirtualNodeSpecBackendDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientPolicy(value: VirtualNodeSpecBackendDefaultsClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
  }
}
