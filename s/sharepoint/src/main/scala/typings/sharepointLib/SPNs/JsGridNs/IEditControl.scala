package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControl extends js.Object {
  var Focus: js.UndefOr[
    js.Function1[/* eventInfo */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit]
  ] = js.undefined
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.undefined
  var GetInputElement: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.undefined
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var OnCellMove: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, scala.Unit]] = js.undefined
  var SetSize: js.UndefOr[js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]] = js.undefined
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, scala.Unit]] = js.undefined
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.undefined
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.undefined
  def BindToCell(cellContext: IEditControlCellContext): scala.Unit
  def Dispose(): scala.Unit
  def OnBeginEdit(eventInfo: microsoftDashAjaxLib.SysNs.UINs.DomEvent): scala.Unit
  def OnEndEdit(): scala.Unit
  def Unbind(): scala.Unit
}

object IEditControl {
  @scala.inline
  def apply(
    BindToCell: IEditControlCellContext => scala.Unit,
    Dispose: () => scala.Unit,
    OnBeginEdit: microsoftDashAjaxLib.SysNs.UINs.DomEvent => scala.Unit,
    OnEndEdit: () => scala.Unit,
    Unbind: () => scala.Unit,
    Focus: /* eventInfo */ microsoftDashAjaxLib.SysNs.UINs.DomEvent => scala.Unit = null,
    GetCellContext: () => IEditControlCellContext = null,
    GetInputElement: () => stdLib.HTMLElement = null,
    GetOriginalValue: () => IValue = null,
    IsCurrentlyUsingGridTextInputElement: () => scala.Boolean = null,
    OnCellMove: () => scala.Unit = null,
    OnValueChanged: /* newValue */ IValue => scala.Unit = null,
    SetSize: (/* width */ scala.Double, /* height */ scala.Double) => scala.Unit = null,
    SetValue: /* value */ IValue => scala.Unit = null,
    SupportedReadMode: EditActorReadType = null,
    SupportedWriteMode: EditActorWriteType = null
  ): IEditControl = {
    val __obj = js.Dynamic.literal(BindToCell = js.Any.fromFunction1(BindToCell), Dispose = js.Any.fromFunction0(Dispose), OnBeginEdit = js.Any.fromFunction1(OnBeginEdit), OnEndEdit = js.Any.fromFunction0(OnEndEdit), Unbind = js.Any.fromFunction0(Unbind))
    if (Focus != null) __obj.updateDynamic("Focus")(js.Any.fromFunction1(Focus))
    if (GetCellContext != null) __obj.updateDynamic("GetCellContext")(js.Any.fromFunction0(GetCellContext))
    if (GetInputElement != null) __obj.updateDynamic("GetInputElement")(js.Any.fromFunction0(GetInputElement))
    if (GetOriginalValue != null) __obj.updateDynamic("GetOriginalValue")(js.Any.fromFunction0(GetOriginalValue))
    if (IsCurrentlyUsingGridTextInputElement != null) __obj.updateDynamic("IsCurrentlyUsingGridTextInputElement")(js.Any.fromFunction0(IsCurrentlyUsingGridTextInputElement))
    if (OnCellMove != null) __obj.updateDynamic("OnCellMove")(js.Any.fromFunction0(OnCellMove))
    if (OnValueChanged != null) __obj.updateDynamic("OnValueChanged")(js.Any.fromFunction1(OnValueChanged))
    if (SetSize != null) __obj.updateDynamic("SetSize")(js.Any.fromFunction2(SetSize))
    if (SetValue != null) __obj.updateDynamic("SetValue")(js.Any.fromFunction1(SetValue))
    if (SupportedReadMode != null) __obj.updateDynamic("SupportedReadMode")(SupportedReadMode)
    if (SupportedWriteMode != null) __obj.updateDynamic("SupportedWriteMode")(SupportedWriteMode)
    __obj.asInstanceOf[IEditControl]
  }
}

