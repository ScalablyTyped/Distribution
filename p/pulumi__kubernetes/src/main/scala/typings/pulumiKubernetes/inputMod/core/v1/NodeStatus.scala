package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
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
  var addresses: js.UndefOr[Input[js.Array[Input[NodeAddress]]]] = js.native
  /**
    * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
    */
  var allocatable: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
    */
  var conditions: js.UndefOr[Input[js.Array[Input[NodeCondition]]]] = js.native
  /**
    * Status of the config assigned to the node via the dynamic Kubelet config feature.
    */
  var config: js.UndefOr[Input[NodeConfigStatus]] = js.native
  /**
    * Endpoints of daemons running on the Node.
    */
  var daemonEndpoints: js.UndefOr[Input[NodeDaemonEndpoints]] = js.native
  /**
    * List of container images on this node
    */
  var images: js.UndefOr[Input[js.Array[Input[ContainerImage]]]] = js.native
  /**
    * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
    */
  var nodeInfo: js.UndefOr[Input[NodeSystemInfo]] = js.native
  /**
    * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
    */
  var phase: js.UndefOr[Input[String]] = js.native
  /**
    * List of volumes that are attached to the node.
    */
  var volumesAttached: js.UndefOr[Input[js.Array[Input[AttachedVolume]]]] = js.native
  /**
    * List of attachable volumes in use (mounted) by the node.
    */
  var volumesInUse: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object NodeStatus {
  @scala.inline
  def apply(): NodeStatus = {
    val __obj = js.Dynamic.literal()
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
    def setAddressesVarargs(value: Input[NodeAddress]*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: Input[js.Array[Input[NodeAddress]]]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setAllocatable(value: Input[StringDictionary[Input[String]]]): Self = this.set("allocatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatable: Self = this.set("allocatable", js.undefined)
    @scala.inline
    def setCapacity(value: Input[StringDictionary[Input[String]]]): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: Input[NodeCondition]*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: Input[js.Array[Input[NodeCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setConfig(value: Input[NodeConfigStatus]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDaemonEndpoints(value: Input[NodeDaemonEndpoints]): Self = this.set("daemonEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaemonEndpoints: Self = this.set("daemonEndpoints", js.undefined)
    @scala.inline
    def setImagesVarargs(value: Input[ContainerImage]*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: Input[js.Array[Input[ContainerImage]]]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setNodeInfo(value: Input[NodeSystemInfo]): Self = this.set("nodeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeInfo: Self = this.set("nodeInfo", js.undefined)
    @scala.inline
    def setPhase(value: Input[String]): Self = this.set("phase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase: Self = this.set("phase", js.undefined)
    @scala.inline
    def setVolumesAttachedVarargs(value: Input[AttachedVolume]*): Self = this.set("volumesAttached", js.Array(value :_*))
    @scala.inline
    def setVolumesAttached(value: Input[js.Array[Input[AttachedVolume]]]): Self = this.set("volumesAttached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumesAttached: Self = this.set("volumesAttached", js.undefined)
    @scala.inline
    def setVolumesInUseVarargs(value: Input[String]*): Self = this.set("volumesInUse", js.Array(value :_*))
    @scala.inline
    def setVolumesInUse(value: Input[js.Array[Input[String]]]): Self = this.set("volumesInUse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumesInUse: Self = this.set("volumesInUse", js.undefined)
  }
  
}

