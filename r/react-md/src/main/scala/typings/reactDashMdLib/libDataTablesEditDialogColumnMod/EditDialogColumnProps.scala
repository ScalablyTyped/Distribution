package typings
package reactDashMdLib.libDataTablesEditDialogColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libTextFieldsTextFieldMod.SharedTextFieldProps because var conflicts: block, fullWidth. Inlined name, inputStyle, inputClassName, paddedBlock, disabled, label, placeholder, `type`, active, error, floating, required, lineDirection, leftIcon, leftIconStateful, rightIcon, rightIconStateful, passwordIcon, passwordInitiallyVisible, rows, maxRows, customSize, errorText, helpText, helpOnFocus, maxLength, inlineIndicator, min, max, step, pattern, resize, tabIndex, passwordIconChildren, passwordIconClassName */ trait EditDialogColumnProps
  extends reactDashMdLib.libHelpersLayoverMod.SharedLayoverProps
     with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var animationPosition: js.UndefOr[reactDashMdLib.libHelpersLayoverMod.LayoverPositions] = js.undefined
  var cancelLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var cancelProps: js.UndefOr[js.Object] = js.undefined
  var cancelSecondary: js.UndefOr[scala.Boolean] = js.undefined
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  var customSize: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var dialogClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogContentClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogContentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var dialogId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var dialogStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var enforceMinWidth: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var errorText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[scala.Boolean] = js.undefined
  var helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var helpText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var inlineIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var inlineIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var inlineIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var inlineIndicator: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var large: js.UndefOr[scala.Boolean] = js.undefined
  var layoverClassName: js.UndefOr[java.lang.String] = js.undefined
  var layoverStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var leftIconStateful: js.UndefOr[scala.Boolean] = js.undefined
  var lineDirection: js.UndefOr[reactDashMdLib.libTextFieldsTextFieldMod.TextFieldLineDirections] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @deprecated
    */
  var noIcon: js.UndefOr[scala.Boolean] = js.undefined
  var okLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var okOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined
  var okPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var okProps: js.UndefOr[js.Object] = js.undefined
  var okSecondary: js.UndefOr[scala.Boolean] = js.undefined
  var onCancelClick: js.UndefOr[
    js.Function2[
      /* value */ scala.Double | java.lang.String, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ scala.Double | java.lang.String, 
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onOkClick: js.UndefOr[
    js.Function2[
      /* value */ scala.Double | java.lang.String, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onOutsideClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var paddedBlock: js.UndefOr[scala.Boolean] = js.undefined
  var passwordIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var passwordIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var passwordIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var passwordInitiallyVisible: js.UndefOr[scala.Boolean] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[reactDashMdLib.Anon_DisableShrink] = js.undefined
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var rightIconStateful: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  /**
    * @deprecated
    */
  var scrollThreshold: js.UndefOr[scala.Double] = js.undefined
  var simplifiedDialog: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var textFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[reactDashMdLib.libTextFieldsTextFieldMod.TextFieldTypes] = js.undefined
  var visibleOnFocus: js.UndefOr[scala.Boolean] = js.undefined
}

