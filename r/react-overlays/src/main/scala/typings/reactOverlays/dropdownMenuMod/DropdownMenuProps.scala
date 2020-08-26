package typings.reactOverlays.dropdownMenuMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownMenuProps extends js.Object {
  /**
    * Aligns the dropdown menu to the 'end' of it's placement position.
    * Generally this is provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var alignEnd: js.UndefOr[Boolean] = js.native
  /**
    * Enables the Popper.js `flip` modifier, allowing the Dropdown to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    */
  var flip: js.UndefOr[Boolean] = js.native
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: js.UndefOr[js.Object] = js.native
  /**
    * Override the default event used by RootCloseWrapper.
    */
  var rootCloseEvent: js.UndefOr[String] = js.native
  /**
    * Controls the visible state of the menu, generally this is
    * provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var show: js.UndefOr[Boolean] = js.native
  var usePopper: js.UndefOr[Boolean] = js.native
  /**
    * A render prop that returns a Menu element. The `props`
    * argument should spread through to **a component that can accept a ref**.
    */
  def children(renderProps: DropdownMenuRenderProps): ReactElement = js.native
}

object DropdownMenuProps {
  @scala.inline
  def apply(children: DropdownMenuRenderProps => ReactElement): DropdownMenuProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DropdownMenuProps]
  }
  @scala.inline
  implicit class DropdownMenuPropsOps[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: DropdownMenuRenderProps => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setAlignEnd(value: Boolean): Self = this.set("alignEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignEnd: Self = this.set("alignEnd", js.undefined)
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setPopperConfig(value: js.Object): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    @scala.inline
    def setRootCloseEvent(value: String): Self = this.set("rootCloseEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootCloseEvent: Self = this.set("rootCloseEvent", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setUsePopper(value: Boolean): Self = this.set("usePopper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePopper: Self = this.set("usePopper", js.undefined)
  }
  
}

