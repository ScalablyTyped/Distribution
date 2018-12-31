package typings
package semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPaginationProps extends js.Object {
  /** Index of the currently active page. */
  var activePage: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** A pagination item can have an aria label. */
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  /** Number of always visible pages at the beginning and end. */
  var boundaryRange: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Initial activePage value. */
  var defaultActivePage: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** A pagination can be disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** A shorthand for PaginationItem. */
  var ellipsisItem: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ]
  ] = js.undefined
  /** A shorthand for PaginationItem. */
  var firstItem: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ]
  ] = js.undefined
  /** A shorthand for PaginationItem. */
  var lastItem: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ]
  ] = js.undefined
  /** A shorthand for PaginationItem. */
  var nextItem: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ]
  ] = js.undefined
  /**
    * Called on change of an active page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onPageChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ PaginationProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A shorthand for PaginationItem. */
  var pageItem: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ]
  ] = js.undefined
  /** A shorthand for PaginationItem. */
  var prevItem: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ]
  ] = js.undefined
  /** Number of always visible pages before and after the current one. */
  var siblingRange: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Total number of pages. */
  var totalPages: scala.Double | java.lang.String
}

