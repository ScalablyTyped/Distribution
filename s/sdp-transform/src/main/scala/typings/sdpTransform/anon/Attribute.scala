package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var attribute: String
  var id: Double | String
  var value: js.UndefOr[String] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(attribute: String, id: Double | String, value: String = null): Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

