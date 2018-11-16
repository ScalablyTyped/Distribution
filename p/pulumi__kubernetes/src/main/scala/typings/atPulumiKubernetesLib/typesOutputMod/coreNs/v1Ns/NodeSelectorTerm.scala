package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * A null or empty node selector term matches no objects.
         */

trait NodeSelectorTerm extends js.Object {
  /**
               * Required. A list of node selector requirements. The requirements are ANDed.
               */
  val matchExpressions: js.Array[NodeSelectorRequirement]
}

