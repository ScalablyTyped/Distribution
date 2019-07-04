package typings
package reactDashFoundationLib.componentsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.AnchorHTMLAttributes because var conflicts: className. Inlined download, href, hrefLang, media, ping, referrerPolicy, rel, target, `type` */ trait LinkProps extends ButtonPropsCommon {
  var color: js.UndefOr[reactDashFoundationLib.enumsMod.ButtonColors] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var hrefLang: js.UndefOr[java.lang.String] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var ping: js.UndefOr[java.lang.String] = js.undefined
  var referrerPolicy: js.UndefOr[java.lang.String] = js.undefined
  var rel: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] = null,
    ButtonPropsCommon: ButtonPropsCommon = null,
    color: reactDashFoundationLib.enumsMod.ButtonColors = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ButtonPropsCommon)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[LinkProps]
  }
}

