package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressHTMLAttributes[T] extends HTMLAttributes[T] {
  var max: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double] = js.undefined
}

object ProgressHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    max: scala.Double | java.lang.String = null,
    value: java.lang.String | js.Array[java.lang.String] | scala.Double = null
  ): ProgressHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressHTMLAttributes[T]]
  }
}

