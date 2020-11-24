package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmapOptions extends js.Object {
  
  var colorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.native
  
  var imageOrientation: js.UndefOr[ImageOrientation] = js.native
  
  var premultiplyAlpha: js.UndefOr[PremultiplyAlpha] = js.native
  
  var resizeHeight: js.UndefOr[Double] = js.native
  
  var resizeQuality: js.UndefOr[ResizeQuality] = js.native
  
  var resizeWidth: js.UndefOr[Double] = js.native
}
object ImageBitmapOptions {
  
  @scala.inline
  def apply(): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapOptions]
  }
  
  @scala.inline
  implicit class ImageBitmapOptionsOps[Self <: ImageBitmapOptions] (val x: Self) extends AnyVal {
    
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
    def setColorSpaceConversion(value: ColorSpaceConversion): Self = this.set("colorSpaceConversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpaceConversion: Self = this.set("colorSpaceConversion", js.undefined)
    
    @scala.inline
    def setImageOrientation(value: ImageOrientation): Self = this.set("imageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOrientation: Self = this.set("imageOrientation", js.undefined)
    
    @scala.inline
    def setPremultiplyAlpha(value: PremultiplyAlpha): Self = this.set("premultiplyAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremultiplyAlpha: Self = this.set("premultiplyAlpha", js.undefined)
    
    @scala.inline
    def setResizeHeight(value: Double): Self = this.set("resizeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHeight: Self = this.set("resizeHeight", js.undefined)
    
    @scala.inline
    def setResizeQuality(value: ResizeQuality): Self = this.set("resizeQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeQuality: Self = this.set("resizeQuality", js.undefined)
    
    @scala.inline
    def setResizeWidth(value: Double): Self = this.set("resizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeWidth: Self = this.set("resizeWidth", js.undefined)
  }
}
