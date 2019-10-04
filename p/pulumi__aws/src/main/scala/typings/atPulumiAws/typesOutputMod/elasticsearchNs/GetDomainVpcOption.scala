package typings.atPulumiAws.typesOutputMod.elasticsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainVpcOption extends js.Object {
  /**
    * The availability zones used by the domain.
    */
  var availabilityZones: js.Array[String]
  /**
    * The security groups used by the domain.
    */
  var securityGroupIds: js.Array[String]
  /**
    * The subnets used by the domain.
    */
  var subnetIds: js.Array[String]
  /**
    * The VPC used by the domain.
    */
  var vpcId: String
}

object GetDomainVpcOption {
  @scala.inline
  def apply(
    availabilityZones: js.Array[String],
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): GetDomainVpcOption = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones, securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[GetDomainVpcOption]
  }
}

