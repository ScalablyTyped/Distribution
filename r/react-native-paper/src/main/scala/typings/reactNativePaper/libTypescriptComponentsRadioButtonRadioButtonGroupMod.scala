package typings.reactNativePaper

import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsRadioButtonRadioButtonGroupMod {
  
  /**
    * Radio button group allows to control a group of radio buttons.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/radio-button-group-android.gif" />
    *  <figcaption>Android</figcaption>
    *   </figure>
    *   <figure>
    *     <img class="medium" src="screenshots/radio-button-group-ios.gif" />
    *  <figcaption>iOS</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { View } from 'react-native';
    * import { RadioButton, Text } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [value, setValue] = React.useState('first');
    *
    *   return (
    *     <RadioButton.Group onValueChange={newValue => setValue(newValue)} value={value}>
    *       <View>
    *         <Text>First</Text>
    *         <RadioButton value="first" />
    *       </View>
    *       <View>
    *         <Text>Second</Text>
    *         <RadioButton value="second" />
    *       </View>
    *     </RadioButton.Group>
    *   );
    * };
    *
    * export default MyComponent;
    *```
    */
  object default {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "RadioButtonContext")
  @js.native
  val RadioButtonContext: Context[RadioButtonContextType] = js.native
  
  /**
    * Radio button group allows to control a group of radio buttons.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/radio-button-group-android.gif" />
    *  <figcaption>Android</figcaption>
    *   </figure>
    *   <figure>
    *     <img class="medium" src="screenshots/radio-button-group-ios.gif" />
    *  <figcaption>iOS</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { View } from 'react-native';
    * import { RadioButton, Text } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [value, setValue] = React.useState('first');
    *
    *   return (
    *     <RadioButton.Group onValueChange={newValue => setValue(newValue)} value={value}>
    *       <View>
    *         <Text>First</Text>
    *         <RadioButton value="first" />
    *       </View>
    *       <View>
    *         <Text>Second</Text>
    *         <RadioButton value="second" />
    *       </View>
    *     </RadioButton.Group>
    *   );
    * };
    *
    * export default MyComponent;
    *```
    */
  object RadioButtonGroup {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "RadioButtonGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "RadioButtonGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    /**
      * React elements containing radio buttons.
      */
    var children: ReactNode
    
    /**
      * Function to execute on selection change.
      */
    def onValueChange(value: String): Unit
    
    /**
      * Value of the currently selected radio button.
      */
    var value: String
  }
  object Props {
    
    inline def apply(onValueChange: String => Unit, value: String): Props = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnValueChange(value: String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioButtonContextType extends StObject {
    
    def onValueChange(item: String): Unit
    
    var value: String
  }
  object RadioButtonContextType {
    
    inline def apply(onValueChange: String => Unit, value: String): RadioButtonContextType = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonContextType]
    }
    
    extension [Self <: RadioButtonContextType](x: Self) {
      
      inline def setOnValueChange(value: String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
