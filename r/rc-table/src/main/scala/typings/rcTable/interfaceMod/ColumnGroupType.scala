package typings.rcTable.interfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupType[RecordType] extends ColumnSharedType[RecordType] {
  
  var children: ColumnsType[RecordType] = js.native
}
object ColumnGroupType {
  
  @scala.inline
  def apply[RecordType](children: ColumnsType[RecordType]): ColumnGroupType[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupType[RecordType]]
  }
  
  @scala.inline
  implicit class ColumnGroupTypeMutableBuilder[Self <: ColumnGroupType[_], RecordType] (val x: Self with ColumnGroupType[RecordType]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ColumnsType[RecordType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
