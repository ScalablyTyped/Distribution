package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataHTMLAttributes[T] extends HTMLAttributes[T] {
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object DataHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, value: String | js.Array[String] | Double = null): DataHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHTMLAttributes[T]]
  }
}

