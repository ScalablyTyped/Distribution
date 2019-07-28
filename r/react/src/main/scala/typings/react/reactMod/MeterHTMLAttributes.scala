package typings.react.reactMod

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
    high: Int | Double = null,
    low: Int | Double = null,
    max: Double | String = null,
    min: Double | String = null,
    optimum: Int | Double = null,
    value: String | js.Array[String] | Double = null
  ): MeterHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (form != null) __obj.updateDynamic("form")(form)
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (optimum != null) __obj.updateDynamic("optimum")(optimum.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeterHTMLAttributes[T]]
  }
}

