package typings.projectOxford.mod.Options

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thumbnail extends js.Object {
  
   // Width of the thumb in pixels
  var height: js.UndefOr[Double] = js.native
  
   // Url to image to be thumbnailed
  var path: js.UndefOr[String] = js.native
  
   // Should SmartCropping be enabled?
  var pipe: js.UndefOr[Writable] = js.native
  
   // Height of the thumb in pixels
  var smartCropping: js.UndefOr[Boolean] = js.native
  
  var url: js.UndefOr[String] = js.native
  
   // Path to image to be thumbnailed
  var width: js.UndefOr[Double] = js.native
}
object Thumbnail {
  
  @scala.inline
  def apply(): Thumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnail]
  }
  
  @scala.inline
  implicit class ThumbnailOps[Self <: Thumbnail] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPipe(value: Writable): Self = this.set("pipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipe: Self = this.set("pipe", js.undefined)
    
    @scala.inline
    def setSmartCropping(value: Boolean): Self = this.set("smartCropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartCropping: Self = this.set("smartCropping", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
