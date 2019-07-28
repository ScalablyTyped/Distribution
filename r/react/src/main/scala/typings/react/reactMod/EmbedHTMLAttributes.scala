package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedHTMLAttributes[T] extends HTMLAttributes[T] {
  var height: js.UndefOr[Double | String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object EmbedHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    height: Double | String = null,
    src: String = null,
    `type`: String = null,
    width: Double | String = null
  ): EmbedHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedHTMLAttributes[T]]
  }
}

