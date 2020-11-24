package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordFactory extends js.Object {
  
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
  implicit class RecordFactoryOps[Self <: RecordFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMakeRecord(value: (js.Any, js.Any, Boolean) => IRecord): Self = this.set("MakeRecord", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGridFieldMap(value: js.Any): Self = this.set("gridFieldMap", value.asInstanceOf[js.Any])
  }
}
