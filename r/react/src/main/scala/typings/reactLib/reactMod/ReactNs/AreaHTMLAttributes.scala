package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaHTMLAttributes[T] extends HTMLAttributes[T] {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var coords: js.UndefOr[java.lang.String] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var hrefLang: js.UndefOr[java.lang.String] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var rel: js.UndefOr[java.lang.String] = js.undefined
  var shape: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object AreaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    alt: java.lang.String = null,
    coords: java.lang.String = null,
    download: js.Any = null,
    href: java.lang.String = null,
    hrefLang: java.lang.String = null,
    media: java.lang.String = null,
    rel: java.lang.String = null,
    shape: java.lang.String = null,
    target: java.lang.String = null
  ): AreaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (download != null) __obj.updateDynamic("download")(download)
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang)
    if (media != null) __obj.updateDynamic("media")(media)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[AreaHTMLAttributes[T]]
  }
}

