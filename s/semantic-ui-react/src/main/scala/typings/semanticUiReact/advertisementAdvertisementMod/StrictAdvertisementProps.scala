package typings.semanticUiReact.advertisementAdvertisementMod

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

trait StrictAdvertisementProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Center the advertisement. */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Text to be displayed on the advertisement. */
  var test: js.UndefOr[Boolean | String | Double] = js.undefined
  /** Varies the size of the advertisement. */
  var unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
}

object StrictAdvertisementProps {
  @scala.inline
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`),
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    test: Boolean | String | Double = null
  ): StrictAdvertisementProps = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAdvertisementProps]
  }
}

