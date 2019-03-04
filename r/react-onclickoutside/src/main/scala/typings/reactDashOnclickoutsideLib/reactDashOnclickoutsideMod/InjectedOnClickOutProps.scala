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
  def apply(disableOnClickOutside: js.Function0[scala.Unit], enableOnClickOutside: js.Function0[scala.Unit]): InjectedOnClickOutProps = {
    val __obj = js.Dynamic.literal(disableOnClickOutside = disableOnClickOutside, enableOnClickOutside = enableOnClickOutside)
  
    __obj.asInstanceOf[InjectedOnClickOutProps]
  }
}

