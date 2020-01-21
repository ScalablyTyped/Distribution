package typings.pulumiKubernetes.outputMod.core.v1

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
  val default: js.Object
  /**
    * DefaultRequest is the default resource requirement request value by resource name if
    * resource request is omitted.
    */
  val defaultRequest: js.Object
  /**
    * Max usage constraints on this kind by resource name.
    */
  val max: js.Object
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that
    * are both non-zero where limit divided by request is less than or equal to the enumerated
    * value; this represents the max burst for the named resource.
    */
  val maxLimitRequestRatio: js.Object
  /**
    * Min usage constraints on this kind by resource name.
    */
  val min: js.Object
  /**
    * Type of resource that this limit applies to.
    */
  val `type`: String
}

object LimitRangeItem {
  @scala.inline
  def apply(
    default: js.Object,
    defaultRequest: js.Object,
    max: js.Object,
    maxLimitRequestRatio: js.Object,
    min: js.Object,
    `type`: String
  ): LimitRangeItem = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], defaultRequest = defaultRequest.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLimitRequestRatio = maxLimitRequestRatio.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeItem]
  }
}

