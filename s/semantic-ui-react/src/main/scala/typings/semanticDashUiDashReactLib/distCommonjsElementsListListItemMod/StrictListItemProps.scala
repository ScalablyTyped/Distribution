package typings
package semanticDashUiDashReactLib.distCommonjsElementsListListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictListItemProps extends js.Object {
  /** A list item can active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsElementsListListContentMod.ListContentProps
    ]
  ] = js.undefined
  /** Shorthand for ListDescription. */
  var description: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
    ]
  ] = js.undefined
  /** A list item can disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for ListHeader. */
  var header: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsListListHeaderMod.ListHeaderProps]
  ] = js.undefined
  /** Shorthand for ListIcon. */
  var icon: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsListListIconMod.ListIconProps]
  ] = js.undefined
  /** Shorthand for Image. */
  var image: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsImageImageMod.ImageProps]
  ] = js.undefined
  /**
     * Called on click.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
      /* data */ ListItemProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A value for an ordered list. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

