package typings.atPulumiAws.typesOutputMod.sagemaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelVpcConfig extends js.Object {
  var securityGroupIds: js.Array[String]
  var subnets: js.Array[String]
}

object ModelVpcConfig {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnets: js.Array[String]): ModelVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnets = subnets)
  
    __obj.asInstanceOf[ModelVpcConfig]
  }
}

