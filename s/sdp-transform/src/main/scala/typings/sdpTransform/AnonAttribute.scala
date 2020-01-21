package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttribute extends js.Object {
  var attribute: String
  var id: Double | String
  var value: js.UndefOr[String] = js.undefined
}

object AnonAttribute {
  @scala.inline
  def apply(attribute: String, id: Double | String, value: String = null): AnonAttribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttribute]
  }
}

