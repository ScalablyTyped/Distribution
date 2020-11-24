package typings.projectOxford.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identify extends js.Object {
  
  var maxNumOfCandidatesReturned: Double = js.native
  
  var personGroupId: String = js.native
}
object Identify {
  
  @scala.inline
  def apply(maxNumOfCandidatesReturned: Double, personGroupId: String): Identify = {
    val __obj = js.Dynamic.literal(maxNumOfCandidatesReturned = maxNumOfCandidatesReturned.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any])
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
    def setMaxNumOfCandidatesReturned(value: Double): Self = this.set("maxNumOfCandidatesReturned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonGroupId(value: String): Self = this.set("personGroupId", value.asInstanceOf[js.Any])
  }
}
