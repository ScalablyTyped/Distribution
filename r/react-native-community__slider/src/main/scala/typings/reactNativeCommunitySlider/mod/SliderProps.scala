package typings.reactNativeCommunitySlider.mod

import typings.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibilityIncrementsVarargs(value: String*): Self = this.set("accessibilityIncrements", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityIncrements(value: js.Array[String]): Self = this.set("accessibilityIncrements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIncrements: Self = this.set("accessibilityIncrements", js.undefined)
    
    @scala.inline
    def setAccessibilityUnits(value: String): Self = this.set("accessibilityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityUnits: Self = this.set("accessibilityUnits", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = this.set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumTrackTintColor: Self = this.set("minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* value */ Double => Unit): Self = this.set("onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingComplete: Self = this.set("onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnSlidingStart(value: /* value */ Double => Unit): Self = this.set("onSlidingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingStart: Self = this.set("onSlidingStart", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Double => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setRef(value: MutableRefObject[SliderRef]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
