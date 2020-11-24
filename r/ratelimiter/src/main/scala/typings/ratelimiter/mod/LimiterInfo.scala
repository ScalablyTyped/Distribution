package typings.ratelimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result Object
  */
@js.native
trait LimiterInfo extends js.Object {
  
  /**
    * number of calls left in current `duration` without decreasing current `get`
    */
  var remaining: Double = js.native
  
  /**
    * time since epoch in seconds at which the rate limiting period will end (or already ended)
    */
  var reset: Double = js.native
  
  /**
    * time since epoch in milliseconds at which the rate limiting period will end (or already ended)
    */
  var resetMs: Double = js.native
  
  /**
    * `max` value
    */
  var total: Double = js.native
}
object LimiterInfo {
  
  @scala.inline
  def apply(remaining: Double, reset: Double, resetMs: Double, total: Double): LimiterInfo = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resetMs = resetMs.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterInfo]
  }
  
  @scala.inline
  implicit class LimiterInfoOps[Self <: LimiterInfo] (val x: Self) extends AnyVal {
    
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
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: Double): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetMs(value: Double): Self = this.set("resetMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
