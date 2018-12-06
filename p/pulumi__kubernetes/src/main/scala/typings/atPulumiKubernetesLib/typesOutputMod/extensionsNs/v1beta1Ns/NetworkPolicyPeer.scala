package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by
         * networking/v1/NetworkPolicyPeer.
         */

trait NetworkPolicyPeer extends js.Object {
  /**
               * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the
               * other fields can be.
               */
  val ipBlock: IPBlock
  /**
               * Selects Namespaces using cluster-scoped labels. This field follows standard label selector
               * semantics; if present but empty, it selects all namespaces.
               *
               * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
               * PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods
               * in the Namespaces selected by NamespaceSelector.
               */
  val namespaceSelector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
               * This is a label selector which selects Pods. This field follows standard label selector
               * semantics; if present but empty, it selects all pods.
               *
               * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
               * matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects
               * the Pods matching PodSelector in the policy's own Namespace.
               */
  val podSelector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
}

