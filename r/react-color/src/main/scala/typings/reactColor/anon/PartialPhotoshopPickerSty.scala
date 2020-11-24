package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/photoshop/Photoshop.PhotoshopPickerStylesProps> */
@js.native
trait PartialPhotoshopPickerSty extends js.Object {
  
  var actions: js.UndefOr[CSSProperties] = js.native
  
  var body: js.UndefOr[CSSProperties] = js.native
  
  var controls: js.UndefOr[CSSProperties] = js.native
  
  var head: js.UndefOr[CSSProperties] = js.native
  
  var hue: js.UndefOr[CSSProperties] = js.native
  
  var picker: js.UndefOr[CSSProperties] = js.native
  
  var previews: js.UndefOr[CSSProperties] = js.native
  
  var saturation: js.UndefOr[CSSProperties] = js.native
  
  var top: js.UndefOr[CSSProperties] = js.native
}
object PartialPhotoshopPickerSty {
  
  @scala.inline
  def apply(): PartialPhotoshopPickerSty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPhotoshopPickerSty]
  }
  
  @scala.inline
  implicit class PartialPhotoshopPickerStyOps[Self <: PartialPhotoshopPickerSty] (val x: Self) extends AnyVal {
    
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
    def setActions(value: CSSProperties): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setBody(value: CSSProperties): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setControls(value: CSSProperties): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setHead(value: CSSProperties): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setHue(value: CSSProperties): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    
    @scala.inline
    def setPreviews(value: CSSProperties): Self = this.set("previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviews: Self = this.set("previews", js.undefined)
    
    @scala.inline
    def setSaturation(value: CSSProperties): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
    
    @scala.inline
    def setTop(value: CSSProperties): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
