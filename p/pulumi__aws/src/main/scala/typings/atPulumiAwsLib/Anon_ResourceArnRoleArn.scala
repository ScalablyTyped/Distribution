package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResourceArnRoleArn extends js.Object {
  var resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ResourceArnRoleArn {
  @scala.inline
  def apply(
    resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_ResourceArnRoleArn = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ResourceArnRoleArn]
  }
}

