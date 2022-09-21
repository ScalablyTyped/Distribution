package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.TouchableWithoutFeedback
import typings.reactNativePaper.anon.CallHasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRestDisplayNameString
import typings.reactNativePaper.anon.NumberOfLines
import typings.reactNativePaper.anon.PickTouchableWithoutFeedbAccessibilityIgnoresInvertColors
import typings.reactNativePaper.anon.TouchableWithoutFeedbackPAccessibilityActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableTitleMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableTitle", JSImport.Default)
  @js.native
  val default: ComponentType[PickTouchableWithoutFeedbAccessibilityIgnoresInvertColors] & (NonReactStatics[
    ComponentType[TouchableWithoutFeedbackPAccessibilityActions] & CallHasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRestDisplayNameString, 
    js.Object
  ]) = js.native
  
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
  object DataTableTitle {
    
    inline def apply(hasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableTitle", "DataTableTitle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableTitle", "DataTableTitle.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[Instantiable0[TouchableWithoutFeedback]] & NumberOfLines
  
  type _To = ComponentType[PickTouchableWithoutFeedbAccessibilityIgnoresInvertColors] & (NonReactStatics[
    ComponentType[TouchableWithoutFeedbackPAccessibilityActions] & CallHasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRestDisplayNameString, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `dataTableTitleMod.foo` */
  override def _to: ComponentType[PickTouchableWithoutFeedbAccessibilityIgnoresInvertColors] & (NonReactStatics[
    ComponentType[TouchableWithoutFeedbackPAccessibilityActions] & CallHasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRestDisplayNameString, 
    js.Object
  ]) = default
}
