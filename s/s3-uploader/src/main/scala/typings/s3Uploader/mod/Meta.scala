package typings.s3Uploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends js.Object {
  
  var colorSpace: String = js.native
  
  var compression: String = js.native
  
  var fileSize: String = js.native
  
  var format: String = js.native
  
  var imageSize: typings.s3Uploader.mod.imageSize = js.native
  
  var orientation: String = js.native
  
  var quallity: String = js.native
}
object Meta {
  
  @scala.inline
  def apply(
    colorSpace: String,
    compression: String,
    fileSize: String,
    format: String,
    imageSize: imageSize,
    orientation: String,
    quallity: String
  ): Meta = {
    val __obj = js.Dynamic.literal(colorSpace = colorSpace.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quallity = quallity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    
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
    def setColorSpace(value: String): Self = this.set("colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSize(value: imageSize): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuallity(value: String): Self = this.set("quallity", value.asInstanceOf[js.Any])
  }
}
