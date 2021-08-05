package typings.reactNativeCheckBox

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-check-box", JSImport.Default)
  @js.native
  class default ()
    extends Component[CheckBoxProps, js.Object, js.Any]
  
  type CheckBox = Component[CheckBoxProps, js.Object, js.Any]
  
  trait CheckBoxProps extends StObject {
    
    var checkBoxColor: js.UndefOr[String] = js.undefined
    
    var checkedCheckBoxColor: js.UndefOr[String] = js.undefined
    
    var checkedImage: js.UndefOr[ReactElement] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isChecked: Boolean
    
    var leftText: js.UndefOr[String] = js.undefined
    
    var leftTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var leftTextView: js.UndefOr[ReactNode] = js.undefined
    
    def onClick(): Unit
    
    var rightText: js.UndefOr[String] = js.undefined
    
    var rightTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var rightTextView: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var unCheckedImage: js.UndefOr[ReactElement] = js.undefined
    
    var uncheckedCheckBoxColor: js.UndefOr[String] = js.undefined
  }
  object CheckBoxProps {
    
    inline def apply(isChecked: Boolean, onClick: () => Unit): CheckBoxProps = {
      val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
      __obj.asInstanceOf[CheckBoxProps]
    }
    
    extension [Self <: CheckBoxProps](x: Self) {
      
      inline def setCheckBoxColor(value: String): Self = StObject.set(x, "checkBoxColor", value.asInstanceOf[js.Any])
      
      inline def setCheckBoxColorUndefined: Self = StObject.set(x, "checkBoxColor", js.undefined)
      
      inline def setCheckedCheckBoxColor(value: String): Self = StObject.set(x, "checkedCheckBoxColor", value.asInstanceOf[js.Any])
      
      inline def setCheckedCheckBoxColorUndefined: Self = StObject.set(x, "checkedCheckBoxColor", js.undefined)
      
      inline def setCheckedImage(value: ReactElement): Self = StObject.set(x, "checkedImage", value.asInstanceOf[js.Any])
      
      inline def setCheckedImageUndefined: Self = StObject.set(x, "checkedImage", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setLeftText(value: String): Self = StObject.set(x, "leftText", value.asInstanceOf[js.Any])
      
      inline def setLeftTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "leftTextStyle", value.asInstanceOf[js.Any])
      
      inline def setLeftTextStyleNull: Self = StObject.set(x, "leftTextStyle", null)
      
      inline def setLeftTextStyleUndefined: Self = StObject.set(x, "leftTextStyle", js.undefined)
      
      inline def setLeftTextUndefined: Self = StObject.set(x, "leftText", js.undefined)
      
      inline def setLeftTextView(value: ReactNode): Self = StObject.set(x, "leftTextView", value.asInstanceOf[js.Any])
      
      inline def setLeftTextViewUndefined: Self = StObject.set(x, "leftTextView", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setRightText(value: String): Self = StObject.set(x, "rightText", value.asInstanceOf[js.Any])
      
      inline def setRightTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "rightTextStyle", value.asInstanceOf[js.Any])
      
      inline def setRightTextStyleNull: Self = StObject.set(x, "rightTextStyle", null)
      
      inline def setRightTextStyleUndefined: Self = StObject.set(x, "rightTextStyle", js.undefined)
      
      inline def setRightTextUndefined: Self = StObject.set(x, "rightText", js.undefined)
      
      inline def setRightTextView(value: ReactNode): Self = StObject.set(x, "rightTextView", value.asInstanceOf[js.Any])
      
      inline def setRightTextViewUndefined: Self = StObject.set(x, "rightTextView", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnCheckedImage(value: ReactElement): Self = StObject.set(x, "unCheckedImage", value.asInstanceOf[js.Any])
      
      inline def setUnCheckedImageUndefined: Self = StObject.set(x, "unCheckedImage", js.undefined)
      
      inline def setUncheckedCheckBoxColor(value: String): Self = StObject.set(x, "uncheckedCheckBoxColor", value.asInstanceOf[js.Any])
      
      inline def setUncheckedCheckBoxColorUndefined: Self = StObject.set(x, "uncheckedCheckBoxColor", js.undefined)
    }
  }
}
