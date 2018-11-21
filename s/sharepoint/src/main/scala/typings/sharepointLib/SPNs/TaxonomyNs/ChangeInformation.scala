package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.ChangeInformation")
@js.native
class ChangeInformation protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext) = this()
  def get_itemType(): ChangeItemType = js.native
  def get_operationType(): ChangeOperationType = js.native
  def get_startTime(): microsoftDashAjaxLib.Date = js.native
  def get_withinTimeSpan(): scala.Double = js.native
  def set_itemType(value: ChangeItemType): scala.Unit = js.native
  def set_operationType(value: ChangeOperationType): scala.Unit = js.native
  def set_startTime(value: microsoftDashAjaxLib.Date): scala.Unit = js.native
  def set_withinTimeSpan(value: scala.Double): scala.Unit = js.native
}

