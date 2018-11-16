package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.CustomPropertyMatchInformation")
@js.native
class CustomPropertyMatchInformation protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext) = this()
  def get_customPropertyName(): java.lang.String = js.native
  def get_customPropertyValue(): java.lang.String = js.native
  def get_resultCollectionSize(): scala.Double = js.native
  def get_stringMatchOption(): StringMatchOption = js.native
  def get_trimUnavailable(): scala.Boolean = js.native
  def set_customPropertyName(value: java.lang.String): scala.Unit = js.native
  def set_customPropertyValue(value: java.lang.String): scala.Unit = js.native
  def set_resultCollectionSize(value: scala.Double): scala.Unit = js.native
  def set_stringMatchOption(value: StringMatchOption): scala.Unit = js.native
  def set_trimUnavailable(value: scala.Boolean): scala.Unit = js.native
}

