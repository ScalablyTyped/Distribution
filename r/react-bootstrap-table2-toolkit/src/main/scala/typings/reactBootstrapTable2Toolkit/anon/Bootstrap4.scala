package typings.reactBootstrapTable2Toolkit.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bootstrap4 extends js.Object {
  
  var bootstrap4: js.UndefOr[Boolean] = js.native
  
  var columns: js.Array[ColumnDescription[_, _]] = js.native
  
  var data: js.Array[_] = js.native
  
  /**
    * table key field
    */
  var keyField: js.Any = js.native
}
object Bootstrap4 {
  
  @scala.inline
  def apply(columns: js.Array[ColumnDescription[_, _]], data: js.Array[_], keyField: js.Any): Bootstrap4 = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bootstrap4]
  }
  
  @scala.inline
  implicit class Bootstrap4Ops[Self <: Bootstrap4] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnDescription[_, _]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyField(value: js.Any): Self = this.set("keyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrap4(value: Boolean): Self = this.set("bootstrap4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrap4: Self = this.set("bootstrap4", js.undefined)
  }
}
