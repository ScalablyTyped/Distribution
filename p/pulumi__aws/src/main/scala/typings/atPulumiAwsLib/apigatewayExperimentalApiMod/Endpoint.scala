package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  var hostname: java.lang.String
  var loadBalancer: atPulumiAwsLib.atPulumiAwsMod.elasticloadbalancingv2Ns.LoadBalancer
  var port: scala.Double
}

object Endpoint {
  @scala.inline
  def apply(
    hostname: java.lang.String,
    loadBalancer: atPulumiAwsLib.atPulumiAwsMod.elasticloadbalancingv2Ns.LoadBalancer,
    port: scala.Double
  ): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("loadBalancer")(loadBalancer)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Endpoint]
  }
}

