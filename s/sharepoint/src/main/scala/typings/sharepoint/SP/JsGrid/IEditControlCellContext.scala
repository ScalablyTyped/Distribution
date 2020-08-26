package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.Bottom
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEditControlCellContext extends IEditActorCellContext {
  var cellHeight: Double = js.native
   // TODO: Determine correct type
  var cellRect: js.Any = js.native
  var cellStyle: js.Any = js.native
  var cellWidth: Double = js.native
  def Hide(element: HTMLElement): Unit = js.native
  def NotifyEditComplete(): Unit = js.native
  def NotifyExpandControl(): Unit = js.native
  def Show(element: HTMLElement): Unit = js.native
}

object IEditControlCellContext {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class IEditControlCellContextOps[Self <: IEditControlCellContext] (val x: Self) extends AnyVal {
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
    def setHide(value: HTMLElement => Unit): Self = this.set("Hide", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyEditComplete(value: () => Unit): Self = this.set("NotifyEditComplete", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyExpandControl(value: () => Unit): Self = this.set("NotifyExpandControl", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: HTMLElement => Unit): Self = this.set("Show", js.Any.fromFunction1(value))
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellRect(value: js.Any): Self = this.set("cellRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellStyle(value: js.Any): Self = this.set("cellStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellWidth(value: Double): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
  }
  
}

