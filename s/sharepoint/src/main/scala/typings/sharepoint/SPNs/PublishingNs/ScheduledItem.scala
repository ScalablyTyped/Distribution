package typings.sharepoint.SPNs.PublishingNs

import typings.sharepoint.SPNs.ClientObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.ScheduledItem")
@js.native
class ScheduledItem () extends ClientObject {
  def get_endDate(): Date = js.native
  def get_listItem(): typings.sharepoint.SPNs.ListItem[_] = js.native
  def get_startDate(): Date = js.native
  def schedule(approvalComment: String): Unit = js.native
  def set_endDate(value: Date): Date = js.native
  def set_startDate(value: Date): Date = js.native
}

