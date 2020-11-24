package typings.reactNativeImageGallery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalImage extends Image {
  
  var dimensions: ImageDimensions = js.native
  
  var source: Double = js.native
}
object LocalImage {
  
  @scala.inline
  def apply(dimensions: ImageDimensions, source: Double): LocalImage = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalImage]
  }
  
  @scala.inline
  implicit class LocalImageOps[Self <: LocalImage] (val x: Self) extends AnyVal {
    
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
    def setDimensions(value: ImageDimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Double): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
