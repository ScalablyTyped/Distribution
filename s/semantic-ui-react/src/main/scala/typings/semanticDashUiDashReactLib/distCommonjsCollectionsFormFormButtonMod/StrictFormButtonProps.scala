package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- semanticDashUiDashReactLib.distCommonjsElementsButtonButtonMod.StrictButtonProps because var conflicts: as, children, className, content, disabled, label. Inlined active, animated, attached, basic, circular, color, compact, floated, fluid, icon, inverted, labelPosition, loading, negative, onClick, positive, primary, role, secondary, size, tabIndex, toggle */ trait StrictFormButtonProps
  extends semanticDashUiDashReactLib.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps {
  /** A button can show it is currently the active user selection. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can animate to show hidden content. */
  var animated: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.fade | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertical
  ] = js.undefined
  /** A button can be attached to other content. */
  var attached: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom
  ] = js.undefined
  /** A basic button is less pronounced. */
  var basic: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can be circular. */
  var circular: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can have different colors. */
  var color: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.facebook | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`google plus`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vk | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.twitter | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.linkedin | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.instagram | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.youtube
  ] = js.undefined
  /** A button can reduce its padding to fit into tighter spaces. */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can be aligned to the left or right of its container. */
  var floated: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS] = js.undefined
  /** A button can take the width of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** Add an Icon by name, props object, or pass an <Icon />. */
  var icon: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps]
  ] = js.undefined
  /** A button can be formatted to appear on dark backgrounds. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** A labeled button can format a Label or Icon to appear on the left or right. */
  var labelPosition: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left
  ] = js.undefined
  /** Shorthand for a Label. */
  @JSName("label")
  var label_StrictFormButtonProps: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps]
  ] = js.undefined
  /** A button can show a loading indicator. */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can hint towards a negative consequence. */
  var negative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called after user's click.
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsElementsButtonButtonMod.ButtonProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A button can hint towards a positive consequence. */
  var positive: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can be formatted to show different levels of emphasis. */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /** The role of the HTML element. */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** A button can be formatted to show different levels of emphasis. */
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can have different sizes. */
  var size: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES] = js.undefined
  /** A button can receive focus. */
  var tabIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** A button can be formatted to toggle on and off. */
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
}

