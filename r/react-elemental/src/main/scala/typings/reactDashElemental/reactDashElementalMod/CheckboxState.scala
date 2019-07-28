package typings.reactDashElemental.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxState extends js.Object {
  val isFocus: Boolean
  val isHover: Boolean
}

object CheckboxState {
  @scala.inline
  def apply(isFocus: Boolean, isHover: Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isFocus = isFocus, isHover = isHover)
  
    __obj.asInstanceOf[CheckboxState]
  }
}

