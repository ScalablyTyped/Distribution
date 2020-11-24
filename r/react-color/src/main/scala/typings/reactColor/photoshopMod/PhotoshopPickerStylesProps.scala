package typings.reactColor.photoshopMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoshopPickerStylesProps extends js.Object {
  
  var actions: CSSProperties = js.native
  
  var body: CSSProperties = js.native
  
  var controls: CSSProperties = js.native
  
  var head: CSSProperties = js.native
  
  var hue: CSSProperties = js.native
  
  var picker: CSSProperties = js.native
  
  var previews: CSSProperties = js.native
  
  var saturation: CSSProperties = js.native
  
  var top: CSSProperties = js.native
}
object PhotoshopPickerStylesProps {
  
  @scala.inline
  def apply(
    actions: CSSProperties,
    body: CSSProperties,
    controls: CSSProperties,
    head: CSSProperties,
    hue: CSSProperties,
    picker: CSSProperties,
    previews: CSSProperties,
    saturation: CSSProperties,
    top: CSSProperties
  ): PhotoshopPickerStylesProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopPickerStylesProps]
  }
  
  @scala.inline
  implicit class PhotoshopPickerStylesPropsOps[Self <: PhotoshopPickerStylesProps] (val x: Self) extends AnyVal {
    
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
    def setBody(value: CSSProperties): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: CSSProperties): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead(value: CSSProperties): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: CSSProperties): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviews(value: CSSProperties): Self = this.set("previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: CSSProperties): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: CSSProperties): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}
