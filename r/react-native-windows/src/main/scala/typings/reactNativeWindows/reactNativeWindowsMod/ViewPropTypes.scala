package typings.reactNativeWindows.reactNativeWindowsMod

import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.reactNativeWindows.reactNativeWindowsStrings.`box-none`
import typings.reactNativeWindows.reactNativeWindowsStrings.`box-only`
import typings.reactNativeWindows.reactNativeWindowsStrings.`no-hide-descendants`
import typings.reactNativeWindows.reactNativeWindowsStrings.assertive
import typings.reactNativeWindows.reactNativeWindowsStrings.auto
import typings.reactNativeWindows.reactNativeWindowsStrings.no
import typings.reactNativeWindows.reactNativeWindowsStrings.none
import typings.reactNativeWindows.reactNativeWindowsStrings.polite
import typings.reactNativeWindows.reactNativeWindowsStrings.yes
import typings.reactNativeWindows.rntypesMod.AccessibilityActionEvent
import typings.reactNativeWindows.rntypesMod.AccessibilityActionInfo
import typings.reactNativeWindows.rntypesMod.AccessibilityRole
import typings.reactNativeWindows.rntypesMod.AccessibilityState
import typings.reactNativeWindows.rntypesMod.AccessibilityValue
import typings.reactNativeWindows.rntypesMod.GestureResponderEvent
import typings.reactNativeWindows.rntypesMod.Insets
import typings.reactNativeWindows.rntypesMod.LayoutChangeEvent
import typings.reactNativeWindows.rntypesMod.StyleProp
import typings.reactNativeWindows.rntypesMod.TVParallaxProperties
import typings.reactNativeWindows.rntypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<react-native-windows.react-native-windows/rntypes.ViewProps> */
object ViewPropTypes {
  
  @JSImport("react-native-windows", "ViewPropTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityActions")
  @js.native
  def accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  inline def accessibilityActions_=(x: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityElementsHidden")
  @js.native
  def accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityElementsHidden_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityHint")
  @js.native
  def accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def accessibilityHint_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityIgnoresInvertColors")
  @js.native
  def accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityIgnoresInvertColors_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityLabel")
  @js.native
  def accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def accessibilityLabel_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityLiveRegion")
  @js.native
  def accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  inline def accessibilityLiveRegion_=(x: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityRole")
  @js.native
  def accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]] = js.native
  inline def accessibilityRole_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityState")
  @js.native
  def accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  inline def accessibilityState_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityValue")
  @js.native
  def accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]] = js.native
  inline def accessibilityValue_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessibilityViewIsModal")
  @js.native
  def accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityViewIsModal_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.accessible")
  @js.native
  def accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessible_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessible")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.children")
  @js.native
  def children: js.UndefOr[Validator[js.UndefOr[ReactNode]]] = js.native
  inline def children_=(x: js.UndefOr[Validator[js.UndefOr[ReactNode]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.collapsable")
  @js.native
  def collapsable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def collapsable_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapsable")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.focusable")
  @js.native
  def focusable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def focusable_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusable")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.hasTVPreferredFocus")
  @js.native
  def hasTVPreferredFocus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def hasTVPreferredFocus_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.hitSlop")
  @js.native
  def hitSlop: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.native
  inline def hitSlop_=(x: js.UndefOr[Validator[js.UndefOr[Insets]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.importantForAccessibility")
  @js.native
  def importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  inline def importantForAccessibility_=(x: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.isTVSelectable")
  @js.native
  def isTVSelectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def isTVSelectable_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.nativeID")
  @js.native
  def nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def nativeID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.needsOffscreenAlphaCompositing")
  @js.native
  def needsOffscreenAlphaCompositing: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def needsOffscreenAlphaCompositing_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("needsOffscreenAlphaCompositing")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onAccessibilityAction")
  @js.native
  def onAccessibilityAction: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]] = js.native
  inline def onAccessibilityAction_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onAccessibilityEscape")
  @js.native
  def onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onAccessibilityEscape_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onAccessibilityTap")
  @js.native
  def onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onAccessibilityTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onLayout")
  @js.native
  def onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  inline def onLayout_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onMagicTap")
  @js.native
  def onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onMagicTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onMoveShouldSetResponder")
  @js.native
  def onMoveShouldSetResponder: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  
  @JSImport("react-native-windows", "ViewPropTypes.onMoveShouldSetResponderCapture")
  @js.native
  def onMoveShouldSetResponderCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  inline def onMoveShouldSetResponderCapture_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(x.asInstanceOf[js.Any])
  
  inline def onMoveShouldSetResponder_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onResponderEnd")
  @js.native
  def onResponderEnd: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderEnd_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onResponderGrant")
  @js.native
  def onResponderGrant: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderGrant_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onResponderMove")
  @js.native
  def onResponderMove: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderMove_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onResponderReject")
  @js.native
  def onResponderReject: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderReject_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onResponderRelease")
  @js.native
  def onResponderRelease: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderRelease_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onResponderStart")
  @js.native
  def onResponderStart: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderStart_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onResponderTerminate")
  @js.native
  def onResponderTerminate: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onResponderTerminate_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onResponderTerminationRequest")
  @js.native
  def onResponderTerminationRequest: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  inline def onResponderTerminationRequest_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onStartShouldSetResponder")
  @js.native
  def onStartShouldSetResponder: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  
  @JSImport("react-native-windows", "ViewPropTypes.onStartShouldSetResponderCapture")
  @js.native
  def onStartShouldSetResponderCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.native
  inline def onStartShouldSetResponderCapture_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(x.asInstanceOf[js.Any])
  
  inline def onStartShouldSetResponder_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onTouchCancel")
  @js.native
  def onTouchCancel: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onTouchCancel_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onTouchEnd")
  @js.native
  def onTouchEnd: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  
  @JSImport("react-native-windows", "ViewPropTypes.onTouchEndCapture")
  @js.native
  def onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onTouchEndCapture_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(x.asInstanceOf[js.Any])
  
  inline def onTouchEnd_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onTouchMove")
  @js.native
  def onTouchMove: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onTouchMove_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.onTouchStart")
  @js.native
  def onTouchStart: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onTouchStart_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.pointerEvents")
  @js.native
  def pointerEvents: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.native
  inline def pointerEvents_=(x: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.removeClippedSubviews")
  @js.native
  def removeClippedSubviews: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def removeClippedSubviews_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.renderToHardwareTextureAndroid")
  @js.native
  def renderToHardwareTextureAndroid: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def renderToHardwareTextureAndroid_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderToHardwareTextureAndroid")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.shouldRasterizeIOS")
  @js.native
  def shouldRasterizeIOS: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def shouldRasterizeIOS_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldRasterizeIOS")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.style")
  @js.native
  def style: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  inline def style_=(x: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.testID")
  @js.native
  def testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def testID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.tvParallaxMagnification")
  @js.native
  def tvParallaxMagnification: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def tvParallaxMagnification_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.tvParallaxProperties")
  @js.native
  def tvParallaxProperties: js.UndefOr[Validator[js.UndefOr[TVParallaxProperties]]] = js.native
  inline def tvParallaxProperties_=(x: js.UndefOr[Validator[js.UndefOr[TVParallaxProperties]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.tvParallaxShiftDistanceX")
  @js.native
  def tvParallaxShiftDistanceX: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def tvParallaxShiftDistanceX_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.tvParallaxShiftDistanceY")
  @js.native
  def tvParallaxShiftDistanceY: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def tvParallaxShiftDistanceY_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ViewPropTypes.tvParallaxTiltAngle")
  @js.native
  def tvParallaxTiltAngle: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def tvParallaxTiltAngle_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(x.asInstanceOf[js.Any])
}
