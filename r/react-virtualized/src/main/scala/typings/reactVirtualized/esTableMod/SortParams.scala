package typings.reactVirtualized.esTableMod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortParams extends StObject {
  
  var defaultSortDirection: SortDirectionType = js.native
  
  var event: MouseEvent = js.native
  
  var sortBy: String = js.native
}
object SortParams {
  
  @scala.inline
  def apply(defaultSortDirection: SortDirectionType, event: MouseEvent, sortBy: String): SortParams = {
    val __obj = js.Dynamic.literal(defaultSortDirection = defaultSortDirection.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortParams]
  }
  
  @scala.inline
  implicit class SortParamsMutableBuilder[Self <: SortParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSortDirection(value: SortDirectionType): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
  }
}
