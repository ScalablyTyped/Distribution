package typings.storybookComponents.controlsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorConfig extends _Control {
  
  var presetColors: js.UndefOr[js.Array[String]] = js.native
}
object ColorConfig {
  
  @scala.inline
  def apply(): ColorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorConfig]
  }
  
  @scala.inline
  implicit class ColorConfigOps[Self <: ColorConfig] (val x: Self) extends AnyVal {
    
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
    def setPresetColorsVarargs(value: String*): Self = this.set("presetColors", js.Array(value :_*))
    
    @scala.inline
    def setPresetColors(value: js.Array[String]): Self = this.set("presetColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresetColors: Self = this.set("presetColors", js.undefined)
  }
}
