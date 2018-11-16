package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Run A sUser Strategy Options defines the strategy type and any options used to create the
         * strategy.
         */

trait RunAsUserStrategyOptions extends js.Object {
  /**
               * Ranges are the allowed ranges of uids that may be used.
               */
  val ranges: js.Array[IDRange]
  /**
               * Rule is the strategy that will dictate the allowable RunAsUser values that may be set.
               */
  val rule: java.lang.String
}

