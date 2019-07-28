package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasHTMLAttributes[T] extends HTMLAttributes[T] {
  var height: js.UndefOr[Double | String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object CanvasHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    height: Double | String = null,
    width: Double | String = null
  ): CanvasHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasHTMLAttributes[T]]
  }
}

