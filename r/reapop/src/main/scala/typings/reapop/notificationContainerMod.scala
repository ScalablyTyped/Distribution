package typings.reapop

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reapop.notificationsSystemMod.DismissNotification
import typings.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationContainerMod {
  
  @JSImport("reapop/dist/components/NotificationContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dismissNotification: DismissNotification
    
    var notification: Notification
  }
  object Props {
    
    @scala.inline
    def apply(dismissNotification: /* id */ String => Unit, notification: Notification): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
