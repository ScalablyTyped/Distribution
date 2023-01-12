package typings.reactNativePaper

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsToggleButtonToggleButtonRowMod {
  
  /**
    * Toggle button row renders a group of toggle buttons in a row.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/toggle-button-row.gif" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { ToggleButton } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [value, setValue] = React.useState('left');
    *
    *   return (
    *     <ToggleButton.Row onValueChange={value => setValue(value)} value={value}>
    *       <ToggleButton icon="format-align-left" value="left" />
    *       <ToggleButton icon="format-align-right" value="right" />
    *     </ToggleButton.Row>
    *   );
    * };
    *
    * export default MyComponent;
    *
    *```
    */
  object default {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonRow", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Toggle button row renders a group of toggle buttons in a row.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/toggle-button-row.gif" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { ToggleButton } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [value, setValue] = React.useState('left');
    *
    *   return (
    *     <ToggleButton.Row onValueChange={value => setValue(value)} value={value}>
    *       <ToggleButton icon="format-align-left" value="left" />
    *       <ToggleButton icon="format-align-right" value="right" />
    *     </ToggleButton.Row>
    *   );
    * };
    *
    * export default MyComponent;
    *
    *```
    */
  object ToggleButtonRow {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonRow", "ToggleButtonRow")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonRow", "ToggleButtonRow.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    /**
      * React elements containing toggle buttons.
      */
    var children: ReactNode
    
    /**
      * Function to execute on selection change.
      */
    def onValueChange(value: String): Unit
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Value of the currently selected toggle button.
      */
    var value: String
  }
  object Props {
    
    inline def apply(onValueChange: String => Unit, value: String): Props = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnValueChange(value: String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
