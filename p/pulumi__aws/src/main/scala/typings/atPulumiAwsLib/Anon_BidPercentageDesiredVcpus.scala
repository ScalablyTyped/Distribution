package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BidPercentageDesiredVcpus extends js.Object {
  var bidPercentage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var desiredVcpus: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var ec2KeyPair: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var imageId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var instanceRole: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var instanceTypes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var maxVcpus: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var minVcpus: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var spotIamFleetRole: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var subnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_BidPercentageDesiredVcpus {
  @scala.inline
  def apply(
    instanceRole: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    instanceTypes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    maxVcpus: atPulumiPulumiLib.outputMod.Input[scala.Double],
    minVcpus: atPulumiPulumiLib.outputMod.Input[scala.Double],
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    subnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    bidPercentage: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    desiredVcpus: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    ec2KeyPair: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    imageId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    spotIamFleetRole: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): Anon_BidPercentageDesiredVcpus = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("instanceRole")(instanceRole.asInstanceOf[js.Any])
    __obj.updateDynamic("instanceTypes")(instanceTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("maxVcpus")(maxVcpus.asInstanceOf[js.Any])
    __obj.updateDynamic("minVcpus")(minVcpus.asInstanceOf[js.Any])
    __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (bidPercentage != null) __obj.updateDynamic("bidPercentage")(bidPercentage.asInstanceOf[js.Any])
    if (desiredVcpus != null) __obj.updateDynamic("desiredVcpus")(desiredVcpus.asInstanceOf[js.Any])
    if (ec2KeyPair != null) __obj.updateDynamic("ec2KeyPair")(ec2KeyPair.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (spotIamFleetRole != null) __obj.updateDynamic("spotIamFleetRole")(spotIamFleetRole.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BidPercentageDesiredVcpus]
  }
}

