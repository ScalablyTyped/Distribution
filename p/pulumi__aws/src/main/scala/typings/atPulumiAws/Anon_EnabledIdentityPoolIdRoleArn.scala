package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledIdentityPoolIdRoleArn extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var identityPoolId: Input[String]
  var roleArn: Input[String]
  var userPoolId: Input[String]
}

object Anon_EnabledIdentityPoolIdRoleArn {
  @scala.inline
  def apply(
    identityPoolId: Input[String],
    roleArn: Input[String],
    userPoolId: Input[String],
    enabled: Input[Boolean] = null
  ): Anon_EnabledIdentityPoolIdRoleArn = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledIdentityPoolIdRoleArn]
  }
}

