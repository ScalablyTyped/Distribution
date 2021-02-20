package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  disableGlobalFilter :boolean | undefined}> */
@js.native
trait UseGlobalFiltersColumnOptions[D /* <: js.Object */] extends StObject {
  
  var disableGlobalFilter: js.UndefOr[Boolean] = js.native
}
object UseGlobalFiltersColumnOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseGlobalFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGlobalFiltersColumnOptions[D]]
  }
  
  @scala.inline
  implicit class UseGlobalFiltersColumnOptionsMutableBuilder[Self <: UseGlobalFiltersColumnOptions[_], D /* <: js.Object */] (val x: Self with UseGlobalFiltersColumnOptions[D]) extends AnyVal {
    
    @scala.inline
    def setDisableGlobalFilter(value: Boolean): Self = StObject.set(x, "disableGlobalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGlobalFilterUndefined: Self = StObject.set(x, "disableGlobalFilter", js.undefined)
  }
}
