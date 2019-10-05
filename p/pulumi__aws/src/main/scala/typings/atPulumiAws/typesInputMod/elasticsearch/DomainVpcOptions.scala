package typings.atPulumiAws.typesInputMod.elasticsearch

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainVpcOptions extends js.Object {
  var availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of VPC Security Group IDs to be applied to the Elasticsearch domain endpoints. If omitted, the default Security Group for the VPC will be used.
    */
  var securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of VPC Subnet IDs for the Elasticsearch domain endpoints to be created in.
    */
  var subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var vpcId: js.UndefOr[Input[String]] = js.undefined
}

object DomainVpcOptions {
  @scala.inline
  def apply(
    availabilityZones: Input[js.Array[Input[String]]] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    vpcId: Input[String] = null
  ): DomainVpcOptions = {
    val __obj = js.Dynamic.literal()
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainVpcOptions]
  }
}

