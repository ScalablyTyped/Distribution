package typings.reactOverlays.dropdownToggleMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownToggleProps extends js.Object {
  /**
    * A render prop that returns a Toggle element. The `props`
    * argument should spread through to **a component that can accept a ref**. Use
    * the `onToggle` argument to toggle the menu open or closed
    */
  def children(renderProps: DropdownToggleRenderProps): ReactElement = js.native
}

object DropdownToggleProps {
  @scala.inline
  def apply(children: DropdownToggleRenderProps => ReactElement): DropdownToggleProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DropdownToggleProps]
  }
  @scala.inline
  implicit class DropdownTogglePropsOps[Self <: DropdownToggleProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: DropdownToggleRenderProps => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

