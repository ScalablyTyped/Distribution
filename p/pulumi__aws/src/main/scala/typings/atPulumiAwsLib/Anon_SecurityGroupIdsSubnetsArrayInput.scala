package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetsArrayInput extends js.Object {
  var securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var subnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
}

object Anon_SecurityGroupIdsSubnetsArrayInput {
  @scala.inline
  def apply(
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    subnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ): Anon_SecurityGroupIdsSubnetsArrayInput = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetsArrayInput]
  }
}

