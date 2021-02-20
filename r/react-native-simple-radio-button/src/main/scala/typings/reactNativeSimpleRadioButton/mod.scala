package typings.reactNativeSimpleRadioButton

import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSimpleRadioButton.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait DefaultRadioFormProps extends StObject {
    
    var accessibilityLabel: js.UndefOr[String] = js.native
    
    var accessible: js.UndefOr[Boolean] = js.native
    
    var onPress: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], _]] = js.native
    
    var testID: js.UndefOr[String] = js.native
  }
  object DefaultRadioFormProps {
    
    @scala.inline
    def apply(): DefaultRadioFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRadioFormProps]
    }
    
    @scala.inline
    implicit class DefaultRadioFormPropsMutableBuilder[Self <: DefaultRadioFormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setOnPress(value: /* val */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    }
  }
  
  @js.native
  trait RadioButtonInputProps extends DefaultRadioFormProps {
    
    var buttonInnerColor: js.UndefOr[String] = js.native
    
    var buttonOuterColor: js.UndefOr[String] = js.native
    
    var buttonOuterSize: js.UndefOr[Double] = js.native
    
    var buttonSize: js.UndefOr[Double] = js.native
    
    var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var buttonWrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var index: Double = js.native
    
    var isSelected: js.UndefOr[Boolean] = js.native
    
    var obj: js.Object = js.native
  }
  object RadioButtonInputProps {
    
    @scala.inline
    def apply(index: Double, obj: js.Object): RadioButtonInputProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonInputProps]
    }
    
    @scala.inline
    implicit class RadioButtonInputPropsMutableBuilder[Self <: RadioButtonInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonInnerColor(value: String): Self = StObject.set(x, "buttonInnerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonInnerColorUndefined: Self = StObject.set(x, "buttonInnerColor", js.undefined)
      
      @scala.inline
      def setButtonOuterColor(value: String): Self = StObject.set(x, "buttonOuterColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonOuterColorUndefined: Self = StObject.set(x, "buttonOuterColor", js.undefined)
      
      @scala.inline
      def setButtonOuterSize(value: Double): Self = StObject.set(x, "buttonOuterSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonOuterSizeUndefined: Self = StObject.set(x, "buttonOuterSize", js.undefined)
      
      @scala.inline
      def setButtonSize(value: Double): Self = StObject.set(x, "buttonSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonSizeUndefined: Self = StObject.set(x, "buttonSize", js.undefined)
      
      @scala.inline
      def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      @scala.inline
      def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      @scala.inline
      def setButtonWrapStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonWrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonWrapStyleNull: Self = StObject.set(x, "buttonWrapStyle", null)
      
      @scala.inline
      def setButtonWrapStyleUndefined: Self = StObject.set(x, "buttonWrapStyle", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setObj(value: js.Object): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RadioButtonLabelProps extends DefaultRadioFormProps {
    
    var index: Double = js.native
    
    var labelHorizontal: js.UndefOr[Boolean] = js.native
    
    var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var labelWrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var obj: js.Object = js.native
  }
  object RadioButtonLabelProps {
    
    @scala.inline
    def apply(index: Double, obj: js.Object): RadioButtonLabelProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonLabelProps]
    }
    
    @scala.inline
    implicit class RadioButtonLabelPropsMutableBuilder[Self <: RadioButtonLabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHorizontal(value: Boolean): Self = StObject.set(x, "labelHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHorizontalUndefined: Self = StObject.set(x, "labelHorizontal", js.undefined)
      
      @scala.inline
      def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setLabelWrapStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "labelWrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapStyleNull: Self = StObject.set(x, "labelWrapStyle", null)
      
      @scala.inline
      def setLabelWrapStyleUndefined: Self = StObject.set(x, "labelWrapStyle", js.undefined)
      
      @scala.inline
      def setObj(value: js.Object): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RadioButtonProps extends StObject {
    
    var buttonColor: js.UndefOr[String] = js.native
    
    var idSeparator: js.UndefOr[String] = js.native
    
    var isSelected: js.UndefOr[Boolean] = js.native
    
    var labelColor: js.UndefOr[String] = js.native
    
    var labelHorizontal: js.UndefOr[Boolean] = js.native
    
    var selectedButtonColor: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var wrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object RadioButtonProps {
    
    @scala.inline
    def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    @scala.inline
    implicit class RadioButtonPropsMutableBuilder[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonColor(value: String): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonColorUndefined: Self = StObject.set(x, "buttonColor", js.undefined)
      
      @scala.inline
      def setIdSeparator(value: String): Self = StObject.set(x, "idSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdSeparatorUndefined: Self = StObject.set(x, "idSeparator", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelHorizontal(value: Boolean): Self = StObject.set(x, "labelHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHorizontalUndefined: Self = StObject.set(x, "labelHorizontal", js.undefined)
      
      @scala.inline
      def setSelectedButtonColor(value: String): Self = StObject.set(x, "selectedButtonColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedButtonColorUndefined: Self = StObject.set(x, "selectedButtonColor", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWrapStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyleNull: Self = StObject.set(x, "wrapStyle", null)
      
      @scala.inline
      def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  type RadioForm = Component[ReactNativeRadioFormProps, js.Object, js.Any]
  
  @js.native
  trait ReactNativeRadioFormProps extends DefaultRadioFormProps {
    
    var animation: js.UndefOr[Boolean] = js.native
    
    var buttonColor: js.UndefOr[String] = js.native
    
    var formHorizontal: js.UndefOr[Boolean] = js.native
    
    var initial: js.UndefOr[Double] = js.native
    
    var labelColor: js.UndefOr[String] = js.native
    
    var labelHorizontal: js.UndefOr[Boolean] = js.native
    
    var radio_props: js.UndefOr[js.Array[Label]] = js.native
  }
  object ReactNativeRadioFormProps {
    
    @scala.inline
    def apply(): ReactNativeRadioFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativeRadioFormProps]
    }
    
    @scala.inline
    implicit class ReactNativeRadioFormPropsMutableBuilder[Self <: ReactNativeRadioFormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setButtonColor(value: String): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonColorUndefined: Self = StObject.set(x, "buttonColor", js.undefined)
      
      @scala.inline
      def setFormHorizontal(value: Boolean): Self = StObject.set(x, "formHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormHorizontalUndefined: Self = StObject.set(x, "formHorizontal", js.undefined)
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelHorizontal(value: Boolean): Self = StObject.set(x, "labelHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHorizontalUndefined: Self = StObject.set(x, "labelHorizontal", js.undefined)
      
      @scala.inline
      def setRadio_props(value: js.Array[Label]): Self = StObject.set(x, "radio_props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadio_propsUndefined: Self = StObject.set(x, "radio_props", js.undefined)
      
      @scala.inline
      def setRadio_propsVarargs(value: Label*): Self = StObject.set(x, "radio_props", js.Array(value :_*))
    }
  }
}
