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

