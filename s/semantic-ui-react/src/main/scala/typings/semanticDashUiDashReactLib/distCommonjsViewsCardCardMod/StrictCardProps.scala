package typings
package semanticDashUiDashReactLib.distCommonjsViewsCardCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCardProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A Card can center itself inside its container. */
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A Card can be formatted to display different colors. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Shorthand for CardDescription. */
  var description: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsViewsCardCardDescriptionMod.CardDescriptionProps
    ]
  ] = js.undefined
  /** Shorthand for primary content of CardContent. */
  var extra: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A Card can be formatted to take up the width of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for CardHeader. */
  var header: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsCardCardHeaderMod.CardHeaderProps]
  ] = js.undefined
  /** Render as an `a` tag instead of a `div` and adds the href attribute. */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** A card can contain an Image component. */
  var image: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsImageImageMod.ImageProps]
  ] = js.undefined
  /** A card can be formatted to link to other content. */
  var link: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for CardMeta. */
  var meta: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsCardCardMetaMod.CardMetaProps]
  ] = js.undefined
  /**
    * Called on click. When passed, the component renders as an `a`
    * tag by default instead of a `div`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ CardProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A Card can be formatted to raise above the page. */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictCardProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    description: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsViewsCardCardDescriptionMod.CardDescriptionProps
    ] = null,
    extra: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    header: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsCardCardHeaderMod.CardHeaderProps] = null,
    href: java.lang.String = null,
    image: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsImageImageMod.ImageProps] = null,
    link: js.UndefOr[scala.Boolean] = js.undefined,
    meta: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsCardCardMetaMod.CardMetaProps] = null,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ CardProps, 
      scala.Unit
    ] = null,
    raised: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictCardProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    __obj.asInstanceOf[StrictCardProps]
  }
}

