package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupOption extends js.Object {
  var label: java.lang.String
  var tooltip: java.lang.String
  var value: java.lang.String
}

object ButtonGroupOption {
  @scala.inline
  def apply(label: java.lang.String, tooltip: java.lang.String, value: java.lang.String): ButtonGroupOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ButtonGroupOption]
  }
}

