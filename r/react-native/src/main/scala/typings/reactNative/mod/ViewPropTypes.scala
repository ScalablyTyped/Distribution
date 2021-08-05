package typings.reactNative.mod

import typings.propTypes.mod.Validator
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<react-native.react-native.ViewProps> */
object ViewPropTypes {
  
  @JSImport("react-native", "ViewPropTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "ViewPropTypes.accessibilityActions")
  @js.native
  def accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  inline def accessibilityActions_=(x: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityComponentType")
  @js.native
  def accessibilityComponentType: js.UndefOr[
    Validator[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  inline def accessibilityComponentType_=(
    x: js.UndefOr[
      Validator[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityComponentType")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityElementsHidden")
  @js.native
  def accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityElementsHidden_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityHint")
  @js.native
  def accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def accessibilityHint_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityIgnoresInvertColors")
  @js.native
  def accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityIgnoresInvertColors_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityLabel")
  @js.native
  def accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def accessibilityLabel_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityLiveRegion")
  @js.native
  def accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  inline def accessibilityLiveRegion_=(x: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityRole")
  @js.native
  def accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]] = js.native
  inline def accessibilityRole_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityState")
  @js.native
  def accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  inline def accessibilityState_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityTraits")
  @js.native
  def accessibilityTraits: js.UndefOr[Validator[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  inline def accessibilityTraits_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityValue")
  @js.native
  def accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]] = js.native
  inline def accessibilityValue_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessibilityViewIsModal")
  @js.native
  def accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityViewIsModal_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.accessible")
  @js.native
  def accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessible_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessible")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.collapsable")
  @js.native
  def collapsable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def collapsable_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapsable")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.focusable")
  @js.native
  def focusable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def focusable_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusable")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.hasTVPreferredFocus")
  @js.native
  def hasTVPreferredFocus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def hasTVPreferredFocus_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.hitSlop")
  @js.native
  def hitSlop: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.native
  inline def hitSlop_=(x: js.UndefOr[Validator[js.UndefOr[Insets]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.importantForAccessibility")
  @js.native
  def importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  inline def importantForAccessibility_=(x: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.isTVSelectable")
  @js.native
  def isTVSelectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def isTVSelectable_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.nativeID")
  @js.native
  def nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def nativeID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.needsOffscreenAlphaCompositing")
  @js.native
  def needsOffscreenAlphaCompositing: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def needsOffscreenAlphaCompositing_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("needsOffscreenAlphaCompositing")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onAccessibilityAction")
  @js.native
  def onAccessibilityAction: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]] = js.native
  inline def onAccessibilityAction_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onAccessibilityEscape")
  @js.native
  def onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onAccessibilityEscape_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onAccessibilityTap")
  @js.native
  def onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onAccessibilityTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onLayout")
  @js.native
  def onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  inline def onLayout_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onMagicTap")
  @js.native
  def onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onMagicTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onMoveShouldSetResponder")
  @js.native
  def onMoveShouldSetResponder: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  
  @JSImport("react-native", "ViewPropTypes.onMoveShouldSetResponderCapture")
  @js.native
  def onMoveShouldSetResponderCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  inline def onMoveShouldSetResponderCapture_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(x.asInstanceOf[js.Any])
  
  inline def onMoveShouldSetResponder_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onResponderEnd")
  @js.native
  def onResponderEnd: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderEnd_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onResponderGrant")
  @js.native
  def onResponderGrant: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderGrant_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onResponderMove")
  @js.native
  def onResponderMove: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderMove_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onResponderReject")
  @js.native
  def onResponderReject: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderReject_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onResponderRelease")
  @js.native
  def onResponderRelease: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderRelease_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onResponderStart")
  @js.native
  def onResponderStart: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderStart_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onResponderTerminate")
  @js.native
  def onResponderTerminate: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderTerminate_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onResponderTerminationRequest")
  @js.native
  def onResponderTerminationRequest: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  inline def onResponderTerminationRequest_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onStartShouldSetResponder")
  @js.native
  def onStartShouldSetResponder: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  
  @JSImport("react-native", "ViewPropTypes.onStartShouldSetResponderCapture")
  @js.native
  def onStartShouldSetResponderCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  inline def onStartShouldSetResponderCapture_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(x.asInstanceOf[js.Any])
  
  inline def onStartShouldSetResponder_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onTouchCancel")
  @js.native
  def onTouchCancel: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onTouchCancel_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onTouchEnd")
  @js.native
  def onTouchEnd: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  
  @JSImport("react-native", "ViewPropTypes.onTouchEndCapture")
  @js.native
  def onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onTouchEndCapture_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(x.asInstanceOf[js.Any])
  
  inline def onTouchEnd_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onTouchMove")
  @js.native
  def onTouchMove: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onTouchMove_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.onTouchStart")
  @js.native
  def onTouchStart: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onTouchStart_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.pointerEvents")
  @js.native
  def pointerEvents: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.native
  inline def pointerEvents_=(x: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.removeClippedSubviews")
  @js.native
  def removeClippedSubviews: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def removeClippedSubviews_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.renderToHardwareTextureAndroid")
  @js.native
  def renderToHardwareTextureAndroid: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def renderToHardwareTextureAndroid_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderToHardwareTextureAndroid")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.shouldRasterizeIOS")
  @js.native
  def shouldRasterizeIOS: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def shouldRasterizeIOS_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldRasterizeIOS")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.style")
  @js.native
  def style: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  inline def style_=(x: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.testID")
  @js.native
  def testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def testID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.tvParallaxMagnification")
  @js.native
  def tvParallaxMagnification: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def tvParallaxMagnification_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.tvParallaxProperties")
  @js.native
  def tvParallaxProperties: js.UndefOr[Validator[js.UndefOr[TVParallaxProperties]]] = js.native
  inline def tvParallaxProperties_=(x: js.UndefOr[Validator[js.UndefOr[TVParallaxProperties]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.tvParallaxShiftDistanceX")
  @js.native
  def tvParallaxShiftDistanceX: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def tvParallaxShiftDistanceX_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.tvParallaxShiftDistanceY")
  @js.native
  def tvParallaxShiftDistanceY: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def tvParallaxShiftDistanceY_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ViewPropTypes.tvParallaxTiltAngle")
  @js.native
  def tvParallaxTiltAngle: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def tvParallaxTiltAngle_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(x.asInstanceOf[js.Any])
}
