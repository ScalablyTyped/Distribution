package typings.reactNativeSimpleRadioButton

import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSimpleRadioButton.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-simple-radio-button", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactNativeRadioFormProps, js.Object, js.Any]
  
  @JSImport("react-native-simple-radio-button", "RadioButton")
  @js.native
  class RadioButton protected ()
    extends Component[RadioButtonProps, js.Object, js.Any] {
    def this(props: RadioButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RadioButtonProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-simple-radio-button", "RadioButtonInput")
  @js.native
  class RadioButtonInput protected ()
    extends Component[RadioButtonInputProps, js.Object, js.Any] {
    def this(props: RadioButtonInputProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RadioButtonInputProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-simple-radio-button", "RadioButtonLabel")
  @js.native
  class RadioButtonLabel protected ()
    extends Component[RadioButtonLabelProps, js.Object, js.Any] {
    def this(props: RadioButtonLabelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RadioButtonLabelProps, context: js.Any) = this()
  }
  
  trait DefaultRadioFormProps extends StObject {
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], js.Any]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
  }
  object DefaultRadioFormProps {
    
    inline def apply(): DefaultRadioFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRadioFormProps]
    }
    
    extension [Self <: DefaultRadioFormProps](x: Self) {
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setOnPress(value: /* val */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    }
  }
  
  trait RadioButtonInputProps
    extends StObject
       with DefaultRadioFormProps {
    
    var buttonInnerColor: js.UndefOr[String] = js.undefined
    
    var buttonOuterColor: js.UndefOr[String] = js.undefined
    
    var buttonOuterSize: js.UndefOr[Double] = js.undefined
    
    var buttonSize: js.UndefOr[Double] = js.undefined
    
    var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var buttonWrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var index: Double
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var obj: js.Object
  }
  object RadioButtonInputProps {
    
    inline def apply(index: Double, obj: js.Object): RadioButtonInputProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonInputProps]
    }
    
    extension [Self <: RadioButtonInputProps](x: Self) {
      
      inline def setButtonInnerColor(value: String): Self = StObject.set(x, "buttonInnerColor", value.asInstanceOf[js.Any])
      
      inline def setButtonInnerColorUndefined: Self = StObject.set(x, "buttonInnerColor", js.undefined)
      
      inline def setButtonOuterColor(value: String): Self = StObject.set(x, "buttonOuterColor", value.asInstanceOf[js.Any])
      
      inline def setButtonOuterColorUndefined: Self = StObject.set(x, "buttonOuterColor", js.undefined)
      
      inline def setButtonOuterSize(value: Double): Self = StObject.set(x, "buttonOuterSize", value.asInstanceOf[js.Any])
      
      inline def setButtonOuterSizeUndefined: Self = StObject.set(x, "buttonOuterSize", js.undefined)
      
      inline def setButtonSize(value: Double): Self = StObject.set(x, "buttonSize", value.asInstanceOf[js.Any])
      
      inline def setButtonSizeUndefined: Self = StObject.set(x, "buttonSize", js.undefined)
      
      inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setButtonWrapStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonWrapStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonWrapStyleNull: Self = StObject.set(x, "buttonWrapStyle", null)
      
      inline def setButtonWrapStyleUndefined: Self = StObject.set(x, "buttonWrapStyle", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setObj(value: js.Object): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioButtonLabelProps
    extends StObject
       with DefaultRadioFormProps {
    
    var index: Double
    
    var labelHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var labelWrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var obj: js.Object
  }
  object RadioButtonLabelProps {
    
    inline def apply(index: Double, obj: js.Object): RadioButtonLabelProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonLabelProps]
    }
    
    extension [Self <: RadioButtonLabelProps](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLabelHorizontal(value: Boolean): Self = StObject.set(x, "labelHorizontal", value.asInstanceOf[js.Any])
      
      inline def setLabelHorizontalUndefined: Self = StObject.set(x, "labelHorizontal", js.undefined)
      
      inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setLabelWrapStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "labelWrapStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelWrapStyleNull: Self = StObject.set(x, "labelWrapStyle", null)
      
      inline def setLabelWrapStyleUndefined: Self = StObject.set(x, "labelWrapStyle", js.undefined)
      
      inline def setObj(value: js.Object): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioButtonProps extends StObject {
    
    var buttonColor: js.UndefOr[String] = js.undefined
    
    var idSeparator: js.UndefOr[String] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var labelColor: js.UndefOr[String] = js.undefined
    
    var labelHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var selectedButtonColor: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var wrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object RadioButtonProps {
    
    inline def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    extension [Self <: RadioButtonProps](x: Self) {
      
      inline def setButtonColor(value: String): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
      
      inline def setButtonColorUndefined: Self = StObject.set(x, "buttonColor", js.undefined)
      
      inline def setIdSeparator(value: String): Self = StObject.set(x, "idSeparator", value.asInstanceOf[js.Any])
      
      inline def setIdSeparatorUndefined: Self = StObject.set(x, "idSeparator", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelHorizontal(value: Boolean): Self = StObject.set(x, "labelHorizontal", value.asInstanceOf[js.Any])
      
      inline def setLabelHorizontalUndefined: Self = StObject.set(x, "labelHorizontal", js.undefined)
      
      inline def setSelectedButtonColor(value: String): Self = StObject.set(x, "selectedButtonColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedButtonColorUndefined: Self = StObject.set(x, "selectedButtonColor", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrapStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapStyleNull: Self = StObject.set(x, "wrapStyle", null)
      
      inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  type RadioForm = Component[ReactNativeRadioFormProps, js.Object, js.Any]
  
  trait ReactNativeRadioFormProps
    extends StObject
       with DefaultRadioFormProps {
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var buttonColor: js.UndefOr[String] = js.undefined
    
    var formHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var initial: js.UndefOr[Double] = js.undefined
    
    var labelColor: js.UndefOr[String] = js.undefined
    
    var labelHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var radio_props: js.UndefOr[js.Array[Label]] = js.undefined
  }
  object ReactNativeRadioFormProps {
    
    inline def apply(): ReactNativeRadioFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativeRadioFormProps]
    }
    
    extension [Self <: ReactNativeRadioFormProps](x: Self) {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setButtonColor(value: String): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
      
      inline def setButtonColorUndefined: Self = StObject.set(x, "buttonColor", js.undefined)
      
      inline def setFormHorizontal(value: Boolean): Self = StObject.set(x, "formHorizontal", value.asInstanceOf[js.Any])
      
      inline def setFormHorizontalUndefined: Self = StObject.set(x, "formHorizontal", js.undefined)
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelHorizontal(value: Boolean): Self = StObject.set(x, "labelHorizontal", value.asInstanceOf[js.Any])
      
      inline def setLabelHorizontalUndefined: Self = StObject.set(x, "labelHorizontal", js.undefined)
      
      inline def setRadio_props(value: js.Array[Label]): Self = StObject.set(x, "radio_props", value.asInstanceOf[js.Any])
      
      inline def setRadio_propsUndefined: Self = StObject.set(x, "radio_props", js.undefined)
      
      inline def setRadio_propsVarargs(value: Label*): Self = StObject.set(x, "radio_props", js.Array(value :_*))
    }
  }
}
