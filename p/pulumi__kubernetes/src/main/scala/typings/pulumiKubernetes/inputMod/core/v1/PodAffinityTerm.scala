package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a set of pods (namely those matching the labelSelector relative to the given
  * namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity)
  * with, where co-located is defined as running on a node whose value of the label with key
  * <topologyKey> matches that of any node on which a pod of the set of pods is running
  */
trait PodAffinityTerm extends js.Object {
  /**
    * A label query over a set of resources, in this case pods.
    */
  var labelSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * namespaces specifies which namespaces the labelSelector applies to (matches against); null
    * or empty list means "this pod's namespace"
    */
  var namespaces: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods
    * matching the labelSelector in the specified namespaces, where co-located is defined as
    * running on a node whose value of the label with key topologyKey matches that of any node on
    * which any of the selected pods is running. Empty topologyKey is not allowed.
    */
  var topologyKey: Input[String]
}

object PodAffinityTerm {
  @scala.inline
  def apply(
    topologyKey: Input[String],
    labelSelector: Input[LabelSelector] = null,
    namespaces: Input[js.Array[Input[String]]] = null
  ): PodAffinityTerm = {
    val __obj = js.Dynamic.literal(topologyKey = topologyKey.asInstanceOf[js.Any])
    if (labelSelector != null) __obj.updateDynamic("labelSelector")(labelSelector.asInstanceOf[js.Any])
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAffinityTerm]
  }
}

