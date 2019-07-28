package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps
  extends MDLHTMLAttributes
     with DOMAttributes[Footer] {
  var size: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object FooterProps {
  @scala.inline
  def apply(
    DOMAttributes: DOMAttributes[Footer] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    size: String = null,
    title: String = null
  ): FooterProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FooterProps]
  }
}

