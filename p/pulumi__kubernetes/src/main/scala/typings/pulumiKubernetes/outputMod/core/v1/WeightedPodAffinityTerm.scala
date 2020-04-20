package typings.pulumiKubernetes.outputMod.core.v1

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
  val weight: Double
}

object WeightedPodAffinityTerm {
  @scala.inline
  def apply(podAffinityTerm: PodAffinityTerm, weight: Double): WeightedPodAffinityTerm = {
    val __obj = js.Dynamic.literal(podAffinityTerm = podAffinityTerm.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedPodAffinityTerm]
  }
}

