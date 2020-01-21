package typings.semanticUiReact.paginationPaginationMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.paginationItemMod.PaginationItemProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPaginationProps extends js.Object {
  /** Index of the currently active page. */
  var activePage: js.UndefOr[Double | String] = js.undefined
  /** A pagination item can have an aria label. */
  var `aria-label`: js.UndefOr[String] = js.undefined
  /** Number of always visible pages at the beginning and end. */
  var boundaryRange: js.UndefOr[Double | String] = js.undefined
  /** Initial activePage value. */
  var defaultActivePage: js.UndefOr[Double | String] = js.undefined
  /** A pagination can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A shorthand for PaginationItem. */
  var ellipsisItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.undefined
  /** A shorthand for PaginationItem. */
  var firstItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.undefined
  /** A shorthand for PaginationItem. */
  var lastItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.undefined
  /** A shorthand for PaginationItem. */
  var nextItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.undefined
  /**
    * Called on change of an active page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onPageChange: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ PaginationProps, 
      Unit
    ]
  ] = js.undefined
  /** A shorthand for PaginationItem. */
  var pageItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.undefined
  /** A shorthand for PaginationItem. */
  var prevItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.undefined
  /** Number of always visible pages before and after the current one. */
  var siblingRange: js.UndefOr[Double | String] = js.undefined
  /** Total number of pages. */
  var totalPages: Double | String
}

object StrictPaginationProps {
  @scala.inline
  def apply(
    totalPages: Double | String,
    activePage: Double | String = null,
    `aria-label`: String = null,
    boundaryRange: Double | String = null,
    defaultActivePage: Double | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    ellipsisItem: SemanticShorthandItem[PaginationItemProps] = null,
    firstItem: SemanticShorthandItem[PaginationItemProps] = null,
    lastItem: SemanticShorthandItem[PaginationItemProps] = null,
    nextItem: SemanticShorthandItem[PaginationItemProps] = null,
    onPageChange: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationProps) => Unit = null,
    pageItem: SemanticShorthandItem[PaginationItemProps] = null,
    prevItem: SemanticShorthandItem[PaginationItemProps] = null,
    siblingRange: Double | String = null
  ): StrictPaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    if (activePage != null) __obj.updateDynamic("activePage")(activePage.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (boundaryRange != null) __obj.updateDynamic("boundaryRange")(boundaryRange.asInstanceOf[js.Any])
    if (defaultActivePage != null) __obj.updateDynamic("defaultActivePage")(defaultActivePage.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
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

