package typings.reactstrap.libNavMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavProps
  extends HTMLProps[HTMLUListElement]
     with /* key */ StringDictionary[js.Any] {
  var card: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var justified: js.UndefOr[Boolean] = js.undefined
  var navbar: js.UndefOr[Boolean] = js.undefined
  var pills: js.UndefOr[Boolean] = js.undefined
  var tabs: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var vertical: js.UndefOr[Boolean | String] = js.undefined
}

object NavProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLUListElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    card: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cssModule: CSSModule = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    horizontal: String = null,
    justified: js.UndefOr[Boolean] = js.undefined,
    navbar: js.UndefOr[Boolean] = js.undefined,
    pills: js.UndefOr[Boolean] = js.undefined,
    tabs: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null,
    vertical: Boolean | String = null
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

