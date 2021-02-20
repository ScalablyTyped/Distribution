package typings.pubnub.mod

import typings.pubnub.anon.Next
import typings.pubnub.anon.TotalCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAllMetadataParameters extends StObject {
  
  var filter: js.UndefOr[String] = js.native
  
  var include: js.UndefOr[TotalCount] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var page: js.UndefOr[Next] = js.native
  
  var sort: js.UndefOr[js.Object] = js.native
}
object GetAllMetadataParameters {
  
  @scala.inline
  def apply(): GetAllMetadataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAllMetadataParameters]
  }
  
  @scala.inline
  implicit class GetAllMetadataParametersMutableBuilder[Self <: GetAllMetadataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setInclude(value: TotalCount): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPage(value: Next): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
