package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordInserted
  extends StObject
     with IEventArgs {
  
  var afterRecordKey: Double
  
  var changeKey: IChangeKey
  
  var recordIdx: Double
  
  var recordKey: Double
}
object RecordInserted {
  
  inline def apply(afterRecordKey: Double, changeKey: IChangeKey, recordIdx: Double, recordKey: Double): RecordInserted = {
    val __obj = js.Dynamic.literal(afterRecordKey = afterRecordKey.asInstanceOf[js.Any], changeKey = changeKey.asInstanceOf[js.Any], recordIdx = recordIdx.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordInserted]
  }
  
  extension [Self <: RecordInserted](x: Self) {
    
    inline def setAfterRecordKey(value: Double): Self = StObject.set(x, "afterRecordKey", value.asInstanceOf[js.Any])
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    inline def setRecordIdx(value: Double): Self = StObject.set(x, "recordIdx", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
