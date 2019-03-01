package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledIdentityPoolId extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var identityPoolId: java.lang.String
  var roleArn: java.lang.String
  var userPoolId: java.lang.String
}

object Anon_EnabledIdentityPoolId {
  @scala.inline
  def apply(
    identityPoolId: java.lang.String,
    roleArn: java.lang.String,
    userPoolId: java.lang.String,
    enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EnabledIdentityPoolId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identityPoolId")(identityPoolId)
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.updateDynamic("userPoolId")(userPoolId)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_EnabledIdentityPoolId]
  }
}

