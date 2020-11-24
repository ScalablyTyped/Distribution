package typings.requestStats.mod

import typings.requestStats.anon.BytesDelta
import typings.requestStats.anon.Speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends js.Object {
  
  /**
    * `false` if the request is still in progress
    */
  var completed: Boolean = js.native
  
  var req: BytesDelta = js.native
  
  var res: Speed = js.native
  
  /**
    * The total time the reuqest have been in progress
    */
  var time: Double = js.native
  
  /**
    * The time since previous call to `.progress()`
    */
  var timeDelta: Double = js.native
}
object Progress {
  
  @scala.inline
  def apply(completed: Boolean, req: BytesDelta, res: Speed, time: Double, timeDelta: Double): Progress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDelta = timeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    
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
    def setCompleted(value: Boolean): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: BytesDelta): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: Speed): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDelta(value: Double): Self = this.set("timeDelta", value.asInstanceOf[js.Any])
  }
}
