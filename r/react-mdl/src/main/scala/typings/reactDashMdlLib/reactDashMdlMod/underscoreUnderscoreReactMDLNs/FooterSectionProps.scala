package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterSectionProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[FooterSection] {
  var logo: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object FooterSectionProps {
  @scala.inline
  def apply(
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[FooterSection] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    logo: reactLib.reactMod.ReactNs.ReactNode = null,
    size: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
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

