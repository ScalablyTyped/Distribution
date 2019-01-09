package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.StrictInputProps because var conflicts: as, children, className, disabled, error, label, `type`. Inlined action, actionPosition, fluid, focus, icon, iconPosition, input, inverted, labelPosition, loading, onChange, size, tabIndex, transparent */ trait StrictFormInputProps
  extends semanticDashUiDashReactLib.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps {
  /** An Input can be formatted to alert the user to an action they may perform. */
  var action: js.UndefOr[js.Any | scala.Boolean] = js.undefined
  /** An action can appear along side an Input on the left or right. */
  var actionPosition: js.UndefOr[semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left] = js.undefined
  /** Take on the size of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** An Input field can show a user is currently interacting with it. */
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional Icon to display inside the Input. */
  var icon: js.UndefOr[
    js.Any | semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputProps]
  ] = js.undefined
  /** An Icon can appear inside an Input on the left. */
  var iconPosition: js.UndefOr[semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left] = js.undefined
  /** Shorthand for creating the HTML Input. */
  var input: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlInputrops]
  ] = js.undefined
  /** Format to appear on dark backgrounds. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** A Label can appear outside an Input on the left or right. */
  var labelPosition: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`left corner`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`right corner`)
  ] = js.undefined
  /** Shorthand for a Label. */
  @JSName("label")
  var label_StrictFormInputProps: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps]
  ] = js.undefined
  /** An Icon Input field can show that it is currently loading data. */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called on change.
    *
    * @param {ChangeEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and a proposed value.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputOnChangeData, 
      scala.Unit
    ]
  ] = js.undefined
  /** An Input can vary in size. */
  var size: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES] = js.undefined
  /** An Input can receive focus. */
  var tabIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Transparent Input has no background. */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
}

