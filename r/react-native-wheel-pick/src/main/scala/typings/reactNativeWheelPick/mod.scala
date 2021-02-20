package typings.reactNativeWheelPick

import typings.react.mod.Component
import typings.react.mod.PureComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.date
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.datetime
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.time
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-wheel-pick", "DatePicker")
  @js.native
  class DatePicker protected ()
    extends PureComponent[DatePickerProps, js.Object, js.Any] {
    def this(props: DatePickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DatePickerProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-wheel-pick", "Picker")
  @js.native
  class Picker[T] protected ()
    extends Component[PickerProps[T], js.Object, js.Any] {
    def this(props: PickerProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps[T], context: js.Any) = this()
  }
  
  @js.native
  trait DatePickerAndroidProps extends ViewProps {
    
    var date: js.UndefOr[Date] = js.native
    
    var itemSpace: js.UndefOr[Double] = js.native
    
    var labelUnit: js.UndefOr[typings.reactNativeWheelPick.anon.Date] = js.native
    
    var maximumDate: js.UndefOr[Date] = js.native
    
    var minimumDate: js.UndefOr[Date] = js.native
    
    var mode: js.UndefOr[date | time | datetime] = js.native
    
    def onDateChange(newDate: Date): Unit = js.native
    
    var order: js.UndefOr[String] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var textSize: js.UndefOr[Double] = js.native
  }
  object DatePickerAndroidProps {
    
    @scala.inline
    def apply(onDateChange: Date => Unit): DatePickerAndroidProps = {
      val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
      __obj.asInstanceOf[DatePickerAndroidProps]
    }
    
    @scala.inline
    implicit class DatePickerAndroidPropsMutableBuilder[Self <: DatePickerAndroidProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setItemSpace(value: Double): Self = StObject.set(x, "itemSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSpaceUndefined: Self = StObject.set(x, "itemSpace", js.undefined)
      
      @scala.inline
      def setLabelUnit(value: typings.reactNativeWheelPick.anon.Date): Self = StObject.set(x, "labelUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUnitUndefined: Self = StObject.set(x, "labelUnit", js.undefined)
      
      @scala.inline
      def setMaximumDate(value: Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
      
      @scala.inline
      def setMinimumDate(value: Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
      
      @scala.inline
      def setMode(value: date | time | datetime): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnDateChange(value: Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    }
  }
  
  @js.native
  trait DatePickerIOSProps extends ViewProps {
    
    var date: js.UndefOr[Date] = js.native
    
    var maximumDate: js.UndefOr[Date] = js.native
    
    var minimumDate: js.UndefOr[Date] = js.native
    
    var mode: js.UndefOr[date | time | datetime] = js.native
    
    def onDateChange(newDate: Date): Unit = js.native
  }
  object DatePickerIOSProps {
    
    @scala.inline
    def apply(onDateChange: Date => Unit): DatePickerIOSProps = {
      val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
      __obj.asInstanceOf[DatePickerIOSProps]
    }
    
    @scala.inline
    implicit class DatePickerIOSPropsMutableBuilder[Self <: DatePickerIOSProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setMaximumDate(value: Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
      
      @scala.inline
      def setMinimumDate(value: Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
      
      @scala.inline
      def setMode(value: date | time | datetime): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnDateChange(value: Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.TVViewPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.Touchable because Already inherited
  - typings.reactNative.mod.GestureResponderHandlers because Already inherited
  - typings.reactNative.mod.ViewPropsIOS because Already inherited
  - typings.reactNative.mod.ViewPropsAndroid because Already inherited
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.ViewProps because Already inherited
  - typings.reactNativeWheelPick.mod.DatePickerIOSProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, date, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, maximumDate, minimumDate, mode, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined  */ @js.native
  trait DatePickerProps extends DatePickerAndroidProps
  object DatePickerProps {
    
    @scala.inline
    def apply(onDateChange: Date => Unit): DatePickerProps = {
      val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
      __obj.asInstanceOf[DatePickerProps]
    }
  }
  
  @js.native
  trait PickerProps[T] extends ViewProps {
    
    var itemSpace: js.UndefOr[Double] = js.native
    
    var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    def onValueChange(value: T): Unit = js.native
    
    var pickerData: js.Array[T] = js.native
    
    var selectedValue: js.UndefOr[T] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var textSize: js.UndefOr[Double] = js.native
  }
  object PickerProps {
    
    @scala.inline
    def apply[T](onValueChange: T => Unit, pickerData: js.Array[T]): PickerProps[T] = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), pickerData = pickerData.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerProps[T]]
    }
    
    @scala.inline
    implicit class PickerPropsMutableBuilder[Self <: PickerProps[_], T] (val x: Self with PickerProps[T]) extends AnyVal {
      
      @scala.inline
      def setItemSpace(value: Double): Self = StObject.set(x, "itemSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSpaceUndefined: Self = StObject.set(x, "itemSpace", js.undefined)
      
      @scala.inline
      def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: T => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPickerData(value: js.Array[T]): Self = StObject.set(x, "pickerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerDataVarargs(value: T*): Self = StObject.set(x, "pickerData", js.Array(value :_*))
      
      @scala.inline
      def setSelectedValue(value: T): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    }
  }
}
