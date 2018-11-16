package typings
package atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * NetworkPolicyPeer describes a peer to allow traffic from. Exactly one of its fields must be
         * specified.
         */

trait NetworkPolicyPeer extends js.Object {
  /**
               * IPBlock defines policy on a particular IPBlock
               */
  val ipBlock: IPBlock
  /**
               * Selects Namespaces using cluster scoped-labels. This matches all pods in all namespaces
               * selected by this label selector. This field follows standard label selector semantics. If
               * present but empty, this selector selects all namespaces.
               */
  val namespaceSelector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
               * This is a label selector which selects Pods in this namespace. This field follows standard
               * label selector semantics. If present but empty, this selector selects all pods in this
               * namespace.
               */
  val podSelector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
}

