package typings.reactNativeCommunitySlider

import typings.react.mod.Component
import typings.react.mod.MutableRefObject
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/slider", JSImport.Default)
  @js.native
  class default () extends Slider
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @js.native
  trait Slider
    extends Component[SliderProps, js.Object, js.Any]
  
  /**
  * A component used to select a single value from a range of values.
  */
  type SliderComponent = Component[SliderProps, js.Object, js.Any]
  
  type SliderIOS = Slider
  
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
  - typings.reactNativeCommunitySlider.mod.SliderPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined thumbTintColor */ @js.native
  trait SliderProps extends SliderPropsIOS {
    
    /**
      * A string of one or more words to be announced by the screen reader.
      * Otherwise, it will announce the value as a percentage.
      * Requires passing a value to `accessibilityIncrements` to work correctly.
      * Should be a plural word, as singular units will be handled.
      */
    var accessibilityIncrements: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A string of one or more words to be announced by the screen reader.
      * Otherwise, it will announce the value as a percentage.
      * Requires passing a value to `accessibilityIncrements` to work correctly.
      * Should be a plural word, as singular units will be handled.
      */
    var accessibilityUnits: js.UndefOr[String] = js.native
    
    /**
      * If true the user won't be able to move the slider.
      * Default value is false.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Reverses the direction of the slider.
      */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /**
      * The color used for the track to the right of the button.
      * Overrides the default blue gradient image.
      */
    var maximumTrackTintColor: js.UndefOr[String] = js.native
    
    /**
      * Initial maximum value of the slider. Default value is 1.
      */
    var maximumValue: js.UndefOr[Double] = js.native
    
    /**
      * The color used for the track to the left of the button.
      * Overrides the default blue gradient image.
      */
    var minimumTrackTintColor: js.UndefOr[String] = js.native
    
    /**
      * Initial minimum value of the slider. Default value is 0.
      */
    var minimumValue: js.UndefOr[Double] = js.native
    
    /**
      * Callback called when the user finishes changing the value (e.g. when the slider is released).
      */
    var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * Callback that is called when the user picks up the slider.
      * The initial value is passed as an argument to the callback handler.
      */
    var onSlidingStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * Callback continuously called while the user is dragging the slider.
      */
    var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * Reference object.
      */
    var ref: js.UndefOr[MutableRefObject[SliderRef]] = js.native
    
    /**
      * Step value of the slider. The value should be between 0 and (maximumValue - minimumValue). Default value is 0.
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * Color of the foreground switch grip.
      */
    var thumbTintColor: js.UndefOr[String] = js.native
    
    /**
      * Initial value of the slider. The value should be between minimumValue
      * and maximumValue, which default to 0 and 1 respectively.
      * Default value is 0.
      * This is not a controlled component, you don't need to update
      * the value during dragging.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object SliderProps {
    
    @scala.inline
    def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit class SliderPropsMutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityIncrements(value: js.Array[String]): Self = StObject.set(x, "accessibilityIncrements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityIncrementsUndefined: Self = StObject.set(x, "accessibilityIncrements", js.undefined)
      
      @scala.inline
      def setAccessibilityIncrementsVarargs(value: String*): Self = StObject.set(x, "accessibilityIncrements", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityUnits(value: String): Self = StObject.set(x, "accessibilityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityUnitsUndefined: Self = StObject.set(x, "accessibilityUnits", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
      
      @scala.inline
      def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
      
      @scala.inline
      def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
      
      @scala.inline
      def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
      
      @scala.inline
      def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
      
      @scala.inline
      def setOnSlidingStart(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSlidingStartUndefined: Self = StObject.set(x, "onSlidingStart", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setRef(value: MutableRefObject[SliderRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SliderPropsAndroid extends ViewProps {
    
    /**
      * Color of the foreground switch grip.
      */
    var thumbTintColor: js.UndefOr[String] = js.native
  }
  object SliderPropsAndroid {
    
    @scala.inline
    def apply(): SliderPropsAndroid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderPropsAndroid]
    }
    
    @scala.inline
    implicit class SliderPropsAndroidMutableBuilder[Self <: SliderPropsAndroid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    }
  }
  
  @js.native
  trait SliderPropsIOS extends ViewProps {
    
    /**
      * Assigns a maximum track image. Only static images are supported.
      * The leftmost pixel of the image will be stretched to fill the track.
      */
    var maximumTrackImage: js.UndefOr[ImageURISource] = js.native
    
    /**
      * Assigns a minimum track image. Only static images are supported.
      * The rightmost pixel of the image will be stretched to fill the track.
      */
    var minimumTrackImage: js.UndefOr[ImageURISource] = js.native
    
    /**
      * Sets an image for the thumb. Only static images are supported.
      */
    var thumbImage: js.UndefOr[ImageURISource] = js.native
    
    /**
      * Assigns a single image for the track. Only static images
      * are supported. The center pixel of the image will be stretched
      * to fill the track.
      */
    var trackImage: js.UndefOr[ImageURISource] = js.native
  }
  object SliderPropsIOS {
    
    @scala.inline
    def apply(): SliderPropsIOS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderPropsIOS]
    }
    
    @scala.inline
    implicit class SliderPropsIOSMutableBuilder[Self <: SliderPropsIOS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaximumTrackImage(value: ImageURISource): Self = StObject.set(x, "maximumTrackImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTrackImageUndefined: Self = StObject.set(x, "maximumTrackImage", js.undefined)
      
      @scala.inline
      def setMinimumTrackImage(value: ImageURISource): Self = StObject.set(x, "minimumTrackImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumTrackImageUndefined: Self = StObject.set(x, "minimumTrackImage", js.undefined)
      
      @scala.inline
      def setThumbImage(value: ImageURISource): Self = StObject.set(x, "thumbImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbImageUndefined: Self = StObject.set(x, "thumbImage", js.undefined)
      
      @scala.inline
      def setTrackImage(value: ImageURISource): Self = StObject.set(x, "trackImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackImageUndefined: Self = StObject.set(x, "trackImage", js.undefined)
    }
  }
  
  @js.native
  trait SliderRef extends StObject {
    
    def updateValue(value: Double): Unit = js.native
  }
  object SliderRef {
    
    @scala.inline
    def apply(updateValue: Double => Unit): SliderRef = {
      val __obj = js.Dynamic.literal(updateValue = js.Any.fromFunction1(updateValue))
      __obj.asInstanceOf[SliderRef]
    }
    
    @scala.inline
    implicit class SliderRefMutableBuilder[Self <: SliderRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdateValue(value: Double => Unit): Self = StObject.set(x, "updateValue", js.Any.fromFunction1(value))
    }
  }
}
