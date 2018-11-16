package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * CrossVersionObjectReference contains enough information to let you identify the referred
         * resource.
         */

trait CrossVersionObjectReference extends js.Object {
  /**
               * API version of the referent
               */
  val apiVersion: java.lang.String
  /**
               * Kind of the referent; More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
               */
  val kind: java.lang.String
  /**
               * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
               */
  val name: java.lang.String
}

