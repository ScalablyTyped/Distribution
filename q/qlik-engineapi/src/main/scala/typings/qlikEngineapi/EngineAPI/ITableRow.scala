package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableRow...
  */
@js.native
trait ITableRow extends js.Object {
  
  /**
    * Array of field values [{qText, qIsNumeric, qNumber},..]
    */
  var vqValue: js.Array[IFieldValue] = js.native
}
object ITableRow {
  
  @scala.inline
  def apply(vqValue: js.Array[IFieldValue]): ITableRow = {
    val __obj = js.Dynamic.literal(vqValue = vqValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableRow]
  }
  
  @scala.inline
  implicit class ITableRowOps[Self <: ITableRow] (val x: Self) extends AnyVal {
    
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
    def setVqValueVarargs(value: IFieldValue*): Self = this.set("vqValue", js.Array(value :_*))
    
    @scala.inline
    def setVqValue(value: js.Array[IFieldValue]): Self = this.set("vqValue", value.asInstanceOf[js.Any])
  }
}
