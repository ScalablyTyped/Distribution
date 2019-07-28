package typings.atPulumiAws.elasticloadbalancingv2GetListenerMod

import typings.atPulumiAws.Anon_AuthenticateCognitos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerResult extends js.Object {
  val arn: String
  val certificateArn: String
  val defaultActions: js.Array[Anon_AuthenticateCognitos]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val loadBalancerArn: String
  val port: Double
  val protocol: String
  val sslPolicy: String
}

object GetListenerResult {
  @scala.inline
  def apply(
    arn: String,
    certificateArn: String,
    defaultActions: js.Array[Anon_AuthenticateCognitos],
    id: String,
    loadBalancerArn: String,
    port: Double,
    protocol: String,
    sslPolicy: String
  ): GetListenerResult = {
    val __obj = js.Dynamic.literal(arn = arn, certificateArn = certificateArn, defaultActions = defaultActions, id = id, loadBalancerArn = loadBalancerArn, port = port, protocol = protocol, sslPolicy = sslPolicy)
  
    __obj.asInstanceOf[GetListenerResult]
  }
}

