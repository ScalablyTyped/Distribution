package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/chrome/Chrome.ChromePickerStylesProps> */
@js.native
trait PartialChromePickerStyles extends js.Object {
  
  var Alpha: js.UndefOr[CSSProperties] = js.native
  
  var Hue: js.UndefOr[CSSProperties] = js.native
  
  var Saturation: js.UndefOr[CSSProperties] = js.native
  
  var active: js.UndefOr[CSSProperties] = js.native
  
  var alpha: js.UndefOr[CSSProperties] = js.native
  
  var body: js.UndefOr[CSSProperties] = js.native
  
  var color: js.UndefOr[CSSProperties] = js.native
  
  var controls: js.UndefOr[CSSProperties] = js.native
  
  var hue: js.UndefOr[CSSProperties] = js.native
  
  var picker: js.UndefOr[CSSProperties] = js.native
  
  var saturation: js.UndefOr[CSSProperties] = js.native
  
  var swatch: js.UndefOr[CSSProperties] = js.native
  
  var toggles: js.UndefOr[CSSProperties] = js.native
}
object PartialChromePickerStyles {
  
  @scala.inline
  def apply(): PartialChromePickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChromePickerStyles]
  }
  
  @scala.inline
  implicit class PartialChromePickerStylesOps[Self <: PartialChromePickerStyles] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: CSSProperties): Self = this.set("Alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("Alpha", js.undefined)
    
    @scala.inline
    def setHue(value: CSSProperties): Self = this.set("Hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("Hue", js.undefined)
    
    @scala.inline
    def setSaturation(value: CSSProperties): Self = this.set("Saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("Saturation", js.undefined)
    
    @scala.inline
    def setActive(value: CSSProperties): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setBody(value: CSSProperties): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setColor(value: CSSProperties): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setControls(value: CSSProperties): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    
    @scala.inline
    def setSwatch(value: CSSProperties): Self = this.set("swatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwatch: Self = this.set("swatch", js.undefined)
    
    @scala.inline
    def setToggles(value: CSSProperties): Self = this.set("toggles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggles: Self = this.set("toggles", js.undefined)
  }
}
