package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.CallHasLabelAccessibilityLabelPageNumberOfPagesOnPageChangeStyleThemeShowFastPaginationControlsNumberOfItemsPerPageListNumberOfItemsPerPageOnItemsPerPageChangeSelectPageDropdownLabelSelectPageDropdownAccessibilityLabelRest
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityLiveRegion
import typings.reactNativePaper.anon.SelectPageDropdownAccessibilityLabel
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDataTableDataTablePaginationMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTablePagination", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityLiveRegion] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityLanguage] & CallHasLabelAccessibilityLabelPageNumberOfPagesOnPageChangeStyleThemeShowFastPaginationControlsNumberOfItemsPerPageListNumberOfItemsPerPageOnItemsPerPageChangeSelectPageDropdownLabelSelectPageDropdownAccessibilityLabelRest, 
    js.Object
  ]) = js.native
  
  /**
    * A component to show pagination for data table.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/data-table-pagination.png" />
    *   </figure>
    * </div>
    *
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { DataTable } from 'react-native-paper';
    *
    * const numberOfItemsPerPageList = [2, 3, 4];
    *
    * const items = [
    *   {
    *     key: 1,
    *     name: 'Page 1',
    *   },
    *   {
    *     key: 2,
    *     name: 'Page 2',
    *   },
    *   {
    *     key: 3,
    *     name: 'Page 3',
    *   },
    * ];
    *
    * const MyComponent = () => {
    *   const [page, setPage] = React.useState(0);
    *   const [numberOfItemsPerPage, onItemsPerPageChange] = React.useState(numberOfItemsPerPageList[0]);
    *   const from = page * numberOfItemsPerPage;
    *   const to = Math.min((page + 1) * numberOfItemsPerPage, items.length);
    *
    *   React.useEffect(() => {
    *      setPage(0);
    *   }, [numberOfItemsPerPage]);
    *
    *   return (
    *     <DataTable>
    *       <DataTable.Pagination
    *         page={page}
    *         numberOfPages={Math.ceil(items.length / numberOfItemsPerPage)}
    *         onPageChange={page => setPage(page)}
    *         label={`${from + 1}-${to} of ${items.length}`}
    *         showFastPaginationControls
    *         numberOfItemsPerPageList={numberOfItemsPerPageList}
    *         numberOfItemsPerPage={numberOfItemsPerPage}
    *         onItemsPerPageChange={onItemsPerPageChange}
    *         selectPageDropdownLabel={'Rows per page'}
    *       />
    *     </DataTable>
    *   );
    * };
    *
    * export default MyComponent;
    * ```
    */
  object DataTablePagination {
    
    inline def apply(
      hasLabelAccessibilityLabelPageNumberOfPagesOnPageChangeStyleThemeShowFastPaginationControlsNumberOfItemsPerPageListNumberOfItemsPerPageOnItemsPerPageChangeSelectPageDropdownLabelSelectPageDropdownAccessibilityLabelRest: Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasLabelAccessibilityLabelPageNumberOfPagesOnPageChangeStyleThemeShowFastPaginationControlsNumberOfItemsPerPageListNumberOfItemsPerPageOnItemsPerPageChangeSelectPageDropdownLabelSelectPageDropdownAccessibilityLabelRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTablePagination", "DataTablePagination")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTablePagination", "DataTablePagination.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait PaginationControlsProps extends StObject {
    
    /**
      * The total number of pages.
      */
    var numberOfPages: Double
    
    /**
      * Function to execute on page change.
      */
    def onPageChange(page: Double): Unit
    
    /**
      * The currently visible page (starting with 0).
      */
    var page: Double
    
    /**
      * Whether to show fast forward and fast rewind buttons in pagination. False by default.
      */
    var showFastPaginationControls: js.UndefOr[Boolean] = js.undefined
  }
  object PaginationControlsProps {
    
    inline def apply(numberOfPages: Double, onPageChange: Double => Unit, page: Double): PaginationControlsProps = {
      val __obj = js.Dynamic.literal(numberOfPages = numberOfPages.asInstanceOf[js.Any], onPageChange = js.Any.fromFunction1(onPageChange), page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationControlsProps]
    }
    
    extension [Self <: PaginationControlsProps](x: Self) {
      
      inline def setNumberOfPages(value: Double): Self = StObject.set(x, "numberOfPages", value.asInstanceOf[js.Any])
      
      inline def setOnPageChange(value: Double => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setShowFastPaginationControls(value: Boolean): Self = StObject.set(x, "showFastPaginationControls", value.asInstanceOf[js.Any])
      
      inline def setShowFastPaginationControlsUndefined: Self = StObject.set(x, "showFastPaginationControls", js.undefined)
    }
  }
  
  trait PaginationDropdownProps extends StObject {
    
    /**
      * The current number of rows per page.
      */
    var numberOfItemsPerPage: js.UndefOr[Double] = js.undefined
    
    /**
      * Options for a number of rows per page to choose from.
      */
    var numberOfItemsPerPageList: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The function to set the number of rows per page.
      */
    var onItemsPerPageChange: js.UndefOr[js.Function1[/* numberOfItemsPerPage */ Double, Unit]] = js.undefined
  }
  object PaginationDropdownProps {
    
    inline def apply(): PaginationDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationDropdownProps]
    }
    
    extension [Self <: PaginationDropdownProps](x: Self) {
      
      inline def setNumberOfItemsPerPage(value: Double): Self = StObject.set(x, "numberOfItemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setNumberOfItemsPerPageList(value: js.Array[Double]): Self = StObject.set(x, "numberOfItemsPerPageList", value.asInstanceOf[js.Any])
      
      inline def setNumberOfItemsPerPageListUndefined: Self = StObject.set(x, "numberOfItemsPerPageList", js.undefined)
      
      inline def setNumberOfItemsPerPageListVarargs(value: Double*): Self = StObject.set(x, "numberOfItemsPerPageList", js.Array(value*))
      
      inline def setNumberOfItemsPerPageUndefined: Self = StObject.set(x, "numberOfItemsPerPage", js.undefined)
      
      inline def setOnItemsPerPageChange(value: /* numberOfItemsPerPage */ Double => Unit): Self = StObject.set(x, "onItemsPerPageChange", js.Any.fromFunction1(value))
      
      inline def setOnItemsPerPageChangeUndefined: Self = StObject.set(x, "onItemsPerPageChange", js.undefined)
    }
  }
  
  type Props = ComponentPropsWithRef[TypeofView] & PaginationControlsProps & PaginationDropdownProps & SelectPageDropdownAccessibilityLabel
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityLiveRegion] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityLanguage] & CallHasLabelAccessibilityLabelPageNumberOfPagesOnPageChangeStyleThemeShowFastPaginationControlsNumberOfItemsPerPageListNumberOfItemsPerPageOnItemsPerPageChangeSelectPageDropdownLabelSelectPageDropdownAccessibilityLabelRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDataTableDataTablePaginationMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityLiveRegion] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityLanguage] & CallHasLabelAccessibilityLabelPageNumberOfPagesOnPageChangeStyleThemeShowFastPaginationControlsNumberOfItemsPerPageListNumberOfItemsPerPageOnItemsPerPageChangeSelectPageDropdownLabelSelectPageDropdownAccessibilityLabelRest, 
    js.Object
  ]) = default
}
