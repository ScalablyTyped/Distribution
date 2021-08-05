package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortMapping extends StObject {
  
  var containerPort: js.UndefOr[Double] = js.undefined
  
  var hostPort: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[Protocol] = js.undefined
}
object PortMapping {
  
  inline def apply(): PortMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortMapping]
  }
  
  extension [Self <: PortMapping](x: Self) {
    
    inline def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setHostPort(value: Double): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
