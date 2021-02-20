package typings.pulumiKubernetes.outputMod.core.v1

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
  var nodeAffinity: NodeAffinity = js.native
  
  /**
    * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAffinity: PodAffinity = js.native
  
  /**
    * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAntiAffinity: PodAntiAffinity = js.native
}
object Affinity {
  
  @scala.inline
  def apply(nodeAffinity: NodeAffinity, podAffinity: PodAffinity, podAntiAffinity: PodAntiAffinity): Affinity = {
    val __obj = js.Dynamic.literal(nodeAffinity = nodeAffinity.asInstanceOf[js.Any], podAffinity = podAffinity.asInstanceOf[js.Any], podAntiAffinity = podAntiAffinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affinity]
  }
  
  @scala.inline
  implicit class AffinityMutableBuilder[Self <: Affinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeAffinity(value: NodeAffinity): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodAffinity(value: PodAffinity): Self = StObject.set(x, "podAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodAntiAffinity(value: PodAntiAffinity): Self = StObject.set(x, "podAntiAffinity", value.asInstanceOf[js.Any])
  }
}
