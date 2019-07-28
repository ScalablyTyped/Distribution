package typings.reactDashFoundation.componentsButtonMod

import typings.react.reactMod.AnchorHTMLAttributes
import typings.reactDashFoundation.enumsMod.ButtonColors
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.AnchorHTMLAttributes because var conflicts: className. Inlined download, href, hrefLang, media, ping, referrerPolicy, rel, target, `type` */ trait LinkProps extends ButtonPropsCommon {
  var color: js.UndefOr[ButtonColors] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var ping: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[String] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    AnchorHTMLAttributes: AnchorHTMLAttributes[HTMLAnchorElement] = null,
    ButtonPropsCommon: ButtonPropsCommon = null,
    color: ButtonColors = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ButtonPropsCommon)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[LinkProps]
  }
}

