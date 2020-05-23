package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeterHTMLAttributes[T] extends HTMLAttributes[T] {
  var form: js.UndefOr[String] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var optimum: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object MeterHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    form: String = null,
    high: js.UndefOr[Double] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    max: Double | String = null,
    min: Double | String = null,
    optimum: js.UndefOr[Double] = js.undefined,
    value: String | js.Array[String] | Double = null
  ): MeterHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(optimum)) __obj.updateDynamic("optimum")(optimum.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeterHTMLAttributes[T]]
  }
}

