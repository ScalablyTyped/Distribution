package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeStatus is information about the current status of a node.
  */
trait NodeStatus extends js.Object {
  /**
    * List of addresses reachable to the node. Queried from cloud provider, if available. More
    * info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is
    * declared as mergeable, but the merge key is not sufficiently unique, which can cause data
    * corruption when it is merged. Callers should instead use a full-replacement patch. See
    * http://pr.k8s.io/79391 for an example.
    */
  var addresses: js.UndefOr[Input[js.Array[Input[NodeAddress]]]] = js.undefined
  /**
    * Allocatable represents the resources of a node that are available for scheduling. Defaults
    * to Capacity.
    */
  var allocatable: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Capacity represents the total resources of a node. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Conditions is an array of current observed node conditions. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#condition
    */
  var conditions: js.UndefOr[Input[js.Array[Input[NodeCondition]]]] = js.undefined
  /**
    * Status of the config assigned to the node via the dynamic Kubelet config feature.
    */
  var config: js.UndefOr[Input[NodeConfigStatus]] = js.undefined
  /**
    * Endpoints of daemons running on the Node.
    */
  var daemonEndpoints: js.UndefOr[Input[NodeDaemonEndpoints]] = js.undefined
  /**
    * List of container images on this node
    */
  var images: js.UndefOr[Input[js.Array[Input[ContainerImage]]]] = js.undefined
  /**
    * Set of ids/uuids to uniquely identify the node. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#info
    */
  var nodeInfo: js.UndefOr[Input[NodeSystemInfo]] = js.undefined
  /**
    * NodePhase is the recently observed lifecycle phase of the node. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now
    * is deprecated.
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of volumes that are attached to the node.
    */
  var volumesAttached: js.UndefOr[Input[js.Array[Input[AttachedVolume]]]] = js.undefined
  /**
    * List of attachable volumes in use (mounted) by the node.
    */
  var volumesInUse: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object NodeStatus {
  @scala.inline
  def apply(
    addresses: Input[js.Array[Input[NodeAddress]]] = null,
    allocatable: Input[js.Object] = null,
    capacity: Input[js.Object] = null,
    conditions: Input[js.Array[Input[NodeCondition]]] = null,
    config: Input[NodeConfigStatus] = null,
    daemonEndpoints: Input[NodeDaemonEndpoints] = null,
    images: Input[js.Array[Input[ContainerImage]]] = null,
    nodeInfo: Input[NodeSystemInfo] = null,
    phase: Input[String] = null,
    volumesAttached: Input[js.Array[Input[AttachedVolume]]] = null,
    volumesInUse: Input[js.Array[Input[String]]] = null
  ): NodeStatus = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (allocatable != null) __obj.updateDynamic("allocatable")(allocatable.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (daemonEndpoints != null) __obj.updateDynamic("daemonEndpoints")(daemonEndpoints.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (nodeInfo != null) __obj.updateDynamic("nodeInfo")(nodeInfo.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    if (volumesAttached != null) __obj.updateDynamic("volumesAttached")(volumesAttached.asInstanceOf[js.Any])
    if (volumesInUse != null) __obj.updateDynamic("volumesInUse")(volumesInUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatus]
  }
}

