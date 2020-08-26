package typings.pulumiAws.inputMod.datasync

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NfsLocationOnPremConfig extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
    */
  var agentArns: Input[js.Array[Input[String]]] = js.native
}

object NfsLocationOnPremConfig {
  @scala.inline
  def apply(agentArns: Input[js.Array[Input[String]]]): NfsLocationOnPremConfig = {
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
    def setAgentArnsVarargs(value: Input[String]*): Self = this.set("agentArns", js.Array(value :_*))
    @scala.inline
    def setAgentArns(value: Input[js.Array[Input[String]]]): Self = this.set("agentArns", value.asInstanceOf[js.Any])
  }
  
}

