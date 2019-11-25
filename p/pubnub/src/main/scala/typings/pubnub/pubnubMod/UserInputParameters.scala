package typings.pubnub.pubnubMod

import typings.pubnub.Anon_CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInputParameters extends js.Object {
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var email: js.UndefOr[String | Null] = js.undefined
  var externalId: js.UndefOr[String | Null] = js.undefined
  var id: String
  var include: js.UndefOr[Anon_CustomFields] = js.undefined
  var name: String
  var profileUrl: js.UndefOr[String | Null] = js.undefined
}

object UserInputParameters {
  @scala.inline
  def apply(
    id: String,
    name: String,
    custom: js.Object = null,
    email: String = null,
    externalId: String = null,
    include: Anon_CustomFields = null,
    profileUrl: String = null
  ): UserInputParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (profileUrl != null) __obj.updateDynamic("profileUrl")(profileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInputParameters]
  }
}

