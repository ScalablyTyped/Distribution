package typings.rrNotifications

import typings.react.mod.global.JSX.Element
import typings.rrNotifications.mod.NotificationPayload
import typings.rrNotifications.rrNotificationsStrings.left
import typings.rrNotifications.rrNotificationsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnimationDuration extends StObject {
    
    /** Duration of the show and hide animations in milliseconds */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /** Animation timing function / cubic-bezier */
    var animationEasing: js.UndefOr[String] = js.undefined
    
    /** Time in milliseconds after which the notification is automatically dismissed */
    var dismissAfter: js.UndefOr[Double] = js.undefined
    
    /** Fixed position where all notifications are displayed */
    var position: js.UndefOr[js.Tuple4[String, String, String, String]] = js.undefined
    
    /** Render prop which passes down removeNotification function and notification payload */
    def renderNotification(args: Payload): Element
    
    /**
      * Horizontal direction which notification appears from. If not provided, the notification will
      * appear from top or bottom, depending on position prop
      */
    var slideFromSide: js.UndefOr[right | left] = js.undefined
  }
  object AnimationDuration {
    
    inline def apply(renderNotification: Payload => Element): AnimationDuration = {
      val __obj = js.Dynamic.literal(renderNotification = js.Any.fromFunction1(renderNotification))
      __obj.asInstanceOf[AnimationDuration]
    }
    
    extension [Self <: AnimationDuration](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationEasing(value: String): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
      
      inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
      
      inline def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      inline def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      inline def setPosition(value: js.Tuple4[String, String, String, String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRenderNotification(value: Payload => Element): Self = StObject.set(x, "renderNotification", js.Any.fromFunction1(value))
      
      inline def setSlideFromSide(value: right | left): Self = StObject.set(x, "slideFromSide", value.asInstanceOf[js.Any])
      
      inline def setSlideFromSideUndefined: Self = StObject.set(x, "slideFromSide", js.undefined)
    }
  }
  
  trait Payload extends StObject {
    
    var payload: NotificationPayload
    
    def removeNotification(): Unit
  }
  object Payload {
    
    inline def apply(payload: NotificationPayload, removeNotification: () => Unit): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], removeNotification = js.Any.fromFunction0(removeNotification))
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setPayload(value: NotificationPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setRemoveNotification(value: () => Unit): Self = StObject.set(x, "removeNotification", js.Any.fromFunction0(value))
    }
  }
}
