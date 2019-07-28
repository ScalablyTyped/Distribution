package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterLinkListProps
  extends MDLHTMLAttributes
     with DOMAttributes[FooterLinkList] {
  var size: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object FooterLinkListProps {
  @scala.inline
  def apply(
    DOMAttributes: DOMAttributes[FooterLinkList] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    size: String = null,
    title: String = null
  ): FooterLinkListProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FooterLinkListProps]
  }
}

