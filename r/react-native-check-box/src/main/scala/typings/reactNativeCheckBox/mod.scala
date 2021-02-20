package typings.reactNativeCheckBox

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-check-box", JSImport.Default)
  @js.native
  class default ()
    extends Component[CheckBoxProps, js.Object, js.Any]
  
  type CheckBox = Component[CheckBoxProps, js.Object, js.Any]
  
  @js.native
  trait CheckBoxProps extends StObject {
    
    var checkBoxColor: js.UndefOr[String] = js.native
    
    var checkedCheckBoxColor: js.UndefOr[String] = js.native
    
    var checkedImage: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var isChecked: Boolean = js.native
    
    var leftText: js.UndefOr[String] = js.native
    
    var leftTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var leftTextView: js.UndefOr[ReactNode] = js.native
    
    def onClick(): Unit = js.native
    
    var rightText: js.UndefOr[String] = js.native
    
    var rightTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var rightTextView: js.UndefOr[ReactNode] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var unCheckedImage: js.UndefOr[ReactElement] = js.native
    
    var uncheckedCheckBoxColor: js.UndefOr[String] = js.native
  }
  object CheckBoxProps {
    
    @scala.inline
    def apply(isChecked: Boolean, onClick: () => Unit): CheckBoxProps = {
      val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
      __obj.asInstanceOf[CheckBoxProps]
    }
    
    @scala.inline
    implicit class CheckBoxPropsMutableBuilder[Self <: CheckBoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckBoxColor(value: String): Self = StObject.set(x, "checkBoxColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckBoxColorUndefined: Self = StObject.set(x, "checkBoxColor", js.undefined)
      
      @scala.inline
      def setCheckedCheckBoxColor(value: String): Self = StObject.set(x, "checkedCheckBoxColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedCheckBoxColorUndefined: Self = StObject.set(x, "checkedCheckBoxColor", js.undefined)
      
      @scala.inline
      def setCheckedImage(value: ReactElement): Self = StObject.set(x, "checkedImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedImageUndefined: Self = StObject.set(x, "checkedImage", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftText(value: String): Self = StObject.set(x, "leftText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "leftTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTextStyleNull: Self = StObject.set(x, "leftTextStyle", null)
      
      @scala.inline
      def setLeftTextStyleUndefined: Self = StObject.set(x, "leftTextStyle", js.undefined)
      
      @scala.inline
      def setLeftTextUndefined: Self = StObject.set(x, "leftText", js.undefined)
      
      @scala.inline
      def setLeftTextView(value: ReactNode): Self = StObject.set(x, "leftTextView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTextViewUndefined: Self = StObject.set(x, "leftTextView", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRightText(value: String): Self = StObject.set(x, "rightText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "rightTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTextStyleNull: Self = StObject.set(x, "rightTextStyle", null)
      
      @scala.inline
      def setRightTextStyleUndefined: Self = StObject.set(x, "rightTextStyle", js.undefined)
      
      @scala.inline
      def setRightTextUndefined: Self = StObject.set(x, "rightText", js.undefined)
      
      @scala.inline
      def setRightTextView(value: ReactNode): Self = StObject.set(x, "rightTextView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTextViewUndefined: Self = StObject.set(x, "rightTextView", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnCheckedImage(value: ReactElement): Self = StObject.set(x, "unCheckedImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnCheckedImageUndefined: Self = StObject.set(x, "unCheckedImage", js.undefined)
      
      @scala.inline
      def setUncheckedCheckBoxColor(value: String): Self = StObject.set(x, "uncheckedCheckBoxColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedCheckBoxColorUndefined: Self = StObject.set(x, "uncheckedCheckBoxColor", js.undefined)
    }
  }
}
