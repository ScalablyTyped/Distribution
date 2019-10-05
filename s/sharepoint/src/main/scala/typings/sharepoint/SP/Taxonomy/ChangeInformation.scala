package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.ChangeInformation")
@js.native
class ChangeInformation protected () extends ClientObject {
  def this(context: ClientContext) = this()
  def get_itemType(): ChangeItemType = js.native
  def get_operationType(): ChangeOperationType = js.native
  def get_startTime(): Date = js.native
  def get_withinTimeSpan(): Double = js.native
  def set_itemType(value: ChangeItemType): Unit = js.native
  def set_operationType(value: ChangeOperationType): Unit = js.native
  def set_startTime(value: Date): Unit = js.native
  def set_withinTimeSpan(value: Double): Unit = js.native
}

