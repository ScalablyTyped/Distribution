package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupOption extends js.Object {
  var label: String
  var tooltip: String
  var value: String
}

object ButtonGroupOption {
  @scala.inline
  def apply(label: String, tooltip: String, value: String): ButtonGroupOption = {
    val __obj = js.Dynamic.literal(label = label, tooltip = tooltip, value = value)
  
    __obj.asInstanceOf[ButtonGroupOption]
  }
}

