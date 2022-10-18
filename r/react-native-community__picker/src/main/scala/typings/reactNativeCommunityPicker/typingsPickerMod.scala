package typings.reactNativeCommunityPicker

import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNativeCommunityPicker.reactNativeCommunityPickerStrings.dialog
import typings.reactNativeCommunityPicker.reactNativeCommunityPickerStrings.dropdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsPickerMod {
  
  type ItemValue = Double | String
  
  type Picker = Component[PickerProps, js.Object, Any]
  
  trait PickerItemProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var value: ItemValue
  }
  object PickerItemProps {
    
    inline def apply(value: ItemValue): PickerItemProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerItemProps]
    }
    
    extension [Self <: PickerItemProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setValue(value: ItemValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickerProps
    extends StObject
       with ViewProps {
    
    /**
      * If set to false, the picker will be disabled, i.e. the user will not be able to make a
      * selection.
      * @platform android
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style to apply to each of the item labels.
      * @platform ios
      */
    var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * On Android, specifies how to display the selection items when the user taps on the picker:
      *
      *   - 'dialog': Show a modal dialog. This is the default.
      *   - 'dropdown': Shows a dropdown anchored to the picker view
      *
      * @platform android
      */
    var mode: js.UndefOr[dialog | dropdown] = js.undefined
    
    /**
      * Callback for when an item is selected. This is called with the following parameters:
      *   - `itemValue`: the `value` prop of the item that was selected
      *   - `itemIndex`: the index of the selected item in this picker
      */
    var onValueChange: js.UndefOr[js.Function2[/* itemValue */ ItemValue, /* itemIndex */ Double, Unit]] = js.undefined
    
    /**
      * Prompt string for this picker, used on Android in dialog mode as the title of the dialog.
      * @platform android
      */
    var prompt: js.UndefOr[String] = js.undefined
    
    /**
      * Value matching value of one of the items. Can be a string or an integer.
      */
    var selectedValue: js.UndefOr[ItemValue] = js.undefined
    
    @JSName("style")
    var style_PickerProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object PickerProps {
    
    inline def apply(): PickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerProps]
    }
    
    extension [Self <: PickerProps](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setMode(value: dialog | dropdown): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnValueChange(value: (/* itemValue */ ItemValue, /* itemIndex */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setSelectedValue(value: ItemValue): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
