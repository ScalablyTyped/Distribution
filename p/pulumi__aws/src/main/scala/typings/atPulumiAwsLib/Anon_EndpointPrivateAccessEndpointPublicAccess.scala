package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointPrivateAccessEndpointPublicAccess extends js.Object {
  var endpointPrivateAccess: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var endpointPublicAccess: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var securityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_EndpointPrivateAccessEndpointPublicAccess {
  @scala.inline
  def apply(
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    endpointPrivateAccess: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    endpointPublicAccess: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_EndpointPrivateAccessEndpointPublicAccess = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
    if (endpointPrivateAccess != null) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess.asInstanceOf[js.Any])
    if (endpointPublicAccess != null) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointPrivateAccessEndpointPublicAccess]
  }
}

