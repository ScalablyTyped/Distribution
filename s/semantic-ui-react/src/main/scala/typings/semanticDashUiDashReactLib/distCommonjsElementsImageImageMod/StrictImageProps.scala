package typings
package semanticDashUiDashReactLib.distCommonjsElementsImageImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictImageProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** An image may be formatted to appear inline with text as an avatar. */
  var avatar: js.UndefOr[scala.Boolean] = js.undefined
  /** An image may include a border to emphasize the edges of white or transparent content. */
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  /** An image can appear centered in a content block. */
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** An image may appear circular. */
  var circular: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Shorthand for Dimmer. */
  var dimmer: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsModulesDimmerDimmerMod.DimmerProps]
  ] = js.undefined
  /** An image can show that it is disabled and cannot be selected. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** An image can sit to the left or right of other content. */
  var floated: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS] = js.undefined
  /** An image can take up the width of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** An image can be hidden. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Renders the Image as an <a> tag with this href. */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** An image may appear inline. */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for Label. */
  var label: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps]
  ] = js.undefined
  /** An image may appear rounded. */
  var rounded: js.UndefOr[scala.Boolean] = js.undefined
  /** An image may appear at different sizes. */
  var size: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES] = js.undefined
  /** An image can specify that it needs an additional spacing to separate it from nearby content. */
  var spaced: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** Whether or not to add the ui className. */
  var ui: js.UndefOr[scala.Boolean] = js.undefined
  /** An image can specify its vertical alignment. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
  /** An image can render wrapped in a `div.ui.image` as alternative HTML markup. */
  var wrapped: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictImageProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    avatar: js.UndefOr[scala.Boolean] = js.undefined,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    circular: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    dimmer: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsModulesDimmerDimmerMod.DimmerProps] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    floated: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    label: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps] = null,
    rounded: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES = null,
    spaced: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    ui: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null,
    wrapped: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictImageProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(avatar)) __obj.updateDynamic("avatar")(avatar)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular)
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dimmer != null) __obj.updateDynamic("dimmer")(dimmer.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (floated != null) __obj.updateDynamic("floated")(floated)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded)
    if (size != null) __obj.updateDynamic("size")(size)
    if (spaced != null) __obj.updateDynamic("spaced")(spaced.asInstanceOf[js.Any])
    if (!js.isUndefined(ui)) __obj.updateDynamic("ui")(ui)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(wrapped)) __obj.updateDynamic("wrapped")(wrapped)
    __obj.asInstanceOf[StrictImageProps]
  }
}

