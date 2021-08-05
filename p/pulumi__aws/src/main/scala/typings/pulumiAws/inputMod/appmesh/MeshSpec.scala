package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshSpec extends StObject {
  
  /**
    * The egress filter rules for the service mesh.
    */
  var egressFilter: js.UndefOr[Input[MeshSpecEgressFilter]] = js.undefined
}
object MeshSpec {
  
  inline def apply(): MeshSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpec]
  }
  
  extension [Self <: MeshSpec](x: Self) {
    
    inline def setEgressFilter(value: Input[MeshSpecEgressFilter]): Self = StObject.set(x, "egressFilter", value.asInstanceOf[js.Any])
    
    inline def setEgressFilterUndefined: Self = StObject.set(x, "egressFilter", js.undefined)
  }
}
