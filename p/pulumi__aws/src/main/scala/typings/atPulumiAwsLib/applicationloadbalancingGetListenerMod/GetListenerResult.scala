package typings
package atPulumiAwsLib.applicationloadbalancingGetListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerResult extends js.Object {
  val arn: java.lang.String
  val certificateArn: java.lang.String
  val defaultActions: js.Array[atPulumiAwsLib.Anon_AuthenticateCognitos]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val loadBalancerArn: java.lang.String
  val port: scala.Double
  val protocol: java.lang.String
  val sslPolicy: java.lang.String
}

object GetListenerResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    certificateArn: java.lang.String,
    defaultActions: js.Array[atPulumiAwsLib.Anon_AuthenticateCognitos],
    id: java.lang.String,
    loadBalancerArn: java.lang.String,
    port: scala.Double,
    protocol: java.lang.String,
    sslPolicy: java.lang.String
  ): GetListenerResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("certificateArn")(certificateArn)
    __obj.updateDynamic("defaultActions")(defaultActions)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("loadBalancerArn")(loadBalancerArn)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("sslPolicy")(sslPolicy)
    __obj.asInstanceOf[GetListenerResult]
  }
}

