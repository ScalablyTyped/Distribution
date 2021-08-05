package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.Bottom
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditControlCellContext
  extends StObject
     with IEditActorCellContext {
  
  def Hide(element: HTMLElement): Unit
  
  def NotifyEditComplete(): Unit
  
  def NotifyExpandControl(): Unit
  
  def Show(element: HTMLElement): Unit
  
  var cellHeight: Double
  
  // TODO: Determine correct type
  var cellRect: js.Any
  
  var cellStyle: js.Any
  
  var cellWidth: Double
}
object IEditControlCellContext {
  
  inline def apply(
    Hide: HTMLElement => Unit,
    NotifyEditComplete: () => Unit,
    NotifyExpandControl: () => Unit,
    SetCurrentValue: js.Any => Unit,
    Show: HTMLElement => Unit,
    cellExpandSpace: Bottom,
    cellHeight: Double,
    cellRect: js.Any,
    cellStyle: js.Any,
    cellWidth: Double,
    column: ColumnInfo,
    field: GridField,
    fieldKey: String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditControlCellContext = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1(Hide), NotifyEditComplete = js.Any.fromFunction0(NotifyEditComplete), NotifyExpandControl = js.Any.fromFunction0(NotifyExpandControl), SetCurrentValue = js.Any.fromFunction1(SetCurrentValue), Show = js.Any.fromFunction1(Show), cellExpandSpace = cellExpandSpace.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellRect = cellRect.asInstanceOf[js.Any], cellStyle = cellStyle.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControlCellContext]
  }
  
  extension [Self <: IEditControlCellContext](x: Self) {
    
    inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellRect(value: js.Any): Self = StObject.set(x, "cellRect", value.asInstanceOf[js.Any])
    
    inline def setCellStyle(value: js.Any): Self = StObject.set(x, "cellStyle", value.asInstanceOf[js.Any])
    
    inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
    
    inline def setHide(value: HTMLElement => Unit): Self = StObject.set(x, "Hide", js.Any.fromFunction1(value))
    
    inline def setNotifyEditComplete(value: () => Unit): Self = StObject.set(x, "NotifyEditComplete", js.Any.fromFunction0(value))
    
    inline def setNotifyExpandControl(value: () => Unit): Self = StObject.set(x, "NotifyExpandControl", js.Any.fromFunction0(value))
    
    inline def setShow(value: HTMLElement => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction1(value))
  }
}
