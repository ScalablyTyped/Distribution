package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
  */
@js.native
trait LimitRangeItem extends js.Object {
  /**
    * Default resource requirement limit value by resource name if resource limit is omitted.
    */
  var default: StringDictionary[String] = js.native
  /**
    * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
    */
  var defaultRequest: StringDictionary[String] = js.native
  /**
    * Max usage constraints on this kind by resource name.
    */
  var max: StringDictionary[String] = js.native
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
    */
  var maxLimitRequestRatio: StringDictionary[String] = js.native
  /**
    * Min usage constraints on this kind by resource name.
    */
  var min: StringDictionary[String] = js.native
  /**
    * Type of resource that this limit applies to.
    */
  var `type`: String = js.native
}

object LimitRangeItem {
  @scala.inline
  def apply(
    default: StringDictionary[String],
    defaultRequest: StringDictionary[String],
    max: StringDictionary[String],
    maxLimitRequestRatio: StringDictionary[String],
    min: StringDictionary[String],
    `type`: String
  ): LimitRangeItem = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], defaultRequest = defaultRequest.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLimitRequestRatio = maxLimitRequestRatio.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeItem]
  }
  @scala.inline
  implicit class LimitRangeItemOps[Self <: LimitRangeItem] (val x: Self) extends AnyVal {
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
    def setDefault(value: StringDictionary[String]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRequest(value: StringDictionary[String]): Self = this.set("defaultRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: StringDictionary[String]): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLimitRequestRatio(value: StringDictionary[String]): Self = this.set("maxLimitRequestRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: StringDictionary[String]): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

