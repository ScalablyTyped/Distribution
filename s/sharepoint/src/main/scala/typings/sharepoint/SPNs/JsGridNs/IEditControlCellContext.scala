package typings.sharepoint.SPNs.JsGridNs

import typings.sharepoint.Anon_Bottom
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControlCellContext extends IEditActorCellContext {
  var cellHeight: Double
   // TODO: Determine correct type
  var cellRect: js.Any
  var cellStyle: js.Any
  var cellWidth: Double
  def Hide(element: HTMLElement): Unit
  def NotifyEditComplete(): Unit
  def NotifyExpandControl(): Unit
  def Show(element: HTMLElement): Unit
}

object IEditControlCellContext {
  @scala.inline
  def apply(
    Hide: HTMLElement => Unit,
    NotifyEditComplete: () => Unit,
    NotifyExpandControl: () => Unit,
    SetCurrentValue: js.Any => Unit,
    Show: HTMLElement => Unit,
    cellExpandSpace: Anon_Bottom,
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
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1(Hide), NotifyEditComplete = js.Any.fromFunction0(NotifyEditComplete), NotifyExpandControl = js.Any.fromFunction0(NotifyExpandControl), SetCurrentValue = js.Any.fromFunction1(SetCurrentValue), Show = js.Any.fromFunction1(Show), cellExpandSpace = cellExpandSpace, cellHeight = cellHeight, cellRect = cellRect, cellStyle = cellStyle, cellWidth = cellWidth, column = column, field = field, fieldKey = fieldKey, originalValue = originalValue, propType = propType, record = record)
  
    __obj.asInstanceOf[IEditControlCellContext]
  }
}

