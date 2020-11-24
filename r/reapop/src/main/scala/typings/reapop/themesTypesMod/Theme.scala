package typings.reapop.themesTypesMod

import typings.react.mod.CSSProperties
import typings.reapop.typesMod.Notification
import typings.reapop.typesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends js.Object {
  
  def container(position: Position, singleContainer: Boolean): CSSProperties = js.native
  
  def notification(notification: Notification): CSSProperties = js.native
  
  def notificationButton(notification: Notification, position: Double, state: NotificationButtonState): CSSProperties = js.native
  
  def notificationButtonText(notification: Notification, position: Double, state: NotificationButtonState): CSSProperties = js.native
  
  def notificationButtons(notification: Notification): CSSProperties = js.native
  
  def notificationDismissIcon(notification: Notification): CSSProperties = js.native
  
  def notificationIcon(notification: Notification): CSSProperties = js.native
  
  def notificationImage(notification: Notification): CSSProperties = js.native
  
  def notificationImageContainer(notification: Notification): CSSProperties = js.native
  
  def notificationMessage(notification: Notification): CSSProperties = js.native
  
  def notificationMeta(notification: Notification): CSSProperties = js.native
  
  def notificationTitle(notification: Notification): CSSProperties = js.native
}
object Theme {
  
  @scala.inline
  def apply(
    container: (Position, Boolean) => CSSProperties,
    notification: Notification => CSSProperties,
    notificationButton: (Notification, Double, NotificationButtonState) => CSSProperties,
    notificationButtonText: (Notification, Double, NotificationButtonState) => CSSProperties,
    notificationButtons: Notification => CSSProperties,
    notificationDismissIcon: Notification => CSSProperties,
    notificationIcon: Notification => CSSProperties,
    notificationImage: Notification => CSSProperties,
    notificationImageContainer: Notification => CSSProperties,
    notificationMessage: Notification => CSSProperties,
    notificationMeta: Notification => CSSProperties,
    notificationTitle: Notification => CSSProperties
  ): Theme = {
    val __obj = js.Dynamic.literal(container = js.Any.fromFunction2(container), notification = js.Any.fromFunction1(notification), notificationButton = js.Any.fromFunction3(notificationButton), notificationButtonText = js.Any.fromFunction3(notificationButtonText), notificationButtons = js.Any.fromFunction1(notificationButtons), notificationDismissIcon = js.Any.fromFunction1(notificationDismissIcon), notificationIcon = js.Any.fromFunction1(notificationIcon), notificationImage = js.Any.fromFunction1(notificationImage), notificationImageContainer = js.Any.fromFunction1(notificationImageContainer), notificationMessage = js.Any.fromFunction1(notificationMessage), notificationMeta = js.Any.fromFunction1(notificationMeta), notificationTitle = js.Any.fromFunction1(notificationTitle))
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainer(value: (Position, Boolean) => CSSProperties): Self = this.set("container", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNotification(value: Notification => CSSProperties): Self = this.set("notification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationButton(value: (Notification, Double, NotificationButtonState) => CSSProperties): Self = this.set("notificationButton", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNotificationButtonText(value: (Notification, Double, NotificationButtonState) => CSSProperties): Self = this.set("notificationButtonText", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNotificationButtons(value: Notification => CSSProperties): Self = this.set("notificationButtons", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationDismissIcon(value: Notification => CSSProperties): Self = this.set("notificationDismissIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationIcon(value: Notification => CSSProperties): Self = this.set("notificationIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationImage(value: Notification => CSSProperties): Self = this.set("notificationImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationImageContainer(value: Notification => CSSProperties): Self = this.set("notificationImageContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationMessage(value: Notification => CSSProperties): Self = this.set("notificationMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationMeta(value: Notification => CSSProperties): Self = this.set("notificationMeta", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationTitle(value: Notification => CSSProperties): Self = this.set("notificationTitle", js.Any.fromFunction1(value))
  }
}
