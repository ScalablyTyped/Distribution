package typings.reactOverlays.dropdownToggleMod

import typings.reactOverlays.AnonAriaexpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleRenderProps extends js.Object {
  var props: AnonAriaexpanded
  var show: Boolean
  def toggle(show: Boolean): Unit
}

object DropdownToggleRenderProps {
  @scala.inline
  def apply(props: AnonAriaexpanded, show: Boolean, toggle: Boolean => Unit): DropdownToggleRenderProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[DropdownToggleRenderProps]
  }
}

