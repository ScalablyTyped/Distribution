package typings.rcNotification

import org.scalablytyped.runtime.Shortcut
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.rcNotification.esNoticeMod.NoticeConfig
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Key
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import typings.std.ShadowRoot
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationsMod extends Shortcut {
  
  @JSImport("rc-notification/es/Notifications", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[NotificationsProps & RefAttributes[NotificationsRef]] = js.native
  
  trait NotificationsProps extends StObject {
    
    var className: js.UndefOr[js.Function1[/* placement */ Placement, String]] = js.undefined
    
    var container: js.UndefOr[HTMLElement | ShadowRoot] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])] = js.undefined
    
    var onAllRemoved: js.UndefOr[VoidFunction] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Function1[/* placement */ Placement, CSSProperties]] = js.undefined
  }
  object NotificationsProps {
    
    inline def apply(): NotificationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationsProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: /* placement */ Placement => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainer(value: HTMLElement | ShadowRoot): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
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
  
  trait NotificationsRef extends StObject {
    
    def close(key: Key): Unit
    
    def destroy(): Unit
    
    def open(config: OpenConfig): Unit
  }
  object NotificationsRef {
    
    inline def apply(close: Key => Unit, destroy: () => Unit, open: OpenConfig => Unit): NotificationsRef = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction1(open))
      __obj.asInstanceOf[NotificationsRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationsRef] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Key => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setOpen(value: OpenConfig => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenConfig
    extends StObject
       with NoticeConfig {
    
    var key: Key
    
    var placement: js.UndefOr[Placement] = js.undefined
  }
  object OpenConfig {
    
    inline def apply(key: Key): OpenConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenConfig] (val x: Self) extends AnyVal {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcNotification.rcNotificationStrings.top
    - typings.rcNotification.rcNotificationStrings.topLeft
    - typings.rcNotification.rcNotificationStrings.topRight
    - typings.rcNotification.rcNotificationStrings.bottom
    - typings.rcNotification.rcNotificationStrings.bottomLeft
    - typings.rcNotification.rcNotificationStrings.bottomRight
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typings.rcNotification.rcNotificationStrings.bottom = "bottom".asInstanceOf[typings.rcNotification.rcNotificationStrings.bottom]
    
    inline def bottomLeft: typings.rcNotification.rcNotificationStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.rcNotification.rcNotificationStrings.bottomLeft]
    
    inline def bottomRight: typings.rcNotification.rcNotificationStrings.bottomRight = "bottomRight".asInstanceOf[typings.rcNotification.rcNotificationStrings.bottomRight]
    
    inline def top: typings.rcNotification.rcNotificationStrings.top = "top".asInstanceOf[typings.rcNotification.rcNotificationStrings.top]
    
    inline def topLeft: typings.rcNotification.rcNotificationStrings.topLeft = "topLeft".asInstanceOf[typings.rcNotification.rcNotificationStrings.topLeft]
    
    inline def topRight: typings.rcNotification.rcNotificationStrings.topRight = "topRight".asInstanceOf[typings.rcNotification.rcNotificationStrings.topRight]
  }
  
  type _To = ForwardRefExoticComponent[NotificationsProps & RefAttributes[NotificationsRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esNotificationsMod.foo` */
  override def _to: ForwardRefExoticComponent[NotificationsProps & RefAttributes[NotificationsRef]] = default
}
