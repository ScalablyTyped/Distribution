package typings.reactNativeWindows.mod

import typings.propTypes.mod.Validator
import typings.reactNativeWindows.reactNativeWindowsStrings.`no-hide-descendants`
import typings.reactNativeWindows.reactNativeWindowsStrings.assertive
import typings.reactNativeWindows.reactNativeWindowsStrings.auto
import typings.reactNativeWindows.reactNativeWindowsStrings.no
import typings.reactNativeWindows.reactNativeWindowsStrings.none
import typings.reactNativeWindows.reactNativeWindowsStrings.polite
import typings.reactNativeWindows.reactNativeWindowsStrings.resize
import typings.reactNativeWindows.reactNativeWindowsStrings.scale
import typings.reactNativeWindows.reactNativeWindowsStrings.yes
import typings.reactNativeWindows.rntypesMod.AccessibilityActionEvent
import typings.reactNativeWindows.rntypesMod.AccessibilityActionInfo
import typings.reactNativeWindows.rntypesMod.AccessibilityRole
import typings.reactNativeWindows.rntypesMod.AccessibilityState
import typings.reactNativeWindows.rntypesMod.AccessibilityValue
import typings.reactNativeWindows.rntypesMod.ImageErrorEventData
import typings.reactNativeWindows.rntypesMod.ImageLoadEventData
import typings.reactNativeWindows.rntypesMod.ImageProgressEventDataIOS
import typings.reactNativeWindows.rntypesMod.ImageResizeMode
import typings.reactNativeWindows.rntypesMod.ImageSourcePropType
import typings.reactNativeWindows.rntypesMod.ImageStyle
import typings.reactNativeWindows.rntypesMod.ImageURISource
import typings.reactNativeWindows.rntypesMod.Insets
import typings.reactNativeWindows.rntypesMod.LayoutChangeEvent
import typings.reactNativeWindows.rntypesMod.NativeSyntheticEvent
import typings.reactNativeWindows.rntypesMod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<react-native-windows.react-native-windows/rntypes.ImageProps> */
object ImagePropTypes {
  
  @JSImport("react-native-windows", "ImagePropTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityActions")
  @js.native
  def accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  inline def accessibilityActions_=(x: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityElementsHidden")
  @js.native
  def accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityElementsHidden_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityHint")
  @js.native
  def accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def accessibilityHint_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityIgnoresInvertColors")
  @js.native
  def accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityIgnoresInvertColors_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityLabel")
  @js.native
  def accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def accessibilityLabel_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityLiveRegion")
  @js.native
  def accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  inline def accessibilityLiveRegion_=(x: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityRole")
  @js.native
  def accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]] = js.native
  inline def accessibilityRole_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityState")
  @js.native
  def accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  inline def accessibilityState_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityValue")
  @js.native
  def accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]] = js.native
  inline def accessibilityValue_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessibilityViewIsModal")
  @js.native
  def accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessibilityViewIsModal_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.accessible")
  @js.native
  def accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def accessible_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessible")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.blurRadius")
  @js.native
  def blurRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def blurRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blurRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.borderBottomLeftRadius")
  @js.native
  def borderBottomLeftRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def borderBottomLeftRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.borderBottomRightRadius")
  @js.native
  def borderBottomRightRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def borderBottomRightRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.borderRadius")
  @js.native
  def borderRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def borderRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.borderTopLeftRadius")
  @js.native
  def borderTopLeftRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def borderTopLeftRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.borderTopRightRadius")
  @js.native
  def borderTopRightRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def borderTopRightRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.capInsets")
  @js.native
  def capInsets: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.native
  inline def capInsets_=(x: js.UndefOr[Validator[js.UndefOr[Insets]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capInsets")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.defaultSource")
  @js.native
  def defaultSource: js.UndefOr[Validator[js.UndefOr[ImageURISource | Double]]] = js.native
  inline def defaultSource_=(x: js.UndefOr[Validator[js.UndefOr[ImageURISource | Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSource")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.fadeDuration")
  @js.native
  def fadeDuration: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def fadeDuration_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fadeDuration")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.height")
  @js.native
  def height: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def height_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.importantForAccessibility")
  @js.native
  def importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  inline def importantForAccessibility_=(x: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.loadingIndicatorSource")
  @js.native
  def loadingIndicatorSource: js.UndefOr[Validator[js.UndefOr[ImageURISource]]] = js.native
  inline def loadingIndicatorSource_=(x: js.UndefOr[Validator[js.UndefOr[ImageURISource]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicatorSource")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.nativeID")
  @js.native
  def nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def nativeID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onAccessibilityAction")
  @js.native
  def onAccessibilityAction: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]] = js.native
  inline def onAccessibilityAction_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onAccessibilityEscape")
  @js.native
  def onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onAccessibilityEscape_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onAccessibilityTap")
  @js.native
  def onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onAccessibilityTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onError")
  @js.native
  def onError: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]]
    ]
  ] = js.native
  inline def onError_=(
    x: js.UndefOr[
      Validator[
        js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onLayout")
  @js.native
  def onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  inline def onLayout_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onLoad")
  @js.native
  def onLoad: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]]
    ]
  ] = js.native
  
  @JSImport("react-native-windows", "ImagePropTypes.onLoadEnd")
  @js.native
  def onLoadEnd: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onLoadEnd_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLoadEnd")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onLoadStart")
  @js.native
  def onLoadStart: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onLoadStart_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(x.asInstanceOf[js.Any])
  
  inline def onLoad_=(
    x: js.UndefOr[
      Validator[
        js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onMagicTap")
  @js.native
  def onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onMagicTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onPartialLoad")
  @js.native
  def onPartialLoad: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  inline def onPartialLoad_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPartialLoad")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.onProgress")
  @js.native
  def onProgress: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]]
    ]
  ] = js.native
  inline def onProgress_=(
    x: js.UndefOr[
      Validator[
        js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.progressiveRenderingEnabled")
  @js.native
  def progressiveRenderingEnabled: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  inline def progressiveRenderingEnabled_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressiveRenderingEnabled")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.resizeMethod")
  @js.native
  def resizeMethod: js.UndefOr[Validator[js.UndefOr[auto | resize | scale]]] = js.native
  inline def resizeMethod_=(x: js.UndefOr[Validator[js.UndefOr[auto | resize | scale]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeMethod")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.resizeMode")
  @js.native
  def resizeMode: js.UndefOr[Validator[js.UndefOr[ImageResizeMode]]] = js.native
  inline def resizeMode_=(x: js.UndefOr[Validator[js.UndefOr[ImageResizeMode]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.source")
  @js.native
  def source: js.UndefOr[Validator[ImageSourcePropType]] = js.native
  inline def source_=(x: js.UndefOr[Validator[ImageSourcePropType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.style")
  @js.native
  def style: js.UndefOr[Validator[js.UndefOr[StyleProp[ImageStyle]]]] = js.native
  inline def style_=(x: js.UndefOr[Validator[js.UndefOr[StyleProp[ImageStyle]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.testID")
  @js.native
  def testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  inline def testID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-windows", "ImagePropTypes.width")
  @js.native
  def width: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  inline def width_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
}
