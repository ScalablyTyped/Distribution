package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainVpcOption extends js.Object {
  /**
    * The availability zones used by the domain.
    */
  var availabilityZones: js.Array[String] = js.native
  /**
    * The security groups used by the domain.
    */
  var securityGroupIds: js.Array[String] = js.native
  /**
    * The subnets used by the domain.
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The VPC used by the domain.
    */
  var vpcId: String = js.native
}

object GetDomainVpcOption {
  @scala.inline
  def apply(
    availabilityZones: js.Array[String],
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): GetDomainVpcOption = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainVpcOption]
  }
}

