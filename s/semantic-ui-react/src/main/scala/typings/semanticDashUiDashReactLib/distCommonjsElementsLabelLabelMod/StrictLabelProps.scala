package typings
package semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictLabelProps extends js.Object {
  /** A label can be active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A label can attach to a content segment. */
  var attached: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom right`)
  ] = js.undefined
  /** A label can reduce its complexity. */
  var basic: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** A label can be circular. */
  var circular: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Color of the label. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A label can position itself in the corner of an element. */
  var corner: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** Shorthand for LabelDetail. */
  var detail: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsElementsLabelLabelDetailMod.LabelDetailProps
    ]
  ] = js.undefined
  /** Formats the label as a dot. */
  var empty: js.UndefOr[js.Any] = js.undefined
  /** Float above another element in the upper right corner. */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /** A horizontal label is formatted to label content along-side it horizontally. */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /** Add an icon by icon name or pass an <Icon /.> */
  var icon: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps]
  ] = js.undefined
  /** A label can be formatted to emphasize an image or prop can be used as shorthand for Image. */
  var image: js.UndefOr[js.Any] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ LabelProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Adds an "x" icon, called when "x" is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onRemove: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ LabelProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A label can point to content next to it. */
  var pointing: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.above | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.below | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** Shorthand for Icon to appear as the last child and trigger onRemove. */
  var removeIcon: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps]
  ] = js.undefined
  /** A label can appear as a ribbon attaching itself to an element. */
  var ribbon: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** A label can have different sizes. */
  var size: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES] = js.undefined
  /** A label can appear as a tag. */
  var tag: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictLabelProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    attached: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom right`) = null,
    basic: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    circular: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    corner: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    detail: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsElementsLabelLabelDetailMod.LabelDetailProps
    ] = null,
    empty: js.Any = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    icon: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps] = null,
    image: js.Any = null,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ LabelProps, 
      scala.Unit
    ] = null,
    onRemove: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ LabelProps, 
      scala.Unit
    ] = null,
    pointing: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.above | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.below | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    removeIcon: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps] = null,
    ribbon: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    size: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES = null,
    tag: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictLabelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (pointing != null) __obj.updateDynamic("pointing")(pointing.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (ribbon != null) __obj.updateDynamic("ribbon")(ribbon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[StrictLabelProps]
  }
}

