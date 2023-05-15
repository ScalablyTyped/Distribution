package typings.reactToastify

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.JSX.Element
import typings.react.mod.RefAttributes
import typings.reactToastify.anon.ContainerRef
import typings.reactToastify.anon.EventHandlers
import typings.reactToastify.distComponentsIconsMod.BuiltInIconProps
import typings.reactToastify.distCoreEventManagerMod.OnChangeCallback
import typings.reactToastify.distCoreToastMod.ToastPromiseParams
import typings.reactToastify.distTypesMod.ClearWaitingQueueParams
import typings.reactToastify.distTypesMod.Id
import typings.reactToastify.distTypesMod.ToastContainerProps
import typings.reactToastify.distTypesMod.ToastContent
import typings.reactToastify.distTypesMod.ToastOptions
import typings.reactToastify.distTypesMod.ToastPosition
import typings.reactToastify.distTypesMod.ToastProps
import typings.reactToastify.distTypesMod.ToastTransitionProps
import typings.reactToastify.distTypesMod.TypeOptions
import typings.reactToastify.distTypesMod.UpdateOptions
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
  
  object toast {
    
    inline def apply[TData](content: ToastContent[TData]): Id = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[Id]
    inline def apply[TData](content: ToastContent[TData], options: ToastOptions[js.Object]): Id = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Id]
    
    @JSImport("react-toastify", "toast")
    @js.native
    val ^ : js.Any = js.native
    
    object POSITION {
      
      @JSImport("react-toastify", "toast.POSITION")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-toastify", "toast.POSITION.BOTTOM_CENTER")
      @js.native
      def BOTTOM_CENTER: ToastPosition = js.native
      inline def BOTTOM_CENTER_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_CENTER")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.POSITION.BOTTOM_LEFT")
      @js.native
      def BOTTOM_LEFT: ToastPosition = js.native
      inline def BOTTOM_LEFT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.POSITION.BOTTOM_RIGHT")
      @js.native
      def BOTTOM_RIGHT: ToastPosition = js.native
      inline def BOTTOM_RIGHT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.POSITION.TOP_CENTER")
      @js.native
      def TOP_CENTER: ToastPosition = js.native
      inline def TOP_CENTER_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_CENTER")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.POSITION.TOP_LEFT")
      @js.native
      def TOP_LEFT: ToastPosition = js.native
      inline def TOP_LEFT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.POSITION.TOP_RIGHT")
      @js.native
      def TOP_RIGHT: ToastPosition = js.native
      inline def TOP_RIGHT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(x.asInstanceOf[js.Any])
    }
    
    object TYPE {
      
      @JSImport("react-toastify", "toast.TYPE")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-toastify", "toast.TYPE.DEFAULT")
      @js.native
      def DEFAULT: TypeOptions = js.native
      inline def DEFAULT_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.TYPE.ERROR")
      @js.native
      def ERROR: TypeOptions = js.native
      inline def ERROR_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.TYPE.INFO")
      @js.native
      def INFO: TypeOptions = js.native
      inline def INFO_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.TYPE.SUCCESS")
      @js.native
      def SUCCESS: TypeOptions = js.native
      inline def SUCCESS_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify", "toast.TYPE.WARNING")
      @js.native
      def WARNING: TypeOptions = js.native
      inline def WARNING_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("react-toastify", "toast.clearWaitingQueue")
    @js.native
    def clearWaitingQueue: js.Function1[/* params */ js.UndefOr[ClearWaitingQueueParams], Unit] = js.native
    inline def clearWaitingQueue_=(x: js.Function1[/* params */ js.UndefOr[ClearWaitingQueueParams], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearWaitingQueue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.dark")
    @js.native
    def dark: js.Function2[
        /* content */ ToastContent[Any], 
        /* options */ js.UndefOr[ToastOptions[js.Object]], 
        Id
      ] = js.native
    inline def dark_=(
      x: js.Function2[
          /* content */ ToastContent[Any], 
          /* options */ js.UndefOr[ToastOptions[js.Object]], 
          Id
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.dismiss")
    @js.native
    def dismiss: js.Function1[/* id */ js.UndefOr[Id], Unit] = js.native
    inline def dismiss_=(x: js.Function1[/* id */ js.UndefOr[Id], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.done")
    @js.native
    def done: js.Function1[/* id */ Id, Unit] = js.native
    inline def done_=(x: js.Function1[/* id */ Id, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("done")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.error")
    @js.native
    def error: js.Function2[
        /* content */ ToastContent[Any], 
        /* options */ js.UndefOr[ToastOptions[js.Object]], 
        Id
      ] = js.native
    inline def error_=(
      x: js.Function2[
          /* content */ ToastContent[Any], 
          /* options */ js.UndefOr[ToastOptions[js.Object]], 
          Id
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.info")
    @js.native
    def info: js.Function2[
        /* content */ ToastContent[Any], 
        /* options */ js.UndefOr[ToastOptions[js.Object]], 
        Id
      ] = js.native
    inline def info_=(
      x: js.Function2[
          /* content */ ToastContent[Any], 
          /* options */ js.UndefOr[ToastOptions[js.Object]], 
          Id
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.isActive")
    @js.native
    def isActive: js.Function1[/* id */ Id, Boolean] = js.native
    inline def isActive_=(x: js.Function1[/* id */ Id, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isActive")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.loading")
    @js.native
    def loading: js.Function2[
        /* content */ ToastContent[Any], 
        /* options */ js.UndefOr[ToastOptions[js.Object]], 
        Id
      ] = js.native
    inline def loading_=(
      x: js.Function2[
          /* content */ ToastContent[Any], 
          /* options */ js.UndefOr[ToastOptions[js.Object]], 
          Id
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.onChange")
    @js.native
    def onChange: js.Function1[/* callback */ OnChangeCallback, js.Function0[Unit]] = js.native
    inline def onChange_=(x: js.Function1[/* callback */ OnChangeCallback, js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    
    inline def promise[TData, TError, TPending](promise: js.Function0[js.Promise[TData]], param1: ToastPromiseParams[TData, TError, TPending]): js.Promise[TData] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(promise.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TData]]
    inline def promise[TData, TError, TPending](
      promise: js.Function0[js.Promise[TData]],
      param1: ToastPromiseParams[TData, TError, TPending],
      options: ToastOptions[js.Object]
    ): js.Promise[TData] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(promise.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TData]]
    /* was `typeof handlePromise` */
    inline def promise[TData, TError, TPending](promise: js.Promise[TData], param1: ToastPromiseParams[TData, TError, TPending]): js.Promise[TData] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(promise.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TData]]
    inline def promise[TData, TError, TPending](
      promise: js.Promise[TData],
      param1: ToastPromiseParams[TData, TError, TPending],
      options: ToastOptions[js.Object]
    ): js.Promise[TData] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(promise.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TData]]
    
    @JSImport("react-toastify", "toast.success")
    @js.native
    def success: js.Function2[
        /* content */ ToastContent[Any], 
        /* options */ js.UndefOr[ToastOptions[js.Object]], 
        Id
      ] = js.native
    inline def success_=(
      x: js.Function2[
          /* content */ ToastContent[Any], 
          /* options */ js.UndefOr[ToastOptions[js.Object]], 
          Id
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.update")
    @js.native
    def update: js.Function2[/* toastId */ Id, /* options */ js.UndefOr[UpdateOptions[Any]], Unit] = js.native
    inline def update_=(x: js.Function2[/* toastId */ Id, /* options */ js.UndefOr[UpdateOptions[Any]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.warn")
    @js.native
    def warn: js.Function2[
        /* content */ ToastContent[Any], 
        /* options */ js.UndefOr[ToastOptions[js.Object]], 
        Id
      ] = js.native
    inline def warn_=(
      x: js.Function2[
          /* content */ ToastContent[Any], 
          /* options */ js.UndefOr[ToastOptions[js.Object]], 
          Id
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.warning")
    @js.native
    def warning: js.Function2[
        /* content */ ToastContent[Any], 
        /* options */ js.UndefOr[ToastOptions[js.Object]], 
        Id
      ] = js.native
    inline def warning_=(
      x: js.Function2[
          /* content */ ToastContent[Any], 
          /* options */ js.UndefOr[ToastOptions[js.Object]], 
          Id
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  inline def useToast(props: ToastProps): EventHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useToast")(props.asInstanceOf[js.Any]).asInstanceOf[EventHandlers]
  
  inline def useToastContainer(props: ToastContainerProps): ContainerRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useToastContainer")(props.asInstanceOf[js.Any]).asInstanceOf[ContainerRef]
}
