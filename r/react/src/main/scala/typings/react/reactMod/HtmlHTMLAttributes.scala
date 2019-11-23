package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlHTMLAttributes[T] extends HTMLAttributes[T] {
  var manifest: js.UndefOr[String] = js.undefined
}

object HtmlHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, manifest: String = null): HtmlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    __obj.asInstanceOf[HtmlHTMLAttributes[T]]
  }
}

