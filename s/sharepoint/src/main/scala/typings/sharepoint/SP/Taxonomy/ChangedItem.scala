package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedItem extends ClientObject {
  def get_changedBy(): String = js.native
  def get_changedTime(): Date = js.native
  def get_id(): Guid = js.native
  def get_itemType(): ChangeItemType = js.native
  def get_operation(): ChangeOperationType = js.native
}

