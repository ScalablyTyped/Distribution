package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// User
trait UserData extends ObjectData {
  var email: js.UndefOr[String | Null] = js.undefined
  var externalId: js.UndefOr[String | Null] = js.undefined
  var name: String
  var profileUrl: js.UndefOr[String | Null] = js.undefined
}

object UserData {
  @scala.inline
  def apply(
    created: String,
    eTag: String,
    id: String,
    name: String,
    updated: String,
    custom: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    email: js.UndefOr[Null | String] = js.undefined,
    externalId: js.UndefOr[Null | String] = js.undefined,
    profileUrl: js.UndefOr[Null | String] = js.undefined
  ): UserData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(externalId)) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (!js.isUndefined(profileUrl)) __obj.updateDynamic("profileUrl")(profileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
}

