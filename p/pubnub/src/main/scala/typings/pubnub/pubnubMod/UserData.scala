package typings.pubnub.pubnubMod

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
    custom: StringDictionary[String] = null,
    email: String = null,
    externalId: String = null,
    profileUrl: String = null
  ): UserData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (profileUrl != null) __obj.updateDynamic("profileUrl")(profileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
}

