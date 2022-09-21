package typings.reactNativePickerPicker

import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNativePickerPicker.anon.ItemIndex
import typings.reactNativePickerPicker.pickerMod.ItemValue
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerIOSMod {
  
  @JSImport("@react-native-picker/picker/typings/PickerIOS", "PickerIOS")
  @js.native
  open class PickerIOS protected ()
    extends Component[PickerIOSProps, js.Object, Any] {
    def this(props: PickerIOSProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerIOSProps, context: Any) = this()
  }
  object PickerIOS {
    
    /* was `typeof PickerIOSItem` */
    @JSImport("@react-native-picker/picker/typings/PickerIOS", "PickerIOS.Item")
    @js.native
    open class Item ()
      extends Component[PickerIOSItemProps, js.Object, Any]
  }
  
  type PickerIOSItem = Component[PickerIOSItemProps, js.Object, Any]
  
  trait PickerIOSItemProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object PickerIOSItemProps {
    
    inline def apply(): PickerIOSItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerIOSItemProps]
    }
    
    extension [Self <: PickerIOSItemProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PickerIOSProps
    extends StObject
       with ViewProps {
    
    var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var numberOfLines: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[SyntheticEvent[ItemIndex, Event]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function2[/* itemValue */ ItemValue, /* itemIndex */ Double, Unit]] = js.undefined
    
    var selectedValue: js.UndefOr[ItemValue] = js.undefined
    
    @JSName("style")
    var style_PickerIOSProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var themeVariant: js.UndefOr[String] = js.undefined
  }
  object PickerIOSProps {
    
    inline def apply(): PickerIOSProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerIOSProps]
    }
    
    extension [Self <: PickerIOSProps](x: Self) {
      
      inline def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
      
      inline def setOnChange(value: SyntheticEvent[ItemIndex, Event]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnValueChange(value: (/* itemValue */ ItemValue, /* itemIndex */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setSelectedValue(value: ItemValue): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setThemeVariant(value: String): Self = StObject.set(x, "themeVariant", value.asInstanceOf[js.Any])
      
      inline def setThemeVariantUndefined: Self = StObject.set(x, "themeVariant", js.undefined)
    }
  }
}
