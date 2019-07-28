package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.LabelMatchInformation")
@js.native
class LabelMatchInformation protected () extends ClientObject {
  def this(context: ClientContext) = this()
  def get_defaultLabelOnly(): Boolean = js.native
  def get_excludeKeyword(): Boolean = js.native
  def get_lcid(): Double = js.native
  def get_resultCollectionSize(): Double = js.native
  def get_stringMatchOption(): StringMatchOption = js.native
  def get_termLabel(): String = js.native
  def get_trimDeprecated(): Boolean = js.native
  def get_trimUnavailable(): Boolean = js.native
  def set_defaultLabelOnly(value: Boolean): Unit = js.native
  def set_excludeKeyword(value: Boolean): Unit = js.native
  def set_lcid(value: Double): Unit = js.native
  def set_resultCollectionSize(value: Double): Unit = js.native
  def set_stringMatchOption(value: StringMatchOption): Unit = js.native
  def set_termLabel(value: String): Unit = js.native
  def set_trimDeprecated(value: Boolean): Unit = js.native
  def set_trimUnavailable(value: Boolean): Unit = js.native
}

