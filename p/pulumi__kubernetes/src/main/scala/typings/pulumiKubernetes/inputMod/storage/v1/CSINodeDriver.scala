package typings.pulumiKubernetes.inputMod.storage.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSINodeDriver holds information about the specification of one CSI driver installed on a node
  */
@js.native
trait CSINodeDriver extends js.Object {
  /**
    * allocatable represents the volume resources of a node that are available for scheduling. This field is beta.
    */
  var allocatable: js.UndefOr[Input[VolumeNodeResources]] = js.native
  /**
    * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
    */
  var name: Input[String] = js.native
  /**
    * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
    */
  var nodeID: Input[String] = js.native
  /**
    * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
    */
  var topologyKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object CSINodeDriver {
  @scala.inline
  def apply(name: Input[String], nodeID: Input[String]): CSINodeDriver = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeID = nodeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSINodeDriver]
  }
  @scala.inline
  implicit class CSINodeDriverOps[Self <: CSINodeDriver] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeID(value: Input[String]): Self = this.set("nodeID", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocatable(value: Input[VolumeNodeResources]): Self = this.set("allocatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatable: Self = this.set("allocatable", js.undefined)
    @scala.inline
    def setTopologyKeysVarargs(value: Input[String]*): Self = this.set("topologyKeys", js.Array(value :_*))
    @scala.inline
    def setTopologyKeys(value: Input[js.Array[Input[String]]]): Self = this.set("topologyKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopologyKeys: Self = this.set("topologyKeys", js.undefined)
  }
  
}

