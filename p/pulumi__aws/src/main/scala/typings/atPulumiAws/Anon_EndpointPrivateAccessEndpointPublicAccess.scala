package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointPrivateAccessEndpointPublicAccess extends js.Object {
  var endpointPrivateAccess: js.UndefOr[Input[Boolean]] = js.undefined
  var endpointPublicAccess: js.UndefOr[Input[Boolean]] = js.undefined
  var securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var subnetIds: Input[js.Array[Input[String]]]
  var vpcId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EndpointPrivateAccessEndpointPublicAccess {
  @scala.inline
  def apply(
    subnetIds: Input[js.Array[Input[String]]],
    endpointPrivateAccess: Input[Boolean] = null,
    endpointPublicAccess: Input[Boolean] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    vpcId: Input[String] = null
  ): Anon_EndpointPrivateAccessEndpointPublicAccess = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
    if (endpointPrivateAccess != null) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess.asInstanceOf[js.Any])
    if (endpointPublicAccess != null) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointPrivateAccessEndpointPublicAccess]
  }
}

