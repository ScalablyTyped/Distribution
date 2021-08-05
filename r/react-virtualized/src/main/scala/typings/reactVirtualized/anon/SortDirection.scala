package typings.reactVirtualized.anon

import typings.reactVirtualized.esTableMod.SortDirectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortDirection extends StObject {
  
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
}
object SortDirection {
  
  inline def apply(): SortDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortDirection]
  }
  
  extension [Self <: SortDirection](x: Self) {
    
    inline def setSortDirection(value: SortDirectionType): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
  }
}
