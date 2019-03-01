package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BidPercentage extends js.Object {
  var bidPercentage: js.UndefOr[scala.Double] = js.undefined
  var desiredVcpus: js.UndefOr[scala.Double] = js.undefined
  var ec2KeyPair: js.UndefOr[java.lang.String] = js.undefined
  var imageId: js.UndefOr[java.lang.String] = js.undefined
  var instanceRole: java.lang.String
  var instanceTypes: js.Array[java.lang.String]
  var maxVcpus: scala.Double
  var minVcpus: scala.Double
  var securityGroupIds: js.Array[java.lang.String]
  var spotIamFleetRole: js.UndefOr[java.lang.String] = js.undefined
  var subnets: js.Array[java.lang.String]
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var `type`: java.lang.String
}

object Anon_BidPercentage {
  @scala.inline
  def apply(
    instanceRole: java.lang.String,
    instanceTypes: js.Array[java.lang.String],
    maxVcpus: scala.Double,
    minVcpus: scala.Double,
    securityGroupIds: js.Array[java.lang.String],
    subnets: js.Array[java.lang.String],
    `type`: java.lang.String,
    bidPercentage: scala.Int | scala.Double = null,
    desiredVcpus: scala.Int | scala.Double = null,
    ec2KeyPair: java.lang.String = null,
    imageId: java.lang.String = null,
    spotIamFleetRole: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_BidPercentage = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("instanceRole")(instanceRole)
    __obj.updateDynamic("instanceTypes")(instanceTypes)
    __obj.updateDynamic("maxVcpus")(maxVcpus)
    __obj.updateDynamic("minVcpus")(minVcpus)
    __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    __obj.updateDynamic("subnets")(subnets)
    if (bidPercentage != null) __obj.updateDynamic("bidPercentage")(bidPercentage.asInstanceOf[js.Any])
    if (desiredVcpus != null) __obj.updateDynamic("desiredVcpus")(desiredVcpus.asInstanceOf[js.Any])
    if (ec2KeyPair != null) __obj.updateDynamic("ec2KeyPair")(ec2KeyPair)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    if (spotIamFleetRole != null) __obj.updateDynamic("spotIamFleetRole")(spotIamFleetRole)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_BidPercentage]
  }
}

