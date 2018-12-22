package typings
package semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictCheckboxProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Whether or not checkbox is checked. */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** The initial value of checked. */
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not checkbox is indeterminate. */
  var defaultIndeterminate: js.UndefOr[scala.Boolean] = js.undefined
  /** A checkbox can appear disabled and be unable to change states */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Removes padding for a label. Auto applied when there is no label. */
  var fitted: js.UndefOr[scala.Boolean] = js.undefined
  /** A unique identifier. */
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Whether or not checkbox is indeterminate. */
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  /** The text of the associated label element. */
  var label: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlLabelProps]
  ] = js.undefined
  /** The HTML input name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Called when the user attempts to change the checked state.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props and proposed checked/indeterminate state.
     */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLInputElement], 
      /* data */ CheckboxProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when the checkbox or label is clicked.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props and current checked/indeterminate state.
     */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ CheckboxProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when the user presses down on the mouse.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props and current checked/indeterminate state.
     */
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ CheckboxProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when the user releases the mouse.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props and current checked/indeterminate state.
     */
  var onMouseUp: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ CheckboxProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Format as a radio element. This means it is an exclusive option. */
  var radio: js.UndefOr[scala.Boolean] = js.undefined
  /** A checkbox can be read-only and unable to change states. */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Format to emphasize the current selection state. */
  var slider: js.UndefOr[scala.Boolean] = js.undefined
  /** A checkbox can receive focus. */
  var tabIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Format to show an on or off choice. */
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
  /** HTML input type, either checkbox or radio. */
  var `type`: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.checkbox | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.radio
  ] = js.undefined
  /** The HTML input value. */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

