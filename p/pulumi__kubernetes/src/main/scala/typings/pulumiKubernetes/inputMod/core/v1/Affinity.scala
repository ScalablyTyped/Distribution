package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Affinity is a group of affinity scheduling rules.
  */
@js.native
trait Affinity extends StObject {
  
  /**
    * Describes node affinity scheduling rules for the pod.
    */
  var nodeAffinity: js.UndefOr[Input[NodeAffinity]] = js.native
  
  /**
    * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAffinity: js.UndefOr[Input[PodAffinity]] = js.native
  
  /**
    * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAntiAffinity: js.UndefOr[Input[PodAntiAffinity]] = js.native
}
object Affinity {
  
  @scala.inline
  def apply(): Affinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Affinity]
  }
  
  @scala.inline
  implicit class AffinityMutableBuilder[Self <: Affinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeAffinity(value: Input[NodeAffinity]): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAffinityUndefined: Self = StObject.set(x, "nodeAffinity", js.undefined)
    
    @scala.inline
    def setPodAffinity(value: Input[PodAffinity]): Self = StObject.set(x, "podAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodAffinityUndefined: Self = StObject.set(x, "podAffinity", js.undefined)
    
    @scala.inline
    def setPodAntiAffinity(value: Input[PodAntiAffinity]): Self = StObject.set(x, "podAntiAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodAntiAffinityUndefined: Self = StObject.set(x, "podAntiAffinity", js.undefined)
  }
}
