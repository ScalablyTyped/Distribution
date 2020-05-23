package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInputParameters extends js.Object {
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var email: js.UndefOr[String | Null] = js.undefined
  var externalId: js.UndefOr[String | Null] = js.undefined
  var id: String
  var include: js.UndefOr[CustomFields] = js.undefined
  var name: String
  var profileUrl: js.UndefOr[String | Null] = js.undefined
}

object UserInputParameters {
  @scala.inline
  def apply(
    id: String,
    name: String,
    custom: js.UndefOr[Null | js.Object] = js.undefined,
    email: js.UndefOr[Null | String] = js.undefined,
    externalId: js.UndefOr[Null | String] = js.undefined,
    include: CustomFields = null,
    profileUrl: js.UndefOr[Null | String] = js.undefined
  ): UserInputParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(externalId)) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(profileUrl)) __obj.updateDynamic("profileUrl")(profileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInputParameters]
  }
}

