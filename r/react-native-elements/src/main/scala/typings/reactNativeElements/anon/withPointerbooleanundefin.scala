package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.Modal
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  withPointer :boolean | undefined,   popover :react.react.ReactElement | undefined,   toggleOnPress :boolean | undefined,   toggleAction :string | undefined,   height :string | number | undefined,   width :string | number | undefined,   containerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   pointerColor :react-native.react-native.ColorValue | undefined,   onClose :(): void | undefined,   onOpen :(): void | undefined,   overlayColor :react-native.react-native.ColorValue | undefined,   withOverlay :boolean | undefined,   backgroundColor :react-native.react-native.ColorValue | undefined,   highlightColor :react-native.react-native.ColorValue | undefined,   skipAndroidStatusBar :boolean | undefined,   ModalComponent :{  contextType :react.react.Context<any> | undefined} & new <P = {}, S = {}, SS = any>(props : std.Readonly</ * import warning: RewrittenClass.unapply cls was tparam P * / any>): react.react.Component<P, S, SS> | undefined,   closeOnlyOnBackdropPress :boolean | undefined,   withOverlay :boolean,   overlayColor :string,   highlightColor :string,   withPointer :boolean,   toggleOnPress :boolean,   toggleAction :string,   height :number,   width :number,   containerStyle :{},   backgroundColor :string, onClose (): void, onOpen (): void,   skipAndroidStatusBar :boolean,   ModalComponent :new (props : std.Readonly<react-native.react-native.ModalProps>): react-native.react-native.Modal,   closeOnlyOnBackdropPress :boolean} & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/tooltip/Tooltip.TooltipProps>> */
@js.native
trait withPointerbooleanundefin extends StObject {
  
  var ModalComponent: (js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      Component[js.Object, js.Object, js.Object]
    ])
  ]) & (Instantiable1[/* props */ ReadonlyModalProps, Modal]) = js.native
  
  var backgroundColor: js.UndefOr[ColorValue] & String = js.native
  
  var closeOnlyOnBackdropPress: js.UndefOr[Boolean] & Boolean = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] & js.Object = js.native
  
  var height: (js.UndefOr[String | Double]) & Double = js.native
  
  var highlightColor: js.UndefOr[ColorValue] & String = js.native
  
  def onClose(): Unit = js.native
  @JSName("onClose")
  var onClose_FwithPointerbooleanundefin: js.UndefOr[js.Function0[Unit]] = js.native
  
  def onOpen(): Unit = js.native
  @JSName("onOpen")
  var onOpen_FwithPointerbooleanundefin: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overlayColor: js.UndefOr[ColorValue] & String = js.native
  
  var pointerColor: js.UndefOr[ColorValue] = js.native
  
  var popover: js.UndefOr[ReactElement] = js.native
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.native
  
  var skipAndroidStatusBar: js.UndefOr[Boolean] & Boolean = js.native
  
  var theme: js.UndefOr[ThemeTooltipProps] = js.native
  
  var toggleAction: js.UndefOr[String] & String = js.native
  
  var toggleOnPress: js.UndefOr[Boolean] & Boolean = js.native
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.native
  
  var width: (js.UndefOr[String | Double]) & Double = js.native
  
  var withOverlay: js.UndefOr[Boolean] & Boolean = js.native
  
  var withPointer: js.UndefOr[Boolean] & Boolean = js.native
}
