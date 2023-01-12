package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditControl extends StObject {
  
  def BindToCell(cellContext: IEditControlCellContext): Unit
  
  def Dispose(): Unit
  
  var Focus: js.UndefOr[js.Function1[/* eventInfo */ DomEvent, Unit]] = js.undefined
  
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.undefined
  
  var GetInputElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.undefined
  
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  def OnBeginEdit(eventInfo: DomEvent): Unit
  
  var OnCellMove: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def OnEndEdit(): Unit
  
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, Unit]] = js.undefined
  
  var SetSize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.undefined
  
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, Unit]] = js.undefined
  
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.undefined
  
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.undefined
  
  def Unbind(): Unit
}
object IEditControl {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IEditControl] (val x: Self) extends AnyVal {
    
    inline def setBindToCell(value: IEditControlCellContext => Unit): Self = StObject.set(x, "BindToCell", js.Any.fromFunction1(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "Dispose", js.Any.fromFunction0(value))
    
    inline def setFocus(value: /* eventInfo */ DomEvent => Unit): Self = StObject.set(x, "Focus", js.Any.fromFunction1(value))
    
    inline def setFocusUndefined: Self = StObject.set(x, "Focus", js.undefined)
    
    inline def setGetCellContext(value: () => IEditControlCellContext): Self = StObject.set(x, "GetCellContext", js.Any.fromFunction0(value))
    
    inline def setGetCellContextUndefined: Self = StObject.set(x, "GetCellContext", js.undefined)
    
    inline def setGetInputElement(value: () => HTMLElement): Self = StObject.set(x, "GetInputElement", js.Any.fromFunction0(value))
    
    inline def setGetInputElementUndefined: Self = StObject.set(x, "GetInputElement", js.undefined)
    
    inline def setGetOriginalValue(value: () => IValue): Self = StObject.set(x, "GetOriginalValue", js.Any.fromFunction0(value))
    
    inline def setGetOriginalValueUndefined: Self = StObject.set(x, "GetOriginalValue", js.undefined)
    
    inline def setIsCurrentlyUsingGridTextInputElement(value: () => Boolean): Self = StObject.set(x, "IsCurrentlyUsingGridTextInputElement", js.Any.fromFunction0(value))
    
    inline def setIsCurrentlyUsingGridTextInputElementUndefined: Self = StObject.set(x, "IsCurrentlyUsingGridTextInputElement", js.undefined)
    
    inline def setOnBeginEdit(value: DomEvent => Unit): Self = StObject.set(x, "OnBeginEdit", js.Any.fromFunction1(value))
    
    inline def setOnCellMove(value: () => Unit): Self = StObject.set(x, "OnCellMove", js.Any.fromFunction0(value))
    
    inline def setOnCellMoveUndefined: Self = StObject.set(x, "OnCellMove", js.undefined)
    
    inline def setOnEndEdit(value: () => Unit): Self = StObject.set(x, "OnEndEdit", js.Any.fromFunction0(value))
    
    inline def setOnValueChanged(value: /* newValue */ IValue => Unit): Self = StObject.set(x, "OnValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "OnValueChanged", js.undefined)
    
    inline def setSetSize(value: (/* width */ Double, /* height */ Double) => Unit): Self = StObject.set(x, "SetSize", js.Any.fromFunction2(value))
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "SetSize", js.undefined)
    
    inline def setSetValue(value: /* value */ IValue => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "SetValue", js.undefined)
    
    inline def setSupportedReadMode(value: EditActorReadType): Self = StObject.set(x, "SupportedReadMode", value.asInstanceOf[js.Any])
    
    inline def setSupportedReadModeUndefined: Self = StObject.set(x, "SupportedReadMode", js.undefined)
    
    inline def setSupportedWriteMode(value: EditActorWriteType): Self = StObject.set(x, "SupportedWriteMode", value.asInstanceOf[js.Any])
    
    inline def setSupportedWriteModeUndefined: Self = StObject.set(x, "SupportedWriteMode", js.undefined)
    
    inline def setUnbind(value: () => Unit): Self = StObject.set(x, "Unbind", js.Any.fromFunction0(value))
  }
}
