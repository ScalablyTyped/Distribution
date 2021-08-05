package typings.sharepoint.SP.JsGrid.EventArgs

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleCellKeyDown
  extends StObject
     with IEventArgs {
  
  var eventInfo: DomEvent
  
  var fieldKey: String
  
  var recordKey: Double
}
object SingleCellKeyDown {
  
  inline def apply(eventInfo: DomEvent, fieldKey: String, recordKey: Double): SingleCellKeyDown = {
    val __obj = js.Dynamic.literal(eventInfo = eventInfo.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleCellKeyDown]
  }
  
  extension [Self <: SingleCellKeyDown](x: Self) {
    
    inline def setEventInfo(value: DomEvent): Self = StObject.set(x, "eventInfo", value.asInstanceOf[js.Any])
    
    inline def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
