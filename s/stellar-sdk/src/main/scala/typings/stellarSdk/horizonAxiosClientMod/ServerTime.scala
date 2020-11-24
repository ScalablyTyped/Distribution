package typings.stellarSdk.horizonAxiosClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerTime extends js.Object {
  
  var localTimeRecorded: Double = js.native
  
  var serverTime: Double = js.native
}
object ServerTime {
  
  @scala.inline
  def apply(localTimeRecorded: Double, serverTime: Double): ServerTime = {
    val __obj = js.Dynamic.literal(localTimeRecorded = localTimeRecorded.asInstanceOf[js.Any], serverTime = serverTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTime]
  }
  
  @scala.inline
  implicit class ServerTimeOps[Self <: ServerTime] (val x: Self) extends AnyVal {
    
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
    def setLocalTimeRecorded(value: Double): Self = this.set("localTimeRecorded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTime(value: Double): Self = this.set("serverTime", value.asInstanceOf[js.Any])
  }
}
