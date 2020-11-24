package typings.requestStats.mod

import typings.requestStats.anon.Bytes
import typings.requestStats.anon.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats extends js.Object {
  
  /**
    * `true` if the connection was closed correctly and `false` otherwise
    */
  var ok: Boolean = js.native
  
  var req: Bytes = js.native
  
  var res: Headers = js.native
  
  /**
    * The milliseconds it took to serve the request
    */
  var time: Double = js.native
}
object Stats {
  
  @scala.inline
  def apply(ok: Boolean, req: Bytes, res: Headers, time: Double): Stats = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    
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
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: Bytes): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: Headers): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
