package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.LabelMatchInformation")
@js.native
class LabelMatchInformation protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext) = this()
  def get_defaultLabelOnly(): scala.Boolean = js.native
  def get_excludeKeyword(): scala.Boolean = js.native
  def get_lcid(): scala.Double = js.native
  def get_resultCollectionSize(): scala.Double = js.native
  def get_stringMatchOption(): StringMatchOption = js.native
  def get_termLabel(): java.lang.String = js.native
  def get_trimDeprecated(): scala.Boolean = js.native
  def get_trimUnavailable(): scala.Boolean = js.native
  def set_defaultLabelOnly(value: scala.Boolean): scala.Unit = js.native
  def set_excludeKeyword(value: scala.Boolean): scala.Unit = js.native
  def set_lcid(value: scala.Double): scala.Unit = js.native
  def set_resultCollectionSize(value: scala.Double): scala.Unit = js.native
  def set_stringMatchOption(value: StringMatchOption): scala.Unit = js.native
  def set_termLabel(value: java.lang.String): scala.Unit = js.native
  def set_trimDeprecated(value: scala.Boolean): scala.Unit = js.native
  def set_trimUnavailable(value: scala.Boolean): scala.Unit = js.native
}

