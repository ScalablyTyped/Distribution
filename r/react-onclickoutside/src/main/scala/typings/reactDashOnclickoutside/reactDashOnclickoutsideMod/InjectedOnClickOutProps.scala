package typings.reactDashOnclickoutside.reactDashOnclickoutsideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedOnClickOutProps extends js.Object {
  def disableOnClickOutside(): Unit
  def enableOnClickOutside(): Unit
}

object InjectedOnClickOutProps {
  @scala.inline
  def apply(disableOnClickOutside: () => Unit, enableOnClickOutside: () => Unit): InjectedOnClickOutProps = {
    val __obj = js.Dynamic.literal(disableOnClickOutside = js.Any.fromFunction0(disableOnClickOutside), enableOnClickOutside = js.Any.fromFunction0(enableOnClickOutside))
  
    __obj.asInstanceOf[InjectedOnClickOutProps]
  }
}

