package typings.projectOxford.mod.FaceResponses

import typings.projectOxford.anon.Confidence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identify extends js.Object {
  
  var candidates: js.Array[Confidence] = js.native
  
  var faceId: String = js.native
}
object Identify {
  
  @scala.inline
  def apply(candidates: js.Array[Confidence], faceId: String): Identify = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identify]
  }
  
  @scala.inline
  implicit class IdentifyOps[Self <: Identify] (val x: Self) extends AnyVal {
    
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
    def setCandidatesVarargs(value: Confidence*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[Confidence]): Self = this.set("candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceId(value: String): Self = this.set("faceId", value.asInstanceOf[js.Any])
  }
}
