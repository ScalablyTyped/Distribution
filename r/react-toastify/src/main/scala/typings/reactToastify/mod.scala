package typings.reactToastify

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactToastify.anon.ContainerRef
import typings.reactToastify.anon.EventHandlers
import typings.reactToastify.distComponentsIconsMod.BuiltInIconProps
import typings.reactToastify.distTypesMod.ToastContainerProps
import typings.reactToastify.distTypesMod.ToastProps
import typings.reactToastify.distTypesMod.ToastTransitionProps
import typings.reactToastify.distUtilsConstantMod.Default
import typings.reactToastify.distUtilsCssTransitionMod.CSSTransitionProps
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toastify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bounce(param0: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bounce")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Flip(param0: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Flip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object Icons {
    
    @JSImport("react-toastify", "Icons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify", "Icons.error")
    @js.native
    def error: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def error_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "Icons.info")
    @js.native
    def info: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def info_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "Icons.spinner")
    @js.native
    def spinner: js.Function0[Element] = js.native
    inline def spinner_=(x: js.Function0[Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spinner")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "Icons.success")
    @js.native
    def success: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def success_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "Icons.warning")
    @js.native
    def warning: js.Function1[/* props */ BuiltInIconProps, Element] = js.native
    inline def warning_=(x: js.Function1[/* props */ BuiltInIconProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  inline def Slide(param0: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slide")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-toastify", "ToastContainer")
  @js.native
  val ToastContainer: ForwardRefExoticComponent[ToastContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def Zoom(param0: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Zoom")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToast")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: Default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToast")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cssTransition(param0: CSSTransitionProps): js.Function1[/* param0 */ ToastTransitionProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ ToastTransitionProps, Element]]
  
  inline def useToast(props: ToastProps): EventHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useToast")(props.asInstanceOf[js.Any]).asInstanceOf[EventHandlers]
  
  inline def useToastContainer(props: ToastContainerProps): ContainerRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useToastContainer")(props.asInstanceOf[js.Any]).asInstanceOf[ContainerRef]
}
