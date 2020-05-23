package typings.semanticUiReact.advertisementAdvertisementMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.`half banner`
import typings.semanticUiReact.semanticUiReactStrings.`half page`
import typings.semanticUiReact.semanticUiReactStrings.`large leaderboard`
import typings.semanticUiReact.semanticUiReactStrings.`large rectangle`
import typings.semanticUiReact.semanticUiReactStrings.`medium rectangle`
import typings.semanticUiReact.semanticUiReactStrings.`mobile banner`
import typings.semanticUiReact.semanticUiReactStrings.`mobile leaderboard`
import typings.semanticUiReact.semanticUiReactStrings.`small button`
import typings.semanticUiReact.semanticUiReactStrings.`small rectangle`
import typings.semanticUiReact.semanticUiReactStrings.`small square`
import typings.semanticUiReact.semanticUiReactStrings.`square button`
import typings.semanticUiReact.semanticUiReactStrings.`top banner`
import typings.semanticUiReact.semanticUiReactStrings.`vertical banner`
import typings.semanticUiReact.semanticUiReactStrings.`vertical rectangle`
import typings.semanticUiReact.semanticUiReactStrings.`wide skyscraper`
import typings.semanticUiReact.semanticUiReactStrings.banner
import typings.semanticUiReact.semanticUiReactStrings.billboard
import typings.semanticUiReact.semanticUiReactStrings.button
import typings.semanticUiReact.semanticUiReactStrings.leaderboard
import typings.semanticUiReact.semanticUiReactStrings.netboard
import typings.semanticUiReact.semanticUiReactStrings.panorama
import typings.semanticUiReact.semanticUiReactStrings.skyscraper
import typings.semanticUiReact.semanticUiReactStrings.square
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertisementProps]
  }
}

