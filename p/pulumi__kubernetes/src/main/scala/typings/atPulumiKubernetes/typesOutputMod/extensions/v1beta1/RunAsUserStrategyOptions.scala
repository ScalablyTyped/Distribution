package typings.atPulumiKubernetes.typesOutputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RunAsUserStrategyOptions defines the strategy type and any options used to create the
  * strategy. Deprecated: use RunAsUserStrategyOptions from policy API Group instead.
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
  val rule: String
}

object RunAsUserStrategyOptions {
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: String): RunAsUserStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges, rule = rule)
  
    __obj.asInstanceOf[RunAsUserStrategyOptions]
  }
}

