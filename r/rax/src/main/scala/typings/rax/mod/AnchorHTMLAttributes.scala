package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorHTMLAttributes[T] extends HTMLAttributes[T] {
  var download: js.UndefOr[js.Any] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[String] = js.undefined
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
    referrerPolicy: String = null,
    rel: String = null,
    target: String = null,
    `type`: String = null
  ): AnchorHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorHTMLAttributes[T]]
  }
}

