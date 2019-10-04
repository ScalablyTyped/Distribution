package typings.atPulumiAws.typesOutputMod.elasticsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainVpcOptions extends js.Object {
  var availabilityZones: js.Array[String]
  /**
    * List of VPC Security Group IDs to be applied to the Elasticsearch domain endpoints. If omitted, the default Security Group for the VPC will be used.
    */
  var securityGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of VPC Subnet IDs for the Elasticsearch domain endpoints to be created in.
    */
  var subnetIds: js.UndefOr[js.Array[String]] = js.undefined
  var vpcId: String
}

object DomainVpcOptions {
  @scala.inline
  def apply(
    availabilityZones: js.Array[String],
    vpcId: String,
    securityGroupIds: js.Array[String] = null,
    subnetIds: js.Array[String] = null
  ): DomainVpcOptions = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones, vpcId = vpcId)
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds)
    __obj.asInstanceOf[DomainVpcOptions]
  }
}

