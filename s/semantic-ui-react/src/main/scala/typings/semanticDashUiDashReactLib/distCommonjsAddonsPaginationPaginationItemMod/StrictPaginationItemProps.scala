package typings
package semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPaginationItemProps extends js.Object {
  /** A pagination item can be active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** A pagination item can be disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ PaginationItemProps, 
      scala.Unit
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ PaginationItemProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A pagination should have a type. */
  var `type`: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.ellipsisItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.firstItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.prevItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.pageItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.nextItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.lastItem
  ] = js.undefined
}

object StrictPaginationItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], /* data */ PaginationItemProps) => scala.Unit = null,
    onKeyDown: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], /* data */ PaginationItemProps) => scala.Unit = null,
    `type`: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.ellipsisItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.firstItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.prevItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.pageItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.nextItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.lastItem = null
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

