package typings
package reactstrapLib.libNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var dark: js.UndefOr[scala.Boolean] = js.undefined
  var expand: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var fixed: js.UndefOr[java.lang.String] = js.undefined
  var full: js.UndefOr[scala.Boolean] = js.undefined
  var light: js.UndefOr[scala.Boolean] = js.undefined
  var sticky: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object NavbarProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    dark: js.UndefOr[scala.Boolean] = js.undefined,
    expand: scala.Boolean | java.lang.String = null,
    fixed: java.lang.String = null,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    light: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    sticky: java.lang.String = null,
    tag: reactLib.reactMod.ReactType[_] = null
  ): NavbarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark)
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed)
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light)
    if (role != null) __obj.updateDynamic("role")(role)
    if (sticky != null) __obj.updateDynamic("sticky")(sticky)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarProps]
  }
}

