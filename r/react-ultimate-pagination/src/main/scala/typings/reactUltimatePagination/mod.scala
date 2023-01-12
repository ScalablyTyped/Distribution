package typings.reactUltimatePagination

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ultimate-pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ITEM_TYPES extends StObject
  @JSImport("react-ultimate-pagination", "ITEM_TYPES")
  @js.native
  object ITEM_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ITEM_TYPES & String] = js.native
    
    @js.native
    sealed trait ELLIPSIS
      extends StObject
         with ITEM_TYPES
    /* "ELLIPSIS" */ val ELLIPSIS: typings.reactUltimatePagination.mod.ITEM_TYPES.ELLIPSIS & String = js.native
    
    @js.native
    sealed trait FIRST_PAGE_LINK
      extends StObject
         with ITEM_TYPES
    /* "FIRST_PAGE_LINK" */ val FIRST_PAGE_LINK: typings.reactUltimatePagination.mod.ITEM_TYPES.FIRST_PAGE_LINK & String = js.native
    
    @js.native
    sealed trait LAST_PAGE_LINK
      extends StObject
         with ITEM_TYPES
    /* "LAST_PAGE_LINK" */ val LAST_PAGE_LINK: typings.reactUltimatePagination.mod.ITEM_TYPES.LAST_PAGE_LINK & String = js.native
    
    @js.native
    sealed trait NEXT_PAGE_LINK
      extends StObject
         with ITEM_TYPES
    /* "NEXT_PAGE_LINK" */ val NEXT_PAGE_LINK: typings.reactUltimatePagination.mod.ITEM_TYPES.NEXT_PAGE_LINK & String = js.native
    
    @js.native
    sealed trait PAGE
      extends StObject
         with ITEM_TYPES
    /* "PAGE" */ val PAGE: typings.reactUltimatePagination.mod.ITEM_TYPES.PAGE & String = js.native
    
    @js.native
    sealed trait PREVIOUS_PAGE_LINK
      extends StObject
         with ITEM_TYPES
    /* "PREVIOUS_PAGE_LINK" */ val PREVIOUS_PAGE_LINK: typings.reactUltimatePagination.mod.ITEM_TYPES.PREVIOUS_PAGE_LINK & String = js.native
  }
  
  inline def createUltimatePagination(options: CreateUltimatePaginationOptions): ComponentType[UltimatePaginationProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUltimatePagination")(options.asInstanceOf[js.Any]).asInstanceOf[ComponentType[UltimatePaginationProps]]
  
  trait CreateUltimatePaginationOptions extends StObject {
    
    /**
      * A React.js component that will be used as a wrapper for pagination items
      */
    var WrapperComponent: js.UndefOr[String | ComponentType[Any]] = js.undefined
    
    /**
      * An object that is used as a map from the item type to the React.js component that will be used to render this item
      */
    var itemTypeToComponent: ItemTypeToComponent
  }
  object CreateUltimatePaginationOptions {
    
    inline def apply(itemTypeToComponent: ItemTypeToComponent): CreateUltimatePaginationOptions = {
      val __obj = js.Dynamic.literal(itemTypeToComponent = itemTypeToComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateUltimatePaginationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateUltimatePaginationOptions] (val x: Self) extends AnyVal {
      
      inline def setItemTypeToComponent(value: ItemTypeToComponent): Self = StObject.set(x, "itemTypeToComponent", value.asInstanceOf[js.Any])
      
      inline def setWrapperComponent(value: String | ComponentType[Any]): Self = StObject.set(x, "WrapperComponent", value.asInstanceOf[js.Any])
      
      inline def setWrapperComponentUndefined: Self = StObject.set(x, "WrapperComponent", js.undefined)
    }
  }
  
  trait ItemTypeToComponent extends StObject {
    
    /**
      * An item that represents groups of pages that currently are not visible in paginator (can be used to navigate to the page in the group that is the nearest to the current page)
      */
    var ELLIPSIS: ComponentType[PaginationComponentProps]
    
    /**
      * A link to the first page
      */
    var FIRST_PAGE_LINK: ComponentType[PaginationComponentProps]
    
    /**
      * A link to the last page
      */
    var LAST_PAGE_LINK: ComponentType[PaginationComponentProps]
    
    /**
      * A link to the next page
      */
    var NEXT_PAGE_LINK: ComponentType[PaginationComponentProps]
    
    /**
      * A link to a page
      */
    var PAGE: ComponentType[PaginationComponentProps]
    
    /**
      * A link to the previous page
      */
    var PREVIOUS_PAGE_LINK: ComponentType[PaginationComponentProps]
  }
  object ItemTypeToComponent {
    
    inline def apply(
      ELLIPSIS: ComponentType[PaginationComponentProps],
      FIRST_PAGE_LINK: ComponentType[PaginationComponentProps],
      LAST_PAGE_LINK: ComponentType[PaginationComponentProps],
      NEXT_PAGE_LINK: ComponentType[PaginationComponentProps],
      PAGE: ComponentType[PaginationComponentProps],
      PREVIOUS_PAGE_LINK: ComponentType[PaginationComponentProps]
    ): ItemTypeToComponent = {
      val __obj = js.Dynamic.literal(ELLIPSIS = ELLIPSIS.asInstanceOf[js.Any], FIRST_PAGE_LINK = FIRST_PAGE_LINK.asInstanceOf[js.Any], LAST_PAGE_LINK = LAST_PAGE_LINK.asInstanceOf[js.Any], NEXT_PAGE_LINK = NEXT_PAGE_LINK.asInstanceOf[js.Any], PAGE = PAGE.asInstanceOf[js.Any], PREVIOUS_PAGE_LINK = PREVIOUS_PAGE_LINK.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemTypeToComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemTypeToComponent] (val x: Self) extends AnyVal {
      
      inline def setELLIPSIS(value: ComponentType[PaginationComponentProps]): Self = StObject.set(x, "ELLIPSIS", value.asInstanceOf[js.Any])
      
      inline def setFIRST_PAGE_LINK(value: ComponentType[PaginationComponentProps]): Self = StObject.set(x, "FIRST_PAGE_LINK", value.asInstanceOf[js.Any])
      
      inline def setLAST_PAGE_LINK(value: ComponentType[PaginationComponentProps]): Self = StObject.set(x, "LAST_PAGE_LINK", value.asInstanceOf[js.Any])
      
      inline def setNEXT_PAGE_LINK(value: ComponentType[PaginationComponentProps]): Self = StObject.set(x, "NEXT_PAGE_LINK", value.asInstanceOf[js.Any])
      
      inline def setPAGE(value: ComponentType[PaginationComponentProps]): Self = StObject.set(x, "PAGE", value.asInstanceOf[js.Any])
      
      inline def setPREVIOUS_PAGE_LINK(value: ComponentType[PaginationComponentProps]): Self = StObject.set(x, "PREVIOUS_PAGE_LINK", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationComponentProps extends StObject {
    
    /**
      * Show if `currentPage` if the same as `value` of an item (can be used to highlight a current page or disable first, previous, next or last page links when user is already on first/last page)
      */
    var isActive: Boolean
    
    /**
      * Show if button should be disabled
      */
    var isDisabled: Boolean
    
    /**
      * Should be called when user interacted with a component and the current page should be changed to the page represented by item (no arguments should be used, can be used for all item types)
      */
    def onClick(): Unit
    
    /**
      * Number of pages that user should navigate to when item is activated (for items with type `PAGE` it also can be used as a label in UI)
      */
    var value: Double
  }
  object PaginationComponentProps {
    
    inline def apply(isActive: Boolean, isDisabled: Boolean, onClick: () => Unit, value: Double): PaginationComponentProps = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationComponentProps] (val x: Self) extends AnyVal {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait UltimatePaginationProps extends StObject {
    
    /**
      * Number of always visible pages at the beginning and end
      */
    var boundaryPagesRange: js.UndefOr[Double] = js.undefined
    
    /**
      * Current page number
      */
    var currentPage: Double
    
    /**
      * Boolean flag to disable all buttons in pagination
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean flag to hide ellipsis
      */
    var hideEllipsis: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean flag to hide first and last page links
      */
    var hideFirstAndLastPageLinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean flag to hide previous and next page links
      */
    var hidePreviousAndNextPageLinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that will be called with new page when it should be changed by user interaction
      */
    var onChange: js.UndefOr[js.Function1[/* newPage */ Double, Unit]] = js.undefined
    
    /**
      * Number of always visible pages before and after the current one
      */
    var siblingPagesRange: js.UndefOr[Double] = js.undefined
    
    /**
      * Total number of pages
      */
    var totalPages: Double
  }
  object UltimatePaginationProps {
    
    inline def apply(currentPage: Double, totalPages: Double): UltimatePaginationProps = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[UltimatePaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UltimatePaginationProps] (val x: Self) extends AnyVal {
      
      inline def setBoundaryPagesRange(value: Double): Self = StObject.set(x, "boundaryPagesRange", value.asInstanceOf[js.Any])
      
      inline def setBoundaryPagesRangeUndefined: Self = StObject.set(x, "boundaryPagesRange", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHideEllipsis(value: Boolean): Self = StObject.set(x, "hideEllipsis", value.asInstanceOf[js.Any])
      
      inline def setHideEllipsisUndefined: Self = StObject.set(x, "hideEllipsis", js.undefined)
      
      inline def setHideFirstAndLastPageLinks(value: Boolean): Self = StObject.set(x, "hideFirstAndLastPageLinks", value.asInstanceOf[js.Any])
      
      inline def setHideFirstAndLastPageLinksUndefined: Self = StObject.set(x, "hideFirstAndLastPageLinks", js.undefined)
      
      inline def setHidePreviousAndNextPageLinks(value: Boolean): Self = StObject.set(x, "hidePreviousAndNextPageLinks", value.asInstanceOf[js.Any])
      
      inline def setHidePreviousAndNextPageLinksUndefined: Self = StObject.set(x, "hidePreviousAndNextPageLinks", js.undefined)
      
      inline def setOnChange(value: /* newPage */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSiblingPagesRange(value: Double): Self = StObject.set(x, "siblingPagesRange", value.asInstanceOf[js.Any])
      
      inline def setSiblingPagesRangeUndefined: Self = StObject.set(x, "siblingPagesRange", js.undefined)
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
}
