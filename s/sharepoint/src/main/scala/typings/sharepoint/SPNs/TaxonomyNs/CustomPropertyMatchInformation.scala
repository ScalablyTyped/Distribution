package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.CustomPropertyMatchInformation")
@js.native
class CustomPropertyMatchInformation protected () extends ClientObject {
  def this(context: ClientContext) = this()
  def get_customPropertyName(): String = js.native
  def get_customPropertyValue(): String = js.native
  def get_resultCollectionSize(): Double = js.native
  def get_stringMatchOption(): StringMatchOption = js.native
  def get_trimUnavailable(): Boolean = js.native
  def set_customPropertyName(value: String): Unit = js.native
  def set_customPropertyValue(value: String): Unit = js.native
  def set_resultCollectionSize(value: Double): Unit = js.native
  def set_stringMatchOption(value: StringMatchOption): Unit = js.native
  def set_trimUnavailable(value: Boolean): Unit = js.native
}

