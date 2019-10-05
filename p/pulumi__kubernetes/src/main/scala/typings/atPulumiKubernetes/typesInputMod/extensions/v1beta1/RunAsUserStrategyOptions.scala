package typings.atPulumiKubernetes.typesInputMod.extensions.v1beta1

import typings.atPulumiPulumi.outputMod.Input
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
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.undefined
  /**
    * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var rule: Input[String]
}

object RunAsUserStrategyOptions {
  @scala.inline
  def apply(rule: Input[String], ranges: Input[js.Array[Input[IDRange]]] = null): RunAsUserStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAsUserStrategyOptions]
  }
}

