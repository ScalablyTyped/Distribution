package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.undefined
  /**
    * rule is the strategy that will dictate what supplemental groups is used in the
    * SecurityContext.
    */
  var rule: js.UndefOr[Input[String]] = js.undefined
}

object SupplementalGroupsStrategyOptions {
  @scala.inline
  def apply(ranges: Input[js.Array[Input[IDRange]]] = null, rule: Input[String] = null): SupplementalGroupsStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplementalGroupsStrategyOptions]
  }
}

