package typings.sharepoint.SP.JsGrid

import typings.microsoftDashAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControl extends js.Object {
  var Focus: js.UndefOr[js.Function1[/* eventInfo */ DomEvent, Unit]] = js.undefined
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.undefined
  var GetInputElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.undefined
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var OnCellMove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, Unit]] = js.undefined
  var SetSize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.undefined
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, Unit]] = js.undefined
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.undefined
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.undefined
  def BindToCell(cellContext: IEditControlCellContext): Unit
  def Dispose(): Unit
  def OnBeginEdit(eventInfo: DomEvent): Unit
  def OnEndEdit(): Unit
  def Unbind(): Unit
}

object IEditControl {
  @scala.inline
  def apply(
    BindToCell: IEditControlCellContext => Unit,
    Dispose: () => Unit,
    OnBeginEdit: DomEvent => Unit,
    OnEndEdit: () => Unit,
    Unbind: () => Unit,
    Focus: /* eventInfo */ DomEvent => Unit = null,
    GetCellContext: () => IEditControlCellContext = null,
    GetInputElement: () => HTMLElement = null,
    GetOriginalValue: () => IValue = null,
    IsCurrentlyUsingGridTextInputElement: () => Boolean = null,
    OnCellMove: () => Unit = null,
    OnValueChanged: /* newValue */ IValue => Unit = null,
    SetSize: (/* width */ Double, /* height */ Double) => Unit = null,
    SetValue: /* value */ IValue => Unit = null,
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
    if (SupportedReadMode != null) __obj.updateDynamic("SupportedReadMode")(SupportedReadMode.asInstanceOf[js.Any])
    if (SupportedWriteMode != null) __obj.updateDynamic("SupportedWriteMode")(SupportedWriteMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControl]
  }
}

