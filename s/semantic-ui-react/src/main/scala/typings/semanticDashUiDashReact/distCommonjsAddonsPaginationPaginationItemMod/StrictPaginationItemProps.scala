package typings.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.ellipsisItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.firstItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.lastItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.nextItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.pageItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.prevItem
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPaginationItemProps extends js.Object {
  /** A pagination item can be active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** A pagination item can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
  /** A pagination should have a type. */
  var `type`: js.UndefOr[ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem] = js.undefined
}

object StrictPaginationItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit = null,
    onKeyDown: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null
  ): StrictPaginationItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPaginationItemProps]
  }
}

