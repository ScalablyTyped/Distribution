package typings.reactFileIcon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileIconProps extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var extension: js.UndefOr[String] = js.native
  
  var fold: js.UndefOr[Boolean] = js.native
  
  var foldColor: js.UndefOr[String] = js.native
  
  var glyphColor: js.UndefOr[String] = js.native
  
  var gradientColor: js.UndefOr[String] = js.native
  
  var gradientOpacity: js.UndefOr[Double] = js.native
  
  var labelColor: js.UndefOr[String] = js.native
  
  var labelTextColor: js.UndefOr[String] = js.native
  
  var labelTextStyle: js.UndefOr[js.Object] = js.native
  
  var labelUppercase: js.UndefOr[Boolean] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[IconType] = js.native
}
object FileIconProps {
  
  @scala.inline
  def apply(): FileIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileIconProps]
  }
  
  @scala.inline
  implicit class FileIconPropsOps[Self <: FileIconProps] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFold(value: Boolean): Self = this.set("fold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFold: Self = this.set("fold", js.undefined)
    
    @scala.inline
    def setFoldColor(value: String): Self = this.set("foldColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldColor: Self = this.set("foldColor", js.undefined)
    
    @scala.inline
    def setGlyphColor(value: String): Self = this.set("glyphColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphColor: Self = this.set("glyphColor", js.undefined)
    
    @scala.inline
    def setGradientColor(value: String): Self = this.set("gradientColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientColor: Self = this.set("gradientColor", js.undefined)
    
    @scala.inline
    def setGradientOpacity(value: Double): Self = this.set("gradientOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientOpacity: Self = this.set("gradientOpacity", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelTextColor(value: String): Self = this.set("labelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTextColor: Self = this.set("labelTextColor", js.undefined)
    
    @scala.inline
    def setLabelTextStyle(value: js.Object): Self = this.set("labelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTextStyle: Self = this.set("labelTextStyle", js.undefined)
    
    @scala.inline
    def setLabelUppercase(value: Boolean): Self = this.set("labelUppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelUppercase: Self = this.set("labelUppercase", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setType(value: IconType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
