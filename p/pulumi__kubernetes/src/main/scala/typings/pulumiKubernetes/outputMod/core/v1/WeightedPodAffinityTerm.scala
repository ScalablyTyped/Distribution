package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
  */
trait WeightedPodAffinityTerm extends StObject {
  
  /**
    * Required. A pod affinity term, associated with the corresponding weight.
    */
  var podAffinityTerm: PodAffinityTerm
  
  /**
    * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
    */
  var weight: Double
}
object WeightedPodAffinityTerm {
  
  @scala.inline
  def apply(podAffinityTerm: PodAffinityTerm, weight: Double): WeightedPodAffinityTerm = {
    val __obj = js.Dynamic.literal(podAffinityTerm = podAffinityTerm.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedPodAffinityTerm]
  }
  
  @scala.inline
  implicit class WeightedPodAffinityTermMutableBuilder[Self <: WeightedPodAffinityTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPodAffinityTerm(value: PodAffinityTerm): Self = StObject.set(x, "podAffinityTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
