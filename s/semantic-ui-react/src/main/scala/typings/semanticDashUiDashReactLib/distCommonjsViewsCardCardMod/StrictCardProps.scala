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

