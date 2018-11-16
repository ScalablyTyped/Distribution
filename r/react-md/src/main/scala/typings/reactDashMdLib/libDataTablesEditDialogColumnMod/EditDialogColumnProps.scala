package typings
package reactDashMdLib.libDataTablesEditDialogColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashMdLib.libTextFieldsTextFieldMod.SharedTextFieldProps because Would inherit conflicting mutable fields List(fullWidth, block))*/

trait EditDialogColumnProps
  extends reactDashMdLib.libHelpersLayoverMod.SharedLayoverProps
     with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps {
  var animationPosition: js.UndefOr[reactDashMdLib.libHelpersLayoverMod.LayoverPositions] = js.undefined
  var cancelLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var cancelProps: js.UndefOr[js.Object] = js.undefined
  var cancelSecondary: js.UndefOr[scala.Boolean] = js.undefined
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var dialogClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogContentClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogContentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var dialogId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var dialogStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
     * @deprecated
     */
  var enforceMinWidth: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[scala.Boolean] = js.undefined
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
  var large: js.UndefOr[scala.Boolean] = js.undefined
  var layoverClassName: js.UndefOr[java.lang.String] = js.undefined
  var layoverStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onOutsideClick: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], scala.Unit]
  ] = js.undefined
  /**
     * @deprecated
     */
  var scrollThreshold: js.UndefOr[scala.Double] = js.undefined
  var simplifiedDialog: js.UndefOr[scala.Boolean] = js.undefined
  var textFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * @deprecated
     */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var visibleOnFocus: js.UndefOr[scala.Boolean] = js.undefined
}

