package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFields extends js.Object {
  var customFields: js.UndefOr[Boolean] = js.undefined
}

object CustomFields {
  @scala.inline
  def apply(customFields: js.UndefOr[Boolean] = js.undefined): CustomFields = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(customFields)) __obj.updateDynamic("customFields")(customFields.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFields]
  }
}

