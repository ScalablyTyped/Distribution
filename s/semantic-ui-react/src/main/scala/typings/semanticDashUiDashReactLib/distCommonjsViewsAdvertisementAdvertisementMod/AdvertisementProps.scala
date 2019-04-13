package typings
package semanticDashUiDashReactLib.distCommonjsViewsAdvertisementAdvertisementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisementProps
  extends StrictAdvertisementProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object AdvertisementProps {
  @scala.inline
  def apply(
    unit: (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`medium rectangle`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`large rectangle`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`vertical rectangle`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`small rectangle`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`mobile banner`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.banner | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`vertical banner`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top banner`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`half banner`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.button | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`square button`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`small button`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.skyscraper | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`wide skyscraper`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.leaderboard | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`large leaderboard`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`mobile leaderboard`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.billboard | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.panorama | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.netboard | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`half page`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.square | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`small square`),
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    test: scala.Boolean | java.lang.String | scala.Double = null
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

