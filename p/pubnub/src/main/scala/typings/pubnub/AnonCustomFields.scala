package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomFields extends js.Object {
  var customFields: js.UndefOr[Boolean] = js.undefined
}

object AnonCustomFields {
  @scala.inline
  def apply(customFields: js.UndefOr[Boolean] = js.undefined): AnonCustomFields = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(customFields)) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomFields]
  }
}

