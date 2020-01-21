package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyOption extends js.Object {
  var label: String
  var value: String
}

object CustomPropertyOption {
  @scala.inline
  def apply(label: String, value: String): CustomPropertyOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomPropertyOption]
  }
}

