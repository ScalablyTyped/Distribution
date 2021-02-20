package typings.rrNotifications

import typings.react.mod.global.JSX.Element
import typings.rrNotifications.mod.NotificationPayload
import typings.rrNotifications.rrNotificationsStrings.left
import typings.rrNotifications.rrNotificationsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnimationDuration extends StObject {
    
    /** Duration of the show and hide animations in milliseconds */
    var animationDuration: js.UndefOr[Double] = js.native
    
    /** Animation timing function / cubic-bezier */
    var animationEasing: js.UndefOr[String] = js.native
    
    /** Time in milliseconds after which the notification is automatically dismissed */
    var dismissAfter: js.UndefOr[Double] = js.native
    
    /** Fixed position where all notifications are displayed */
    var position: js.UndefOr[js.Tuple4[String, String, String, String]] = js.native
    
    /** Render prop which passes down removeNotification function and notification payload */
    def renderNotification(args: Payload): Element = js.native
    
    /**
      * Horizontal direction which notification appears from. If not provided, the notification will
      * appear from top or bottom, depending on position prop
      */
    var slideFromSide: js.UndefOr[right | left] = js.native
  }
  object AnimationDuration {
    
    @scala.inline
    def apply(renderNotification: Payload => Element): AnimationDuration = {
      val __obj = js.Dynamic.literal(renderNotification = js.Any.fromFunction1(renderNotification))
      __obj.asInstanceOf[AnimationDuration]
    }
    
    @scala.inline
    implicit class AnimationDurationMutableBuilder[Self <: AnimationDuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationEasing(value: String): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
      
      @scala.inline
      def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Tuple4[String, String, String, String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRenderNotification(value: Payload => Element): Self = StObject.set(x, "renderNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideFromSide(value: right | left): Self = StObject.set(x, "slideFromSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideFromSideUndefined: Self = StObject.set(x, "slideFromSide", js.undefined)
    }
  }
  
  @js.native
  trait Payload extends StObject {
    
    var payload: NotificationPayload = js.native
    
    def removeNotification(): Unit = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(payload: NotificationPayload, removeNotification: () => Unit): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], removeNotification = js.Any.fromFunction0(removeNotification))
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: NotificationPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveNotification(value: () => Unit): Self = StObject.set(x, "removeNotification", js.Any.fromFunction0(value))
    }
  }
}
