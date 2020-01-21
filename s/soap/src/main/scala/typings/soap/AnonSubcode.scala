package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubcode extends js.Object {
  var Subcode: js.UndefOr[AnonValue] = js.undefined
  var Value: String
}

object AnonSubcode {
  @scala.inline
  def apply(Value: String, Subcode: AnonValue = null): AnonSubcode = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    if (Subcode != null) __obj.updateDynamic("Subcode")(Subcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubcode]
  }
}

