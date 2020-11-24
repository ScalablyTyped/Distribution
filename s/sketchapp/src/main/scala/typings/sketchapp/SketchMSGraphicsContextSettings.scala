package typings.sketchapp

import typings.sketchapp.sketchappStrings.graphicsContextSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSGraphicsContextSettings extends js.Object {
  
  var _class: graphicsContextSettings = js.native
  
  var blendMode: SketchMSGraphicsContextSettingsBlendMode = js.native
  
  var opacity: Double = js.native
}
object SketchMSGraphicsContextSettings {
  
  @scala.inline
  def apply(
    _class: graphicsContextSettings,
    blendMode: SketchMSGraphicsContextSettingsBlendMode,
    opacity: Double
  ): SketchMSGraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGraphicsContextSettings]
  }
  
  @scala.inline
  implicit class SketchMSGraphicsContextSettingsOps[Self <: SketchMSGraphicsContextSettings] (val x: Self) extends AnyVal {
    
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
    def set_class(value: graphicsContextSettings): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: SketchMSGraphicsContextSettingsBlendMode): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
  }
}
