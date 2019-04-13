package typings
package reactDashFoundationLib.componentsAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.AnchorHTMLAttributes because var conflicts: className. Inlined download, href, hrefLang, media, referrerPolicy, rel, target, `type` */ trait AccordionTitleProps
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  var download: js.UndefOr[js.Any] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var hrefLang: js.UndefOr[java.lang.String] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var referrerPolicy: js.UndefOr[java.lang.String] = js.undefined
  var rel: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AccordionTitleProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] = null,
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined
  ): AccordionTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    __obj.asInstanceOf[AccordionTitleProps]
  }
}

