package typings.semanticUiReact.revealRevealMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.`move down`
import typings.semanticUiReact.semanticUiReactStrings.`move right`
import typings.semanticUiReact.semanticUiReactStrings.`move up`
import typings.semanticUiReact.semanticUiReactStrings.`rotate left`
import typings.semanticUiReact.semanticUiReactStrings.`small fade`
import typings.semanticUiReact.semanticUiReactStrings.fade
import typings.semanticUiReact.semanticUiReactStrings.move
import typings.semanticUiReact.semanticUiReactStrings.rotate
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
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(instant)) __obj.updateDynamic("instant")(instant.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRevealProps]
  }
}

