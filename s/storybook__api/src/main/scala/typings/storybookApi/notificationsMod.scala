package typings.storybookApi

import typings.storybookApi.anon.Color
import typings.storybookApi.anon.Headline
import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  @JSImport("@storybook/api/dist/modules/notifications", "init")
  @js.native
  val init: ModuleFn = js.native
  
  @js.native
  trait Notification extends StObject {
    
    var content: Headline = js.native
    
    var icon: js.UndefOr[Color] = js.native
    
    var id: String = js.native
    
    var link: String = js.native
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object Notification {
    
    @scala.inline
    def apply(content: Headline, id: String, link: String): Notification = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notification]
    }
    
    @scala.inline
    implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: Headline): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: Color): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    }
  }
  
  @js.native
  trait SubAPI extends StObject {
    
    def addNotification(notification: Notification): Unit = js.native
    
    def clearNotification(id: String): Unit = js.native
  }
  object SubAPI {
    
    @scala.inline
    def apply(addNotification: Notification => Unit, clearNotification: String => Unit): SubAPI = {
      val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), clearNotification = js.Any.fromFunction1(clearNotification))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit class SubAPIMutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddNotification(value: Notification => Unit): Self = StObject.set(x, "addNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearNotification(value: String => Unit): Self = StObject.set(x, "clearNotification", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SubState extends StObject {
    
    var notifications: js.Array[Notification] = js.native
  }
  object SubState {
    
    @scala.inline
    def apply(notifications: js.Array[Notification]): SubState = {
      val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit class SubStateMutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    }
  }
}
