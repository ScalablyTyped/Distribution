package typings.reactNativeImageGallery.mod

import typings.reactNativeImageGallery.anon.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteImage extends Image {
  
  var dimensions: js.UndefOr[ImageDimensions] = js.native
  
  var source: Uri = js.native
}
object RemoteImage {
  
  @scala.inline
  def apply(source: Uri): RemoteImage = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteImage]
  }
  
  @scala.inline
  implicit class RemoteImageOps[Self <: RemoteImage] (val x: Self) extends AnyVal {
    
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
    def setSource(value: Uri): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: ImageDimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
  }
}
