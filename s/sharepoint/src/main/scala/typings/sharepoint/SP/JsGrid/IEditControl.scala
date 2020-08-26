package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEditControl extends js.Object {
  var Focus: js.UndefOr[js.Function1[/* eventInfo */ DomEvent, Unit]] = js.native
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.native
  var GetInputElement: js.UndefOr[js.Function0[HTMLElement]] = js.native
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.native
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[Boolean]] = js.native
  var OnCellMove: js.UndefOr[js.Function0[Unit]] = js.native
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, Unit]] = js.native
  var SetSize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.native
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, Unit]] = js.native
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.native
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.native
  def BindToCell(cellContext: IEditControlCellContext): Unit = js.native
  def Dispose(): Unit = js.native
  def OnBeginEdit(eventInfo: DomEvent): Unit = js.native
  def OnEndEdit(): Unit = js.native
  def Unbind(): Unit = js.native
}

object IEditControl {
  @scala.inline
  def apply(
    BindToCell: IEditControlCellContext => Unit,
    Dispose: () => Unit,
    OnBeginEdit: DomEvent => Unit,
    OnEndEdit: () => Unit,
    Unbind: () => Unit
  ): IEditControl = {
    val __obj = js.Dynamic.literal(BindToCell = js.Any.fromFunction1(BindToCell), Dispose = js.Any.fromFunction0(Dispose), OnBeginEdit = js.Any.fromFunction1(OnBeginEdit), OnEndEdit = js.Any.fromFunction0(OnEndEdit), Unbind = js.Any.fromFunction0(Unbind))
    __obj.asInstanceOf[IEditControl]
  }
  @scala.inline
  implicit class IEditControlOps[Self <: IEditControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindToCell(value: IEditControlCellContext => Unit): Self = this.set("BindToCell", js.Any.fromFunction1(value))
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("Dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBeginEdit(value: DomEvent => Unit): Self = this.set("OnBeginEdit", js.Any.fromFunction1(value))
    @scala.inline
    def setOnEndEdit(value: () => Unit): Self = this.set("OnEndEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setUnbind(value: () => Unit): Self = this.set("Unbind", js.Any.fromFunction0(value))
    @scala.inline
    def setFocus(value: /* eventInfo */ DomEvent => Unit): Self = this.set("Focus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocus: Self = this.set("Focus", js.undefined)
    @scala.inline
    def setGetCellContext(value: () => IEditControlCellContext): Self = this.set("GetCellContext", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCellContext: Self = this.set("GetCellContext", js.undefined)
    @scala.inline
    def setGetInputElement(value: () => HTMLElement): Self = this.set("GetInputElement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInputElement: Self = this.set("GetInputElement", js.undefined)
    @scala.inline
    def setGetOriginalValue(value: () => IValue): Self = this.set("GetOriginalValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOriginalValue: Self = this.set("GetOriginalValue", js.undefined)
    @scala.inline
    def setIsCurrentlyUsingGridTextInputElement(value: () => Boolean): Self = this.set("IsCurrentlyUsingGridTextInputElement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsCurrentlyUsingGridTextInputElement: Self = this.set("IsCurrentlyUsingGridTextInputElement", js.undefined)
    @scala.inline
    def setOnCellMove(value: () => Unit): Self = this.set("OnCellMove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCellMove: Self = this.set("OnCellMove", js.undefined)
    @scala.inline
    def setOnValueChanged(value: /* newValue */ IValue => Unit): Self = this.set("OnValueChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValueChanged: Self = this.set("OnValueChanged", js.undefined)
    @scala.inline
    def setSetSize(value: (/* width */ Double, /* height */ Double) => Unit): Self = this.set("SetSize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetSize: Self = this.set("SetSize", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ IValue => Unit): Self = this.set("SetValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("SetValue", js.undefined)
    @scala.inline
    def setSupportedReadMode(value: EditActorReadType): Self = this.set("SupportedReadMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedReadMode: Self = this.set("SupportedReadMode", js.undefined)
    @scala.inline
    def setSupportedWriteMode(value: EditActorWriteType): Self = this.set("SupportedWriteMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedWriteMode: Self = this.set("SupportedWriteMode", js.undefined)
  }
  
}

