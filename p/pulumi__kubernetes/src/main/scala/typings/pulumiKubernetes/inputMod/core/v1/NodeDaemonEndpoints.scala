package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
  */
@js.native
trait NodeDaemonEndpoints extends StObject {
  
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
  implicit class NodeDaemonEndpointsMutableBuilder[Self <: NodeDaemonEndpoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKubeletEndpoint(value: Input[DaemonEndpoint]): Self = StObject.set(x, "kubeletEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubeletEndpointUndefined: Self = StObject.set(x, "kubeletEndpoint", js.undefined)
  }
}
