package typings.atPulumiKubernetes.typesInputMod.policy.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
  */
trait FSGroupStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group
    * then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.undefined
  /**
    * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
    */
  var rule: js.UndefOr[Input[String]] = js.undefined
}

object FSGroupStrategyOptions {
  @scala.inline
  def apply(ranges: Input[js.Array[Input[IDRange]]] = null, rule: Input[String] = null): FSGroupStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSGroupStrategyOptions]
  }
}

