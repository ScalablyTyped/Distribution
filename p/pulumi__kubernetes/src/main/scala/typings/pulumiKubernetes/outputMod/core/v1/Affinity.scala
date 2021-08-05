package typings.pulumiKubernetes.outputMod.core.v1

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
  var nodeAffinity: NodeAffinity
  
  /**
    * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAffinity: PodAffinity
  
  /**
    * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAntiAffinity: PodAntiAffinity
}
object Affinity {
  
  inline def apply(nodeAffinity: NodeAffinity, podAffinity: PodAffinity, podAntiAffinity: PodAntiAffinity): Affinity = {
    val __obj = js.Dynamic.literal(nodeAffinity = nodeAffinity.asInstanceOf[js.Any], podAffinity = podAffinity.asInstanceOf[js.Any], podAntiAffinity = podAntiAffinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affinity]
  }
  
  extension [Self <: Affinity](x: Self) {
    
    inline def setNodeAffinity(value: NodeAffinity): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    inline def setPodAffinity(value: PodAffinity): Self = StObject.set(x, "podAffinity", value.asInstanceOf[js.Any])
    
    inline def setPodAntiAffinity(value: PodAntiAffinity): Self = StObject.set(x, "podAntiAffinity", value.asInstanceOf[js.Any])
  }
}
