package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.StringResult
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyItem")
@js.native
class TaxonomyItem () extends ClientObject {
  def deleteObject(): Unit = js.native
  def get_createdDate(): Date = js.native
  def get_id(): Guid = js.native
  def get_lastModifiedDate(): Date = js.native
  def get_name(): String = js.native
  def get_termStore(): TermStore = js.native
  def set_name(value: String): Unit = js.native
}

/* static members */
@JSGlobal("SP.Taxonomy.TaxonomyItem")
@js.native
object TaxonomyItem extends js.Object {
  def normalizeName(context: ClientContext, name: String): StringResult = js.native
}

