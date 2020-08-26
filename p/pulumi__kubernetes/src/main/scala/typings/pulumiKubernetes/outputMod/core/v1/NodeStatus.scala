package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeStatus is information about the current status of a node.
  */
@js.native
trait NodeStatus extends js.Object {
  /**
    * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
    */
  var addresses: js.Array[NodeAddress] = js.native
  /**
    * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
    */
  var allocatable: StringDictionary[String] = js.native
  /**
    * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: StringDictionary[String] = js.native
  /**
    * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
    */
  var conditions: js.Array[NodeCondition] = js.native
  /**
    * Status of the config assigned to the node via the dynamic Kubelet config feature.
    */
  var config: NodeConfigStatus = js.native
  /**
    * Endpoints of daemons running on the Node.
    */
  var daemonEndpoints: NodeDaemonEndpoints = js.native
  /**
    * List of container images on this node
    */
  var images: js.Array[ContainerImage] = js.native
  /**
    * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
    */
  var nodeInfo: NodeSystemInfo = js.native
  /**
    * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
    */
  var phase: String = js.native
  /**
    * List of volumes that are attached to the node.
    */
  var volumesAttached: js.Array[AttachedVolume] = js.native
  /**
    * List of attachable volumes in use (mounted) by the node.
    */
  var volumesInUse: js.Array[String] = js.native
}

object NodeStatus {
  @scala.inline
  def apply(
    addresses: js.Array[NodeAddress],
    allocatable: StringDictionary[String],
    capacity: StringDictionary[String],
    conditions: js.Array[NodeCondition],
    config: NodeConfigStatus,
    daemonEndpoints: NodeDaemonEndpoints,
    images: js.Array[ContainerImage],
    nodeInfo: NodeSystemInfo,
    phase: String,
    volumesAttached: js.Array[AttachedVolume],
    volumesInUse: js.Array[String]
  ): NodeStatus = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], allocatable = allocatable.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], daemonEndpoints = daemonEndpoints.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], nodeInfo = nodeInfo.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], volumesAttached = volumesAttached.asInstanceOf[js.Any], volumesInUse = volumesInUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatus]
  }
  @scala.inline
  implicit class NodeStatusOps[Self <: NodeStatus] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: NodeAddress*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[NodeAddress]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocatable(value: StringDictionary[String]): Self = this.set("allocatable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapacity(value: StringDictionary[String]): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: NodeCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[NodeCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: NodeConfigStatus): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaemonEndpoints(value: NodeDaemonEndpoints): Self = this.set("daemonEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: ContainerImage*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[ContainerImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeInfo(value: NodeSystemInfo): Self = this.set("nodeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhase(value: String): Self = this.set("phase", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumesAttachedVarargs(value: AttachedVolume*): Self = this.set("volumesAttached", js.Array(value :_*))
    @scala.inline
    def setVolumesAttached(value: js.Array[AttachedVolume]): Self = this.set("volumesAttached", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumesInUseVarargs(value: String*): Self = this.set("volumesInUse", js.Array(value :_*))
    @scala.inline
    def setVolumesInUse(value: js.Array[String]): Self = this.set("volumesInUse", value.asInstanceOf[js.Any])
  }
  
}

