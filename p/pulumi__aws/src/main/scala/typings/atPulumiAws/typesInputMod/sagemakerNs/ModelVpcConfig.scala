package typings.atPulumiAws.typesInputMod.sagemakerNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelVpcConfig extends js.Object {
  var securityGroupIds: Input[js.Array[Input[String]]]
  var subnets: Input[js.Array[Input[String]]]
}

object ModelVpcConfig {
  @scala.inline
  def apply(securityGroupIds: Input[js.Array[Input[String]]], subnets: Input[js.Array[Input[String]]]): ModelVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModelVpcConfig]
  }
}

