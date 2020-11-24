package typings.semanticUiReact.paginationPaginationMod

import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.paginationItemMod.PaginationItemProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictPaginationProps extends js.Object {
  
  /** Index of the currently active page. */
  var activePage: js.UndefOr[Double | String] = js.native
  
  /** A pagination item can have an aria label. */
  var `aria-label`: js.UndefOr[String] = js.native
  
  /** Number of always visible pages at the beginning and end. */
  var boundaryRange: js.UndefOr[Double | String] = js.native
  
  /** Initial activePage value. */
  var defaultActivePage: js.UndefOr[Double | String] = js.native
  
  /** A pagination can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** A shorthand for PaginationItem. */
  var ellipsisItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  
  /** A shorthand for PaginationItem. */
  var firstItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  
  /** A shorthand for PaginationItem. */
  var lastItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  
  /** A shorthand for PaginationItem. */
  var nextItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  
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
  ] = js.native
  
  /** A shorthand for PaginationItem. */
  var pageItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  
  /** A shorthand for PaginationItem. */
  var prevItem: js.UndefOr[SemanticShorthandItem[PaginationItemProps]] = js.native
  
  /** Number of always visible pages before and after the current one. */
  var siblingRange: js.UndefOr[Double | String] = js.native
  
  /** Total number of pages. */
  var totalPages: Double | String = js.native
}
object StrictPaginationProps {
  
  @scala.inline
  def apply(totalPages: Double | String): StrictPaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPaginationProps]
  }
  
  @scala.inline
  implicit class StrictPaginationPropsOps[Self <: StrictPaginationProps] (val x: Self) extends AnyVal {
    
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
    def setTotalPages(value: Double | String): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePage(value: Double | String): Self = this.set("activePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivePage: Self = this.set("activePage", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def setBoundaryRange(value: Double | String): Self = this.set("boundaryRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryRange: Self = this.set("boundaryRange", js.undefined)
    
    @scala.inline
    def setDefaultActivePage(value: Double | String): Self = this.set("defaultActivePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActivePage: Self = this.set("defaultActivePage", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEllipsisItemFunction3(
      value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("ellipsisItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEllipsisItem(value: SemanticShorthandItem[PaginationItemProps]): Self = this.set("ellipsisItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsisItem: Self = this.set("ellipsisItem", js.undefined)
    
    @scala.inline
    def setFirstItemFunction3(
      value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("firstItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFirstItem(value: SemanticShorthandItem[PaginationItemProps]): Self = this.set("firstItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstItem: Self = this.set("firstItem", js.undefined)
    
    @scala.inline
    def setLastItemFunction3(
      value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("lastItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLastItem(value: SemanticShorthandItem[PaginationItemProps]): Self = this.set("lastItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastItem: Self = this.set("lastItem", js.undefined)
    
    @scala.inline
    def setNextItemFunction3(
      value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("nextItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNextItem(value: SemanticShorthandItem[PaginationItemProps]): Self = this.set("nextItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextItem: Self = this.set("nextItem", js.undefined)
    
    @scala.inline
    def setOnPageChange(
      value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationProps) => Unit
    ): Self = this.set("onPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    
    @scala.inline
    def setPageItemFunction3(
      value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("pageItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPageItem(value: SemanticShorthandItem[PaginationItemProps]): Self = this.set("pageItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageItem: Self = this.set("pageItem", js.undefined)
    
    @scala.inline
    def setPrevItemFunction3(
      value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("prevItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPrevItem(value: SemanticShorthandItem[PaginationItemProps]): Self = this.set("prevItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevItem: Self = this.set("prevItem", js.undefined)
    
    @scala.inline
    def setSiblingRange(value: Double | String): Self = this.set("siblingRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiblingRange: Self = this.set("siblingRange", js.undefined)
  }
}
