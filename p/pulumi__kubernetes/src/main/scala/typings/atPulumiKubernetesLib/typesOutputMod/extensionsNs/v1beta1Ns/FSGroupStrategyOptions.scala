package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
         */

trait FSGroupStrategyOptions extends js.Object {
  /**
               * Ranges are the allowed ranges of fs groups.  If you would like to force a single fs group
               * then supply a single range with the same start and end.
               */
  val ranges: js.Array[IDRange]
  /**
               * Rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
               */
  val rule: java.lang.String
}

