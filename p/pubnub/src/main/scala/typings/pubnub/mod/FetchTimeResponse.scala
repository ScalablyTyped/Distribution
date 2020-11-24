package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// fetch time
@js.native
trait FetchTimeResponse extends js.Object {
  
  var timetoken: Double = js.native
}
object FetchTimeResponse {
  
  @scala.inline
  def apply(timetoken: Double): FetchTimeResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchTimeResponse]
  }
  
  @scala.inline
  implicit class FetchTimeResponseOps[Self <: FetchTimeResponse] (val x: Self) extends AnyVal {
    
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
    def setTimetoken(value: Double): Self = this.set("timetoken", value.asInstanceOf[js.Any])
  }
}
