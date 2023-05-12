package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom sort event.
  * @see {@link ColumnProps.sortFunction}
  * @event
  */
trait ColumnSortEvent
  extends StObject
     with ColumnSortMetaData {
  
  /**
    * Data to be sorted.
    */
  var data: Any
  
  /**
    * Array of multiple sort metadata for multi-column sorting.
    */
  var multiSortMeta: js.UndefOr[js.Array[ColumnSortMetaData]] = js.undefined
}
object ColumnSortEvent {
  
  inline def apply(data: Any, field: String): ColumnSortEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSortEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnSortEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMultiSortMeta(value: js.Array[ColumnSortMetaData]): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
    
    inline def setMultiSortMetaUndefined: Self = StObject.set(x, "multiSortMeta", js.undefined)
    
    inline def setMultiSortMetaVarargs(value: ColumnSortMetaData*): Self = StObject.set(x, "multiSortMeta", js.Array(value*))
  }
}
