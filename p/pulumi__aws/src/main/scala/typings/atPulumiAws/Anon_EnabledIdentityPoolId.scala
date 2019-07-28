package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledIdentityPoolId extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var identityPoolId: String
  var roleArn: String
  var userPoolId: String
}

object Anon_EnabledIdentityPoolId {
  @scala.inline
  def apply(
    identityPoolId: String,
    roleArn: String,
    userPoolId: String,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): Anon_EnabledIdentityPoolId = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId, roleArn = roleArn, userPoolId = userPoolId)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_EnabledIdentityPoolId]
  }
}

