package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
  */
trait PodAffinityTerm extends StObject {
  
  /**
    * A label query over a set of resources, in this case pods.
    */
  var labelSelector: LabelSelector
  
  /**
    * namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"
    */
  var namespaces: js.Array[String]
  
  /**
    * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
    */
  var topologyKey: String
}
object PodAffinityTerm {
  
  inline def apply(labelSelector: LabelSelector, namespaces: js.Array[String], topologyKey: String): PodAffinityTerm = {
    val __obj = js.Dynamic.literal(labelSelector = labelSelector.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any], topologyKey = topologyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAffinityTerm]
  }
  
  extension [Self <: PodAffinityTerm](x: Self) {
    
    inline def setLabelSelector(value: LabelSelector): Self = StObject.set(x, "labelSelector", value.asInstanceOf[js.Any])
    
    inline def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
    
    inline def setTopologyKey(value: String): Self = StObject.set(x, "topologyKey", value.asInstanceOf[js.Any])
  }
}
