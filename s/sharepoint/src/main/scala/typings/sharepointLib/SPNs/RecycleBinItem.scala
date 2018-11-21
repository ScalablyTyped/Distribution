package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RecycleBinItem")
@js.native
class RecycleBinItem () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_author(): User = js.native
  def get_deletedBy(): User = js.native
  def get_deletedDate(): microsoftDashAjaxLib.Date = js.native
  def get_dirName(): java.lang.String = js.native
  def get_id(): Guid = js.native
  def get_itemState(): RecycleBinItemState = js.native
  def get_itemType(): RecycleBinItemType = js.native
  def get_leafName(): java.lang.String = js.native
  def get_size(): scala.Double = js.native
  def get_title(): java.lang.String = js.native
  def restore(): scala.Unit = js.native
}

