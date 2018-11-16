package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val nodeAffinity: NodeAffinity
  /**
               * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone,
               * etc. as some other pod(s)).
               */
  val podAffinity: PodAffinity
  /**
               * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node,
               * zone, etc. as some other pod(s)).
               */
  val podAntiAffinity: PodAntiAffinity
}

