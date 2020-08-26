package typings.reactOverlays.dropdownToggleMod

import typings.reactOverlays.anon.Ariaexpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownToggleRenderProps extends js.Object {
  var props: Ariaexpanded = js.native
  var show: Boolean = js.native
  def toggle(show: Boolean): Unit = js.native
}

object DropdownToggleRenderProps {
  @scala.inline
  def apply(props: Ariaexpanded, show: Boolean, toggle: Boolean => Unit): DropdownToggleRenderProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[DropdownToggleRenderProps]
  }
  @scala.inline
  implicit class DropdownToggleRenderPropsOps[Self <: DropdownToggleRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProps(value: Ariaexpanded): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggle(value: Boolean => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
  }
  
}

