package typings.reactHtml5CameraPhoto.mod

import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.jpg
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageTypes extends js.Object {
  
  var JPG: jpg = js.native
  
  var PNG: png = js.native
}
object ImageTypes {
  
  @scala.inline
  def apply(JPG: jpg, PNG: png): ImageTypes = {
    val __obj = js.Dynamic.literal(JPG = JPG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTypes]
  }
  
  @scala.inline
  implicit class ImageTypesOps[Self <: ImageTypes] (val x: Self) extends AnyVal {
    
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
    def setJPG(value: jpg): Self = this.set("JPG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG(value: png): Self = this.set("PNG", value.asInstanceOf[js.Any])
  }
}
