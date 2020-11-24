package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerPort represents a network port in a single container.
  */
@js.native
trait ContainerPort extends js.Object {
  
  /**
    * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
    */
  var containerPort: Input[Double] = js.native
  
  /**
    * What host IP to bind the external port to.
    */
  var hostIP: js.UndefOr[Input[String]] = js.native
  
  /**
    * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
    */
  var hostPort: js.UndefOr[Input[Double]] = js.native
  
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
    */
  var protocol: js.UndefOr[Input[String]] = js.native
}
object ContainerPort {
  
  @scala.inline
  def apply(containerPort: Input[Double]): ContainerPort = {
    val __obj = js.Dynamic.literal(containerPort = containerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPort]
  }
  
  @scala.inline
  implicit class ContainerPortOps[Self <: ContainerPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerPort(value: Input[Double]): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIP(value: Input[String]): Self = this.set("hostIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostIP: Self = this.set("hostIP", js.undefined)
    
    @scala.inline
    def setHostPort(value: Input[Double]): Self = this.set("hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPort: Self = this.set("hostPort", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
}
