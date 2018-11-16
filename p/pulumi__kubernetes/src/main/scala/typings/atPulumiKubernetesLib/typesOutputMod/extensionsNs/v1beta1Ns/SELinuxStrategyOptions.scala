package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * SELinux  Strategy Options defines the strategy type and any options used to create the
         * strategy.
         */

trait SELinuxStrategyOptions extends js.Object {
  /**
               * type is the strategy that will dictate the allowable labels that may be set.
               */
  val rule: java.lang.String
  /**
               * seLinuxOptions required to run as; required for MustRunAs More info:
               * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
               */
  val seLinuxOptions: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.SELinuxOptions
}

