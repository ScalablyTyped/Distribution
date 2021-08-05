package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerPort extends StObject {
  
  /**
    * Whether the port should be exposed externally.  Defaults to `false`.
    */
  var external: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The incoming port where the service exposes the endpoint.
    */
  var port: Double
  
  /**
    * The protocol to use for exposing the service:
    * * `tcp`: Expose TCP externaly and to the container.
    * * `udp`: Expose UDP externally and to the container.
    * * `http`: Expose HTTP externally and to the container.
    * * `https`: Expose HTTPS externally and HTTP to the container.
    */
  var protocol: js.UndefOr[ContainerProtocol] = js.undefined
  
  /**
    * The target port on the backing container.  Defaults to the value of [port].
    */
  var targetPort: js.UndefOr[Double] = js.undefined
}
object ContainerPort {
  
  inline def apply(port: Double): ContainerPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPort]
  }
  
  extension [Self <: ContainerPort](x: Self) {
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: ContainerProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setTargetPort(value: Double): Self = StObject.set(x, "targetPort", value.asInstanceOf[js.Any])
    
    inline def setTargetPortUndefined: Self = StObject.set(x, "targetPort", js.undefined)
  }
}
