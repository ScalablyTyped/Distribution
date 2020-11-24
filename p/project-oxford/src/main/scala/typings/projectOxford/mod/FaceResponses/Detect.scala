package typings.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detect extends js.Object {
  
  var attributes: Attributes = js.native
  
  var faceId: String = js.native
  
  var faceLandmarks: FaceLandmarks = js.native
  
  var faceRectangle: FaceRectangle = js.native
}
object Detect {
  
  @scala.inline
  def apply(attributes: Attributes, faceId: String, faceLandmarks: FaceLandmarks, faceRectangle: FaceRectangle): Detect = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any], faceLandmarks = faceLandmarks.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detect]
  }
  
  @scala.inline
  implicit class DetectOps[Self <: Detect] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceId(value: String): Self = this.set("faceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceLandmarks(value: FaceLandmarks): Self = this.set("faceLandmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceRectangle(value: FaceRectangle): Self = this.set("faceRectangle", value.asInstanceOf[js.Any])
  }
}
