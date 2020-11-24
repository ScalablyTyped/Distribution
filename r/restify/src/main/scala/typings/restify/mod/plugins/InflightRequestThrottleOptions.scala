package typings.restify.mod.plugins

import typings.restify.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InflightRequestThrottleOptions extends js.Object {
  
  var err: js.Any = js.native
  
  var limit: Double = js.native
  
  var server: Server = js.native
}
object InflightRequestThrottleOptions {
  
  @scala.inline
  def apply(err: js.Any, limit: Double, server: Server): InflightRequestThrottleOptions = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflightRequestThrottleOptions]
  }
  
  @scala.inline
  implicit class InflightRequestThrottleOptionsOps[Self <: InflightRequestThrottleOptions] (val x: Self) extends AnyVal {
    
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
    def setErr(value: js.Any): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
  }
}
