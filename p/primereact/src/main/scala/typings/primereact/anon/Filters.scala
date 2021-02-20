package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filters extends StObject {
  
  var filters: js.Any = js.native
}
object Filters {
  
  @scala.inline
  def apply(filters: js.Any): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
  }
}
