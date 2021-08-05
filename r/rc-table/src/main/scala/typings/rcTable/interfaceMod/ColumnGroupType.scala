package typings.rcTable.interfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnGroupType[RecordType]
  extends StObject
     with ColumnSharedType[RecordType] {
  
  var children: ColumnsType[RecordType]
}
object ColumnGroupType {
  
  inline def apply[RecordType](children: ColumnsType[RecordType]): ColumnGroupType[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupType[RecordType]]
  }
  
  extension [Self <: ColumnGroupType[?], RecordType](x: Self & ColumnGroupType[RecordType]) {
    
    inline def setChildren(value: ColumnsType[RecordType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
