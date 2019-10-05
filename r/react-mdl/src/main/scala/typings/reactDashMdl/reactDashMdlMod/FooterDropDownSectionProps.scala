package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterDropDownSectionProps
  extends MDLHTMLAttributes
     with DOMAttributes[FooterDropDownSection] {
  var size: js.UndefOr[String] = js.undefined
  var title: ReactNode
}

object FooterDropDownSectionProps {
  @scala.inline
  def apply(
    DOMAttributes: DOMAttributes[FooterDropDownSection] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    size: String = null,
    title: ReactNode = null
  ): FooterDropDownSectionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterDropDownSectionProps]
  }
}

