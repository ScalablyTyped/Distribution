package typings.storybookUi.anon

import typings.emotionSerialize.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearNotification extends StObject {
  
  def clearNotification(id: String): Unit = js.native
  
  var notifications: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'] */ js.Any = js.native
  
  var placement: CSSObject = js.native
}
object ClearNotification {
  
  @scala.inline
  def apply(
    clearNotification: String => Unit,
    notifications: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'] */ js.Any,
    placement: CSSObject
  ): ClearNotification = {
    val __obj = js.Dynamic.literal(clearNotification = js.Any.fromFunction1(clearNotification), notifications = notifications.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearNotification]
  }
  
  @scala.inline
  implicit class ClearNotificationMutableBuilder[Self <: ClearNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearNotification(value: String => Unit): Self = StObject.set(x, "clearNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifications(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'] */ js.Any
    ): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: CSSObject): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
