package typings.qrcodeReact.mod

import typings.qrcodeReact.qrcodeReactStrings.H
import typings.qrcodeReact.qrcodeReactStrings.L
import typings.qrcodeReact.qrcodeReactStrings.M
import typings.qrcodeReact.qrcodeReactStrings.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseQRCodeProps extends js.Object {
  
  var bgColor: js.UndefOr[String] = js.native
  
  var fgColor: js.UndefOr[String] = js.native
  
  var imageSettings: js.UndefOr[ImageSettings] = js.native
  
  var includeMargin: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[L | M | Q | H] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var value: String = js.native
}
object BaseQRCodeProps {
  
  @scala.inline
  def apply(value: String): BaseQRCodeProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQRCodeProps]
  }
  
  @scala.inline
  implicit class BaseQRCodePropsOps[Self <: BaseQRCodeProps] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setFgColor(value: String): Self = this.set("fgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFgColor: Self = this.set("fgColor", js.undefined)
    
    @scala.inline
    def setImageSettings(value: ImageSettings): Self = this.set("imageSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSettings: Self = this.set("imageSettings", js.undefined)
    
    @scala.inline
    def setIncludeMargin(value: Boolean): Self = this.set("includeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeMargin: Self = this.set("includeMargin", js.undefined)
    
    @scala.inline
    def setLevel(value: L | M | Q | H): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
