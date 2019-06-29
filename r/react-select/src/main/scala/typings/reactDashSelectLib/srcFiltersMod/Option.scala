package typings
package reactDashSelectLib.srcFiltersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var data: js.Any
  var label: java.lang.String
  var value: java.lang.String
}

object Option {
  @scala.inline
  def apply(data: js.Any, label: java.lang.String, value: java.lang.String): Option = {
    val __obj = js.Dynamic.literal(data = data, label = label, value = value)
  
    __obj.asInstanceOf[Option]
  }
}

