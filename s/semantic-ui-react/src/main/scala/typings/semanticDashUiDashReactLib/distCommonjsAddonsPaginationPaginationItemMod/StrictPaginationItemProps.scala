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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
      /* data */ PaginationItemProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A pagination should have a type. */
  var `type`: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.ellipsisItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.firstItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.prevItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.pageItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.nextItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.lastItem
  ] = js.undefined
}

