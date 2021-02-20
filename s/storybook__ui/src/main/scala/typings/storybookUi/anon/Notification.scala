package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends StObject {
  
  var notification: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'][0] */ js.Any = js.native
  
  def onDismissNotification(id: String): Unit = js.native
}
object Notification {
  
  @scala.inline
  def apply(
    notification: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'][0] */ js.Any,
    onDismissNotification: String => Unit
  ): Notification = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any], onDismissNotification = js.Any.fromFunction1(onDismissNotification))
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotification(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'][0] */ js.Any
    ): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDismissNotification(value: String => Unit): Self = StObject.set(x, "onDismissNotification", js.Any.fromFunction1(value))
  }
}
