package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressHTMLAttributes[T] extends HTMLAttributes[T] {
  var max: js.UndefOr[Double | String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object ProgressHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    max: Double | String = null,
    value: String | js.Array[String] | Double = null
  ): ProgressHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressHTMLAttributes[T]]
  }
}

