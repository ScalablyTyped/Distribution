package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: java.lang.String
  var id: scala.Double | java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Attribute {
  @scala.inline
  def apply(attribute: java.lang.String, id: scala.Double | java.lang.String, value: java.lang.String = null): Anon_Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute, id = id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Attribute]
  }
}

