package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BidPercentage extends js.Object {
  var bidPercentage: js.UndefOr[Double] = js.undefined
  var desiredVcpus: js.UndefOr[Double] = js.undefined
  var ec2KeyPair: js.UndefOr[String] = js.undefined
  var imageId: js.UndefOr[String] = js.undefined
  var instanceRole: String
  var instanceTypes: js.Array[String]
  var launchTemplate: js.UndefOr[Anon_LaunchTemplateIdLaunchTemplateNameVersion] = js.undefined
  var maxVcpus: Double
  var minVcpus: Double
  var securityGroupIds: js.Array[String]
  var spotIamFleetRole: js.UndefOr[String] = js.undefined
  var subnets: js.Array[String]
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var `type`: String
}

object Anon_BidPercentage {
  @scala.inline
  def apply(
    instanceRole: String,
    instanceTypes: js.Array[String],
    maxVcpus: Double,
    minVcpus: Double,
    securityGroupIds: js.Array[String],
    subnets: js.Array[String],
    `type`: String,
    bidPercentage: Int | Double = null,
    desiredVcpus: Int | Double = null,
    ec2KeyPair: String = null,
    imageId: String = null,
    launchTemplate: Anon_LaunchTemplateIdLaunchTemplateNameVersion = null,
    spotIamFleetRole: String = null,
    tags: StringDictionary[js.Any] = null
  ): Anon_BidPercentage = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole, instanceTypes = instanceTypes, maxVcpus = maxVcpus, minVcpus = minVcpus, securityGroupIds = securityGroupIds, subnets = subnets)
    __obj.updateDynamic("type")(`type`)
    if (bidPercentage != null) __obj.updateDynamic("bidPercentage")(bidPercentage.asInstanceOf[js.Any])
    if (desiredVcpus != null) __obj.updateDynamic("desiredVcpus")(desiredVcpus.asInstanceOf[js.Any])
    if (ec2KeyPair != null) __obj.updateDynamic("ec2KeyPair")(ec2KeyPair)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    if (launchTemplate != null) __obj.updateDynamic("launchTemplate")(launchTemplate)
    if (spotIamFleetRole != null) __obj.updateDynamic("spotIamFleetRole")(spotIamFleetRole)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_BidPercentage]
  }
}

