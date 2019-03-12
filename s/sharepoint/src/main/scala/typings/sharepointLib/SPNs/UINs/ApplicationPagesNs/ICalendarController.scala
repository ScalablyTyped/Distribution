package typings
package sharepointLib.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ICalendarController extends js.Object {
  def collapseAll(): scala.Unit
  def deleteItem(itemId: java.lang.String): scala.Unit
  def expandAll(): scala.Unit
  def getActiveScope(): CalendarScope
  def moveToDate(date: java.lang.String): scala.Unit
  def moveToView(scope: CalendarScope): scala.Unit
  def moveToViewDate(scope: CalendarScope, date: java.lang.String): scala.Unit
  def moveToViewType(viewType: java.lang.String): scala.Unit
  def newItemDialog(contentTypeId: java.lang.String): scala.Unit
  def refreshItems(): scala.Unit
}

object ICalendarController {
  @scala.inline
  def apply(
    collapseAll: () => scala.Unit,
    deleteItem: java.lang.String => scala.Unit,
    expandAll: () => scala.Unit,
    getActiveScope: () => CalendarScope,
    moveToDate: java.lang.String => scala.Unit,
    moveToView: CalendarScope => scala.Unit,
    moveToViewDate: (CalendarScope, java.lang.String) => scala.Unit,
    moveToViewType: java.lang.String => scala.Unit,
    newItemDialog: java.lang.String => scala.Unit,
    refreshItems: () => scala.Unit
  ): ICalendarController = {
    val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), deleteItem = js.Any.fromFunction1(deleteItem), expandAll = js.Any.fromFunction0(expandAll), getActiveScope = js.Any.fromFunction0(getActiveScope), moveToDate = js.Any.fromFunction1(moveToDate), moveToView = js.Any.fromFunction1(moveToView), moveToViewDate = js.Any.fromFunction2(moveToViewDate), moveToViewType = js.Any.fromFunction1(moveToViewType), newItemDialog = js.Any.fromFunction1(newItemDialog), refreshItems = js.Any.fromFunction0(refreshItems))
  
    __obj.asInstanceOf[ICalendarController]
  }
}

