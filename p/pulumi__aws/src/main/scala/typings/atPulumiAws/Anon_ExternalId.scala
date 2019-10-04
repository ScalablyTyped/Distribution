package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalId extends js.Object {
  var externalId: js.UndefOr[String] = js.undefined
  var policy: js.UndefOr[String] = js.undefined
  var roleArn: js.UndefOr[String] = js.undefined
  var sessionName: js.UndefOr[String] = js.undefined
}

object Anon_ExternalId {
  @scala.inline
  def apply(
    externalId: String = null,
    policy: String = null,
    roleArn: String = null,
    sessionName: String = null
  ): Anon_ExternalId = {
    val __obj = js.Dynamic.literal()
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (sessionName != null) __obj.updateDynamic("sessionName")(sessionName)
    __obj.asInstanceOf[Anon_ExternalId]
  }
}

