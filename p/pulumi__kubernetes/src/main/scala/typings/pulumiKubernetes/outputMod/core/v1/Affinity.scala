package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Affinity is a group of affinity scheduling rules.
  */
@js.native
trait Affinity extends js.Object {
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
  implicit class AffinityOps[Self <: Affinity] (val x: Self) extends AnyVal {
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
    def setNodeAffinity(value: NodeAffinity): Self = this.set("nodeAffinity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPodAffinity(value: PodAffinity): Self = this.set("podAffinity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPodAntiAffinity(value: PodAntiAffinity): Self = this.set("podAntiAffinity", value.asInstanceOf[js.Any])
  }
  
}

