package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordFactory extends StObject {
  
  /** Create a new record */
  def MakeRecord(dataPropMap: js.Any, localizedPropMap: js.Any, bKeepRawData: Boolean): IRecord = js.native
  
  var gridFieldMap: js.Any = js.native
}
object RecordFactory {
  
  @scala.inline
  def apply(MakeRecord: (js.Any, js.Any, Boolean) => IRecord, gridFieldMap: js.Any): RecordFactory = {
    val __obj = js.Dynamic.literal(MakeRecord = js.Any.fromFunction3(MakeRecord), gridFieldMap = gridFieldMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFactory]
  }
  
  @scala.inline
  implicit class RecordFactoryMutableBuilder[Self <: RecordFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridFieldMap(value: js.Any): Self = StObject.set(x, "gridFieldMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeRecord(value: (js.Any, js.Any, Boolean) => IRecord): Self = StObject.set(x, "MakeRecord", js.Any.fromFunction3(value))
  }
}
