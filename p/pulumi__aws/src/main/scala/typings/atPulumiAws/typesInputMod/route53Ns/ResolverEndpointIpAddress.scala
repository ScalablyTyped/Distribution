package typings.atPulumiAws.typesInputMod.route53Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverEndpointIpAddress extends js.Object {
  /**
    * The IP address in the subnet that you want to use for DNS queries.
    */
  var ip: js.UndefOr[Input[String]] = js.undefined
  var ipId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the subnet that contains the IP address.
    */
  var subnetId: Input[String]
}

object ResolverEndpointIpAddress {
  @scala.inline
  def apply(subnetId: Input[String], ip: Input[String] = null, ipId: Input[String] = null): ResolverEndpointIpAddress = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (ipId != null) __obj.updateDynamic("ipId")(ipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointIpAddress]
  }
}

