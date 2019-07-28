package typings.reactDashSelect.srcFiltersMod

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
    val __obj = js.Dynamic.literal(data = data, label = label, value = value)
  
    __obj.asInstanceOf[Option]
  }
}

