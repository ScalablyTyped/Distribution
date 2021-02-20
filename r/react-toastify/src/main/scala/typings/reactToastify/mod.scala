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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toastify", "Bounce")
  @js.native
  def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  @JSImport("react-toastify", "Flip")
  @js.native
  def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  @JSImport("react-toastify", "Slide")
  @js.native
  def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  @JSImport("react-toastify", "ToastContainer")
  @js.native
  val ToastContainer: FC[ToastContainerProps] = js.native
  
  @JSImport("react-toastify", "Zoom")
  @js.native
  def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): Element = js.native
  
  @JSImport("react-toastify", "collapseToast")
  @js.native
  def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = js.native
  @JSImport("react-toastify", "collapseToast")
  @js.native
  def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: DEFAULT): Unit = js.native
  
  @JSImport("react-toastify", "cssTransition")
  @js.native
  def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ] = js.native
  
  object toast {
    
    @JSImport("react-toastify", "toast")
    @js.native
    def apply(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast")
    @js.native
    def apply(content: ToastContent, options: ToastOptions): ReactText = js.native
    @JSImport("react-toastify", "toast")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify", "toast.POSITION")
    @js.native
    def POSITION: BOTTOMCENTER = js.native
    @scala.inline
    def POSITION_=(x: BOTTOMCENTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.TYPE")
    @js.native
    def TYPE: DARK = js.native
    @scala.inline
    def TYPE_=(x: DARK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * Clear waiting queue when limit is used
      */
    @JSImport("react-toastify", "toast.clearWaitingQueue")
    @js.native
    def clearWaitingQueue(): `false` | Unit = js.native
    @JSImport("react-toastify", "toast.clearWaitingQueue")
    @js.native
    def clearWaitingQueue(params: ClearWaitingQueueParams): `false` | Unit = js.native
    
    /**
      * Configure the ToastContainer when lazy mounted
      */
    @JSImport("react-toastify", "toast.configure")
    @js.native
    def configure(): Unit = js.native
    @JSImport("react-toastify", "toast.configure")
    @js.native
    def configure(config: ToastContainerProps): Unit = js.native
    
    @JSImport("react-toastify", "toast.dark")
    @js.native
    def dark(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.dark")
    @js.native
    def dark(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    /**
      * Remove toast programmaticaly
      */
    @JSImport("react-toastify", "toast.dismiss")
    @js.native
    def dismiss(): `false` | Unit = js.native
    @JSImport("react-toastify", "toast.dismiss")
    @js.native
    def dismiss(id: String): `false` | Unit = js.native
    @JSImport("react-toastify", "toast.dismiss")
    @js.native
    def dismiss(id: Double): `false` | Unit = js.native
    
    /**
      * Used for controlled progress bar.
      */
    @JSImport("react-toastify", "toast.done")
    @js.native
    def done(id: Id): Unit = js.native
    
    @JSImport("react-toastify", "toast.error")
    @js.native
    def error(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.error")
    @js.native
    def error(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify", "toast.info")
    @js.native
    def info(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.info")
    @js.native
    def info(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    /**
      * return true if one container is displaying the toast
      */
    @JSImport("react-toastify", "toast.isActive")
    @js.native
    def isActive(id: Id): Boolean = js.native
    
    /**
      * Track changes. The callback get the number of toast displayed
      *
      */
    @JSImport("react-toastify", "toast.onChange")
    @js.native
    def onChange(callback: OnChangeCallback): js.Function0[Unit] = js.native
    
    @JSImport("react-toastify", "toast.success")
    @js.native
    def success(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.success")
    @js.native
    def success(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify", "toast.update")
    @js.native
    def update(toastId: Id): Unit = js.native
    @JSImport("react-toastify", "toast.update")
    @js.native
    def update(toastId: Id, options: UpdateOptions): Unit = js.native
    
    /**
      * Maybe I should remove warning in favor of warn, I don't know
      */
    @JSImport("react-toastify", "toast.warn")
    @js.native
    def warn(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.warn")
    @js.native
    def warn(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify", "toast.warning")
    @js.native
    def warning(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.warning")
    @js.native
    def warning(content: ToastContent, options: ToastOptions): ReactText = js.native
  }
  
  @JSImport("react-toastify", "useToast")
  @js.native
  def useToast(props: ToastProps): EventHandlers = js.native
  
  @JSImport("react-toastify", "useToastContainer")
  @js.native
  def useToastContainer(props: ToastContainerProps): Collection = js.native
}
