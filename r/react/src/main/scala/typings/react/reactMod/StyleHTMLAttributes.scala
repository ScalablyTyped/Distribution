package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleHTMLAttributes[T] extends HTMLAttributes[T] {
  var media: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object StyleHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    media: String = null,
    nonce: String = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): StyleHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (media != null) __obj.updateDynamic("media")(media)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StyleHTMLAttributes[T]]
  }
}

