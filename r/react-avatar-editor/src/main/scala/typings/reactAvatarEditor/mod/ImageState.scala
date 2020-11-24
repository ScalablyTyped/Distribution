package typings.reactAvatarEditor.mod

import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageState extends CroppedRect {
  
  var resource: ImageData = js.native
}
object ImageState {
  
  @scala.inline
  def apply(height: Double, resource: ImageData, width: Double, x: Double, y: Double): ImageState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageState]
  }
  
  @scala.inline
  implicit class ImageStateOps[Self <: ImageState] (val x: Self) extends AnyVal {
    
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
    def setResource(value: ImageData): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
}
