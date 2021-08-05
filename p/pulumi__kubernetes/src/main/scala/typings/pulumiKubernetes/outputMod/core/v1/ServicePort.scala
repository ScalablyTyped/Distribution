package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServicePort contains information on service's port.
  */
trait ServicePort extends StObject {
  
  /**
    * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol. This is a beta field that is guarded by the ServiceAppProtocol feature gate and enabled by default.
    */
  var appProtocol: String
  
  /**
    * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
    */
  var name: String
  
  /**
    * The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
    */
  var nodePort: Double
  
  /**
    * The port that will be exposed by this service.
    */
  var port: Double
  
  /**
    * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
    */
  var protocol: String
  
  /**
    * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
    */
  var targetPort: Double | String
}
object ServicePort {
  
  inline def apply(
    appProtocol: String,
    name: String,
    nodePort: Double,
    port: Double,
    protocol: String,
    targetPort: Double | String
  ): ServicePort = {
    val __obj = js.Dynamic.literal(appProtocol = appProtocol.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodePort = nodePort.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], targetPort = targetPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePort]
  }
  
  extension [Self <: ServicePort](x: Self) {
    
    inline def setAppProtocol(value: String): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodePort(value: Double): Self = StObject.set(x, "nodePort", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setTargetPort(value: Double | String): Self = StObject.set(x, "targetPort", value.asInstanceOf[js.Any])
  }
}
