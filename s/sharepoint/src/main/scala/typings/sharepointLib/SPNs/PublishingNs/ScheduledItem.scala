package typings
package sharepointLib.SPNs.PublishingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.ScheduledItem")
@js.native
class ScheduledItem ()
  extends sharepointLib.SPNs.ClientObject {
  def get_endDate(): microsoftDashAjaxLib.Date = js.native
  def get_listItem(): sharepointLib.SPNs.ListItem[_] = js.native
  def get_startDate(): microsoftDashAjaxLib.Date = js.native
  def schedule(approvalComment: java.lang.String): scala.Unit = js.native
  def set_endDate(value: microsoftDashAjaxLib.Date): microsoftDashAjaxLib.Date = js.native
  def set_startDate(value: microsoftDashAjaxLib.Date): microsoftDashAjaxLib.Date = js.native
}

