package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomFields extends js.Object {
  var customFields: js.UndefOr[Boolean] = js.undefined
}

object Anon_CustomFields {
  @scala.inline
  def apply(customFields: js.UndefOr[Boolean] = js.undefined): Anon_CustomFields = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(customFields)) __obj.updateDynamic("customFields")(customFields)
    __obj.asInstanceOf[Anon_CustomFields]
  }
}

