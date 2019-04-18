package typings
package reactstrapLib.libNavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLUListElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var card: js.UndefOr[scala.Boolean] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var horizontal: js.UndefOr[java.lang.String] = js.undefined
  var justified: js.UndefOr[scala.Boolean] = js.undefined
  var navbar: js.UndefOr[scala.Boolean] = js.undefined
  var pills: js.UndefOr[scala.Boolean] = js.undefined
  var tabs: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var vertical: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object NavProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLUListElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    card: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    horizontal: java.lang.String = null,
    justified: js.UndefOr[scala.Boolean] = js.undefined,
    navbar: js.UndefOr[scala.Boolean] = js.undefined,
    pills: js.UndefOr[scala.Boolean] = js.undefined,
    tabs: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactType[_] = null,
    vertical: scala.Boolean | java.lang.String = null
  ): NavProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(card)) __obj.updateDynamic("card")(card)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified)
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar)
    if (!js.isUndefined(pills)) __obj.updateDynamic("pills")(pills)
    if (!js.isUndefined(tabs)) __obj.updateDynamic("tabs")(tabs)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavProps]
  }
}

