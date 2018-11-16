package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find
         * the most preferred node(s)
         */

trait WeightedPodAffinityTerm extends js.Object {
  /**
               * Required. A pod affinity term, associated with the corresponding weight.
               */
  val podAffinityTerm: PodAffinityTerm
  /**
               * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
               */
  val weight: scala.Double
}

