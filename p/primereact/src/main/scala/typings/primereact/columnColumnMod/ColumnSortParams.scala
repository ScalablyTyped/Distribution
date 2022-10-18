package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSortParams
  extends StObject
     with ColumnSortMetaData {
  
  var data: Any
  
  var multiSortMeta: js.UndefOr[js.Array[ColumnSortMetaData]] = js.undefined
}
object ColumnSortParams {
  
  inline def apply(data: Any, field: String): ColumnSortParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSortParams]
  }
  
  extension [Self <: ColumnSortParams](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMultiSortMeta(value: js.Array[ColumnSortMetaData]): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
    
    inline def setMultiSortMetaUndefined: Self = StObject.set(x, "multiSortMeta", js.undefined)
    
    inline def setMultiSortMetaVarargs(value: ColumnSortMetaData*): Self = StObject.set(x, "multiSortMeta", js.Array(value*))
  }
}
