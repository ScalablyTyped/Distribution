package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FSGroupStrategyOptions defines the strategy type and options used to create the strategy. Deprecated: use FSGroupStrategyOptions from policy API Group instead.
  */
@js.native
trait FSGroupStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.Array[IDRange] = js.native
  /**
    * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
    */
  var rule: String = js.native
}

object FSGroupStrategyOptions {
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: String): FSGroupStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSGroupStrategyOptions]
  }
  @scala.inline
  implicit class FSGroupStrategyOptionsOps[Self <: FSGroupStrategyOptions] (val x: Self) extends AnyVal {
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

