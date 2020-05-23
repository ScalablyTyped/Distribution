package typings.reactstrap.navMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavProps
  extends AllHTMLAttributes[HTMLUListElement]
     with ClassAttributes[HTMLUListElement]
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
    AllHTMLAttributes: AllHTMLAttributes[HTMLUListElement] = null,
    ClassAttributes: ClassAttributes[HTMLUListElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    card: js.UndefOr[Boolean] = js.undefined,
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(card)) __obj.updateDynamic("card")(card.get.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pills)) __obj.updateDynamic("pills")(pills.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabs)) __obj.updateDynamic("tabs")(tabs.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavProps]
  }
}

