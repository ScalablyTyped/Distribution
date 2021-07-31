package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasFilters extends StObject {
  
  var filter: java.lang.String
}
object CanvasFilters {
  
  @scala.inline
  def apply(filter: java.lang.String): CanvasFilters = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasFilters]
  }
  
  @scala.inline
  implicit class CanvasFiltersMutableBuilder[Self <: CanvasFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: java.lang.String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
