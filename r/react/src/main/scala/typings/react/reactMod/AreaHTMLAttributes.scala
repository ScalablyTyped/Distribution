package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaHTMLAttributes[T] extends HTMLAttributes[T] {
  var alt: js.UndefOr[String] = js.undefined
  var coords: js.UndefOr[String] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object AreaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    alt: String = null,
    coords: String = null,
    download: js.Any = null,
    href: String = null,
    hrefLang: String = null,
    media: String = null,
    rel: String = null,
    shape: String = null,
    target: String = null
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

