package typings.pulumiAws.getDelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDelegationSetResult extends js.Object {
  
  val callerReference: String = js.native
  
  val id: String = js.native
  
  val nameServers: js.Array[String] = js.native
}
object GetDelegationSetResult {
  
  @scala.inline
  def apply(callerReference: String, id: String, nameServers: js.Array[String]): GetDelegationSetResult = {
    val __obj = js.Dynamic.literal(callerReference = callerReference.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nameServers = nameServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDelegationSetResult]
  }
  
  @scala.inline
  implicit class GetDelegationSetResultOps[Self <: GetDelegationSetResult] (val x: Self) extends AnyVal {
    
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
    def setCallerReference(value: String): Self = this.set("callerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServersVarargs(value: String*): Self = this.set("nameServers", js.Array(value :_*))
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
  }
}
