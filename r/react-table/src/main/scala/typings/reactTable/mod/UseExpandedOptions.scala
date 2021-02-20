package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  manualExpandedKey :react-table.react-table.IdType<D>,   paginateExpandedRows :boolean,   expandSubRows :boolean,   autoResetExpanded :boolean | undefined}> */
@js.native
trait UseExpandedOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetExpanded: js.UndefOr[Boolean] = js.native
  
  var expandSubRows: js.UndefOr[Boolean] = js.native
  
  var manualExpandedKey: js.UndefOr[IdType[D]] = js.native
  
  var paginateExpandedRows: js.UndefOr[Boolean] = js.native
}
object UseExpandedOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseExpandedOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseExpandedOptions[D]]
  }
  
  @scala.inline
  implicit class UseExpandedOptionsMutableBuilder[Self <: UseExpandedOptions[_], D /* <: js.Object */] (val x: Self with UseExpandedOptions[D]) extends AnyVal {
    
    @scala.inline
    def setAutoResetExpanded(value: Boolean): Self = StObject.set(x, "autoResetExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResetExpandedUndefined: Self = StObject.set(x, "autoResetExpanded", js.undefined)
    
    @scala.inline
    def setExpandSubRows(value: Boolean): Self = StObject.set(x, "expandSubRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandSubRowsUndefined: Self = StObject.set(x, "expandSubRows", js.undefined)
    
    @scala.inline
    def setManualExpandedKey(value: IdType[D]): Self = StObject.set(x, "manualExpandedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualExpandedKeyUndefined: Self = StObject.set(x, "manualExpandedKey", js.undefined)
    
    @scala.inline
    def setPaginateExpandedRows(value: Boolean): Self = StObject.set(x, "paginateExpandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginateExpandedRowsUndefined: Self = StObject.set(x, "paginateExpandedRows", js.undefined)
  }
}
