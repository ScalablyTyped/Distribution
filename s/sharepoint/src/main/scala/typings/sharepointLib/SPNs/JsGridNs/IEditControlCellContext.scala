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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Hide")(Hide)
    __obj.updateDynamic("NotifyEditComplete")(NotifyEditComplete)
    __obj.updateDynamic("NotifyExpandControl")(NotifyExpandControl)
    __obj.updateDynamic("SetCurrentValue")(SetCurrentValue)
    __obj.updateDynamic("Show")(Show)
    __obj.updateDynamic("cellExpandSpace")(cellExpandSpace)
    __obj.updateDynamic("cellHeight")(cellHeight)
    __obj.updateDynamic("cellRect")(cellRect)
    __obj.updateDynamic("cellStyle")(cellStyle)
    __obj.updateDynamic("cellWidth")(cellWidth)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("fieldKey")(fieldKey)
    __obj.updateDynamic("originalValue")(originalValue)
    __obj.updateDynamic("propType")(propType)
    __obj.updateDynamic("record")(record)
    __obj.asInstanceOf[IEditControlCellContext]
  }
}

