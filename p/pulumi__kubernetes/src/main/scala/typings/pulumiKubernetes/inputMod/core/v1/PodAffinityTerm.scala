package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
  */
@js.native
trait PodAffinityTerm extends js.Object {
  
  /**
    * A label query over a set of resources, in this case pods.
    */
  var labelSelector: js.UndefOr[Input[LabelSelector]] = js.native
  
  /**
    * namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"
    */
  var namespaces: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
    */
  var topologyKey: Input[String] = js.native
}
object PodAffinityTerm {
  
  @scala.inline
  def apply(topologyKey: Input[String]): PodAffinityTerm = {
    val __obj = js.Dynamic.literal(topologyKey = topologyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAffinityTerm]
  }
  
  @scala.inline
  implicit class PodAffinityTermOps[Self <: PodAffinityTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTopologyKey(value: Input[String]): Self = this.set("topologyKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSelector(value: Input[LabelSelector]): Self = this.set("labelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSelector: Self = this.set("labelSelector", js.undefined)
    
    @scala.inline
    def setNamespacesVarargs(value: Input[String]*): Self = this.set("namespaces", js.Array(value :_*))
    
    @scala.inline
    def setNamespaces(value: Input[js.Array[Input[String]]]): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
  }
}
