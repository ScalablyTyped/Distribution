package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.paginationItemMod.PaginationItemProps
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPaginationMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Pagination/Pagination", JSImport.Default)
  @js.native
  class default ()
    extends Component[PaginationProps, js.Object, js.Any]
  object default {
    
    /* was `typeof PaginationItem` */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Pagination/Pagination", "default.Item")
    @js.native
    class Item ()
      extends typings.semanticUiReact.paginationItemMod.default
  }
  
  object Pagination {
    
    /* was `typeof PaginationItem` */
    type Item = typings.semanticUiReact.paginationItemMod.default
  }
  type Pagination = Component[PaginationProps, js.Object, js.Any]
  
  trait PaginationProps
    extends StObject
       with StrictPaginationProps
       with /* key */ StringDictionary[js.Any]
  object PaginationProps {
    
    inline def apply(totalPages: Double | String): PaginationProps = {
      val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
  }
  
  trait StrictPaginationProps extends StObject {
    
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
    
    inline def apply(totalPages: Double | String): StrictPaginationProps = {
      val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictPaginationProps]
    }
    
    extension [Self <: StrictPaginationProps](x: Self) {
      
      inline def setActivePage(value: Double | String): Self = StObject.set(x, "activePage", value.asInstanceOf[js.Any])
      
      inline def setActivePageUndefined: Self = StObject.set(x, "activePage", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setBoundaryRange(value: Double | String): Self = StObject.set(x, "boundaryRange", value.asInstanceOf[js.Any])
      
      inline def setBoundaryRangeUndefined: Self = StObject.set(x, "boundaryRange", js.undefined)
      
      inline def setDefaultActivePage(value: Double | String): Self = StObject.set(x, "defaultActivePage", value.asInstanceOf[js.Any])
      
      inline def setDefaultActivePageUndefined: Self = StObject.set(x, "defaultActivePage", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsisItem(value: SemanticShorthandItem[PaginationItemProps]): Self = StObject.set(x, "ellipsisItem", value.asInstanceOf[js.Any])
      
      inline def setEllipsisItemFunction3(
        value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "ellipsisItem", js.Any.fromFunction3(value))
      
      inline def setEllipsisItemUndefined: Self = StObject.set(x, "ellipsisItem", js.undefined)
      
      inline def setFirstItem(value: SemanticShorthandItem[PaginationItemProps]): Self = StObject.set(x, "firstItem", value.asInstanceOf[js.Any])
      
      inline def setFirstItemFunction3(
        value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "firstItem", js.Any.fromFunction3(value))
      
      inline def setFirstItemUndefined: Self = StObject.set(x, "firstItem", js.undefined)
      
      inline def setLastItem(value: SemanticShorthandItem[PaginationItemProps]): Self = StObject.set(x, "lastItem", value.asInstanceOf[js.Any])
      
      inline def setLastItemFunction3(
        value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "lastItem", js.Any.fromFunction3(value))
      
      inline def setLastItemUndefined: Self = StObject.set(x, "lastItem", js.undefined)
      
      inline def setNextItem(value: SemanticShorthandItem[PaginationItemProps]): Self = StObject.set(x, "nextItem", value.asInstanceOf[js.Any])
      
      inline def setNextItemFunction3(
        value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "nextItem", js.Any.fromFunction3(value))
      
      inline def setNextItemUndefined: Self = StObject.set(x, "nextItem", js.undefined)
      
      inline def setOnPageChange(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationProps) => Unit
      ): Self = StObject.set(x, "onPageChange", js.Any.fromFunction2(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setPageItem(value: SemanticShorthandItem[PaginationItemProps]): Self = StObject.set(x, "pageItem", value.asInstanceOf[js.Any])
      
      inline def setPageItemFunction3(
        value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "pageItem", js.Any.fromFunction3(value))
      
      inline def setPageItemUndefined: Self = StObject.set(x, "pageItem", js.undefined)
      
      inline def setPrevItem(value: SemanticShorthandItem[PaginationItemProps]): Self = StObject.set(x, "prevItem", value.asInstanceOf[js.Any])
      
      inline def setPrevItemFunction3(
        value: (/* component */ ElementType[PaginationItemProps], PaginationItemProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "prevItem", js.Any.fromFunction3(value))
      
      inline def setPrevItemUndefined: Self = StObject.set(x, "prevItem", js.undefined)
      
      inline def setSiblingRange(value: Double | String): Self = StObject.set(x, "siblingRange", value.asInstanceOf[js.Any])
      
      inline def setSiblingRangeUndefined: Self = StObject.set(x, "siblingRange", js.undefined)
      
      inline def setTotalPages(value: Double | String): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
}
