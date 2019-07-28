package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BidPercentageDesiredVcpus extends js.Object {
  var bidPercentage: js.UndefOr[Input[Double]] = js.undefined
  var desiredVcpus: js.UndefOr[Input[Double]] = js.undefined
  var ec2KeyPair: js.UndefOr[Input[String]] = js.undefined
  var imageId: js.UndefOr[Input[String]] = js.undefined
  var instanceRole: Input[String]
  var instanceTypes: Input[js.Array[Input[String]]]
  var launchTemplate: js.UndefOr[Input[Anon_LaunchTemplateIdLaunchTemplateName]] = js.undefined
  var maxVcpus: Input[Double]
  var minVcpus: Input[Double]
  var securityGroupIds: Input[js.Array[Input[String]]]
  var spotIamFleetRole: js.UndefOr[Input[String]] = js.undefined
  var subnets: Input[js.Array[Input[String]]]
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var `type`: Input[String]
}

object Anon_BidPercentageDesiredVcpus {
  @scala.inline
  def apply(
    instanceRole: Input[String],
    instanceTypes: Input[js.Array[Input[String]]],
    maxVcpus: Input[Double],
    minVcpus: Input[Double],
    securityGroupIds: Input[js.Array[Input[String]]],
    subnets: Input[js.Array[Input[String]]],
    `type`: Input[String],
    bidPercentage: Input[Double] = null,
    desiredVcpus: Input[Double] = null,
    ec2KeyPair: Input[String] = null,
    imageId: Input[String] = null,
    launchTemplate: Input[Anon_LaunchTemplateIdLaunchTemplateName] = null,
    spotIamFleetRole: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): Anon_BidPercentageDesiredVcpus = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], maxVcpus = maxVcpus.asInstanceOf[js.Any], minVcpus = minVcpus.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bidPercentage != null) __obj.updateDynamic("bidPercentage")(bidPercentage.asInstanceOf[js.Any])
    if (desiredVcpus != null) __obj.updateDynamic("desiredVcpus")(desiredVcpus.asInstanceOf[js.Any])
    if (ec2KeyPair != null) __obj.updateDynamic("ec2KeyPair")(ec2KeyPair.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (launchTemplate != null) __obj.updateDynamic("launchTemplate")(launchTemplate.asInstanceOf[js.Any])
    if (spotIamFleetRole != null) __obj.updateDynamic("spotIamFleetRole")(spotIamFleetRole.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BidPercentageDesiredVcpus]
  }
}

