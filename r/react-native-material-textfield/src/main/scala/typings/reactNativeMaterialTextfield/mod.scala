package typings.reactNativeMaterialTextfield

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.dashed
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.dotted
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.none
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.solid
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-textfield", "FilledTextField")
  @js.native
  open class FilledTextField protected () extends TextField {
    def this(props: TextFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextFieldProps, context: Any) = this()
  }
  
  @JSImport("react-native-material-textfield", "OutlinedTextField")
  @js.native
  open class OutlinedTextField protected () extends TextField {
    def this(props: TextFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextFieldProps, context: Any) = this()
  }
  
  @JSImport("react-native-material-textfield", "TextField")
  @js.native
  open class TextField protected () extends Component[TextFieldProps, Any, Any] {
    def this(props: TextFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextFieldProps, context: Any) = this()
    
    /*
      * Release focus
      */
    def blur(): Unit = js.native
    
    /*
      * Clear text field
      */
    def clear(): Unit = js.native
    
    /*
      * Acquire focus
      */
    def focus(): Unit = js.native
    
    /*
      * Get current focus state
      */
    def isFocused(): Boolean = js.native
    
    /*
      * Get current restriction state
      */
    def isRestricted(): Boolean = js.native
    
    /*
      * Set current value
      */
    def setValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
    
    /*
      * Get current value
      */
    def value(): String = js.native
  }
  
  trait ContentInset extends StObject {
    
    var input: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object ContentInset {
    
    inline def apply(): ContentInset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentInset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentInset] (val x: Self) extends AnyVal {
      
      inline def setInput(value: Double): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait LabelOffset extends StObject {
    
    /**
      * Horizontal offset for inactive state
      */
    var x0: js.UndefOr[Double] = js.undefined
    
    /**
      * Horizontal offset for active state
      */
    var x1: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical offset for inactive state
      */
    var y0: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical offset for active state
      */
    var y1: js.UndefOr[Double] = js.undefined
  }
  object LabelOffset {
    
    inline def apply(): LabelOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOffset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelOffset] (val x: Self) extends AnyVal {
      
      inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    }
  }
  
  trait TextFieldProps
    extends StObject
       with TextInputProps {
    
    var activeLineWidth: js.UndefOr[Double] = js.undefined
    
    var affixTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var baseColor: js.UndefOr[String] = js.undefined
    
    var characterRestriction: js.UndefOr[Double] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentInset: js.UndefOr[ContentInset] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledLineType: js.UndefOr[solid | dotted | dashed | none] = js.undefined
    
    var disabledLineWidth: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var errorColor: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var formatText: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
    
    var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var labelFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Label position adjustment
      */
    var labelOffset: js.UndefOr[LabelOffset] = js.undefined
    
    var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var lineType: js.UndefOr[solid | dotted | dashed | none] = js.undefined
    
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var renderLeftAccessory: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var renderRightAccessory: js.UndefOr[js.Function0[Element]] = js.undefined
    
    @JSName("style")
    var style_TextFieldProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object TextFieldProps {
    
    inline def apply(): TextFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextFieldProps] (val x: Self) extends AnyVal {
      
      inline def setActiveLineWidth(value: Double): Self = StObject.set(x, "activeLineWidth", value.asInstanceOf[js.Any])
      
      inline def setActiveLineWidthUndefined: Self = StObject.set(x, "activeLineWidth", js.undefined)
      
      inline def setAffixTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "affixTextStyle", value.asInstanceOf[js.Any])
      
      inline def setAffixTextStyleNull: Self = StObject.set(x, "affixTextStyle", null)
      
      inline def setAffixTextStyleUndefined: Self = StObject.set(x, "affixTextStyle", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      inline def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      inline def setCharacterRestriction(value: Double): Self = StObject.set(x, "characterRestriction", value.asInstanceOf[js.Any])
      
      inline def setCharacterRestrictionUndefined: Self = StObject.set(x, "characterRestriction", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setContentInset(value: ContentInset): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
      
      inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledLineType(value: solid | dotted | dashed | none): Self = StObject.set(x, "disabledLineType", value.asInstanceOf[js.Any])
      
      inline def setDisabledLineTypeUndefined: Self = StObject.set(x, "disabledLineType", js.undefined)
      
      inline def setDisabledLineWidth(value: Double): Self = StObject.set(x, "disabledLineWidth", value.asInstanceOf[js.Any])
      
      inline def setDisabledLineWidthUndefined: Self = StObject.set(x, "disabledLineWidth", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFormatText(value: /* text */ String => String): Self = StObject.set(x, "formatText", js.Any.fromFunction1(value))
      
      inline def setFormatTextUndefined: Self = StObject.set(x, "formatText", js.undefined)
      
      inline def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelOffset(value: LabelOffset): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelTextStyleNull: Self = StObject.set(x, "labelTextStyle", null)
      
      inline def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLineType(value: solid | dotted | dashed | none): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
      
      inline def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setOnPress(value: /* event */ Event => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRenderLeftAccessory(value: () => Element): Self = StObject.set(x, "renderLeftAccessory", js.Any.fromFunction0(value))
      
      inline def setRenderLeftAccessoryUndefined: Self = StObject.set(x, "renderLeftAccessory", js.undefined)
      
      inline def setRenderRightAccessory(value: () => Element): Self = StObject.set(x, "renderRightAccessory", js.Any.fromFunction0(value))
      
      inline def setRenderRightAccessoryUndefined: Self = StObject.set(x, "renderRightAccessory", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleTextStyleNull: Self = StObject.set(x, "titleTextStyle", null)
      
      inline def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
