package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.ChangedItem")
@js.native
class ChangedItem () extends ClientObject {
  def get_changedBy(): String = js.native
  def get_changedTime(): Date = js.native
  def get_id(): Guid = js.native
  def get_itemType(): ChangeItemType = js.native
  def get_operation(): ChangeOperationType = js.native
}

