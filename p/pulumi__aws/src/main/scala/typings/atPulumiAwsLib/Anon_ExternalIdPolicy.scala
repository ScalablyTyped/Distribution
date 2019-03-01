package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalIdPolicy extends js.Object {
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  var policy: js.UndefOr[java.lang.String] = js.undefined
  var roleArn: js.UndefOr[java.lang.String] = js.undefined
  var sessionName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ExternalIdPolicy {
  @scala.inline
  def apply(
    externalId: java.lang.String = null,
    policy: java.lang.String = null,
    roleArn: java.lang.String = null,
    sessionName: java.lang.String = null
  ): Anon_ExternalIdPolicy = {
    val __obj = js.Dynamic.literal()
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (sessionName != null) __obj.updateDynamic("sessionName")(sessionName)
    __obj.asInstanceOf[Anon_ExternalIdPolicy]
  }
}

