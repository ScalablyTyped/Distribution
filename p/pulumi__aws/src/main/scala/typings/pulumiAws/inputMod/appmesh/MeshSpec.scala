package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshSpec extends StObject {
  
  /**
    * The egress filter rules for the service mesh.
    */
  var egressFilter: js.UndefOr[Input[MeshSpecEgressFilter]] = js.native
}
object MeshSpec {
  
  @scala.inline
  def apply(): MeshSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpec]
  }
  
  @scala.inline
  implicit class MeshSpecMutableBuilder[Self <: MeshSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEgressFilter(value: Input[MeshSpecEgressFilter]): Self = StObject.set(x, "egressFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressFilterUndefined: Self = StObject.set(x, "egressFilter", js.undefined)
  }
}
