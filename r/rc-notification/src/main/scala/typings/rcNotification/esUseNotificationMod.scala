package typings.rcNotification

import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.rcNotification.esNotificationsMod.Placement
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import typings.std.ShadowRoot
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUseNotificationMod {
  
  @JSImport("rc-notification/es/useNotification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[NotificationAPI, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[NotificationAPI, ReactElement]]
  inline def default(rootConfig: NotificationConfig): js.Tuple2[NotificationAPI, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rootConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NotificationAPI, ReactElement]]
  
  trait NotificationAPI extends StObject {
    
    def close(key: Key): Unit
    
    def destroy(): Unit
    
    def open(config: OptionalConfig): Unit
  }
  object NotificationAPI {
    
    inline def apply(close: Key => Unit, destroy: () => Unit, open: OptionalConfig => Unit): NotificationAPI = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction1(open))
      __obj.asInstanceOf[NotificationAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationAPI] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Key => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setOpen(value: OptionalConfig => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    }
  }
  
  trait NotificationConfig extends StObject {
    
    /** @private. Config for notification holder style. Safe to remove if refactor */
    var className: js.UndefOr[js.Function1[/* placement */ Placement, String]] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    /** Customize container. It will repeat call which means you should return same container element. */
    var getContainer: js.UndefOr[js.Function0[HTMLElement | ShadowRoot]] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])] = js.undefined
    
    /** @private Trigger when all the notification closed. */
    var onAllRemoved: js.UndefOr[VoidFunction] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** @private. Config for notification holder style. Safe to remove if refactor */
    var style: js.UndefOr[js.Function1[/* placement */ Placement, CSSProperties]] = js.undefined
  }
  object NotificationConfig {
    
    inline def apply(): NotificationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationConfig] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: /* placement */ Placement => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: () => HTMLElement | ShadowRoot): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setMotion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionFunction1(value: /* placement */ Placement => CSSMotionProps): Self = StObject.set(x, "motion", js.Any.fromFunction1(value))
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOnAllRemoved(value: () => Unit): Self = StObject.set(x, "onAllRemoved", js.Any.fromFunction0(value))
      
      inline def setOnAllRemovedUndefined: Self = StObject.set(x, "onAllRemoved", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: /* placement */ Placement => CSSProperties): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rc-notification.rc-notification/es/Notifications.OpenConfig> */
  trait OptionalConfig extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onClose: js.UndefOr[VoidFunction] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var props: js.UndefOr[HTMLAttributes[HTMLDivElement] & (Record[String, Any])] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object OptionalConfig {
    
    inline def apply(): OptionalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionalConfig] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setProps(value: HTMLAttributes[HTMLDivElement] & (Record[String, Any])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
