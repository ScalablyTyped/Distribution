package typings.speedtestNet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PingCount extends js.Object {
  
  var pingCount: Double = js.native
}
object PingCount {
  
  @scala.inline
  def apply(pingCount: Double): PingCount = {
    val __obj = js.Dynamic.literal(pingCount = pingCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingCount]
  }
  
  @scala.inline
  implicit class PingCountOps[Self <: PingCount] (val x: Self) extends AnyVal {
    
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
    def setPingCount(value: Double): Self = this.set("pingCount", value.asInstanceOf[js.Any])
  }
}
