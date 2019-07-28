package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetsArrayInput extends js.Object {
  var securityGroupIds: Input[js.Array[Input[String]]]
  var subnets: Input[js.Array[Input[String]]]
}

object Anon_SecurityGroupIdsSubnetsArrayInput {
  @scala.inline
  def apply(securityGroupIds: Input[js.Array[Input[String]]], subnets: Input[js.Array[Input[String]]]): Anon_SecurityGroupIdsSubnetsArrayInput = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetsArrayInput]
  }
}

