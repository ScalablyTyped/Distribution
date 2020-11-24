package typings.pulumiAws.outputMod.datasync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NfsLocationOnPremConfig extends js.Object {
  
  /**
    * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
    */
  var agentArns: js.Array[String] = js.native
}
object NfsLocationOnPremConfig {
  
  @scala.inline
  def apply(agentArns: js.Array[String]): NfsLocationOnPremConfig = {
    val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsLocationOnPremConfig]
  }
  
  @scala.inline
  implicit class NfsLocationOnPremConfigOps[Self <: NfsLocationOnPremConfig] (val x: Self) extends AnyVal {
    
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
    def setAgentArnsVarargs(value: String*): Self = this.set("agentArns", js.Array(value :_*))
    
    @scala.inline
    def setAgentArns(value: js.Array[String]): Self = this.set("agentArns", value.asInstanceOf[js.Any])
  }
}
