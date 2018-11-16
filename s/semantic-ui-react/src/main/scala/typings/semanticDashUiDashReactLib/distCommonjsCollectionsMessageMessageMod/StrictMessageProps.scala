package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsMessageMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictMessageProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A message can be formatted to attach itself to other content. */
  var attached: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top
  ] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A message can be formatted to be different colors. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** A message can only take up the width of its content. */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A message may be formatted to display a negative message. Same as `negative`. */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** A message can float above content that it is related to. */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for MessageHeader. */
  var header: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsCollectionsMessageMessageHeaderMod.MessageHeaderProps
    ]
  ] = js.undefined
  /** A message can be hidden. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Add an icon by icon name or pass an <Icon /.> */
  var icon: js.UndefOr[js.Any | scala.Boolean] = js.undefined
  /** A message may be formatted to display information. */
  var info: js.UndefOr[scala.Boolean] = js.undefined
  /** Array shorthand items for the MessageList. Mutually exclusive with children. */
  var list: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
    ]
  ] = js.undefined
  /** A message may be formatted to display a negative message. Same as `error`. */
  var negative: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * A message that the user can choose to hide.
     * Called when the user clicks the "x" icon. This also adds the "x" icon.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onDismiss: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ MessageProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A message may be formatted to display a positive message.  Same as `success`. */
  var positive: js.UndefOr[scala.Boolean] = js.undefined
  /** A message can have different sizes. */
  var size: js.UndefOr[MessageSizeProp] = js.undefined
  /** A message may be formatted to display a positive message.  Same as `positive`. */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /** A message can be set to visible to force itself to be shown. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** A message may be formatted to display warning messages. */
  var warning: js.UndefOr[scala.Boolean] = js.undefined
}

