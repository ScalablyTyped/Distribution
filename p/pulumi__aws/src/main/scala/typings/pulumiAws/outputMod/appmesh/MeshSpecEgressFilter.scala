package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshSpecEgressFilter extends StObject {
  
  /**
    * The egress filter type. By default, the type is `DROP_ALL`.
    * Valid values are `ALLOW_ALL` and `DROP_ALL`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object MeshSpecEgressFilter {
  
  @scala.inline
  def apply(): MeshSpecEgressFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpecEgressFilter]
  }
  
  @scala.inline
  implicit class MeshSpecEgressFilterMutableBuilder[Self <: MeshSpecEgressFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
