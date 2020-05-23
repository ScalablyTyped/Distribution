package typings.semanticUiReact.imageImageMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.dimmerDimmerMod.DimmerProps
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.labelLabelMod.LabelProps
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictImageProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** An image may be formatted to appear inline with text as an avatar. */
  var avatar: js.UndefOr[Boolean] = js.undefined
  /** An image may include a border to emphasize the edges of white or transparent content. */
  var bordered: js.UndefOr[Boolean] = js.undefined
  /** An image can appear centered in a content block. */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** An image may appear circular. */
  var circular: js.UndefOr[Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Shorthand for Dimmer. */
  var dimmer: js.UndefOr[SemanticShorthandItem[DimmerProps]] = js.undefined
  /** An image can show that it is disabled and cannot be selected. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** An image can sit to the left or right of other content. */
  var floated: js.UndefOr[SemanticFLOATS] = js.undefined
  /** An image can take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** An image can be hidden. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** Renders the Image as an <a> tag with this href. */
  var href: js.UndefOr[String] = js.undefined
  /** An image may appear inline. */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for Label. */
  var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.undefined
  /** An image may appear rounded. */
  var rounded: js.UndefOr[Boolean] = js.undefined
  /** An image may appear at different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.undefined
  /** An image can specify that it needs an additional spacing to separate it from nearby content. */
  var spaced: js.UndefOr[Boolean | left | right] = js.undefined
  /** Whether or not to add the ui className. */
  var ui: js.UndefOr[Boolean] = js.undefined
  /** An image can specify its vertical alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  /** An image can render wrapped in a `div.ui.image` as alternative HTML markup. */
  var wrapped: js.UndefOr[Boolean] = js.undefined
}

object StrictImageProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    avatar: js.UndefOr[Boolean] = js.undefined,
    bordered: js.UndefOr[Boolean] = js.undefined,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    content: SemanticShorthandContent = null,
    dimmer: SemanticShorthandItem[DimmerProps] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[LabelProps] = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    size: SemanticSIZES = null,
    spaced: Boolean | left | right = null,
    ui: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    wrapped: js.UndefOr[Boolean] = js.undefined
  ): StrictImageProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(avatar)) __obj.updateDynamic("avatar")(avatar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dimmer != null) __obj.updateDynamic("dimmer")(dimmer.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spaced != null) __obj.updateDynamic("spaced")(spaced.asInstanceOf[js.Any])
    if (!js.isUndefined(ui)) __obj.updateDynamic("ui")(ui.get.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapped)) __obj.updateDynamic("wrapped")(wrapped.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictImageProps]
  }
}

