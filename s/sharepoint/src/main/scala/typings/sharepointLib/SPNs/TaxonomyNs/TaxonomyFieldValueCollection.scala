package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyFieldValueCollection")
@js.native
class TaxonomyFieldValueCollection protected ()
  extends sharepointLib.SPNs.ClientObjectCollection[TaxonomyFieldValue] {
  def this(context: sharepointLib.SPNs.ClientContext, fieldValue: java.lang.String, creatingField: sharepointLib.SPNs.Field) = this()
  def get_item(index: scala.Double): TaxonomyFieldValue = js.native
  def itemAt(index: scala.Double): TaxonomyFieldValue = js.native
  def populateFromLabelGuidPairs(text: java.lang.String): scala.Unit = js.native
}

