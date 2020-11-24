package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Cta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseGetDashboardMessageForUser200
  extends /* key */ StringDictionary[js.Any] {
  
  var response: js.UndefOr[Cta] = js.native
  
  var status: js.UndefOr[Boolean] = js.native
}
object ResponseGetDashboardMessageForUser200 {
  
  @scala.inline
  def apply(): ResponseGetDashboardMessageForUser200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetDashboardMessageForUser200]
  }
  
  @scala.inline
  implicit class ResponseGetDashboardMessageForUser200Ops[Self <: ResponseGetDashboardMessageForUser200] (val x: Self) extends AnyVal {
    
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
    def setResponse(value: Cta): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
