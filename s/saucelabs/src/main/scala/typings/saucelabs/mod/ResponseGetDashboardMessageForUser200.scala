package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Cta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGetDashboardMessageForUser200
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var response: js.UndefOr[Cta] = js.undefined
  
  var status: js.UndefOr[Boolean] = js.undefined
}
object ResponseGetDashboardMessageForUser200 {
  
  inline def apply(): ResponseGetDashboardMessageForUser200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetDashboardMessageForUser200]
  }
  
  extension [Self <: ResponseGetDashboardMessageForUser200](x: Self) {
    
    inline def setResponse(value: Cta): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
