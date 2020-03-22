package typings.primereact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameValue extends js.Object {
  var id: String
  var name: String
  var value: Double
}

object AnonNameValue {
  @scala.inline
  def apply(id: String, name: String, value: Double): AnonNameValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameValue]
  }
}

