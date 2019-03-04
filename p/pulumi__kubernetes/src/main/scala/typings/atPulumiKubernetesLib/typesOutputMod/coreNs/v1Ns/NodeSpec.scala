package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeSpec describes the attributes that a node is created with.
  */
trait NodeSpec extends js.Object {
  /**
    * If specified, the source to get node configuration from The DynamicKubeletConfig feature
    * gate must be enabled for the Kubelet to use this field
    */
  val configSource: NodeConfigSource
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see:
    * https://issues.k8s.io/61966
    */
  val externalID: java.lang.String
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  val podCIDR: java.lang.String
  /**
    * ID of the node assigned by the cloud provider in the format:
    * <ProviderName>://<ProviderSpecificNodeID>
    */
  val providerID: java.lang.String
  /**
    * If specified, the node's taints.
    */
  val taints: js.Array[Taint]
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable.
    * More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
    */
  val unschedulable: scala.Boolean
}

object NodeSpec {
  @scala.inline
  def apply(
    configSource: NodeConfigSource,
    externalID: java.lang.String,
    podCIDR: java.lang.String,
    providerID: java.lang.String,
    taints: js.Array[Taint],
    unschedulable: scala.Boolean
  ): NodeSpec = {
    val __obj = js.Dynamic.literal(configSource = configSource, externalID = externalID, podCIDR = podCIDR, providerID = providerID, taints = taints, unschedulable = unschedulable)
  
    __obj.asInstanceOf[NodeSpec]
  }
}

