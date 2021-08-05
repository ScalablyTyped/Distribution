package typings.rcTable

import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.Key
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("rc-table/lib/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getColumnsKey(columns: js.Array[GetColumnKeyColumn]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColumnsKey")(columns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
  
  inline def getPathValue[ValueType, ObjectType /* <: js.Object */](record: ObjectType, path: DataIndex): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathValue")(record.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  
  inline def mergeObject[ReturnObject /* <: js.Object */](objects: Partial[ReturnObject]*): ReturnObject = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeObject")(objects.asInstanceOf[js.Any]).asInstanceOf[ReturnObject]
  
  inline def validateValue[T](`val`: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait GetColumnKeyColumn extends StObject {
    
    var dataIndex: js.UndefOr[DataIndex] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
  }
  object GetColumnKeyColumn {
    
    inline def apply(): GetColumnKeyColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetColumnKeyColumn]
    }
    
    extension [Self <: GetColumnKeyColumn](x: Self) {
      
      inline def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      inline def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
