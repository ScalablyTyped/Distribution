package typings.sharepoint.SP.UI.ApplicationPages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ICalendarController extends js.Object {
  def collapseAll(): Unit = js.native
  def deleteItem(itemId: String): Unit = js.native
  def expandAll(): Unit = js.native
  def getActiveScope(): CalendarScope = js.native
  def moveToDate(date: String): Unit = js.native
  def moveToView(scope: CalendarScope): Unit = js.native
  def moveToViewDate(scope: CalendarScope, date: String): Unit = js.native
  def moveToViewType(viewType: String): Unit = js.native
  def newItemDialog(contentTypeId: String): Unit = js.native
  def refreshItems(): Unit = js.native
}

object ICalendarController {
  @scala.inline
  def apply(
    collapseAll: () => Unit,
    deleteItem: String => Unit,
    expandAll: () => Unit,
    getActiveScope: () => CalendarScope,
    moveToDate: String => Unit,
    moveToView: CalendarScope => Unit,
    moveToViewDate: (CalendarScope, String) => Unit,
    moveToViewType: String => Unit,
    newItemDialog: String => Unit,
    refreshItems: () => Unit
  ): ICalendarController = {
    val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), deleteItem = js.Any.fromFunction1(deleteItem), expandAll = js.Any.fromFunction0(expandAll), getActiveScope = js.Any.fromFunction0(getActiveScope), moveToDate = js.Any.fromFunction1(moveToDate), moveToView = js.Any.fromFunction1(moveToView), moveToViewDate = js.Any.fromFunction2(moveToViewDate), moveToViewType = js.Any.fromFunction1(moveToViewType), newItemDialog = js.Any.fromFunction1(newItemDialog), refreshItems = js.Any.fromFunction0(refreshItems))
    __obj.asInstanceOf[ICalendarController]
  }
  @scala.inline
  implicit class ICalendarControllerOps[Self <: ICalendarController] (val x: Self) extends AnyVal {
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
    def setCollapseAll(value: () => Unit): Self = this.set("collapseAll", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteItem(value: String => Unit): Self = this.set("deleteItem", js.Any.fromFunction1(value))
    @scala.inline
    def setExpandAll(value: () => Unit): Self = this.set("expandAll", js.Any.fromFunction0(value))
    @scala.inline
    def setGetActiveScope(value: () => CalendarScope): Self = this.set("getActiveScope", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveToDate(value: String => Unit): Self = this.set("moveToDate", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveToView(value: CalendarScope => Unit): Self = this.set("moveToView", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveToViewDate(value: (CalendarScope, String) => Unit): Self = this.set("moveToViewDate", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveToViewType(value: String => Unit): Self = this.set("moveToViewType", js.Any.fromFunction1(value))
    @scala.inline
    def setNewItemDialog(value: String => Unit): Self = this.set("newItemDialog", js.Any.fromFunction1(value))
    @scala.inline
    def setRefreshItems(value: () => Unit): Self = this.set("refreshItems", js.Any.fromFunction0(value))
  }
  
}

