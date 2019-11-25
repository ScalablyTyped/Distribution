package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: String
  var id: Double | String
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Attribute {
  @scala.inline
  def apply(attribute: String, id: Double | String, value: String = null): Anon_Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attribute]
  }
}

