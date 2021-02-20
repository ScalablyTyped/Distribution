package typings.sharepoint.SP.JsGrid.EventArgs

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleCellClick extends IEventArgs {
  
  var eventInfo: DomEvent = js.native
  
  var fieldKey: String = js.native
  
  var recordKey: Double = js.native
}
object SingleCellClick {
  
  @scala.inline
  def apply(eventInfo: DomEvent, fieldKey: String, recordKey: Double): SingleCellClick = {
    val __obj = js.Dynamic.literal(eventInfo = eventInfo.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleCellClick]
  }
  
  @scala.inline
  implicit class SingleCellClickMutableBuilder[Self <: SingleCellClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventInfo(value: DomEvent): Self = StObject.set(x, "eventInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
