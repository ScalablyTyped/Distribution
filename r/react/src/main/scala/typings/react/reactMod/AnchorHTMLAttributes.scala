package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorHTMLAttributes[T] extends HTMLAttributes[T] {
  var download: js.UndefOr[js.Any] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var ping: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[String] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnchorHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    download: js.Any = null,
    href: String = null,
    hrefLang: String = null,
    media: String = null,
    ping: String = null,
    referrerPolicy: String = null,
    rel: String = null,
    target: String = null,
    `type`: String = null
  ): AnchorHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (download != null) __obj.updateDynamic("download")(download)
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang)
    if (media != null) __obj.updateDynamic("media")(media)
    if (ping != null) __obj.updateDynamic("ping")(ping)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnchorHTMLAttributes[T]]
  }
}

