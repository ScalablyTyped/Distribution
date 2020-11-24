package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends js.Object {
  
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
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    
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
    def setNotification(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'][0] */ js.Any
    ): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDismissNotification(value: String => Unit): Self = this.set("onDismissNotification", js.Any.fromFunction1(value))
  }
}
