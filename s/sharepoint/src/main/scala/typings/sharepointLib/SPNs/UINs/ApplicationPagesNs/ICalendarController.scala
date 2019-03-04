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
    collapseAll: js.Function0[scala.Unit],
    deleteItem: js.Function1[java.lang.String, scala.Unit],
    expandAll: js.Function0[scala.Unit],
    getActiveScope: js.Function0[CalendarScope],
    moveToDate: js.Function1[java.lang.String, scala.Unit],
    moveToView: js.Function1[CalendarScope, scala.Unit],
    moveToViewDate: js.Function2[CalendarScope, java.lang.String, scala.Unit],
    moveToViewType: js.Function1[java.lang.String, scala.Unit],
    newItemDialog: js.Function1[java.lang.String, scala.Unit],
    refreshItems: js.Function0[scala.Unit]
  ): ICalendarController = {
    val __obj = js.Dynamic.literal(collapseAll = collapseAll, deleteItem = deleteItem, expandAll = expandAll, getActiveScope = getActiveScope, moveToDate = moveToDate, moveToView = moveToView, moveToViewDate = moveToViewDate, moveToViewType = moveToViewType, newItemDialog = newItemDialog, refreshItems = refreshItems)
  
    __obj.asInstanceOf[ICalendarController]
  }
}

