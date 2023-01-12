package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationAction extends StObject {
  
  /* standard dom */
  var action: java.lang.String
  
  /* standard dom */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var title: java.lang.String
}
object NotificationAction {
  
  inline def apply(action: java.lang.String, title: java.lang.String): NotificationAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: java.lang.String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: java.lang.String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
