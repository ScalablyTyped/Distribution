package typings
package reactDashSelectLib.libFiltersMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Option]
  }
}

