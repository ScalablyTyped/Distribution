package typings
package reactDashMdLib.libSelectFieldsSelectFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libTextFieldsTextFieldMod.SharedTextFieldProps because var conflicts: block, fullWidth. Inlined name, inputStyle, inputClassName, paddedBlock, disabled, label, placeholder, `type`, active, error, floating, required, lineDirection, leftIcon, leftIconStateful, rightIcon, rightIconStateful, passwordIcon, passwordInitiallyVisible, rows, maxRows, customSize, errorText, helpText, helpOnFocus, maxLength, inlineIndicator, min, max, step, pattern, resize, tabIndex, passwordIconChildren, passwordIconClassName */ trait SharedSelectFieldProps
  extends reactDashMdLib.libMenusMenuMod.BaseMenuProps {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var customSize: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var deleteKeys: js.UndefOr[scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String])] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var errorText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  var getItemProps: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.undefined
  var helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var helpText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var inlineIndicator: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var itemLabel: js.UndefOr[java.lang.String] = js.undefined
  var itemProps: js.UndefOr[java.lang.String] = js.undefined
  var itemValue: js.UndefOr[java.lang.String] = js.undefined
  var keyboardMatchingTimeout: js.UndefOr[scala.Double] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var leftIconStateful: js.UndefOr[scala.Boolean] = js.undefined
  var lineDirection: js.UndefOr[reactDashMdLib.libTextFieldsTextFieldMod.TextFieldLineDirections] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  var menuId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var menuItems: js.UndefOr[
    js.Array[
      scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  var menuTransitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var menuTransitionLeaveTiemout: js.UndefOr[scala.Double] = js.undefined
  var menuTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* value */ scala.Double | java.lang.String, 
      /* selectedIndex */ scala.Double, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ FieldDataProps, 
      scala.Unit
    ]
  ] = js.undefined
  var onVisibilityChange: js.UndefOr[
    js.Function2[
      /* visible */ scala.Boolean, 
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
  var position: js.UndefOr[reactDashMdLib.libHelpersLayoverMod.LayoverPositions] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[reactDashMdLib.Anon_DisableShrink] = js.undefined
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var rightIconStateful: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var stripActiveItem: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var toggleClassName: js.UndefOr[java.lang.String] = js.undefined
  var toggleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var transitionTime: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[reactDashMdLib.libTextFieldsTextFieldMod.TextFieldTypes] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

