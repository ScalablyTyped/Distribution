package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.Modal
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.Dictx
import typings.reactNativeElements.anon.ElementHeight
import typings.reactNativeElements.anon.PickwithPointerbooleanund
import typings.reactNativeElements.anon.ReadonlyModalProps
import typings.reactNativeElements.anon.TooltipPropsPartialThemeP
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.anon.withPointerbooleanundefin
import typings.reactNativeElements.reactNativeElementsBooleans.`false`
import typings.reactNativeElements.reactNativeElementsStrings.onLongPress
import typings.reactNativeElements.reactNativeElementsStrings.onPress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTooltipTooltipMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tooltip/Tooltip", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickwithPointerbooleanund] | ForwardRefExoticComponent[withPointerbooleanundefin] = js.native
  
  @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip")
  @js.native
  open class Tooltip protected () extends Component[TooltipPropsPartialThemeP, TooltipState, Any] {
    def this(props: TooltipPropsPartialThemeP) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TooltipPropsPartialThemeP, context: Any) = this()
    
    var _isMounted: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTooltip(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltip(): Unit = js.native
    
    def containerStyle(withOverlay: Boolean, overlayColor: String): ViewStyle = js.native
    
    def getElementPosition(): Unit = js.native
    
    def getTooltipHighlightedButtonStyle(): ViewStyle = js.native
    
    def getTooltipStyle(): ViewStyle | `false` | Dictx = js.native
    
    def renderContent(withTooltip: Boolean): js.Object = js.native
    
    def renderHighlightedButton(): Element = js.native
    
    def renderModalContent(): Element = js.native
    
    def renderPointer(): Element = js.native
    def renderPointer(tooltipY: String): Element = js.native
    def renderPointer(tooltipY: Double): Element = js.native
    
    def renderStaticHighlightedButton(): Element = js.native
    
    def renderStaticModalContent(): Element = js.native
    
    def renderTogglingModalContent(): Element = js.native
    
    def renderTouchableHighlightedButton(): Element = js.native
    
    var renderedElement: js.UndefOr[View | Null] = js.native
    
    @JSName("state")
    var state_Tooltip: ElementHeight = js.native
    
    def toggleTooltip(): Unit = js.native
    
    def wrapWithPress(
      toggleOnPress: js.UndefOr[Boolean] & Boolean,
      toggleAction: (js.UndefOr[String | onPress | onLongPress]) & String,
      children: ReactNode
    ): js.Object = js.native
  }
  object Tooltip {
    
    /* static member */
    /* static member */
    object defaultProps {
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.ModalComponent")
      @js.native
      open class ModalComponent protected () extends Modal {
        def this(props: ReadonlyModalProps) = this()
      }
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.ModalComponent")
      @js.native
      def ModalComponent: Instantiable1[/* props */ ReadonlyModalProps, Modal] = js.native
      inline def ModalComponent_=(x: Instantiable1[/* props */ ReadonlyModalProps, Modal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModalComponent")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.backgroundColor")
      @js.native
      def backgroundColor: String = js.native
      inline def backgroundColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.closeOnlyOnBackdropPress")
      @js.native
      def closeOnlyOnBackdropPress: Boolean = js.native
      inline def closeOnlyOnBackdropPress_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeOnlyOnBackdropPress")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.height")
      @js.native
      def height: Double = js.native
      inline def height_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.highlightColor")
      @js.native
      def highlightColor: String = js.native
      inline def highlightColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(x.asInstanceOf[js.Any])
      
      inline def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
      
      inline def onOpen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onOpen")().asInstanceOf[Unit]
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.overlayColor")
      @js.native
      def overlayColor: String = js.native
      inline def overlayColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.skipAndroidStatusBar")
      @js.native
      def skipAndroidStatusBar: Boolean = js.native
      inline def skipAndroidStatusBar_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipAndroidStatusBar")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.toggleAction")
      @js.native
      def toggleAction: String = js.native
      inline def toggleAction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleAction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.toggleOnPress")
      @js.native
      def toggleOnPress: Boolean = js.native
      inline def toggleOnPress_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleOnPress")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.width")
      @js.native
      def width: Double = js.native
      inline def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.withOverlay")
      @js.native
      def withOverlay: Boolean = js.native
      inline def withOverlay_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withOverlay")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/tooltip/Tooltip", "Tooltip.defaultProps.withPointer")
      @js.native
      def withPointer: Boolean = js.native
      inline def withPointer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withPointer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooltipProps extends StObject {
    
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
    var onClose_FTooltipProps: js.UndefOr[js.Function0[Unit]] = js.native
    
    def onOpen(): Unit = js.native
    @JSName("onOpen")
    var onOpen_FTooltipProps: js.UndefOr[js.Function0[Unit]] = js.native
    
    var overlayColor: js.UndefOr[ColorValue] = js.native
    
    var pointerColor: js.UndefOr[ColorValue] = js.native
    
    var popover: js.UndefOr[ReactElement] = js.native
    
    var skipAndroidStatusBar: js.UndefOr[Boolean] = js.native
    
    var toggleAction: js.UndefOr[String | onPress | onLongPress] = js.native
    
    var toggleOnPress: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var withOverlay: js.UndefOr[Boolean] = js.native
    
    var withPointer: js.UndefOr[Boolean] = js.native
  }
  
  trait TooltipState extends StObject {
    
    var elementHeight: Double
    
    var elementWidth: Double
    
    var isVisible: Boolean
    
    var xOffset: Double
    
    var yOffset: Double
  }
  object TooltipState {
    
    inline def apply(elementHeight: Double, elementWidth: Double, isVisible: Boolean, xOffset: Double, yOffset: Double): TooltipState = {
      val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any], elementWidth = elementWidth.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipState] (val x: Self) extends AnyVal {
      
      inline def setElementHeight(value: Double): Self = StObject.set(x, "elementHeight", value.asInstanceOf[js.Any])
      
      inline def setElementWidth(value: Double): Self = StObject.set(x, "elementWidth", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[PickwithPointerbooleanund] | ForwardRefExoticComponent[withPointerbooleanundefin]
  
  /* This means you don't have to write `default`, but can instead just say `distTooltipTooltipMod.foo` */
  override def _to: FunctionComponent[PickwithPointerbooleanund] | ForwardRefExoticComponent[withPointerbooleanundefin] = default
}
