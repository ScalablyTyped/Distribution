package typings.reactVirtualized.anon

import typings.reactVirtualized.esTableMod.SortDirectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortDirection extends StObject {
  
  var sortDirection: js.UndefOr[SortDirectionType] = js.native
}
object SortDirection {
  
  @scala.inline
  def apply(): SortDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortDirection]
  }
  
  @scala.inline
  implicit class SortDirectionMutableBuilder[Self <: SortDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSortDirection(value: SortDirectionType): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
  }
}
