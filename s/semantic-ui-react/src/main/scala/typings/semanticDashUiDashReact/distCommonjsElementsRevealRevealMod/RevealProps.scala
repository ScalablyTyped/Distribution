package typings.semanticDashUiDashReact.distCommonjsElementsRevealRevealMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move down`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move right`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move up`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`rotate left`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small fade`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.fade
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.move
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.rotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevealProps
  extends StrictRevealProps
     with /* key */ StringDictionary[js.Any]

object RevealProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    animated: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`) = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    instant: js.UndefOr[Boolean] = js.undefined
  ): RevealProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(instant)) __obj.updateDynamic("instant")(instant)
    __obj.asInstanceOf[RevealProps]
  }
}

