package typings.pubnub.mod

import typings.pubnub.anon.ChannelFields
import typings.pubnub.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMembersParameters extends StObject {
  
  var filter: js.UndefOr[String] = js.undefined
  
  var include: js.UndefOr[ChannelFields] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var page: js.UndefOr[Next] = js.undefined
  
  var sort: js.UndefOr[js.Object] = js.undefined
}
object ChannelMembersParameters {
  
  inline def apply(): ChannelMembersParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembersParameters]
  }
  
  extension [Self <: ChannelMembersParameters](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setInclude(value: ChannelFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPage(value: Next): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
