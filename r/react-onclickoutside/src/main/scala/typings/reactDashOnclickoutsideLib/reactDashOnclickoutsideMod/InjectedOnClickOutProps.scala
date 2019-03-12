package typings
package reactDashOnclickoutsideLib.reactDashOnclickoutsideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedOnClickOutProps extends js.Object {
  def disableOnClickOutside(): scala.Unit
  def enableOnClickOutside(): scala.Unit
}

object InjectedOnClickOutProps {
  @scala.inline
  def apply(disableOnClickOutside: () => scala.Unit, enableOnClickOutside: () => scala.Unit): InjectedOnClickOutProps = {
    val __obj = js.Dynamic.literal(disableOnClickOutside = js.Any.fromFunction0(disableOnClickOutside), enableOnClickOutside = js.Any.fromFunction0(enableOnClickOutside))
  
    __obj.asInstanceOf[InjectedOnClickOutProps]
  }
}

