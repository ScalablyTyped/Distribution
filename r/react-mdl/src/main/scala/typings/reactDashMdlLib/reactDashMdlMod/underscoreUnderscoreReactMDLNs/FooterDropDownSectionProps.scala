package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterDropDownSectionProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[FooterDropDownSection] {
  var size: js.UndefOr[java.lang.String] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object FooterDropDownSectionProps {
  @scala.inline
  def apply(
    title: reactLib.reactMod.ReactNs.ReactNode,
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[FooterDropDownSection] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    size: java.lang.String = null
  ): FooterDropDownSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[FooterDropDownSectionProps]
  }
}

