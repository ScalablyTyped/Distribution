package typings.atPulumiAws.typesOutputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectVpcConfig extends js.Object {
  /**
    * The security group IDs to assign to running builds.
    */
  var securityGroupIds: js.Array[String]
  /**
    * The subnet IDs within which to run builds.
    */
  var subnets: js.Array[String]
  /**
    * The ID of the VPC within which to run builds.
    */
  var vpcId: String
}

object ProjectVpcConfig {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnets: js.Array[String], vpcId: String): ProjectVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnets = subnets, vpcId = vpcId)
  
    __obj.asInstanceOf[ProjectVpcConfig]
  }
}

