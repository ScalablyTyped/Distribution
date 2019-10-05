package typings.atPulumiKubernetes.typesInputMod.networking.v1

import typings.atPulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of fields
  * are allowed
  */
trait NetworkPolicyPeer extends js.Object {
  /**
    * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the
    * other fields can be.
    */
  var ipBlock: js.UndefOr[Input[IPBlock]] = js.undefined
  /**
    * Selects Namespaces using cluster-scoped labels. This field follows standard label selector
    * semantics; if present but empty, it selects all namespaces.
    *
    * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
    * PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods
    * in the Namespaces selected by NamespaceSelector.
    */
  var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * This is a label selector which selects Pods. This field follows standard label selector
    * semantics; if present but empty, it selects all pods.
    *
    * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
    * matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects
    * the Pods matching PodSelector in the policy's own Namespace.
    */
  var podSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
}

object NetworkPolicyPeer {
  @scala.inline
  def apply(
    ipBlock: Input[IPBlock] = null,
    namespaceSelector: Input[LabelSelector] = null,
    podSelector: Input[LabelSelector] = null
  ): NetworkPolicyPeer = {
    val __obj = js.Dynamic.literal()
    if (ipBlock != null) __obj.updateDynamic("ipBlock")(ipBlock.asInstanceOf[js.Any])
    if (namespaceSelector != null) __obj.updateDynamic("namespaceSelector")(namespaceSelector.asInstanceOf[js.Any])
    if (podSelector != null) __obj.updateDynamic("podSelector")(podSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyPeer]
  }
}

