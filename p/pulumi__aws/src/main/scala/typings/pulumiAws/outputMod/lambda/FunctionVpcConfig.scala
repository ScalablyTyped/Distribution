package typings.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionVpcConfig extends js.Object {
  /**
    * A list of security group IDs associated with the Lambda function.
    */
  var securityGroupIds: js.Array[String] = js.native
  /**
    * A list of subnet IDs associated with the Lambda function.
    */
  var subnetIds: js.Array[String] = js.native
  var vpcId: String = js.native
}

object FunctionVpcConfig {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): FunctionVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionVpcConfig]
  }
}

