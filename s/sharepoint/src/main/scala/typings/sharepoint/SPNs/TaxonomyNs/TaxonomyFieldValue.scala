package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientValueObject
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyFieldValue")
@js.native
class TaxonomyFieldValue () extends ClientValueObject {
  def get_label(): String = js.native
  def get_termGuid(): Guid = js.native
  def get_wssId(): Double = js.native
  def set_label(value: String): Unit = js.native
  def set_termGuid(value: Guid): Unit = js.native
  def set_wssId(value: Double): Unit = js.native
}

