package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColHTMLAttributes[T] extends HTMLAttributes[T] {
  var span: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ColHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, span: Int | Double = null, width: Double | String = null): ColHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColHTMLAttributes[T]]
  }
}

