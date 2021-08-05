package typings.reactToastNotifications

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactToastNotifications.anon.Appearance
import typings.reactToastNotifications.anon.Toast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toast-notifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-toast-notifications", "DefaultToast")
  @js.native
  val DefaultToast: ComponentType[ToastProps] = js.native
  
  @JSImport("react-toast-notifications", "DefaultToastContainer")
  @js.native
  val DefaultToastContainer: ComponentType[ToastContainerProps] = js.native
  
  @JSImport("react-toast-notifications", "ToastConsumer")
  @js.native
  val ToastConsumer: ComponentType[ToastConsumerProps] = js.native
  
  @JSImport("react-toast-notifications", "ToastProvider")
  @js.native
  val ToastProvider: ComponentType[ToastProviderProps] = js.native
  
  inline def useToasts(): typings.reactToastNotifications.anon.AddToast = ^.asInstanceOf[js.Dynamic].applyDynamic("useToasts")().asInstanceOf[typings.reactToastNotifications.anon.AddToast]
  
  inline def withToastManager(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withToastManager")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  type AddToast = js.Function3[
    /* content */ ReactNode, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactToastNotifications.reactToastNotificationsStrings.error
    - typings.reactToastNotifications.reactToastNotificationsStrings.info
    - typings.reactToastNotifications.reactToastNotificationsStrings.success
    - typings.reactToastNotifications.reactToastNotificationsStrings.warning
  */
  trait AppearanceTypes extends StObject
  object AppearanceTypes {
    
    inline def error: typings.reactToastNotifications.reactToastNotificationsStrings.error = "error".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.error]
    
    inline def info: typings.reactToastNotifications.reactToastNotificationsStrings.info = "info".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.info]
    
    inline def success: typings.reactToastNotifications.reactToastNotificationsStrings.success = "success".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.success]
    
    inline def warning: typings.reactToastNotifications.reactToastNotificationsStrings.warning = "warning".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.warning]
  }
  
  trait Options extends StObject {
    
    var appearance: AppearanceTypes
    
    var autoDismiss: js.UndefOr[Boolean] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(appearance: AppearanceTypes): Options = {
      val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppearance(value: AppearanceTypes): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAutoDismiss(value: Boolean): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      inline def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      inline def setOnDismiss(value: /* id */ String => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-left`
    - typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-center`
    - typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-right`
    - typings.reactToastNotifications.reactToastNotificationsStrings.`top-left`
    - typings.reactToastNotifications.reactToastNotificationsStrings.`top-center`
    - typings.reactToastNotifications.reactToastNotificationsStrings.`top-right`
  */
  trait Placement extends StObject
  object Placement {
    
    inline def `bottom-center`: typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-center`]
    
    inline def `bottom-left`: typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.`bottom-right`]
    
    inline def `top-center`: typings.reactToastNotifications.reactToastNotificationsStrings.`top-center` = "top-center".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.`top-center`]
    
    inline def `top-left`: typings.reactToastNotifications.reactToastNotificationsStrings.`top-left` = "top-left".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.`top-left`]
    
    inline def `top-right`: typings.reactToastNotifications.reactToastNotificationsStrings.`top-right` = "top-right".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.`top-right`]
  }
  
  type RemoveAllToasts = js.Function0[Unit]
  
  type RemoveToast = js.Function2[/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  
  trait ToastConsumerContext extends StObject {
    
    var add: AddToast
    
    var remove: RemoveToast
    
    var toasts: js.Array[Appearance]
  }
  object ToastConsumerContext {
    
    inline def apply(
      add: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
      remove: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
      toasts: js.Array[Appearance]
    ): ToastConsumerContext = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), remove = js.Any.fromFunction2(remove), toasts = toasts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastConsumerContext]
    }
    
    extension [Self <: ToastConsumerContext](x: Self) {
      
      inline def setAdd(
        value: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
      ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
      
      inline def setRemove(value: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setToasts(value: js.Array[Appearance]): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
      
      inline def setToastsVarargs(value: Appearance*): Self = StObject.set(x, "toasts", js.Array(value :_*))
    }
  }
  
  trait ToastConsumerProps extends StObject {
    
    def children(context: ToastConsumerContext): ReactNode
  }
  object ToastConsumerProps {
    
    inline def apply(children: ToastConsumerContext => ReactNode): ToastConsumerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ToastConsumerProps]
    }
    
    extension [Self <: ToastConsumerProps](x: Self) {
      
      inline def setChildren(value: ToastConsumerContext => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait ToastContainerProps extends StObject {
    
    var children: ReactNode
    
    var hasToasts: Boolean
    
    var placement: Placement
  }
  object ToastContainerProps {
    
    inline def apply(hasToasts: Boolean, placement: Placement): ToastContainerProps = {
      val __obj = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastContainerProps]
    }
    
    extension [Self <: ToastContainerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHasToasts(value: Boolean): Self = StObject.set(x, "hasToasts", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToastProps extends StObject {
    
    var appearance: AppearanceTypes = js.native
    
    var autoDismiss: Boolean | Double = js.native
    
    // inherited from ToastProvider
    var autoDismissTimeout: Double = js.native
    
    // inherited from ToastProvider
    var children: ReactNode = js.native
    
    var isRunning: Boolean = js.native
    
    def onDismiss(): Unit = js.native
    def onDismiss(id: String): Unit = js.native
    
    def onMouseEnter(): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
    
    var placement: Placement = js.native
    
    var transitionDuration: Double = js.native
    
    // inherited from ToastProvider
    var transitionState: TransitionState = js.native
  }
  
  trait ToastProviderProps extends StObject {
    
    var autoDismiss: js.UndefOr[Boolean | Double] = js.undefined
    
    var autoDismissTimeout: js.UndefOr[Double] = js.undefined
    
    var children: ReactNode
    
    var components: js.UndefOr[Toast] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object ToastProviderProps {
    
    inline def apply(): ToastProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProviderProps]
    }
    
    extension [Self <: ToastProviderProps](x: Self) {
      
      inline def setAutoDismiss(value: Boolean | Double): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      inline def setAutoDismissTimeout(value: Double): Self = StObject.set(x, "autoDismissTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoDismissTimeoutUndefined: Self = StObject.set(x, "autoDismissTimeout", js.undefined)
      
      inline def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponents(value: Toast): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactToastNotifications.reactToastNotificationsStrings.entering
    - typings.reactToastNotifications.reactToastNotificationsStrings.entered
    - typings.reactToastNotifications.reactToastNotificationsStrings.exiting
    - typings.reactToastNotifications.reactToastNotificationsStrings.exited
  */
  trait TransitionState extends StObject
  object TransitionState {
    
    inline def entered: typings.reactToastNotifications.reactToastNotificationsStrings.entered = "entered".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.entered]
    
    inline def entering: typings.reactToastNotifications.reactToastNotificationsStrings.entering = "entering".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.entering]
    
    inline def exited: typings.reactToastNotifications.reactToastNotificationsStrings.exited = "exited".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.exited]
    
    inline def exiting: typings.reactToastNotifications.reactToastNotificationsStrings.exiting = "exiting".asInstanceOf[typings.reactToastNotifications.reactToastNotificationsStrings.exiting]
  }
  
  trait UpdateOptions
    extends StObject
       with Options {
    
    var content: js.UndefOr[String] = js.undefined
  }
  object UpdateOptions {
    
    inline def apply(appearance: AppearanceTypes): UpdateOptions = {
      val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateOptions]
    }
    
    extension [Self <: UpdateOptions](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type UpdateToast = js.Function3[
    /* id */ String, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
}
