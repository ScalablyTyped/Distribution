package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSINodeDriver holds information about the specification of one CSI driver installed on a node
  */
trait CSINodeDriver extends js.Object {
  /**
    * This is the name of the CSI driver that this object refers to. This MUST be the same name
    * returned by the CSI GetPluginName() call for that driver.
    */
  val name: java.lang.String
  /**
    * nodeID of the node from the driver point of view. This field enables Kubernetes to
    * communicate with storage systems that do not share the same nomenclature for nodes. For
    * example, Kubernetes may refer to a given node as "node1", but the storage system may refer
    * to the same node as "nodeA". When Kubernetes issues a command to the storage system to
    * attach a volume to a specific node, it can use this field to refer to the node name using
    * the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field
    * is required.
    */
  val nodeID: java.lang.String
  /**
    * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a
    * cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone",
    * "company.com/region"). When a driver is initialized on a node, it provides the same
    * topology keys along with values. Kubelet will expose these topology keys as labels on its
    * own node object. When Kubernetes does topology aware provisioning, it can use this list to
    * determine which labels it should retrieve from the node object and pass back to the driver.
    * It is possible for different nodes to use different topology keys. This can be empty if
    * driver does not support topology.
    */
  val topologyKeys: js.Array[java.lang.String]
}

object CSINodeDriver {
  @scala.inline
  def apply(name: java.lang.String, nodeID: java.lang.String, topologyKeys: js.Array[java.lang.String]): CSINodeDriver = {
    val __obj = js.Dynamic.literal(name = name, nodeID = nodeID, topologyKeys = topologyKeys)
  
    __obj.asInstanceOf[CSINodeDriver]
  }
}

