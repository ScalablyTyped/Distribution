package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ASCENDING
import typings.saucelabs.saucelabsStrings.DESCENDING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationSettings
  extends /* key */ StringDictionary[js.Any] {
  
  var limit: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var searchTerm: js.UndefOr[String] = js.native
  
  var sortDirection: js.UndefOr[ASCENDING | DESCENDING] = js.native
}
object PaginationSettings {
  
  @scala.inline
  def apply(): PaginationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationSettings]
  }
  
  @scala.inline
  implicit class PaginationSettingsMutableBuilder[Self <: PaginationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    
    @scala.inline
    def setSortDirection(value: ASCENDING | DESCENDING): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
  }
}
