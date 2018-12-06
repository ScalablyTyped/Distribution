package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * A null or empty node selector term matches no objects. The requirements of them are ANDed.
         * The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
         */

trait NodeSelectorTerm extends js.Object {
  /**
               * A list of node selector requirements by node's labels.
               */
  val matchExpressions: js.Array[NodeSelectorRequirement]
  /**
               * A list of node selector requirements by node's fields.
               */
  val matchFields: js.Array[NodeSelectorRequirement]
}

