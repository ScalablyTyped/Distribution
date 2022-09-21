package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordFactory extends StObject {
  
  /** Create a new record */
  def MakeRecord(dataPropMap: Any, localizedPropMap: Any, bKeepRawData: Boolean): IRecord
  
  var gridFieldMap: Any
}
object RecordFactory {
  
  inline def apply(MakeRecord: (Any, Any, Boolean) => IRecord, gridFieldMap: Any): RecordFactory = {
    val __obj = js.Dynamic.literal(MakeRecord = js.Any.fromFunction3(MakeRecord), gridFieldMap = gridFieldMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFactory]
  }
  
  extension [Self <: RecordFactory](x: Self) {
    
    inline def setGridFieldMap(value: Any): Self = StObject.set(x, "gridFieldMap", value.asInstanceOf[js.Any])
    
    inline def setMakeRecord(value: (Any, Any, Boolean) => IRecord): Self = StObject.set(x, "MakeRecord", js.Any.fromFunction3(value))
  }
}
