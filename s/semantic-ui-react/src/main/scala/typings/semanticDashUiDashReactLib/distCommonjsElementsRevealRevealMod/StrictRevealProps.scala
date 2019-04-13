package typings
package semanticDashUiDashReactLib.distCommonjsElementsRevealRevealMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRevealProps extends js.Object {
  /** An active reveal displays its hidden content. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An animation name that will be applied to Reveal. */
  var animated: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.fade | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`small fade`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.move | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move up`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move down`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.rotate | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`rotate left`)
  ] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A disabled reveal will not animate when hovered. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** An element can show its content without delay. */
  var instant: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictRevealProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    animated: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.fade | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`small fade`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.move | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move up`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`move down`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.rotate | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`rotate left`) = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    instant: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictRevealProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(instant)) __obj.updateDynamic("instant")(instant)
    __obj.asInstanceOf[StrictRevealProps]
  }
}

