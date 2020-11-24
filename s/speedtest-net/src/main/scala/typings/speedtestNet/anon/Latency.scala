package typings.speedtestNet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Latency extends js.Object {
  
  var latency: PingCount = js.native
  
  var upload: IsClientPrimaryMeasureMethod = js.native
}
object Latency {
  
  @scala.inline
  def apply(latency: PingCount, upload: IsClientPrimaryMeasureMethod): Latency = {
    val __obj = js.Dynamic.literal(latency = latency.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latency]
  }
  
  @scala.inline
  implicit class LatencyOps[Self <: Latency] (val x: Self) extends AnyVal {
    
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
    def setLatency(value: PingCount): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: IsClientPrimaryMeasureMethod): Self = this.set("upload", value.asInstanceOf[js.Any])
  }
}
