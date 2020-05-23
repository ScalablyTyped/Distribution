package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var field: String
  var order: Double
}

object Field {
  @scala.inline
  def apply(field: String, order: Double): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

