package typings.reactNativeWheelPick

import typings.react.mod.Component
import typings.react.mod.PureComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeWheelPick.anon.Date
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.date
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.datetime
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-wheel-pick", "DatePicker")
  @js.native
  open class DatePicker protected ()
    extends PureComponent[DatePickerProps, js.Object, Any] {
    def this(props: DatePickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DatePickerProps, context: Any) = this()
  }
  
  @JSImport("react-native-wheel-pick", "Picker")
  @js.native
  open class Picker[T] protected ()
    extends Component[PickerProps[T], js.Object, Any] {
    def this(props: PickerProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps[T], context: Any) = this()
  }
  
  trait DatePickerAndroidProps
    extends StObject
       with ViewProps {
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var itemSpace: js.UndefOr[Double] = js.undefined
    
    var labelUnit: js.UndefOr[Date] = js.undefined
    
    var maximumDate: js.UndefOr[js.Date] = js.undefined
    
    var minimumDate: js.UndefOr[js.Date] = js.undefined
    
    var mode: js.UndefOr[date | time | datetime] = js.undefined
    
    def onDateChange(newDate: js.Date): Unit
    
    var order: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var textSize: js.UndefOr[Double] = js.undefined
  }
  object DatePickerAndroidProps {
    
    inline def apply(onDateChange: js.Date => Unit): DatePickerAndroidProps = {
      val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
      __obj.asInstanceOf[DatePickerAndroidProps]
    }
    
    extension [Self <: DatePickerAndroidProps](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setItemSpace(value: Double): Self = StObject.set(x, "itemSpace", value.asInstanceOf[js.Any])
      
      inline def setItemSpaceUndefined: Self = StObject.set(x, "itemSpace", js.undefined)
      
      inline def setLabelUnit(value: Date): Self = StObject.set(x, "labelUnit", value.asInstanceOf[js.Any])
      
      inline def setLabelUnitUndefined: Self = StObject.set(x, "labelUnit", js.undefined)
      
      inline def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      inline def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
      
      inline def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      inline def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
      
      inline def setMode(value: date | time | datetime): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDateChange(value: js.Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    }
  }
  
  trait DatePickerIOSProps
    extends StObject
       with ViewProps {
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var maximumDate: js.UndefOr[js.Date] = js.undefined
    
    var minimumDate: js.UndefOr[js.Date] = js.undefined
    
    var mode: js.UndefOr[date | time | datetime] = js.undefined
    
    def onDateChange(newDate: js.Date): Unit
  }
  object DatePickerIOSProps {
    
    inline def apply(onDateChange: js.Date => Unit): DatePickerIOSProps = {
      val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
      __obj.asInstanceOf[DatePickerIOSProps]
    }
    
    extension [Self <: DatePickerIOSProps](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      inline def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
      
      inline def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      inline def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
      
      inline def setMode(value: date | time | datetime): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDateChange(value: js.Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.TVViewPropsIOS because Already inherited
  - js.Any because Already inherited
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.PointerEvents because Already inherited
  - typings.reactNative.mod.Touchable because Already inherited
  - typings.reactNative.mod.GestureResponderHandlers because Already inherited
  - typings.reactNative.mod.ViewPropsIOS because Already inherited
  - typings.reactNative.mod.ViewPropsAndroid because Already inherited
  - js.Object because Already inherited
  - typings.reactNative.mod.ViewProps because Already inherited
  - typings.reactNativeWheelPick.mod.DatePickerIOSProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, collapsable, date, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, maximumDate, minimumDate, mode, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onPointerCancel, onPointerCancelCapture, onPointerDown, onPointerDownCapture, onPointerEnter, onPointerEnterCapture, onPointerLeave, onPointerLeaveCapture, onPointerMove, onPointerMoveCapture, onPointerUp, onPointerUpCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined  */ trait DatePickerProps
    extends StObject
       with DatePickerAndroidProps
  object DatePickerProps {
    
    inline def apply(onDateChange: js.Date => Unit): DatePickerProps = {
      val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
      __obj.asInstanceOf[DatePickerProps]
    }
  }
  
  trait PickerProps[T]
    extends StObject
       with ViewProps {
    
    var itemSpace: js.UndefOr[Double] = js.undefined
    
    var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    def onValueChange(value: T): Unit
    
    var pickerData: js.Array[T]
    
    var selectedValue: js.UndefOr[T] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var textSize: js.UndefOr[Double] = js.undefined
  }
  object PickerProps {
    
    inline def apply[T](onValueChange: T => Unit, pickerData: js.Array[T]): PickerProps[T] = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), pickerData = pickerData.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerProps[T]]
    }
    
    extension [Self <: PickerProps[?], T](x: Self & PickerProps[T]) {
      
      inline def setItemSpace(value: Double): Self = StObject.set(x, "itemSpace", value.asInstanceOf[js.Any])
      
      inline def setItemSpaceUndefined: Self = StObject.set(x, "itemSpace", js.undefined)
      
      inline def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setOnValueChange(value: T => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setPickerData(value: js.Array[T]): Self = StObject.set(x, "pickerData", value.asInstanceOf[js.Any])
      
      inline def setPickerDataVarargs(value: T*): Self = StObject.set(x, "pickerData", js.Array(value*))
      
      inline def setSelectedValue(value: T): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    }
  }
}
