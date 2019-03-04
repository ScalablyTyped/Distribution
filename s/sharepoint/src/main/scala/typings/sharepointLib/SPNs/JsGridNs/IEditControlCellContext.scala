package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControlCellContext extends IEditActorCellContext {
  var cellHeight: scala.Double
   // TODO: Determine correct type
  var cellRect: js.Any
  var cellStyle: js.Any
  var cellWidth: scala.Double
  def Hide(element: stdLib.HTMLElement): scala.Unit
  def NotifyEditComplete(): scala.Unit
  def NotifyExpandControl(): scala.Unit
  def Show(element: stdLib.HTMLElement): scala.Unit
}

object IEditControlCellContext {
  @scala.inline
  def apply(
    Hide: js.Function1[stdLib.HTMLElement, scala.Unit],
    NotifyEditComplete: js.Function0[scala.Unit],
    NotifyExpandControl: js.Function0[scala.Unit],
    SetCurrentValue: js.Function1[js.Any, scala.Unit],
    Show: js.Function1[stdLib.HTMLElement, scala.Unit],
    cellExpandSpace: sharepointLib.Anon_Bottom,
    cellHeight: scala.Double,
    cellRect: js.Any,
    cellStyle: js.Any,
    cellWidth: scala.Double,
    column: ColumnInfo,
    field: GridField,
    fieldKey: java.lang.String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditControlCellContext = {
    val __obj = js.Dynamic.literal(Hide = Hide, NotifyEditComplete = NotifyEditComplete, NotifyExpandControl = NotifyExpandControl, SetCurrentValue = SetCurrentValue, Show = Show, cellExpandSpace = cellExpandSpace, cellHeight = cellHeight, cellRect = cellRect, cellStyle = cellStyle, cellWidth = cellWidth, column = column, field = field, fieldKey = fieldKey, originalValue = originalValue, propType = propType, record = record)
  
    __obj.asInstanceOf[IEditControlCellContext]
  }
}

