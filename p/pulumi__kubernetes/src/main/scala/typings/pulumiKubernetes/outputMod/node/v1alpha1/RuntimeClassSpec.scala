package typings.pulumiKubernetes.outputMod.node.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
  */
@js.native
trait RuntimeClassSpec extends js.Object {
  
  /**
    * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
    */
  var overhead: Overhead = js.native
  
  /**
    * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
    */
  var runtimeHandler: String = js.native
  
  /**
    * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
    */
  var scheduling: Scheduling = js.native
}
object RuntimeClassSpec {
  
  @scala.inline
  def apply(overhead: Overhead, runtimeHandler: String, scheduling: Scheduling): RuntimeClassSpec = {
    val __obj = js.Dynamic.literal(overhead = overhead.asInstanceOf[js.Any], runtimeHandler = runtimeHandler.asInstanceOf[js.Any], scheduling = scheduling.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeClassSpec]
  }
  
  @scala.inline
  implicit class RuntimeClassSpecOps[Self <: RuntimeClassSpec] (val x: Self) extends AnyVal {
    
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
    def setOverhead(value: Overhead): Self = this.set("overhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeHandler(value: String): Self = this.set("runtimeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduling(value: Scheduling): Self = this.set("scheduling", value.asInstanceOf[js.Any])
  }
}
