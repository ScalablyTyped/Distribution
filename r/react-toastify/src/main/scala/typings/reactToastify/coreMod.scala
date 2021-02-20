package typings.reactToastify

import typings.react.mod.ReactText
import typings.reactToastify.anon.BOTTOMCENTER
import typings.reactToastify.anon.DARK
import typings.reactToastify.eventManagerMod.EventManager_
import typings.reactToastify.eventManagerMod.OnChangeCallback
import typings.reactToastify.reactToastifyBooleans.`false`
import typings.reactToastify.typesMod.ClearWaitingQueueParams
import typings.reactToastify.typesMod.Id
import typings.reactToastify.typesMod.ToastContainerProps
import typings.reactToastify.typesMod.ToastContent
import typings.reactToastify.typesMod.ToastOptions
import typings.reactToastify.typesMod.UpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("react-toastify/dist/core", "eventManager")
  @js.native
  val eventManager: EventManager_ = js.native
  
  object toast {
    
    @JSImport("react-toastify/dist/core", "toast")
    @js.native
    def apply(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify/dist/core", "toast")
    @js.native
    def apply(content: ToastContent, options: ToastOptions): ReactText = js.native
    @JSImport("react-toastify/dist/core", "toast")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify/dist/core", "toast.POSITION")
    @js.native
    def POSITION: BOTTOMCENTER = js.native
    @scala.inline
    def POSITION_=(x: BOTTOMCENTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/core", "toast.TYPE")
    @js.native
    def TYPE: DARK = js.native
    @scala.inline
    def TYPE_=(x: DARK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * Clear waiting queue when limit is used
      */
    @JSImport("react-toastify/dist/core", "toast.clearWaitingQueue")
    @js.native
    def clearWaitingQueue(): `false` | Unit = js.native
    @JSImport("react-toastify/dist/core", "toast.clearWaitingQueue")
    @js.native
    def clearWaitingQueue(params: ClearWaitingQueueParams): `false` | Unit = js.native
    
    /**
      * Configure the ToastContainer when lazy mounted
      */
    @JSImport("react-toastify/dist/core", "toast.configure")
    @js.native
    def configure(): Unit = js.native
    @JSImport("react-toastify/dist/core", "toast.configure")
    @js.native
    def configure(config: ToastContainerProps): Unit = js.native
    
    @JSImport("react-toastify/dist/core", "toast.dark")
    @js.native
    def dark(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify/dist/core", "toast.dark")
    @js.native
    def dark(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    /**
      * Remove toast programmaticaly
      */
    @JSImport("react-toastify/dist/core", "toast.dismiss")
    @js.native
    def dismiss(): `false` | Unit = js.native
    @JSImport("react-toastify/dist/core", "toast.dismiss")
    @js.native
    def dismiss(id: String): `false` | Unit = js.native
    @JSImport("react-toastify/dist/core", "toast.dismiss")
    @js.native
    def dismiss(id: Double): `false` | Unit = js.native
    
    /**
      * Used for controlled progress bar.
      */
    @JSImport("react-toastify/dist/core", "toast.done")
    @js.native
    def done(id: Id): Unit = js.native
    
    @JSImport("react-toastify/dist/core", "toast.error")
    @js.native
    def error(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify/dist/core", "toast.error")
    @js.native
    def error(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify/dist/core", "toast.info")
    @js.native
    def info(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify/dist/core", "toast.info")
    @js.native
    def info(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    /**
      * return true if one container is displaying the toast
      */
    @JSImport("react-toastify/dist/core", "toast.isActive")
    @js.native
    def isActive(id: Id): Boolean = js.native
    
    /**
      * Track changes. The callback get the number of toast displayed
      *
      */
    @JSImport("react-toastify/dist/core", "toast.onChange")
    @js.native
    def onChange(callback: OnChangeCallback): js.Function0[Unit] = js.native
    
    @JSImport("react-toastify/dist/core", "toast.success")
    @js.native
    def success(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify/dist/core", "toast.success")
    @js.native
    def success(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify/dist/core", "toast.update")
    @js.native
    def update(toastId: Id): Unit = js.native
    @JSImport("react-toastify/dist/core", "toast.update")
    @js.native
    def update(toastId: Id, options: UpdateOptions): Unit = js.native
    
    /**
      * Maybe I should remove warning in favor of warn, I don't know
      */
    @JSImport("react-toastify/dist/core", "toast.warn")
    @js.native
    def warn(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify/dist/core", "toast.warn")
    @js.native
    def warn(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify/dist/core", "toast.warning")
    @js.native
    def warning(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify/dist/core", "toast.warning")
    @js.native
    def warning(content: ToastContent, options: ToastOptions): ReactText = js.native
  }
}
