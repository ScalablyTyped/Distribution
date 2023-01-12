package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellEditBegin
  extends StObject
     with IEventArgs {
  
  var fieldKey: String
  
  var recordKey: Double
}
object CellEditBegin {
  
  inline def apply(fieldKey: String, recordKey: Double): CellEditBegin = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellEditBegin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellEditBegin] (val x: Self) extends AnyVal {
    
    inline def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
