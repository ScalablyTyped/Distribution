package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterSectionProps
  extends MDLHTMLAttributes
     with DOMAttributes[FooterSection] {
  var logo: js.UndefOr[ReactNode] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object FooterSectionProps {
  @scala.inline
  def apply(
    DOMAttributes: DOMAttributes[FooterSection] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    logo: ReactNode = null,
    size: String = null,
    title: String = null,
    `type`: String = null
  ): FooterSectionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FooterSectionProps]
  }
}

