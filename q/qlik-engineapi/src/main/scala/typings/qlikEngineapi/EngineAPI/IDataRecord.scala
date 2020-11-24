package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataRecord...
  */
@js.native
trait IDataRecord extends js.Object {
  
  /**
    * List of values inside the table.
    * The first values (in result/qPreview/0/qValues) correspond to the field names in the table.
    * The following values (from result/qPreview/1/qValues) are the values of the fields in the table.
    */
  var qValues: js.Array[String] = js.native
}
object IDataRecord {
  
  @scala.inline
  def apply(qValues: js.Array[String]): IDataRecord = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataRecord]
  }
  
  @scala.inline
  implicit class IDataRecordOps[Self <: IDataRecord] (val x: Self) extends AnyVal {
    
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
    def setQValuesVarargs(value: String*): Self = this.set("qValues", js.Array(value :_*))
    
    @scala.inline
    def setQValues(value: js.Array[String]): Self = this.set("qValues", value.asInstanceOf[js.Any])
  }
}
