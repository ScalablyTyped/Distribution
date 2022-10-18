package typings.reactNativeWindows.mod

import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.reactNativeWindows.reactNativeWindowsStrings.`no-hide-descendants`
import typings.reactNativeWindows.reactNativeWindowsStrings.all_
import typings.reactNativeWindows.reactNativeWindowsStrings.assertive
import typings.reactNativeWindows.reactNativeWindowsStrings.auto
import typings.reactNativeWindows.reactNativeWindowsStrings.balanced
import typings.reactNativeWindows.reactNativeWindowsStrings.clip
import typings.reactNativeWindows.reactNativeWindowsStrings.email
import typings.reactNativeWindows.reactNativeWindowsStrings.full
import typings.reactNativeWindows.reactNativeWindowsStrings.head
import typings.reactNativeWindows.reactNativeWindowsStrings.high
import typings.reactNativeWindows.reactNativeWindowsStrings.highQuality
import typings.reactNativeWindows.reactNativeWindowsStrings.link
import typings.reactNativeWindows.reactNativeWindowsStrings.middle
import typings.reactNativeWindows.reactNativeWindowsStrings.no
import typings.reactNativeWindows.reactNativeWindowsStrings.none
import typings.reactNativeWindows.reactNativeWindowsStrings.normal_
import typings.reactNativeWindows.reactNativeWindowsStrings.phoneNumber
import typings.reactNativeWindows.reactNativeWindowsStrings.polite
import typings.reactNativeWindows.reactNativeWindowsStrings.simple
import typings.reactNativeWindows.reactNativeWindowsStrings.tail
import typings.reactNativeWindows.reactNativeWindowsStrings.yes
import typings.reactNativeWindows.rntypesMod.AccessibilityActionEvent
import typings.reactNativeWindows.rntypesMod.AccessibilityActionInfo
import typings.reactNativeWindows.rntypesMod.AccessibilityRole
import typings.reactNativeWindows.rntypesMod.AccessibilityState
import typings.reactNativeWindows.rntypesMod.AccessibilityValue
import typings.reactNativeWindows.rntypesMod.ColorValue
import typings.reactNativeWindows.rntypesMod.GestureResponderEvent
import typings.reactNativeWindows.rntypesMod.LayoutChangeEvent
import typings.reactNativeWindows.rntypesMod.NativeSyntheticEvent
import typings.reactNativeWindows.rntypesMod.StyleProp
import typings.reactNativeWindows.rntypesMod.TextLayoutEventData
import typings.reactNativeWindows.rntypesMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<react-native-windows.react-native-windows/rntypes.TextProps> */
object TextPropTypes {
  
  @JSImport("react-native-windows", "TextPropTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityActions")
  @js.native
  def accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  inline def accessibilityActions_=(x: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityElementsHidden")
  @js.native
  def accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityElementsHidden_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityHint")
  @js.native
  def accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def accessibilityHint_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityIgnoresInvertColors")
  @js.native
  def accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityIgnoresInvertColors_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityLabel")
  @js.native
  def accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def accessibilityLabel_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityLiveRegion")
  @js.native
  def accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  inline def accessibilityLiveRegion_=(x: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityRole")
  @js.native
  def accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]] = js.native
  inline def accessibilityRole_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityState")
  @js.native
  def accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  inline def accessibilityState_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityValue")
  @js.native
  def accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]] = js.native
  inline def accessibilityValue_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessibilityViewIsModal")
  @js.native
  def accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityViewIsModal_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.accessible")
  @js.native
  def accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessible_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessible")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.adjustsFontSizeToFit")
  @js.native
  def adjustsFontSizeToFit: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def adjustsFontSizeToFit_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adjustsFontSizeToFit")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.allowFontScaling")
  @js.native
  def allowFontScaling: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def allowFontScaling_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.android_hyphenationFrequency")
  @js.native
  def androidHyphenationFrequency: js.UndefOr[Validator[js.UndefOr[normal_ | none | full | high | balanced]]] = js.native
  
  inline def androidHyphenationFrequency_=(x: js.UndefOr[Validator[js.UndefOr[normal_ | none | full | high | balanced]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android_hyphenationFrequency")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.children")
  @js.native
  def children: js.UndefOr[Validator[js.UndefOr[ReactNode]]] = js.native
  inline def children_=(x: js.UndefOr[Validator[js.UndefOr[ReactNode]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.dataDetectorType")
  @js.native
  def dataDetectorType: js.UndefOr[Validator[js.UndefOr[Null | phoneNumber | link | email | none | all_]]] = js.native
  inline def dataDetectorType_=(x: js.UndefOr[Validator[js.UndefOr[Null | phoneNumber | link | email | none | all_]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataDetectorType")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.ellipsizeMode")
  @js.native
  def ellipsizeMode: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]] = js.native
  inline def ellipsizeMode_=(x: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsizeMode")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.importantForAccessibility")
  @js.native
  def importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  inline def importantForAccessibility_=(x: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.lineBreakMode")
  @js.native
  def lineBreakMode: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]] = js.native
  inline def lineBreakMode_=(x: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBreakMode")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.maxFontSizeMultiplier")
  @js.native
  def maxFontSizeMultiplier: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  inline def maxFontSizeMultiplier_=(x: js.UndefOr[Validator[js.UndefOr[Double | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.minimumFontScale")
  @js.native
  def minimumFontScale: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def minimumFontScale_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minimumFontScale")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.nativeID")
  @js.native
  def nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def nativeID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.numberOfLines")
  @js.native
  def numberOfLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def numberOfLines_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onAccessibilityAction")
  @js.native
  def onAccessibilityAction: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]] = js.native
  inline def onAccessibilityAction_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onAccessibilityEscape")
  @js.native
  def onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onAccessibilityEscape_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onAccessibilityTap")
  @js.native
  def onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onAccessibilityTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onLayout")
  @js.native
  def onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  inline def onLayout_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onLongPress")
  @js.native
  def onLongPress: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onLongPress_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onMagicTap")
  @js.native
  def onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onMagicTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onPress")
  @js.native
  def onPress: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  
  @JSImport("react-native-windows", "TextPropTypes.onPressIn")
  @js.native
  def onPressIn: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onPressIn_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onPressOut")
  @js.native
  def onPressOut: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.native
  inline def onPressOut_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPressOut")(x.asInstanceOf[js.Any])
  
  inline def onPress_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPress")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.onTextLayout")
  @js.native
  def onTextLayout: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
    ]
  ] = js.native
  inline def onTextLayout_=(
    x: js.UndefOr[
      Validator[
        js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTextLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.selectable")
  @js.native
  def selectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def selectable_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.selectionColor")
  @js.native
  def selectionColor: js.UndefOr[Validator[js.UndefOr[ColorValue]]] = js.native
  inline def selectionColor_=(x: js.UndefOr[Validator[js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.style")
  @js.native
  def style: js.UndefOr[Validator[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  inline def style_=(x: js.UndefOr[Validator[js.UndefOr[StyleProp[TextStyle]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.suppressHighlighting")
  @js.native
  def suppressHighlighting: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def suppressHighlighting_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suppressHighlighting")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.testID")
  @js.native
  def testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def testID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "TextPropTypes.textBreakStrategy")
  @js.native
  def textBreakStrategy: js.UndefOr[Validator[js.UndefOr[simple | highQuality | balanced]]] = js.native
  inline def textBreakStrategy_=(x: js.UndefOr[Validator[js.UndefOr[simple | highQuality | balanced]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textBreakStrategy")(x.asInstanceOf[js.Any])
}
