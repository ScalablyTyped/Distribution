package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipArtType extends js.Object {
  
  var clipArtType: Double = js.native
  
  var lineDrawingType: Double = js.native
}
object ClipArtType {
  
  @scala.inline
  def apply(clipArtType: Double, lineDrawingType: Double): ClipArtType = {
    val __obj = js.Dynamic.literal(clipArtType = clipArtType.asInstanceOf[js.Any], lineDrawingType = lineDrawingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipArtType]
  }
  
  @scala.inline
  implicit class ClipArtTypeOps[Self <: ClipArtType] (val x: Self) extends AnyVal {
    
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
    def setClipArtType(value: Double): Self = this.set("clipArtType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDrawingType(value: Double): Self = this.set("lineDrawingType", value.asInstanceOf[js.Any])
  }
}
