package typings.rcTable

import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.Key
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("rc-table/lib/utils/valueUtil", "getColumnsKey")
  @js.native
  def getColumnsKey(columns: js.Array[GetColumnKeyColumn]): js.Array[String | Double] = js.native
  
  @JSImport("rc-table/lib/utils/valueUtil", "getPathValue")
  @js.native
  def getPathValue[ValueType, ObjectType /* <: js.Object */](record: ObjectType, path: DataIndex): ValueType = js.native
  
  @JSImport("rc-table/lib/utils/valueUtil", "mergeObject")
  @js.native
  def mergeObject[ReturnObject /* <: js.Object */](objects: Partial[ReturnObject]*): ReturnObject = js.native
  
  @JSImport("rc-table/lib/utils/valueUtil", "validateValue")
  @js.native
  def validateValue[T](`val`: T): Boolean = js.native
  
  @js.native
  trait GetColumnKeyColumn extends StObject {
    
    var dataIndex: js.UndefOr[DataIndex] = js.native
    
    var key: js.UndefOr[Key] = js.native
  }
  object GetColumnKeyColumn {
    
    @scala.inline
    def apply(): GetColumnKeyColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetColumnKeyColumn]
    }
    
    @scala.inline
    implicit class GetColumnKeyColumnMutableBuilder[Self <: GetColumnKeyColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      @scala.inline
      def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
