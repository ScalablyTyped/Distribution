package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  manualExpandedKey :react-table.react-table.IdType<D>,   paginateExpandedRows :boolean,   expandSubRows :boolean,   autoResetExpanded :boolean | undefined}> */
trait UseExpandedOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetExpanded: js.UndefOr[Boolean] = js.undefined
  
  var expandSubRows: js.UndefOr[Boolean] = js.undefined
  
  var manualExpandedKey: js.UndefOr[IdType[D]] = js.undefined
  
  var paginateExpandedRows: js.UndefOr[Boolean] = js.undefined
}
object UseExpandedOptions {
  
  inline def apply[D /* <: js.Object */](): UseExpandedOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseExpandedOptions[D]]
  }
  
  extension [Self <: UseExpandedOptions[?], D /* <: js.Object */](x: Self & UseExpandedOptions[D]) {
    
    inline def setAutoResetExpanded(value: Boolean): Self = StObject.set(x, "autoResetExpanded", value.asInstanceOf[js.Any])
    
    inline def setAutoResetExpandedUndefined: Self = StObject.set(x, "autoResetExpanded", js.undefined)
    
    inline def setExpandSubRows(value: Boolean): Self = StObject.set(x, "expandSubRows", value.asInstanceOf[js.Any])
    
    inline def setExpandSubRowsUndefined: Self = StObject.set(x, "expandSubRows", js.undefined)
    
    inline def setManualExpandedKey(value: IdType[D]): Self = StObject.set(x, "manualExpandedKey", value.asInstanceOf[js.Any])
    
    inline def setManualExpandedKeyUndefined: Self = StObject.set(x, "manualExpandedKey", js.undefined)
    
    inline def setPaginateExpandedRows(value: Boolean): Self = StObject.set(x, "paginateExpandedRows", value.asInstanceOf[js.Any])
    
    inline def setPaginateExpandedRowsUndefined: Self = StObject.set(x, "paginateExpandedRows", js.undefined)
  }
}
