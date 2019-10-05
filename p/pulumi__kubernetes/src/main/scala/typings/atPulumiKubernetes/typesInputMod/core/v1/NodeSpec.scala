package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var configSource: js.UndefOr[Input[NodeConfigSource]] = js.undefined
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see:
    * https://issues.k8s.io/61966
    */
  var externalID: js.UndefOr[Input[String]] = js.undefined
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  var podCIDR: js.UndefOr[Input[String]] = js.undefined
  /**
    * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If
    * this field is specified, the 0th entry must match the podCIDR field. It may contain at most
    * 1 value for each of IPv4 and IPv6.
    */
  var podCIDRs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * ID of the node assigned by the cloud provider in the format:
    * <ProviderName>://<ProviderSpecificNodeID>
    */
  var providerID: js.UndefOr[Input[String]] = js.undefined
  /**
    * If specified, the node's taints.
    */
  var taints: js.UndefOr[Input[js.Array[Input[Taint]]]] = js.undefined
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable.
    * More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
    */
  var unschedulable: js.UndefOr[Input[Boolean]] = js.undefined
}

object NodeSpec {
  @scala.inline
  def apply(
    configSource: Input[NodeConfigSource] = null,
    externalID: Input[String] = null,
    podCIDR: Input[String] = null,
    podCIDRs: Input[js.Array[Input[String]]] = null,
    providerID: Input[String] = null,
    taints: Input[js.Array[Input[Taint]]] = null,
    unschedulable: Input[Boolean] = null
  ): NodeSpec = {
    val __obj = js.Dynamic.literal()
    if (configSource != null) __obj.updateDynamic("configSource")(configSource.asInstanceOf[js.Any])
    if (externalID != null) __obj.updateDynamic("externalID")(externalID.asInstanceOf[js.Any])
    if (podCIDR != null) __obj.updateDynamic("podCIDR")(podCIDR.asInstanceOf[js.Any])
    if (podCIDRs != null) __obj.updateDynamic("podCIDRs")(podCIDRs.asInstanceOf[js.Any])
    if (providerID != null) __obj.updateDynamic("providerID")(providerID.asInstanceOf[js.Any])
    if (taints != null) __obj.updateDynamic("taints")(taints.asInstanceOf[js.Any])
    if (unschedulable != null) __obj.updateDynamic("unschedulable")(unschedulable.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSpec]
  }
}

