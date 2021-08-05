package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEntryRecordCommitted
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
  
  var originalRecordKey: Double
  
  var recordKey: Double
}
object OnEntryRecordCommitted {
  
  inline def apply(changeKey: IChangeKey, originalRecordKey: Double, recordKey: Double): OnEntryRecordCommitted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], originalRecordKey = originalRecordKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordCommitted]
  }
  
  extension [Self <: OnEntryRecordCommitted](x: Self) {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    inline def setOriginalRecordKey(value: Double): Self = StObject.set(x, "originalRecordKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
