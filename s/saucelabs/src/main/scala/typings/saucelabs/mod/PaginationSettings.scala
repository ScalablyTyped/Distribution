package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ASCENDING
import typings.saucelabs.saucelabsStrings.DESCENDING
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
  implicit class PaginationSettingsOps[Self <: PaginationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSearchTerm(value: String): Self = this.set("searchTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTerm: Self = this.set("searchTerm", js.undefined)
    
    @scala.inline
    def setSortDirection(value: ASCENDING | DESCENDING): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
  }
}
