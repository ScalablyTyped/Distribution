package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyItem")
@js.native
class TaxonomyItem ()
  extends sharepointLib.SPNs.ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_createdDate(): microsoftDashAjaxLib.Date = js.native
  def get_id(): sharepointLib.SPNs.Guid = js.native
  def get_lastModifiedDate(): microsoftDashAjaxLib.Date = js.native
  def get_name(): java.lang.String = js.native
  def get_termStore(): TermStore = js.native
  def set_name(value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("SP.Taxonomy.TaxonomyItem")
@js.native
object TaxonomyItem extends js.Object {
  def normalizeName(context: sharepointLib.SPNs.ClientContext, name: java.lang.String): sharepointLib.SPNs.StringResult = js.native
}

