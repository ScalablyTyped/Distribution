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
    BindToCell: js.Function1[IEditControlCellContext, scala.Unit],
    Dispose: js.Function0[scala.Unit],
    OnBeginEdit: js.Function1[microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit],
    OnEndEdit: js.Function0[scala.Unit],
    Unbind: js.Function0[scala.Unit],
    Focus: js.Function1[/* eventInfo */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit] = null,
    GetCellContext: js.Function0[IEditControlCellContext] = null,
    GetInputElement: js.Function0[stdLib.HTMLElement] = null,
    GetOriginalValue: js.Function0[IValue] = null,
    IsCurrentlyUsingGridTextInputElement: js.Function0[scala.Boolean] = null,
    OnCellMove: js.Function0[scala.Unit] = null,
    OnValueChanged: js.Function1[/* newValue */ IValue, scala.Unit] = null,
    SetSize: js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit] = null,
    SetValue: js.Function1[/* value */ IValue, scala.Unit] = null,
    SupportedReadMode: EditActorReadType = null,
    SupportedWriteMode: EditActorWriteType = null
  ): IEditControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BindToCell")(BindToCell)
    __obj.updateDynamic("Dispose")(Dispose)
    __obj.updateDynamic("OnBeginEdit")(OnBeginEdit)
    __obj.updateDynamic("OnEndEdit")(OnEndEdit)
    __obj.updateDynamic("Unbind")(Unbind)
    if (Focus != null) __obj.updateDynamic("Focus")(Focus)
    if (GetCellContext != null) __obj.updateDynamic("GetCellContext")(GetCellContext)
    if (GetInputElement != null) __obj.updateDynamic("GetInputElement")(GetInputElement)
    if (GetOriginalValue != null) __obj.updateDynamic("GetOriginalValue")(GetOriginalValue)
    if (IsCurrentlyUsingGridTextInputElement != null) __obj.updateDynamic("IsCurrentlyUsingGridTextInputElement")(IsCurrentlyUsingGridTextInputElement)
    if (OnCellMove != null) __obj.updateDynamic("OnCellMove")(OnCellMove)
    if (OnValueChanged != null) __obj.updateDynamic("OnValueChanged")(OnValueChanged)
    if (SetSize != null) __obj.updateDynamic("SetSize")(SetSize)
    if (SetValue != null) __obj.updateDynamic("SetValue")(SetValue)
    if (SupportedReadMode != null) __obj.updateDynamic("SupportedReadMode")(SupportedReadMode)
    if (SupportedWriteMode != null) __obj.updateDynamic("SupportedWriteMode")(SupportedWriteMode)
    __obj.asInstanceOf[IEditControl]
  }
}

