package typings.semanticDashUiDashReact.distCommonjsElementsHeaderHeaderMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictHeaderProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Attach header  to other content, like a segment. */
  var attached: js.UndefOr[Boolean | top | bottom] = js.undefined
  /** Format header to appear inside a content block. */
  var block: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Color of the header. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[ReactNode] = js.undefined
  /** Show that the header is inactive. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Divide header from the content below it. */
  var dividing: js.UndefOr[Boolean] = js.undefined
  /** Header can sit to the left or right of other content. */
  var floated: js.UndefOr[SemanticFLOATS] = js.undefined
  /** Add an icon by icon name or pass an Icon. */
  var icon: js.UndefOr[js.Any] = js.undefined
  /** Add an image by img src or pass an Image. */
  var image: js.UndefOr[js.Any] = js.undefined
  /** Inverts the color of the header for dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Content headings are sized with em and are based on the font-size of their container. */
  var size: js.UndefOr[tiny | small | medium | large | huge] = js.undefined
  /** Headers may be formatted to label smaller or de-emphasized content. */
  var sub: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for Header.Subheader. */
  var subheader: js.UndefOr[js.Any] = js.undefined
  /** Align header content. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
}

object StrictHeaderProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    attached: Boolean | top | bottom = null,
    block: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    content: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dividing: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    icon: js.Any = null,
    image: js.Any = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    size: tiny | small | medium | large | huge = null,
    sub: js.UndefOr[Boolean] = js.undefined,
    subheader: js.Any = null,
    textAlign: SemanticTEXTALIGNMENTS = null
  ): StrictHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dividing)) __obj.updateDynamic("dividing")(dividing)
    if (floated != null) __obj.updateDynamic("floated")(floated)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sub)) __obj.updateDynamic("sub")(sub)
    if (subheader != null) __obj.updateDynamic("subheader")(subheader)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    __obj.asInstanceOf[StrictHeaderProps]
  }
}

