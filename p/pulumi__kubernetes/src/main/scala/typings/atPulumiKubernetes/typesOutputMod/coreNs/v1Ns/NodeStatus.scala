package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val addresses: js.Array[NodeAddress]
  /**
    * Allocatable represents the resources of a node that are available for scheduling. Defaults
    * to Capacity.
    */
  val allocatable: js.Object
  /**
    * Capacity represents the total resources of a node. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  val capacity: js.Object
  /**
    * Conditions is an array of current observed node conditions. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#condition
    */
  val conditions: js.Array[NodeCondition]
  /**
    * Status of the config assigned to the node via the dynamic Kubelet config feature.
    */
  val config: NodeConfigStatus
  /**
    * Endpoints of daemons running on the Node.
    */
  val daemonEndpoints: NodeDaemonEndpoints
  /**
    * List of container images on this node
    */
  val images: js.Array[ContainerImage]
  /**
    * Set of ids/uuids to uniquely identify the node. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#info
    */
  val nodeInfo: NodeSystemInfo
  /**
    * NodePhase is the recently observed lifecycle phase of the node. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now
    * is deprecated.
    */
  val phase: String
  /**
    * List of volumes that are attached to the node.
    */
  val volumesAttached: js.Array[AttachedVolume]
  /**
    * List of attachable volumes in use (mounted) by the node.
    */
  val volumesInUse: js.Array[String]
}

object NodeStatus {
  @scala.inline
  def apply(
    addresses: js.Array[NodeAddress],
    allocatable: js.Object,
    capacity: js.Object,
    conditions: js.Array[NodeCondition],
    config: NodeConfigStatus,
    daemonEndpoints: NodeDaemonEndpoints,
    images: js.Array[ContainerImage],
    nodeInfo: NodeSystemInfo,
    phase: String,
    volumesAttached: js.Array[AttachedVolume],
    volumesInUse: js.Array[String]
  ): NodeStatus = {
    val __obj = js.Dynamic.literal(addresses = addresses, allocatable = allocatable, capacity = capacity, conditions = conditions, config = config, daemonEndpoints = daemonEndpoints, images = images, nodeInfo = nodeInfo, phase = phase, volumesAttached = volumesAttached, volumesInUse = volumesInUse)
  
    __obj.asInstanceOf[NodeStatus]
  }
}

