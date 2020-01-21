package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Affinity is a group of affinity scheduling rules.
  */
trait Affinity extends js.Object {
  /**
    * Describes node affinity scheduling rules for the pod.
    */
  var nodeAffinity: js.UndefOr[Input[NodeAffinity]] = js.undefined
  /**
    * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone,
    * etc. as some other pod(s)).
    */
  var podAffinity: js.UndefOr[Input[PodAffinity]] = js.undefined
  /**
    * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node,
    * zone, etc. as some other pod(s)).
    */
  var podAntiAffinity: js.UndefOr[Input[PodAntiAffinity]] = js.undefined
}

object Affinity {
  @scala.inline
  def apply(
    nodeAffinity: Input[NodeAffinity] = null,
    podAffinity: Input[PodAffinity] = null,
    podAntiAffinity: Input[PodAntiAffinity] = null
  ): Affinity = {
    val __obj = js.Dynamic.literal()
    if (nodeAffinity != null) __obj.updateDynamic("nodeAffinity")(nodeAffinity.asInstanceOf[js.Any])
    if (podAffinity != null) __obj.updateDynamic("podAffinity")(podAffinity.asInstanceOf[js.Any])
    if (podAntiAffinity != null) __obj.updateDynamic("podAntiAffinity")(podAntiAffinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affinity]
  }
}

