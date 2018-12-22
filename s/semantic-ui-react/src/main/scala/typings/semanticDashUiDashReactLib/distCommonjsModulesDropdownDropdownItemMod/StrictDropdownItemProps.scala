package typings
package semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictDropdownItemProps extends js.Object {
  /** Style as the currently chosen item. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Additional text with less emphasis. */
  var description: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlSpanProps]
  ] = js.undefined
  /** A dropdown item can be disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for Flag. */
  var flag: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsFlagFlagMod.FlagProps]
  ] = js.undefined
  /** Shorthand for Icon. */
  var icon: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps]
  ] = js.undefined
  /** Shorthand for Image. */
  var image: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsImageImageMod.ImageProps]
  ] = js.undefined
  /** Shorthand for Label. */
  var label: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps]
  ] = js.undefined
  /**
     * Called on click.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ DropdownItemProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * The item currently selected by keyboard shortcut.
     * This is not the active item.
     */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** Display text. */
  var text: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Stored value. */
  var value: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
}

