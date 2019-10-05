package typings.atPulumiKubernetes.typesOutputMod.core.v1

import typings.atPulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
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
  val labelSelector: LabelSelector
  /**
    * namespaces specifies which namespaces the labelSelector applies to (matches against); null
    * or empty list means "this pod's namespace"
    */
  val namespaces: js.Array[String]
  /**
    * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods
    * matching the labelSelector in the specified namespaces, where co-located is defined as
    * running on a node whose value of the label with key topologyKey matches that of any node on
    * which any of the selected pods is running. Empty topologyKey is not allowed.
    */
  val topologyKey: String
}

object PodAffinityTerm {
  @scala.inline
  def apply(labelSelector: LabelSelector, namespaces: js.Array[String], topologyKey: String): PodAffinityTerm = {
    val __obj = js.Dynamic.literal(labelSelector = labelSelector, namespaces = namespaces, topologyKey = topologyKey)
  
    __obj.asInstanceOf[PodAffinityTerm]
  }
}

