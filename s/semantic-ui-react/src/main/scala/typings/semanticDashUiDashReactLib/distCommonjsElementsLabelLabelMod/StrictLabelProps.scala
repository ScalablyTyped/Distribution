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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
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

