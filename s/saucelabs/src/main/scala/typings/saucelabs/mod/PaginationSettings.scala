package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ASCENDING
import typings.saucelabs.saucelabsStrings.DESCENDING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationSettings
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var searchTerm: js.UndefOr[String] = js.undefined
  
  var sortDirection: js.UndefOr[ASCENDING | DESCENDING] = js.undefined
}
object PaginationSettings {
  
  inline def apply(): PaginationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginationSettings] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    
    inline def setSortDirection(value: ASCENDING | DESCENDING): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
  }
}
