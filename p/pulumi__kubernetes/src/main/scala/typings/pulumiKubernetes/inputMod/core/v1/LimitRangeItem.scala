package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
  */
trait LimitRangeItem extends js.Object {
  /**
    * Default resource requirement limit value by resource name if resource limit is omitted.
    */
  var default: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * DefaultRequest is the default resource requirement request value by resource name if
    * resource request is omitted.
    */
  var defaultRequest: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Max usage constraints on this kind by resource name.
    */
  var max: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that
    * are both non-zero where limit divided by request is less than or equal to the enumerated
    * value; this represents the max burst for the named resource.
    */
  var maxLimitRequestRatio: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Min usage constraints on this kind by resource name.
    */
  var min: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Type of resource that this limit applies to.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object LimitRangeItem {
  @scala.inline
  def apply(
    default: Input[js.Object] = null,
    defaultRequest: Input[js.Object] = null,
    max: Input[js.Object] = null,
    maxLimitRequestRatio: Input[js.Object] = null,
    min: Input[js.Object] = null,
    `type`: Input[String] = null
  ): LimitRangeItem = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (defaultRequest != null) __obj.updateDynamic("defaultRequest")(defaultRequest.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLimitRequestRatio != null) __obj.updateDynamic("maxLimitRequestRatio")(maxLimitRequestRatio.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeItem]
  }
}

