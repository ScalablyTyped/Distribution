package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
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
  var labelSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
  
  /**
    * namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"
    */
  var namespaces: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
    */
  var topologyKey: Input[String]
}
object PodAffinityTerm {
  
  @scala.inline
  def apply(topologyKey: Input[String]): PodAffinityTerm = {
    val __obj = js.Dynamic.literal(topologyKey = topologyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAffinityTerm]
  }
  
  @scala.inline
  implicit class PodAffinityTermMutableBuilder[Self <: PodAffinityTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelSelector(value: Input[LabelSelector]): Self = StObject.set(x, "labelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSelectorUndefined: Self = StObject.set(x, "labelSelector", js.undefined)
    
    @scala.inline
    def setNamespaces(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    @scala.inline
    def setNamespacesVarargs(value: Input[String]*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
    
    @scala.inline
    def setTopologyKey(value: Input[String]): Self = StObject.set(x, "topologyKey", value.asInstanceOf[js.Any])
  }
}
