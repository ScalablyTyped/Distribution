package typings.pulumiAws.getListenerMod

import typings.pulumiAws.outputMod.alb.GetListenerDefaultAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerResult extends js.Object {
  val arn: String = js.native
  val certificateArn: String = js.native
  val defaultActions: js.Array[GetListenerDefaultAction] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val loadBalancerArn: String = js.native
  val port: Double = js.native
  val protocol: String = js.native
  val sslPolicy: String = js.native
}

object GetListenerResult {
  @scala.inline
  def apply(
    arn: String,
    certificateArn: String,
    defaultActions: js.Array[GetListenerDefaultAction],
    id: String,
    loadBalancerArn: String,
    port: Double,
    protocol: String,
    sslPolicy: String
  ): GetListenerResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateArn = certificateArn.asInstanceOf[js.Any], defaultActions = defaultActions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadBalancerArn = loadBalancerArn.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], sslPolicy = sslPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerResult]
  }
  @scala.inline
  implicit class GetListenerResultOps[Self <: GetListenerResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateArn(value: String): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultActionsVarargs(value: GetListenerDefaultAction*): Self = this.set("defaultActions", js.Array(value :_*))
    @scala.inline
    def setDefaultActions(value: js.Array[GetListenerDefaultAction]): Self = this.set("defaultActions", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerArn(value: String): Self = this.set("loadBalancerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSslPolicy(value: String): Self = this.set("sslPolicy", value.asInstanceOf[js.Any])
  }
  
}

