package typings.sharepoint.SP.JsGrid.EventArgs

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.JsGrid.ClickContext
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click
  extends StObject
     with IEventArgs {
  
  var context: ClickContext
  
  var eventInfo: DomEvent
  
  var fieldKey: String
  
  var recordKey: Double
}
object Click {
  
  inline def apply(context: ClickContext, eventInfo: DomEvent, fieldKey: String, recordKey: Double): Click = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], eventInfo = eventInfo.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
    
    inline def setContext(value: ClickContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setEventInfo(value: DomEvent): Self = StObject.set(x, "eventInfo", value.asInstanceOf[js.Any])
    
    inline def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
