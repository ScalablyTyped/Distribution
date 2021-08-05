package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceSpec extends StObject {
  
  /**
    * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
    */
  var provider: js.UndefOr[Input[VirtualServiceSpecProvider]] = js.undefined
}
object VirtualServiceSpec {
  
  inline def apply(): VirtualServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceSpec]
  }
  
  extension [Self <: VirtualServiceSpec](x: Self) {
    
    inline def setProvider(value: Input[VirtualServiceSpecProvider]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
