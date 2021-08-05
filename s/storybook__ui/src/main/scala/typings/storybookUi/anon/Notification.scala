package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  var notification: /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@storybook/api.@storybook/api/dist/modules/notifications.Notification>[0] */ js.Any
  
  def onDismissNotification(id: String): Unit
}
object Notification {
  
  inline def apply(
    notification: /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@storybook/api.@storybook/api/dist/modules/notifications.Notification>[0] */ js.Any,
    onDismissNotification: String => Unit
  ): Notification = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any], onDismissNotification = js.Any.fromFunction1(onDismissNotification))
    __obj.asInstanceOf[Notification]
  }
  
  extension [Self <: Notification](x: Self) {
    
    inline def setNotification(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@storybook/api.@storybook/api/dist/modules/notifications.Notification>[0] */ js.Any
    ): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setOnDismissNotification(value: String => Unit): Self = StObject.set(x, "onDismissNotification", js.Any.fromFunction1(value))
  }
}
