package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerPort represents a network port in a single container.
  */
@js.native
trait ContainerPort extends StObject {
  
  /**
    * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
    */
  var containerPort: Double = js.native
  
  /**
    * What host IP to bind the external port to.
    */
  var hostIP: String = js.native
  
  /**
    * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
    */
  var hostPort: Double = js.native
  
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
    */
  var name: String = js.native
  
  /**
    * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
    */
  var protocol: String = js.native
}
object ContainerPort {
  
  @scala.inline
  def apply(containerPort: Double, hostIP: String, hostPort: Double, name: String, protocol: String): ContainerPort = {
    val __obj = js.Dynamic.literal(containerPort = containerPort.asInstanceOf[js.Any], hostIP = hostIP.asInstanceOf[js.Any], hostPort = hostPort.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPort]
  }
  
  @scala.inline
  implicit class ContainerPortMutableBuilder[Self <: ContainerPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIP(value: String): Self = StObject.set(x, "hostIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPort(value: Double): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
