package typings.reactNativePaper

import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Call
import typings.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityLiveRegion
import typings.reactNativePaper.anon.PickTouchableWithoutFeedbAccessibilityActions
import typings.reactNativePaper.anon.PickTouchableWithoutFeedbAccessibilityElementsHidden
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityLanguage
import typings.reactNativePaper.anon.PickpagenumbernumberOfPag
import typings.reactNativePaper.anon.PointerEvents
import typings.reactNativePaper.anon.Style
import typings.reactNativePaper.anon.TouchableWithoutFeedbackP
import typings.reactNativePaper.anon.TouchableWithoutFeedbackPAccessibilityActions
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityLabelledBy
import typings.reactNativePaper.anon.`10`
import typings.reactNativePaper.anon.`11`
import typings.reactNativePaper.anon.`7`
import typings.reactNativePaper.anon.`8`
import typings.reactNativePaper.anon.`9`
import typings.reactNativePaper.anon.pagenumbernumberOfPagesnu
import typings.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDataTableDataTableMod {
  
  /**
    * Data tables allow displaying sets of data.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="large" src="screenshots/data-table.png" />
    *     <figcaption>Data table</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { DataTable } from 'react-native-paper';
    *
    * const optionsPerPage = [2, 3, 4];
    *
    * const MyComponent = () => {
    *   const [page, setPage] = React.useState<number>(0);
    *   const [itemsPerPage, setItemsPerPage] = React.useState(optionsPerPage[0]);
    *
    *   React.useEffect(() => {
    *     setPage(0);
    *   }, [itemsPerPage]);
    *
    *   return (
    *     <DataTable>
    *       <DataTable.Header>
    *         <DataTable.Title>Dessert</DataTable.Title>
    *         <DataTable.Title numeric>Calories</DataTable.Title>
    *         <DataTable.Title numeric>Fat</DataTable.Title>
    *       </DataTable.Header>
    *
    *       <DataTable.Row>
    *         <DataTable.Cell>Frozen yogurt</DataTable.Cell>
    *         <DataTable.Cell numeric>159</DataTable.Cell>
    *         <DataTable.Cell numeric>6.0</DataTable.Cell>
    *       </DataTable.Row>
    *
    *       <DataTable.Row>
    *         <DataTable.Cell>Ice cream sandwich</DataTable.Cell>
    *         <DataTable.Cell numeric>237</DataTable.Cell>
    *         <DataTable.Cell numeric>8.0</DataTable.Cell>
    *       </DataTable.Row>
    *
    *       <DataTable.Pagination
    *         page={page}
    *         numberOfPages={3}
    *         onPageChange={(page) => setPage(page)}
    *         label="1-2 of 6"
    *         optionsPerPage={optionsPerPage}
    *         itemsPerPage={itemsPerPage}
    *         setItemsPerPage={setItemsPerPage}
    *         showFastPagination
    *         optionsLabel={'Rows per page'}
    *       />
    *     </DataTable>
    *   );
    *}
    *
    * export default MyComponent;
    * ```
    */
  object default {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTable", "default.Cell")
    @js.native
    def Cell: `10` = js.native
    inline def Cell_=(x: `10`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTable", "default.Header")
    @js.native
    def Header: ComponentType[PickViewPropsRefAttributeAccessibilityLanguage] & (NonReactStatics[ComponentType[ViewPropsRefAttributesVieAccessibilityLabelledBy] & `7`, js.Object]) = js.native
    inline def Header_=(
      x: ComponentType[PickViewPropsRefAttributeAccessibilityLanguage] & (NonReactStatics[ComponentType[ViewPropsRefAttributesVieAccessibilityLabelledBy] & `7`, js.Object])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTable", "default.Pagination")
    @js.native
    def Pagination: ComponentType[PickpagenumbernumberOfPag] & (NonReactStatics[ComponentType[pagenumbernumberOfPagesnu] & `11`, js.Object]) = js.native
    inline def Pagination_=(
      x: ComponentType[PickpagenumbernumberOfPag] & (NonReactStatics[ComponentType[pagenumbernumberOfPagesnu] & `11`, js.Object])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTable", "default.Row")
    @js.native
    def Row: ComponentType[PickRemoveChildrenComponeAccessibilityLiveRegion] & (NonReactStatics[
        (ComponentType[
          (RemoveChildren[
            ComponentType[PickTouchableWithoutFeedbAccessibilityActions] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
          ]) & PointerEvents
        ]) & `9`, 
        js.Object
      ]) = js.native
    inline def Row_=(
      x: ComponentType[PickRemoveChildrenComponeAccessibilityLiveRegion] & (NonReactStatics[
          (ComponentType[
            (RemoveChildren[
              ComponentType[PickTouchableWithoutFeedbAccessibilityActions] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
            ]) & PointerEvents
          ]) & `9`, 
          js.Object
        ])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTable", "default.Title")
    @js.native
    def Title: ComponentType[PickTouchableWithoutFeedbAccessibilityElementsHidden] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackPAccessibilityActions] & `8`, js.Object]) = js.native
    inline def Title_=(
      x: ComponentType[PickTouchableWithoutFeedbAccessibilityElementsHidden] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackPAccessibilityActions] & `8`, js.Object])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[TypeofView] & Style
}
