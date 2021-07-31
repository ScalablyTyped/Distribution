package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var podAffinityTerm: Input[PodAffinityTerm]
  
  /**
    * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
    */
  var weight: Input[Double]
}
object WeightedPodAffinityTerm {
  
  @scala.inline
  def apply(podAffinityTerm: Input[PodAffinityTerm], weight: Input[Double]): WeightedPodAffinityTerm = {
    val __obj = js.Dynamic.literal(podAffinityTerm = podAffinityTerm.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedPodAffinityTerm]
  }
  
  @scala.inline
  implicit class WeightedPodAffinityTermMutableBuilder[Self <: WeightedPodAffinityTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPodAffinityTerm(value: Input[PodAffinityTerm]): Self = StObject.set(x, "podAffinityTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
