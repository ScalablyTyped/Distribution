package typings.atPulumiAws.typesOutputMod.sagemaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVpcConfig extends js.Object {
  var securityGroupIds: js.Array[String] = js.native
  var subnets: js.Array[String] = js.native
}

object ModelVpcConfig {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnets: js.Array[String]): ModelVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModelVpcConfig]
  }
}

