package typings.rax.mod

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
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
}

