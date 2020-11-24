package typings.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Verify extends js.Object {
  
  var confidence: Double = js.native
  
  var isIdentical: Boolean = js.native
}
object Verify {
  
  @scala.inline
  def apply(confidence: Double, isIdentical: Boolean): Verify = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], isIdentical = isIdentical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verify]
  }
  
  @scala.inline
  implicit class VerifyOps[Self <: Verify] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdentical(value: Boolean): Self = this.set("isIdentical", value.asInstanceOf[js.Any])
  }
}
