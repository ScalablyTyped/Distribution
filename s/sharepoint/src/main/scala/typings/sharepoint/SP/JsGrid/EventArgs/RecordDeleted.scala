package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordDeleted
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
  
  var recordIdx: Double
  
  var recordKey: Double
}
object RecordDeleted {
  
  inline def apply(changeKey: IChangeKey, recordIdx: Double, recordKey: Double): RecordDeleted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], recordIdx = recordIdx.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDeleted]
  }
  
  extension [Self <: RecordDeleted](x: Self) {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    inline def setRecordIdx(value: Double): Self = StObject.set(x, "recordIdx", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
