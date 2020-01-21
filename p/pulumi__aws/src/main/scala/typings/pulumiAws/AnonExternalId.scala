package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExternalId extends js.Object {
  var externalId: js.UndefOr[String] = js.native
  var policy: js.UndefOr[String] = js.native
  var roleArn: js.UndefOr[String] = js.native
  var sessionName: js.UndefOr[String] = js.native
}

object AnonExternalId {
  @scala.inline
  def apply(
    externalId: String = null,
    policy: String = null,
    roleArn: String = null,
    sessionName: String = null
  ): AnonExternalId = {
    val __obj = js.Dynamic.literal()
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (sessionName != null) __obj.updateDynamic("sessionName")(sessionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternalId]
  }
}

