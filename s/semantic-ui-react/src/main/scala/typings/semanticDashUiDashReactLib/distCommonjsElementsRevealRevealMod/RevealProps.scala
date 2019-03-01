package typings
package semanticDashUiDashReactLib.distCommonjsElementsRevealRevealMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevealProps
  extends StrictRevealProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object RevealProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    animated: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.fade | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`small fade`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.move | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move up`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move down`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.rotate | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`rotate left`) = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    instant: js.UndefOr[scala.Boolean] = js.undefined
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

