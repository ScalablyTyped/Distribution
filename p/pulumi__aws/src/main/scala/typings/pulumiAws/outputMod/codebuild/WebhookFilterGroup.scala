package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookFilterGroup extends StObject {
  
  /**
    * A webhook filter for the group. Filter blocks are documented below.
    */
  var filters: js.UndefOr[js.Array[WebhookFilterGroupFilter]] = js.undefined
}
object WebhookFilterGroup {
  
  inline def apply(): WebhookFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookFilterGroup]
  }
  
  extension [Self <: WebhookFilterGroup](x: Self) {
    
    inline def setFilters(value: js.Array[WebhookFilterGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: WebhookFilterGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
