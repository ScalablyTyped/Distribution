package typings.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptional extends js.Object {
  var optional: js.UndefOr[js.Array[String]] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonOptional {
  @scala.inline
  def apply(optional: js.Array[String] = null, required: js.Array[String] = null): AnonOptional = {
    val __obj = js.Dynamic.literal()
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptional]
  }
}

