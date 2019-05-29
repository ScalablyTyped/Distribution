package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxState extends js.Object {
  val isFocus: scala.Boolean
  val isHover: scala.Boolean
}

object CheckboxState {
  @scala.inline
  def apply(isFocus: scala.Boolean, isHover: scala.Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isFocus = isFocus, isHover = isHover)
  
    __obj.asInstanceOf[CheckboxState]
  }
}

