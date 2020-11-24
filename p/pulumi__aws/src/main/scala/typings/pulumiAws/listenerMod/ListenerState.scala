package typings.pulumiAws.listenerMod

import typings.pulumiAws.inputMod.alb.ListenerDefaultAction
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * An Action block. Action blocks are documented below.
    */
  val defaultActions: js.UndefOr[Input[js.Array[Input[ListenerDefaultAction]]]] = js.native
  
  /**
    * The ARN of the load balancer.
    */
  val loadBalancerArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The port on which the load balancer is listening.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The protocol for connections from clients to the load balancer. Valid values are `TCP`, `TLS`, `UDP`, `TCP_UDP`, `HTTP` and `HTTPS`. Defaults to `HTTP`.
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
    */
  val sslPolicy: js.UndefOr[Input[String]] = js.native
}
object ListenerState {
  
  @scala.inline
  def apply(): ListenerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerState]
  }
  
  @scala.inline
  implicit class ListenerStateOps[Self <: ListenerState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    
    @scala.inline
    def setDefaultActionsVarargs(value: Input[ListenerDefaultAction]*): Self = this.set("defaultActions", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActions(value: Input[js.Array[Input[ListenerDefaultAction]]]): Self = this.set("defaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActions: Self = this.set("defaultActions", js.undefined)
    
    @scala.inline
    def setLoadBalancerArn(value: Input[String]): Self = this.set("loadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerArn: Self = this.set("loadBalancerArn", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSslPolicy(value: Input[String]): Self = this.set("sslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslPolicy: Self = this.set("sslPolicy", js.undefined)
  }
}
