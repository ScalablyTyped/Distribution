package typings.smallweiAvue.anon

import typings.smallweiAvue.TableColumnCtx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[T] extends StObject {
  
  var columns: js.Array[TableColumnCtx[T]]
  
  var data: js.Array[T]
}
object Data {
  
  inline def apply[T](columns: js.Array[TableColumnCtx[T]], data: js.Array[T]): Data[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data[?], T] (val x: Self & Data[T]) extends AnyVal {
    
    inline def setColumns(value: js.Array[TableColumnCtx[T]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: TableColumnCtx[T]*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
