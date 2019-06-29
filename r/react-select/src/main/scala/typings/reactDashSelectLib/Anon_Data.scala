package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var id: scala.Double
  var index: scala.Double
  var isDisabled: scala.Boolean
  var isFocused: scala.Boolean
  var isSelected: scala.Boolean
  var label: java.lang.String
  var onClick: reactDashSelectLib.srcTypesMod.MouseEventHandler
  var onMouseOver: reactDashSelectLib.srcTypesMod.MouseEventHandler
  var value: js.Any
}

object Anon_Data {
  @scala.inline
  def apply(
    data: js.Any,
    id: scala.Double,
    index: scala.Double,
    isDisabled: scala.Boolean,
    isFocused: scala.Boolean,
    isSelected: scala.Boolean,
    label: java.lang.String,
    onClick: reactDashSelectLib.srcTypesMod.MouseEventHandler,
    onMouseOver: reactDashSelectLib.srcTypesMod.MouseEventHandler,
    value: js.Any
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, id = id, index = index, isDisabled = isDisabled, isFocused = isFocused, isSelected = isSelected, label = label, onClick = onClick, onMouseOver = onMouseOver, value = value)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

