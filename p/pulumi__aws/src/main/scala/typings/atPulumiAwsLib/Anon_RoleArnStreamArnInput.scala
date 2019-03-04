package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleArnStreamArnInput extends js.Object {
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var streamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_RoleArnStreamArnInput {
  @scala.inline
  def apply(
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    streamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_RoleArnStreamArnInput = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RoleArnStreamArnInput]
  }
}

