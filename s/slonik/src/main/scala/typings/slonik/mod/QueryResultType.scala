package typings.slonik.mod

import typings.slonik.slonikStrings.DELETE
import typings.slonik.slonikStrings.INSERT
import typings.slonik.slonikStrings.SELECT
import typings.slonik.slonikStrings.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResultType[T] extends StObject {
  
  var command: DELETE | INSERT | SELECT | UPDATE
  
  var fields: js.Array[FieldType]
  
  var notices: js.Array[NoticeType]
  
  var oid: Double | Null
  
  var rowAsArray: Boolean
  
  var rowCount: Double
  
  var rows: js.Array[T]
}
object QueryResultType {
  
  inline def apply[T](
    command: DELETE | INSERT | SELECT | UPDATE,
    fields: js.Array[FieldType],
    notices: js.Array[NoticeType],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[T]
  ): QueryResultType[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], notices = notices.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], oid = null)
    __obj.asInstanceOf[QueryResultType[T]]
  }
  
  extension [Self <: QueryResultType[?], T](x: Self & QueryResultType[T]) {
    
    inline def setCommand(value: DELETE | INSERT | SELECT | UPDATE): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[FieldType]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldType*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setNotices(value: js.Array[NoticeType]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    inline def setNoticesVarargs(value: NoticeType*): Self = StObject.set(x, "notices", js.Array(value*))
    
    inline def setOid(value: Double): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    inline def setOidNull: Self = StObject.set(x, "oid", null)
    
    inline def setRowAsArray(value: Boolean): Self = StObject.set(x, "rowAsArray", value.asInstanceOf[js.Any])
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[T]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: T*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
