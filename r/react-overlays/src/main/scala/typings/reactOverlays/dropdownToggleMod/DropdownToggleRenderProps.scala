package typings.reactOverlays.dropdownToggleMod

import typings.reactOverlays.anon.Ariaexpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleRenderProps extends js.Object {
  var props: Ariaexpanded
  var show: Boolean
  def toggle(show: Boolean): Unit
}

object DropdownToggleRenderProps {
  @scala.inline
  def apply(props: Ariaexpanded, show: Boolean, toggle: Boolean => Unit): DropdownToggleRenderProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[DropdownToggleRenderProps]
  }
}

