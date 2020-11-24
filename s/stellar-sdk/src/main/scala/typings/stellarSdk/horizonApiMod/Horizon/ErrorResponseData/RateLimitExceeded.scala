package typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData

import typings.stellarSdk.stellarSdkNumbers.`429`
import typings.stellarSdk.stellarSdkStrings.`Rate Limit Exceeded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateLimitExceeded extends Base {
  
  @JSName("status")
  var status_RateLimitExceeded: `429` = js.native
  
  @JSName("title")
  var title_RateLimitExceeded: `Rate Limit Exceeded` = js.native
}
object RateLimitExceeded {
  
  @scala.inline
  def apply(details: String, instance: String, status: `429`, title: `Rate Limit Exceeded`, `type`: String): RateLimitExceeded = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitExceeded]
  }
  
  @scala.inline
  implicit class RateLimitExceededOps[Self <: RateLimitExceeded] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: `429`): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: `Rate Limit Exceeded`): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
