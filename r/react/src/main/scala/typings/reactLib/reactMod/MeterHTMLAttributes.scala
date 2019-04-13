package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeterHTMLAttributes[T] extends HTMLAttributes[T] {
  var form: js.UndefOr[java.lang.String] = js.undefined
  var high: js.UndefOr[scala.Double] = js.undefined
  var low: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var min: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var optimum: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double] = js.undefined
}

object MeterHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    form: java.lang.String = null,
    high: scala.Int | scala.Double = null,
    low: scala.Int | scala.Double = null,
    max: scala.Double | java.lang.String = null,
    min: scala.Double | java.lang.String = null,
    optimum: scala.Int | scala.Double = null,
    value: java.lang.String | js.Array[java.lang.String] | scala.Double = null
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

