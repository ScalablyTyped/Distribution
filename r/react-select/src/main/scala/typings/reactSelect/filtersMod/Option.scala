package typings.reactSelect.filtersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var data: js.Any
  var label: String
  var value: String
}

object Option {
  @scala.inline
  def apply(data: js.Any, label: String, value: String): Option = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Option]
  }
}

