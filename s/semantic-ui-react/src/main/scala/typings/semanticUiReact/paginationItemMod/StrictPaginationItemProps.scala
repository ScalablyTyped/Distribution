package typings.semanticUiReact.paginationItemMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typings.semanticUiReact.semanticUiReactStrings.firstItem
import typings.semanticUiReact.semanticUiReactStrings.lastItem
import typings.semanticUiReact.semanticUiReactStrings.nextItem
import typings.semanticUiReact.semanticUiReactStrings.pageItem
import typings.semanticUiReact.semanticUiReactStrings.prevItem
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictPaginationItemProps extends js.Object {
  /** A pagination item can be active. */
  var active: js.UndefOr[Boolean] = js.native
  /** A pagination item can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ PaginationItemProps, 
      Unit
    ]
  ] = js.native
  /**
    * Called on key down.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onKeyDown: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ PaginationItemProps, 
      Unit
    ]
  ] = js.native
  /** A pagination should have a type. */
  var `type`: js.UndefOr[ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem] = js.native
}

object StrictPaginationItemProps {
  @scala.inline
  def apply(): StrictPaginationItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictPaginationItemProps]
  }
  @scala.inline
  implicit class StrictPaginationItemPropsOps[Self <: StrictPaginationItemProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyDown(
      value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit
    ): Self = this.set("onKeyDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setType(value: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

