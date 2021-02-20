package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditControl extends StObject {
  
  def BindToCell(cellContext: IEditControlCellContext): Unit = js.native
  
  def Dispose(): Unit = js.native
  
  var Focus: js.UndefOr[js.Function1[/* eventInfo */ DomEvent, Unit]] = js.native
  
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.native
  
  var GetInputElement: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.native
  
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[Boolean]] = js.native
  
  def OnBeginEdit(eventInfo: DomEvent): Unit = js.native
  
  var OnCellMove: js.UndefOr[js.Function0[Unit]] = js.native
  
  def OnEndEdit(): Unit = js.native
  
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, Unit]] = js.native
  
  var SetSize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.native
  
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, Unit]] = js.native
  
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.native
  
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.native
  
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
  implicit class IEditControlMutableBuilder[Self <: IEditControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindToCell(value: IEditControlCellContext => Unit): Self = StObject.set(x, "BindToCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "Dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: /* eventInfo */ DomEvent => Unit): Self = StObject.set(x, "Focus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "Focus", js.undefined)
    
    @scala.inline
    def setGetCellContext(value: () => IEditControlCellContext): Self = StObject.set(x, "GetCellContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCellContextUndefined: Self = StObject.set(x, "GetCellContext", js.undefined)
    
    @scala.inline
    def setGetInputElement(value: () => HTMLElement): Self = StObject.set(x, "GetInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputElementUndefined: Self = StObject.set(x, "GetInputElement", js.undefined)
    
    @scala.inline
    def setGetOriginalValue(value: () => IValue): Self = StObject.set(x, "GetOriginalValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOriginalValueUndefined: Self = StObject.set(x, "GetOriginalValue", js.undefined)
    
    @scala.inline
    def setIsCurrentlyUsingGridTextInputElement(value: () => Boolean): Self = StObject.set(x, "IsCurrentlyUsingGridTextInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCurrentlyUsingGridTextInputElementUndefined: Self = StObject.set(x, "IsCurrentlyUsingGridTextInputElement", js.undefined)
    
    @scala.inline
    def setOnBeginEdit(value: DomEvent => Unit): Self = StObject.set(x, "OnBeginEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCellMove(value: () => Unit): Self = StObject.set(x, "OnCellMove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCellMoveUndefined: Self = StObject.set(x, "OnCellMove", js.undefined)
    
    @scala.inline
    def setOnEndEdit(value: () => Unit): Self = StObject.set(x, "OnEndEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnValueChanged(value: /* newValue */ IValue => Unit): Self = StObject.set(x, "OnValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangedUndefined: Self = StObject.set(x, "OnValueChanged", js.undefined)
    
    @scala.inline
    def setSetSize(value: (/* width */ Double, /* height */ Double) => Unit): Self = StObject.set(x, "SetSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSizeUndefined: Self = StObject.set(x, "SetSize", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ IValue => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "SetValue", js.undefined)
    
    @scala.inline
    def setSupportedReadMode(value: EditActorReadType): Self = StObject.set(x, "SupportedReadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedReadModeUndefined: Self = StObject.set(x, "SupportedReadMode", js.undefined)
    
    @scala.inline
    def setSupportedWriteMode(value: EditActorWriteType): Self = StObject.set(x, "SupportedWriteMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedWriteModeUndefined: Self = StObject.set(x, "SupportedWriteMode", js.undefined)
    
    @scala.inline
    def setUnbind(value: () => Unit): Self = StObject.set(x, "Unbind", js.Any.fromFunction0(value))
  }
}
