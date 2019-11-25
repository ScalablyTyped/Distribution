package typings.semanticDashUiDashReact.distCommonjsElementsRevealRevealMod

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

trait StrictRevealProps extends js.Object {
  /** An active reveal displays its hidden content. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An animation name that will be applied to Reveal. */
  var animated: js.UndefOr[
    fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
  ] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A disabled reveal will not animate when hovered. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** An element can show its content without delay. */
  var instant: js.UndefOr[Boolean] = js.undefined
}

object StrictRevealProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    animated: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`) = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    instant: js.UndefOr[Boolean] = js.undefined
  ): StrictRevealProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(instant)) __obj.updateDynamic("instant")(instant.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRevealProps]
  }
}

