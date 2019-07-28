package typings.semanticDashUiDashReact.distCommonjsViewsAdvertisementAdvertisementMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`half banner`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`half page`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`large leaderboard`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`large rectangle`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`medium rectangle`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`mobile banner`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`mobile leaderboard`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small button`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small rectangle`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small square`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`square button`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`top banner`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`vertical banner`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`vertical rectangle`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`wide skyscraper`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.banner
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.billboard
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.button
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.leaderboard
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.netboard
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.panorama
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.skyscraper
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisementProps
  extends StrictAdvertisementProps
     with /* key */ StringDictionary[js.Any]

object AdvertisementProps {
  @scala.inline
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`),
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    test: Boolean | String | Double = null
  ): AdvertisementProps = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertisementProps]
  }
}

