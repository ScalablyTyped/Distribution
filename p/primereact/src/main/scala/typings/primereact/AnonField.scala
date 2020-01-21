package typings.primereact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var field: String
  var order: Double
}

object AnonField {
  @scala.inline
  def apply(field: String, order: Double): AnonField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonField]
  }
}

