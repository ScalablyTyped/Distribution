package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.onLongPress
import typings.reactNativeElements.reactNativeElementsStrings.onPress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/tooltip/Tooltip.TooltipProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/tooltip/Tooltip.TooltipProps>> */
@js.native
trait TooltipPropsPartialThemeP extends StObject {
  
  var ModalComponent: js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      Component[js.Object, js.Object, js.Object]
    ])
  ] = js.native
  
  var backgroundColor: js.UndefOr[ColorValue] = js.native
  
  var closeOnlyOnBackdropPress: js.UndefOr[Boolean] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var highlightColor: js.UndefOr[ColorValue] = js.native
  
  def onClose(): Unit = js.native
  @JSName("onClose")
  var onClose_FTooltipPropsPartialThemeP: js.UndefOr[js.Function0[Unit]] = js.native
  
  def onOpen(): Unit = js.native
  @JSName("onOpen")
  var onOpen_FTooltipPropsPartialThemeP: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overlayColor: js.UndefOr[ColorValue] = js.native
  
  var pointerColor: js.UndefOr[ColorValue] = js.native
  
  var popover: js.UndefOr[ReactElement] = js.native
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.native
  
  var skipAndroidStatusBar: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[ThemeTooltipProps] = js.native
  
  var toggleAction: js.UndefOr[String | onPress | onLongPress] = js.native
  
  var toggleOnPress: js.UndefOr[Boolean] = js.native
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var withOverlay: js.UndefOr[Boolean] = js.native
  
  var withPointer: js.UndefOr[Boolean] = js.native
}
