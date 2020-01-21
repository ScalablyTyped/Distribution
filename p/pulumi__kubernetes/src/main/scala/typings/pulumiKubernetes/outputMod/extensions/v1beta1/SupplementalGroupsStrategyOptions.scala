package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the
  * strategy. Deprecated: use SupplementalGroupsStrategyOptions from policy API Group instead.
  */
trait SupplementalGroupsStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
    * supplemental group then supply a single range with the same start and end. Required for
    * MustRunAs.
    */
  val ranges: js.Array[IDRange]
  /**
    * rule is the strategy that will dictate what supplemental groups is used in the
    * SecurityContext.
    */
  val rule: String
}

object SupplementalGroupsStrategyOptions {
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: String): SupplementalGroupsStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SupplementalGroupsStrategyOptions]
  }
}

