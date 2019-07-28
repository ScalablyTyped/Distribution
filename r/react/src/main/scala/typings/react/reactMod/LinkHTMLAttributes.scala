package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkHTMLAttributes[T] extends HTMLAttributes[T] {
  var as: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LinkHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    as: String = null,
    crossOrigin: String = null,
    href: String = null,
    hrefLang: String = null,
    integrity: String = null,
    media: String = null,
    rel: String = null,
    sizes: String = null,
    `type`: String = null
  ): LinkHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (as != null) __obj.updateDynamic("as")(as)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (media != null) __obj.updateDynamic("media")(media)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
}

