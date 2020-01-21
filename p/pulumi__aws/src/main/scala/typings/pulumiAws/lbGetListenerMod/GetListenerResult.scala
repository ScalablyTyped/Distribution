package typings.pulumiAws.lbGetListenerMod

import typings.pulumiAws.outputMod.lb.GetListenerDefaultAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerResult extends js.Object {
  val arn: String = js.native
  val certificateArn: String = js.native
  val defaultActions: js.Array[GetListenerDefaultAction] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
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
}

