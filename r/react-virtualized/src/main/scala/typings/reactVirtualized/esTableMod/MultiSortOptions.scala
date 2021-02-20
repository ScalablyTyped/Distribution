package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSortOptions extends StObject {
  
  var defaultSortBy: js.UndefOr[js.Array[String]] = js.native
  
  var defaultSortDirection: js.UndefOr[SortDirectionMap] = js.native
}
object MultiSortOptions {
  
  @scala.inline
  def apply(): MultiSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSortOptions]
  }
  
  @scala.inline
  implicit class MultiSortOptionsMutableBuilder[Self <: MultiSortOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSortBy(value: js.Array[String]): Self = StObject.set(x, "defaultSortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortByUndefined: Self = StObject.set(x, "defaultSortBy", js.undefined)
    
    @scala.inline
    def setDefaultSortByVarargs(value: String*): Self = StObject.set(x, "defaultSortBy", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSortDirection(value: SortDirectionMap): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
  }
}
