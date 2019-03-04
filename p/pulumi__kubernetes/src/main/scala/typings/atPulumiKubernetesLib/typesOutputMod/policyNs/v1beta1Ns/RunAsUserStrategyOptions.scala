package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RunAsUserStrategyOptions defines the strategy type and any options used to create the
  * strategy.
  */
trait RunAsUserStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of uids that may be used. If you would like to force a single
    * uid then supply a single range with the same start and end. Required for MustRunAs.
    */
  val ranges: js.Array[IDRange]
  /**
    * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  val rule: java.lang.String
}

object RunAsUserStrategyOptions {
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: java.lang.String): RunAsUserStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges, rule = rule)
  
    __obj.asInstanceOf[RunAsUserStrategyOptions]
  }
}

