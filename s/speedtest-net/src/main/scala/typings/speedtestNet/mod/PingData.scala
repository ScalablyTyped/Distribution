package typings.speedtestNet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PingData extends js.Object {
  
  /** Milliseconds */
  var jitter: Double = js.native
  
  /** Milliseconds */
  var latency: Double = js.native
  
  var progress: js.UndefOr[Double] = js.native
}
object PingData {
  
  @scala.inline
  def apply(jitter: Double, latency: Double): PingData = {
    val __obj = js.Dynamic.literal(jitter = jitter.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingData]
  }
  
  @scala.inline
  implicit class PingDataOps[Self <: PingData] (val x: Self) extends AnyVal {
    
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
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
}
