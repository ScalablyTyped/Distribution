package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayPropsConfig extends js.Object {
  
  var delay: Double = js.native
  
  var duration: Double = js.native
  
  var interrupt: String = js.native
  
  var loop: Double = js.native
  
  var offset: Double = js.native
  
  var pan: Double = js.native
  
  def set(props: js.Any): PlayPropsConfig = js.native
  
  var startTime: Double = js.native
  
  var volume: Double = js.native
}
object PlayPropsConfig {
  
  @scala.inline
  def apply(
    delay: Double,
    duration: Double,
    interrupt: String,
    loop: Double,
    offset: Double,
    pan: Double,
    set: js.Any => PlayPropsConfig,
    startTime: Double,
    volume: Double
  ): PlayPropsConfig = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), startTime = startTime.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayPropsConfig]
  }
  
  @scala.inline
  implicit class PlayPropsConfigOps[Self <: PlayPropsConfig] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterrupt(value: String): Self = this.set("interrupt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPan(value: Double): Self = this.set("pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: js.Any => PlayPropsConfig): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
