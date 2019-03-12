package typings
package reactDashOverlaysLib.libDropdownToggleMod.DropdownToggleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleRenderProps extends js.Object {
  var props: reactDashOverlaysLib.Anon_Ariaexpanded
  var show: scala.Boolean
  def toggle(show: scala.Boolean): scala.Unit
}

object DropdownToggleRenderProps {
  @scala.inline
  def apply(
    props: reactDashOverlaysLib.Anon_Ariaexpanded,
    show: scala.Boolean,
    toggle: scala.Boolean => scala.Unit
  ): DropdownToggleRenderProps = {
    val __obj = js.Dynamic.literal(props = props, show = show, toggle = js.Any.fromFunction1(toggle))
  
    __obj.asInstanceOf[DropdownToggleRenderProps]
  }
}

