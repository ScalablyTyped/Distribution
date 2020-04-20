package typings.sharepoint.SP.UI.ApplicationPages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ICalendarController extends js.Object {
  def collapseAll(): Unit
  def deleteItem(itemId: String): Unit
  def expandAll(): Unit
  def getActiveScope(): CalendarScope
  def moveToDate(date: String): Unit
  def moveToView(scope: CalendarScope): Unit
  def moveToViewDate(scope: CalendarScope, date: String): Unit
  def moveToViewType(viewType: String): Unit
  def newItemDialog(contentTypeId: String): Unit
  def refreshItems(): Unit
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
}

