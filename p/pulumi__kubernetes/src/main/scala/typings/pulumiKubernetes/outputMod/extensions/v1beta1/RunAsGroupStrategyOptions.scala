package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RunAsGroupStrategyOptions defines the strategy type and any options used to create the
  * strategy. Deprecated: use RunAsGroupStrategyOptions from policy API Group instead.
  */
trait RunAsGroupStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of gids that may be used. If you would like to force a single
    * gid then supply a single range with the same start and end. Required for MustRunAs.
    */
  val ranges: js.Array[IDRange]
  /**
    * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
    */
  val rule: String
}

object RunAsGroupStrategyOptions {
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: String): RunAsGroupStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunAsGroupStrategyOptions]
  }
}

