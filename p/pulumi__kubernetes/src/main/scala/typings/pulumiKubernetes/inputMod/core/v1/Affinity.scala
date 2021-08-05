package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Affinity is a group of affinity scheduling rules.
  */
trait Affinity extends StObject {
  
  /**
    * Describes node affinity scheduling rules for the pod.
    */
  var nodeAffinity: js.UndefOr[Input[NodeAffinity]] = js.undefined
  
  /**
    * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAffinity: js.UndefOr[Input[PodAffinity]] = js.undefined
  
  /**
    * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAntiAffinity: js.UndefOr[Input[PodAntiAffinity]] = js.undefined
}
object Affinity {
  
  inline def apply(): Affinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Affinity]
  }
  
  extension [Self <: Affinity](x: Self) {
    
    inline def setNodeAffinity(value: Input[NodeAffinity]): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    inline def setNodeAffinityUndefined: Self = StObject.set(x, "nodeAffinity", js.undefined)
    
    inline def setPodAffinity(value: Input[PodAffinity]): Self = StObject.set(x, "podAffinity", value.asInstanceOf[js.Any])
    
    inline def setPodAffinityUndefined: Self = StObject.set(x, "podAffinity", js.undefined)
    
    inline def setPodAntiAffinity(value: Input[PodAntiAffinity]): Self = StObject.set(x, "podAntiAffinity", value.asInstanceOf[js.Any])
    
    inline def setPodAntiAffinityUndefined: Self = StObject.set(x, "podAntiAffinity", js.undefined)
  }
}
