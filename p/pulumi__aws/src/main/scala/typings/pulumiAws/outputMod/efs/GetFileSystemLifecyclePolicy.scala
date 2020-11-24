package typings.pulumiAws.outputMod.efs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileSystemLifecyclePolicy extends js.Object {
  
  var transitionToIa: String = js.native
}
object GetFileSystemLifecyclePolicy {
  
  @scala.inline
  def apply(transitionToIa: String): GetFileSystemLifecyclePolicy = {
    val __obj = js.Dynamic.literal(transitionToIa = transitionToIa.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileSystemLifecyclePolicy]
  }
  
  @scala.inline
  implicit class GetFileSystemLifecyclePolicyOps[Self <: GetFileSystemLifecyclePolicy] (val x: Self) extends AnyVal {
    
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
    def setTransitionToIa(value: String): Self = this.set("transitionToIa", value.asInstanceOf[js.Any])
  }
}
