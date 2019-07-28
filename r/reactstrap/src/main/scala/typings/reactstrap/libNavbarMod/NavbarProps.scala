package typings.reactstrap.libNavbarMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var dark: js.UndefOr[Boolean] = js.undefined
  var expand: js.UndefOr[Boolean | String] = js.undefined
  var fixed: js.UndefOr[String] = js.undefined
  var full: js.UndefOr[Boolean] = js.undefined
  var light: js.UndefOr[Boolean] = js.undefined
  var sticky: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object NavbarProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    color: String = null,
    cssModule: CSSModule = null,
    dark: js.UndefOr[Boolean] = js.undefined,
    expand: Boolean | String = null,
    fixed: String = null,
    full: js.UndefOr[Boolean] = js.undefined,
    light: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    sticky: String = null,
    tag: ReactType[_] = null
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

