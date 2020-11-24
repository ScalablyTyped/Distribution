package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioTimestamp extends js.Object {
  
  var contextTime: js.UndefOr[Double] = js.native
  
  var performanceTime: js.UndefOr[Double] = js.native
}
object AudioTimestamp {
  
  @scala.inline
  def apply(): AudioTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTimestamp]
  }
  
  @scala.inline
  implicit class AudioTimestampOps[Self <: AudioTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContextTime(value: Double): Self = this.set("contextTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextTime: Self = this.set("contextTime", js.undefined)
    
    @scala.inline
    def setPerformanceTime(value: Double): Self = this.set("performanceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceTime: Self = this.set("performanceTime", js.undefined)
  }
}
