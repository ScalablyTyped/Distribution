package typings.pulumiAws.lbListenerMod

import typings.pulumiAws.inputMod.lb.ListenerDefaultAction
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerArgs extends js.Object {
  
  /**
    * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * An Action block. Action blocks are documented below.
    */
  val defaultActions: Input[js.Array[Input[ListenerDefaultAction]]] = js.native
  
  /**
    * The ARN of the load balancer.
    */
  val loadBalancerArn: Input[String] = js.native
  
  /**
    * The port on which the load balancer is listening.
    */
  val port: Input[Double] = js.native
  
  /**
    * The protocol for connections from clients to the load balancer. Valid values are `TCP`, `TLS`, `UDP`, `TCP_UDP`, `HTTP` and `HTTPS`. Defaults to `HTTP`.
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
    */
  val sslPolicy: js.UndefOr[Input[String]] = js.native
}
object ListenerArgs {
  
  @scala.inline
  def apply(
    defaultActions: Input[js.Array[Input[ListenerDefaultAction]]],
    loadBalancerArn: Input[String],
    port: Input[Double]
  ): ListenerArgs = {
    val __obj = js.Dynamic.literal(defaultActions = defaultActions.asInstanceOf[js.Any], loadBalancerArn = loadBalancerArn.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerArgs]
  }
  
  @scala.inline
  implicit class ListenerArgsOps[Self <: ListenerArgs] (val x: Self) extends AnyVal {
    
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
    def setDefaultActionsVarargs(value: Input[ListenerDefaultAction]*): Self = this.set("defaultActions", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActions(value: Input[js.Array[Input[ListenerDefaultAction]]]): Self = this.set("defaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArn(value: Input[String]): Self = this.set("loadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    
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
