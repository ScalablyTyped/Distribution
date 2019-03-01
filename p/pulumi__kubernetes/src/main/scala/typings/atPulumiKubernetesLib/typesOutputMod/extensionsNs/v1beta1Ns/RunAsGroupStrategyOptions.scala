package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

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
  val rule: java.lang.String
}

object RunAsGroupStrategyOptions {
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: java.lang.String): RunAsGroupStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ranges")(ranges)
    __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[RunAsGroupStrategyOptions]
  }
}

