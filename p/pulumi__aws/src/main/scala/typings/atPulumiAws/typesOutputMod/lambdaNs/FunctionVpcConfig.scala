package typings.atPulumiAws.typesOutputMod.lambdaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionVpcConfig extends js.Object {
  /**
    * A list of security group IDs associated with the Lambda function.
    */
  var securityGroupIds: js.Array[String]
  /**
    * A list of subnet IDs associated with the Lambda function.
    */
  var subnetIds: js.Array[String]
  var vpcId: String
}

object FunctionVpcConfig {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): FunctionVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[FunctionVpcConfig]
  }
}

