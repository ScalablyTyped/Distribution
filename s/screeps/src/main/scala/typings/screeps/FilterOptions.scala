package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Filter Options
@js.native
trait FilterOptions[T /* <: FindConstant */] extends StObject {
  
  var filter: FilterFunction[T] | FilterObject | String = js.native
}
object FilterOptions {
  
  @scala.inline
  def apply[T /* <: FindConstant */](filter: FilterFunction[T] | FilterObject | String): FilterOptions[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions[T]]
  }
  
  @scala.inline
  implicit class FilterOptionsMutableBuilder[Self <: FilterOptions[_], T /* <: FindConstant */] (val x: Self with FilterOptions[T]) extends AnyVal {
    
    @scala.inline
    def setFilter(value: FilterFunction[T] | FilterObject | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
  }
}
