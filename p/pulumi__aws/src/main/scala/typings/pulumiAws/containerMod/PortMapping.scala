package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortMapping extends StObject {
  
  var containerPort: js.UndefOr[Double] = js.native
  
  var hostPort: js.UndefOr[Double] = js.native
  
  var protocol: js.UndefOr[Protocol] = js.native
}
object PortMapping {
  
  @scala.inline
  def apply(): PortMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortMapping]
  }
  
  @scala.inline
  implicit class PortMappingMutableBuilder[Self <: PortMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    @scala.inline
    def setHostPort(value: Double): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
