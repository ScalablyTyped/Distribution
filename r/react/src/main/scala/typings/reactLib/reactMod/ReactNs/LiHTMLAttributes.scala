package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiHTMLAttributes[T] extends HTMLAttributes[T] {
  var value: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double] = js.undefined
}

object LiHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    value: java.lang.String | js.Array[java.lang.String] | scala.Double = null
  ): LiHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiHTMLAttributes[T]]
  }
}

