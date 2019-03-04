package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledIdentityPoolIdRoleArn extends js.Object {
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var identityPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_EnabledIdentityPoolIdRoleArn {
  @scala.inline
  def apply(
    identityPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_EnabledIdentityPoolIdRoleArn = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledIdentityPoolIdRoleArn]
  }
}

