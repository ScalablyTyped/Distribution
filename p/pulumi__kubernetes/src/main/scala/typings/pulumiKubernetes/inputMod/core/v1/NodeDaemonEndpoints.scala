package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
  */
@js.native
trait NodeDaemonEndpoints extends js.Object {
  
  /**
    * Endpoint on which Kubelet is listening.
    */
  var kubeletEndpoint: js.UndefOr[Input[DaemonEndpoint]] = js.native
}
object NodeDaemonEndpoints {
  
  @scala.inline
  def apply(): NodeDaemonEndpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDaemonEndpoints]
  }
  
  @scala.inline
  implicit class NodeDaemonEndpointsOps[Self <: NodeDaemonEndpoints] (val x: Self) extends AnyVal {
    
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
    def setKubeletEndpoint(value: Input[DaemonEndpoint]): Self = this.set("kubeletEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubeletEndpoint: Self = this.set("kubeletEndpoint", js.undefined)
  }
}
