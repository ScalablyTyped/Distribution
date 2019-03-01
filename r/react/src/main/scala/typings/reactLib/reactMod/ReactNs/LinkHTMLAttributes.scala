package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkHTMLAttributes[T] extends HTMLAttributes[T] {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var hrefLang: js.UndefOr[java.lang.String] = js.undefined
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var rel: js.UndefOr[java.lang.String] = js.undefined
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LinkHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    as: java.lang.String = null,
    crossOrigin: java.lang.String = null,
    href: java.lang.String = null,
    hrefLang: java.lang.String = null,
    integrity: java.lang.String = null,
    media: java.lang.String = null,
    rel: java.lang.String = null,
    sizes: java.lang.String = null,
    `type`: java.lang.String = null
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

