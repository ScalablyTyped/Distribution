package typings.reactOverlays.dropdownMod

import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownProps extends js.Object {
  /**
    * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
    */
  var alignEnd: js.UndefOr[Boolean] = js.native
  /**
    * Determines the direction and location of the Menu in relation to it's Toggle.
    */
  var drop: js.UndefOr[Directions] = js.native
  /**
    * A css slector string that will return __focusable__ menu items.
    * Selectors should be relative to the menu component:
    * e.g. ` > li:not('.disabled')`
    */
  var itemSelector: js.UndefOr[String] = js.native
  /**
    * A callback fired when the Dropdown wishes to change visibility. Called with the requested
    * `show` value, the DOM event, and the source that fired it: `'click'`,`'keydown'`,`'rootClose'`, or `'select'`.
    */
  var onToggle: js.UndefOr[js.Function2[/* isOpen */ Boolean, /* event */ SyntheticEvent[_, Event], Unit]] = js.native
  /**
    * Whether or not the Dropdown is visible
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * A render prop that returns the root dropdown element. The `props`
    * argument should spread through to an element containing _both_ the
    * menu and toggle in order to handle keyboard events for focus management.
    */
  def children(renderProps: DropdownRenderProps): ReactElement = js.native
}

object DropdownProps {
  @scala.inline
  def apply(children: DropdownRenderProps => ReactElement): DropdownProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DropdownProps]
  }
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: DropdownRenderProps => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setAlignEnd(value: Boolean): Self = this.set("alignEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignEnd: Self = this.set("alignEnd", js.undefined)
    @scala.inline
    def setDrop(value: Directions): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setItemSelector(value: String): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    @scala.inline
    def setOnToggle(value: (/* isOpen */ Boolean, /* event */ SyntheticEvent[_, Event]) => Unit): Self = this.set("onToggle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

