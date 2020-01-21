package typings.pulumiAws.inputMod.route53

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverEndpointIpAddress extends js.Object {
  /**
    * The IP address in the subnet that you want to use for DNS queries.
    */
  var ip: js.UndefOr[Input[String]] = js.native
  var ipId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the subnet that contains the IP address.
    */
  var subnetId: Input[String] = js.native
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

