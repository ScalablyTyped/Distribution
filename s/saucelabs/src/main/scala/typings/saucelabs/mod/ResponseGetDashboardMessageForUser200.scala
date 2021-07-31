package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Cta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGetDashboardMessageForUser200
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var response: js.UndefOr[Cta] = js.undefined
  
  var status: js.UndefOr[Boolean] = js.undefined
}
object ResponseGetDashboardMessageForUser200 {
  
  @scala.inline
  def apply(): ResponseGetDashboardMessageForUser200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetDashboardMessageForUser200]
  }
  
  @scala.inline
  implicit class ResponseGetDashboardMessageForUser200MutableBuilder[Self <: ResponseGetDashboardMessageForUser200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: Cta): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
