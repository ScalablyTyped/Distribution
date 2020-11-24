package typings.slonik.mod

import typings.slonik.slonikStrings.DELETE
import typings.slonik.slonikStrings.INSERT
import typings.slonik.slonikStrings.SELECT
import typings.slonik.slonikStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultType[T] extends js.Object {
  
  var command: DELETE | INSERT | SELECT | UPDATE = js.native
  
  var fields: js.Array[FieldType] = js.native
  
  var notices: js.Array[NoticeType] = js.native
  
  var oid: Double | Null = js.native
  
  var rowAsArray: Boolean = js.native
  
  var rowCount: Double = js.native
  
  var rows: js.Array[T] = js.native
}
object QueryResultType {
  
  @scala.inline
  def apply[T](
    command: DELETE | INSERT | SELECT | UPDATE,
    fields: js.Array[FieldType],
    notices: js.Array[NoticeType],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[T]
  ): QueryResultType[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], notices = notices.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultType[T]]
  }
  
  @scala.inline
  implicit class QueryResultTypeOps[Self <: QueryResultType[_], T] (val x: Self with QueryResultType[T]) extends AnyVal {
    
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
    def setCommand(value: DELETE | INSERT | SELECT | UPDATE): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: FieldType*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FieldType]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticesVarargs(value: NoticeType*): Self = this.set("notices", js.Array(value :_*))
    
    @scala.inline
    def setNotices(value: js.Array[NoticeType]): Self = this.set("notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowAsArray(value: Boolean): Self = this.set("rowAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: T*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[T]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOid(value: Double): Self = this.set("oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidNull: Self = this.set("oid", null)
  }
}
