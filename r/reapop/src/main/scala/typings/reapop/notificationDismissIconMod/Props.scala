package typings.reapop.notificationDismissIconMod

import typings.react.mod.SyntheticEvent
import typings.reapop.themesTypesMod.Theme
import typings.reapop.typesMod.Notification
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  def dismissNotification(event: SyntheticEvent[Element, Event]): Unit = js.native
  
  var notification: Notification = js.native
  
  var theme: js.UndefOr[Theme] = js.native
}
object Props {
  
  @scala.inline
  def apply(dismissNotification: SyntheticEvent[Element, Event] => Unit, notification: Notification): Props = {
    val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setDismissNotification(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("dismissNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
