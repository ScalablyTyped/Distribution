package typings.reactNativePickerPicker

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNativePickerPicker.reactNativePickerPickerStrings.dialog
import typings.reactNativePickerPicker.reactNativePickerPickerStrings.dropdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsPickerMod {
  
  @JSImport("@react-native-picker/picker/typings/Picker", "Picker")
  @js.native
  open class Picker[T] protected ()
    extends Component[PickerProps[T], js.Object, Any] {
    def this(props: PickerProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps[T], context: Any) = this()
    
    /**
      * @platform android
      */
    def blur(): Unit = js.native
    
    /**
      * @platform android
      */
    def focus(): Unit = js.native
  }
  object Picker {
    
    @JSImport("@react-native-picker/picker/typings/Picker", "Picker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@react-native-picker/picker/typings/Picker", "Picker.Item")
    @js.native
    def Item: ComponentType[
        PickerItemProps[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T */ Any
        ]
      ] = js.native
    inline def Item_=(
      x: ComponentType[
          PickerItemProps[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dialog (this is the default).
      */
    /* static member */
    @JSImport("@react-native-picker/picker/typings/Picker", "Picker.MODE_DIALOG")
    @js.native
    val MODE_DIALOG: dialog = js.native
    
    /**
      * On Android, display the options in a dropdown.
      */
    /* static member */
    @JSImport("@react-native-picker/picker/typings/Picker", "Picker.MODE_DROPDOWN")
    @js.native
    val MODE_DROPDOWN: dropdown = js.native
  }
  
  type ItemValue = Double | String
  
  trait PickerItemProps[T] extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * If set to false, the specific item will be disabled, i.e. the user will not be able to make a
      * selection.
      * @default true
      * @platform android | web
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Style to apply to individual item labels.
      * Only following values take effect:
      *   - 'color'
      *   - 'backgroundColor'
      *   - 'fontSize'
      *   - 'fontFamily'
      *
      * @platform android
      */
    var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object PickerItemProps {
    
    inline def apply[T](): PickerItemProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerItemProps[T]]
    }
    
    extension [Self <: PickerItemProps[?], T](x: Self & PickerItemProps[T]) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PickerProps[T]
    extends StObject
       with ViewProps {
    
    /**
      * Color of arrow for spinner dropdown in hexadecimal format
      * @platform android
      */
    var dropdownIconColor: js.UndefOr[Double | ColorValue] = js.undefined
    
    /**
      * Ripple color of spinner's arrow
      * @platform android
      */
    var dropdownIconRippleColor: js.UndefOr[Double | ColorValue] = js.undefined
    
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
      * On Android & iOS, used to truncate the text with an ellipsis after computing the text layout, including line wrapping,
      * such that the total number of lines does not exceed this number. Default is '1'
      * @platform android & iOS
      */
    var numberOfLines: js.UndefOr[Double] = js.undefined
    
    /**
      * Called when picker is blurred
      * @platform android
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * Called when picker is focused
      * @platform android
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * Callback for when an item is selected. This is called with the following parameters:
      *   - `itemValue`: the `value` prop of the item that was selected
      *   - `itemIndex`: the index of the selected item in this picker
      */
    var onValueChange: js.UndefOr[js.Function2[/* itemValue */ T, /* itemIndex */ Double, Unit]] = js.undefined
    
    /**
      * Placeholder string for this picker, used on Windows if no item has been selected.
      * @platform windows
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Prompt string for this picker, used on Android in dialog mode as the title of the dialog.
      * @platform android
      */
    var prompt: js.UndefOr[String] = js.undefined
    
    /**
      * Value matching value of one of the items. Can be a string or an integer.
      */
    var selectedValue: js.UndefOr[T] = js.undefined
    
    @JSName("style")
    var style_PickerProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object PickerProps {
    
    inline def apply[T](): PickerProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerProps[T]]
    }
    
    extension [Self <: PickerProps[?], T](x: Self & PickerProps[T]) {
      
      inline def setDropdownIconColor(value: Double | ColorValue): Self = StObject.set(x, "dropdownIconColor", value.asInstanceOf[js.Any])
      
      inline def setDropdownIconColorUndefined: Self = StObject.set(x, "dropdownIconColor", js.undefined)
      
      inline def setDropdownIconRippleColor(value: Double | ColorValue): Self = StObject.set(x, "dropdownIconRippleColor", value.asInstanceOf[js.Any])
      
      inline def setDropdownIconRippleColorUndefined: Self = StObject.set(x, "dropdownIconRippleColor", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setMode(value: dialog | dropdown): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
      
      inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnValueChange(value: (/* itemValue */ T, /* itemIndex */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setSelectedValue(value: T): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
