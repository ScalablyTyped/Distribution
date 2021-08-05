package typings.reactToastify

import typings.react.mod.FC
import typings.react.mod.ReactText
import typings.react.mod.global.JSX.Element
import typings.reactToastify.anon.BOTTOMCENTER
import typings.reactToastify.anon.Collection
import typings.reactToastify.anon.DARK
import typings.reactToastify.anon.EventHandlers
import typings.reactToastify.constantMod.DEFAULT
import typings.reactToastify.cssTransitionMod.CSSTransitionProps
import typings.reactToastify.eventManagerMod.OnChangeCallback
import typings.reactToastify.reactToastifyBooleans.`false`
import typings.reactToastify.typesMod.ClearWaitingQueueParams
import typings.reactToastify.typesMod.Id
import typings.reactToastify.typesMod.ToastContainerProps
import typings.reactToastify.typesMod.ToastContent
import typings.reactToastify.typesMod.ToastOptions
import typings.reactToastify.typesMod.ToastProps
import typings.reactToastify.typesMod.ToastTransitionProps
import typings.reactToastify.typesMod.UpdateOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toastify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bounce")(hasChildrenPositionPreventExitTransitionDoneProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Flip")(hasChildrenPositionPreventExitTransitionDoneProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slide")(hasChildrenPositionPreventExitTransitionDoneProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-toastify", "ToastContainer")
  @js.native
  val ToastContainer: FC[ToastContainerProps] = js.native
  
  inline def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Zoom")(hasChildrenPositionPreventExitTransitionDoneProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToast")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: DEFAULT): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToast")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(hasEnterExitDurationAppendPositionCollapseCollapseDuration.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ]]
  
  object toast {
    
    inline def apply(content: ToastContent): ReactText = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[ReactText]
    inline def apply(content: ToastContent, options: ToastOptions): ReactText = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactText]
    
    @JSImport("react-toastify", "toast")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify", "toast.POSITION")
    @js.native
    def POSITION: BOTTOMCENTER = js.native
    inline def POSITION_=(x: BOTTOMCENTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.TYPE")
    @js.native
    def TYPE: DARK = js.native
    inline def TYPE_=(x: DARK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * Clear waiting queue when limit is used
      */
    inline def clearWaitingQueue(): `false` | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearWaitingQueue")().asInstanceOf[`false` | Unit]
    inline def clearWaitingQueue(params: ClearWaitingQueueParams): `false` | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearWaitingQueue")(params.asInstanceOf[js.Any]).asInstanceOf[`false` | Unit]
    
    /**
      * Configure the ToastContainer when lazy mounted
      */
    inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
    inline def configure(config: ToastContainerProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def dark(content: ToastContent): ReactText = ^.asInstanceOf[js.Dynamic].applyDynamic("dark")(content.asInstanceOf[js.Any]).asInstanceOf[ReactText]
    inline def dark(content: ToastContent, options: ToastOptions): ReactText = (^.asInstanceOf[js.Dynamic].applyDynamic("dark")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactText]
    
    /**
      * Remove toast programmaticaly
      */
    inline def dismiss(): `false` | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[`false` | Unit]
    inline def dismiss(id: String): `false` | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(id.asInstanceOf[js.Any]).asInstanceOf[`false` | Unit]
    inline def dismiss(id: Double): `false` | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(id.asInstanceOf[js.Any]).asInstanceOf[`false` | Unit]
    
    /**
      * Used for controlled progress bar.
      */
    inline def done(id: Id): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("done")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(content: ToastContent): ReactText = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(content.asInstanceOf[js.Any]).asInstanceOf[ReactText]
    inline def error(content: ToastContent, options: ToastOptions): ReactText = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactText]
    
    inline def info(content: ToastContent): ReactText = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any]).asInstanceOf[ReactText]
    inline def info(content: ToastContent, options: ToastOptions): ReactText = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactText]
    
    /**
      * return true if one container is displaying the toast
      */
    inline def isActive(id: Id): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Track changes. The callback get the number of toast displayed
      *
      */
    inline def onChange(callback: OnChangeCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def success(content: ToastContent): ReactText = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any]).asInstanceOf[ReactText]
    inline def success(content: ToastContent, options: ToastOptions): ReactText = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactText]
    
    inline def update(toastId: Id): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(toastId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def update(toastId: Id, options: UpdateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(toastId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Maybe I should remove warning in favor of warn, I don't know
      */
    inline def warn(content: ToastContent): ReactText = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(content.asInstanceOf[js.Any]).asInstanceOf[ReactText]
    inline def warn(content: ToastContent, options: ToastOptions): ReactText = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactText]
    
    inline def warning(content: ToastContent): ReactText = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(content.asInstanceOf[js.Any]).asInstanceOf[ReactText]
    inline def warning(content: ToastContent, options: ToastOptions): ReactText = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactText]
  }
  
  inline def useToast(props: ToastProps): EventHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useToast")(props.asInstanceOf[js.Any]).asInstanceOf[EventHandlers]
  
  inline def useToastContainer(props: ToastContainerProps): Collection = ^.asInstanceOf[js.Dynamic].applyDynamic("useToastContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Collection]
}
