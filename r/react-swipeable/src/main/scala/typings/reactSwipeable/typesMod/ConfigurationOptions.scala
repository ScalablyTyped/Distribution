package typings.reactSwipeable.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationOptions extends js.Object {
  
  var delta: Double = js.native
  
  var preventDefaultTouchmoveEvent: Boolean = js.native
  
  var rotationAngle: Double = js.native
  
  var trackMouse: Boolean = js.native
  
  var trackTouch: Boolean = js.native
}
object ConfigurationOptions {
  
  @scala.inline
  def apply(
    delta: Double,
    preventDefaultTouchmoveEvent: Boolean,
    rotationAngle: Double,
    trackMouse: Boolean,
    trackTouch: Boolean
  ): ConfigurationOptions = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], preventDefaultTouchmoveEvent = preventDefaultTouchmoveEvent.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], trackMouse = trackMouse.asInstanceOf[js.Any], trackTouch = trackTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptions]
  }
  
  @scala.inline
  implicit class ConfigurationOptionsOps[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultTouchmoveEvent(value: Boolean): Self = this.set("preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackMouse(value: Boolean): Self = this.set("trackMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackTouch(value: Boolean): Self = this.set("trackTouch", value.asInstanceOf[js.Any])
  }
}
