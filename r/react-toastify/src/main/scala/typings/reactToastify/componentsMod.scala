package typings.reactToastify

import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactToastify.closeButtonMod.CloseButtonProps
import typings.reactToastify.iconsMod.BuiltInIconProps
import typings.reactToastify.progressBarMod.ProgressBarProps
import typings.reactToastify.typesMod.ToastContainerProps
import typings.reactToastify.typesMod.ToastProps
import typings.reactToastify.typesMod.ToastTransitionProps
import typings.reactToastify.typesMod.TypeOptions
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("react-toastify/dist/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bounce(hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bounce")(hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CloseButton(hasCloseToastThemeAriaLabel: CloseButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CloseButton")(hasCloseToastThemeAriaLabel.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Flip(hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Flip")(hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object Icons {
    
    @JSImport("react-toastify/dist/components", "Icons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify/dist/components", "Icons.error")
    @js.native
    def error: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def error_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/components", "Icons.info")
    @js.native
    def info: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def info_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/components", "Icons.spinner")
    @js.native
    def spinner: js.Function0[Element] = js.native
    inline def spinner_=(x: js.Function0[Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spinner")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/components", "Icons.success")
    @js.native
    def success: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def success_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/components", "Icons.warning")
    @js.native
    def warning: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def warning_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  object ProgressBar {
    
    inline def apply(
      hasDelayIsRunningCloseToastTypeHideClassNameUserStyleControlledProgressProgressRtlIsInTheme: ProgressBarProps
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasDelayIsRunningCloseToastTypeHideClassNameUserStyleControlledProgressProgressRtlIsInTheme.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-toastify/dist/components", "ProgressBar")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps.hide")
      @js.native
      def hide: Boolean = js.native
      inline def hide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hide")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps.type")
      @js.native
      val `type`: TypeOptions = js.native
    }
  }
  
  inline def Slide(hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slide")(hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-toastify/dist/components", "Toast")
  @js.native
  val Toast: FC[ToastProps] = js.native
  
  @JSImport("react-toastify/dist/components", "ToastContainer")
  @js.native
  val ToastContainer: ForwardRefExoticComponent[ToastContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def Zoom(hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Zoom")(hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getIcon(hasThemeTypeIsLoadingIcon: ToastProps): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcon")(hasThemeTypeIsLoadingIcon.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
}
