package typings.pulumiKubernetes.outputMod.policy.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
  */
@js.native
trait SupplementalGroupsStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.Array[IDRange] = js.native
  /**
    * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
    */
  var rule: String = js.native
}

object SupplementalGroupsStrategyOptions {
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: String): SupplementalGroupsStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplementalGroupsStrategyOptions]
  }
  @scala.inline
  implicit class SupplementalGroupsStrategyOptionsOps[Self <: SupplementalGroupsStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRangesVarargs(value: IDRange*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[IDRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: String): Self = this.set("rule", value.asInstanceOf[js.Any])
  }
  
}

