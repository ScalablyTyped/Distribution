package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
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
  var default: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
    */
  var defaultRequest: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Max usage constraints on this kind by resource name.
    */
  var max: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
    */
  var maxLimitRequestRatio: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Min usage constraints on this kind by resource name.
    */
  var min: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Type of resource that this limit applies to.
    */
  var `type`: Input[String] = js.native
}

object LimitRangeItem {
  @scala.inline
  def apply(`type`: Input[String]): LimitRangeItem = {
    val __obj = js.Dynamic.literal()
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Input[StringDictionary[Input[String]]]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultRequest(value: Input[StringDictionary[Input[String]]]): Self = this.set("defaultRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRequest: Self = this.set("defaultRequest", js.undefined)
    @scala.inline
    def setMax(value: Input[StringDictionary[Input[String]]]): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxLimitRequestRatio(value: Input[StringDictionary[Input[String]]]): Self = this.set("maxLimitRequestRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLimitRequestRatio: Self = this.set("maxLimitRequestRatio", js.undefined)
    @scala.inline
    def setMin(value: Input[StringDictionary[Input[String]]]): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

