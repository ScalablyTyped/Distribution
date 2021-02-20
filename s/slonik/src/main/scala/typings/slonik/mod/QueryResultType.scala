package typings.slonik.mod

import typings.slonik.slonikStrings.DELETE
import typings.slonik.slonikStrings.INSERT
import typings.slonik.slonikStrings.SELECT
import typings.slonik.slonikStrings.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultType[T] extends StObject {
  
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
  implicit class QueryResultTypeMutableBuilder[Self <: QueryResultType[_], T] (val x: Self with QueryResultType[T]) extends AnyVal {
    
    @scala.inline
    def setCommand(value: DELETE | INSERT | SELECT | UPDATE): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[FieldType]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: FieldType*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setNotices(value: js.Array[NoticeType]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticesVarargs(value: NoticeType*): Self = StObject.set(x, "notices", js.Array(value :_*))
    
    @scala.inline
    def setOid(value: Double): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidNull: Self = StObject.set(x, "oid", null)
    
    @scala.inline
    def setRowAsArray(value: Boolean): Self = StObject.set(x, "rowAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[T]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: T*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
