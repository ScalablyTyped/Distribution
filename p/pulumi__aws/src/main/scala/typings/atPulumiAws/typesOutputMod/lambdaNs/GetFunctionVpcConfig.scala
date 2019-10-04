package typings.atPulumiAws.typesOutputMod.lambdaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionVpcConfig extends js.Object {
  var securityGroupIds: js.Array[String]
  var subnetIds: js.Array[String]
  var vpcId: String
}

object GetFunctionVpcConfig {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): GetFunctionVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[GetFunctionVpcConfig]
  }
}

