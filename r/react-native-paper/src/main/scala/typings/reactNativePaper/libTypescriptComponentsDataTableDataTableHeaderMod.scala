package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.ChildrenStyle
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityLabelledBy
import typings.reactNativePaper.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDataTableDataTableHeaderMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableHeader", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[ComponentType[ViewPropsRefAttributesVieAccessibilityLabelledBy] & `7`, js.Object]) = js.native
  
  /**
    * A component to display title in table header.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/data-table-header.png" />
    *   </figure>
    * </div>
    *
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { DataTable } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *       <DataTable>
    *         <DataTable.Header>
    *           <DataTable.Title
    *             sortDirection='descending'
    *           >
    *             Dessert
    *           </DataTable.Title>
    *           <DataTable.Title numeric>Calories</DataTable.Title>
    *           <DataTable.Title numeric>Fat (g)</DataTable.Title>
    *         </DataTable.Header>
    *       </DataTable>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object DataTableHeader {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableHeader", "DataTableHeader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableHeader", "DataTableHeader.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[TypeofView] & ChildrenStyle
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[ComponentType[ViewPropsRefAttributesVieAccessibilityLabelledBy] & `7`, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDataTableDataTableHeaderMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[ComponentType[ViewPropsRefAttributesVieAccessibilityLabelledBy] & `7`, js.Object]) = default
}
