package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.ChangedItem")
@js.native
class ChangedItem ()
  extends sharepointLib.SPNs.ClientObject {
  def get_changedBy(): java.lang.String = js.native
  def get_changedTime(): stdLib.Date = js.native
  def get_id(): sharepointLib.SPNs.Guid = js.native
  def get_itemType(): ChangeItemType = js.native
  def get_operation(): ChangeOperationType = js.native
}

