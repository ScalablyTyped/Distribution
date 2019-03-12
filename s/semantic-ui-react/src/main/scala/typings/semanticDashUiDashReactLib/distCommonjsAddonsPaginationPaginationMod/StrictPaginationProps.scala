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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
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

object StrictPaginationProps {
  @scala.inline
  def apply(
    totalPages: scala.Double | java.lang.String,
    activePage: scala.Double | java.lang.String = null,
    `aria-label`: java.lang.String = null,
    boundaryRange: scala.Double | java.lang.String = null,
    defaultActivePage: scala.Double | java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    ellipsisItem: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ] = null,
    firstItem: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ] = null,
    lastItem: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ] = null,
    nextItem: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ] = null,
    onPageChange: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], /* data */ PaginationProps) => scala.Unit = null,
    pageItem: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ] = null,
    prevItem: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
    ] = null,
    siblingRange: scala.Double | java.lang.String = null
  ): StrictPaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    if (activePage != null) __obj.updateDynamic("activePage")(activePage.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (boundaryRange != null) __obj.updateDynamic("boundaryRange")(boundaryRange.asInstanceOf[js.Any])
    if (defaultActivePage != null) __obj.updateDynamic("defaultActivePage")(defaultActivePage.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (ellipsisItem != null) __obj.updateDynamic("ellipsisItem")(ellipsisItem.asInstanceOf[js.Any])
    if (firstItem != null) __obj.updateDynamic("firstItem")(firstItem.asInstanceOf[js.Any])
    if (lastItem != null) __obj.updateDynamic("lastItem")(lastItem.asInstanceOf[js.Any])
    if (nextItem != null) __obj.updateDynamic("nextItem")(nextItem.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2(onPageChange))
    if (pageItem != null) __obj.updateDynamic("pageItem")(pageItem.asInstanceOf[js.Any])
    if (prevItem != null) __obj.updateDynamic("prevItem")(prevItem.asInstanceOf[js.Any])
    if (siblingRange != null) __obj.updateDynamic("siblingRange")(siblingRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPaginationProps]
  }
}

