package typings.atPulumiAws.typesInputMod.codebuild

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectVpcConfig extends js.Object {
  /**
    * The security group IDs to assign to running builds.
    */
  var securityGroupIds: Input[js.Array[Input[String]]]
  /**
    * The subnet IDs within which to run builds.
    */
  var subnets: Input[js.Array[Input[String]]]
  /**
    * The ID of the VPC within which to run builds.
    */
  var vpcId: Input[String]
}

object ProjectVpcConfig {
  @scala.inline
  def apply(
    securityGroupIds: Input[js.Array[Input[String]]],
    subnets: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): ProjectVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectVpcConfig]
  }
}

