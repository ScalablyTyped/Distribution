package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObjectCollection
import typings.sharepoint.SP.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyFieldValueCollection")
@js.native
class TaxonomyFieldValueCollection protected () extends ClientObjectCollection[TaxonomyFieldValue] {
  def this(context: ClientContext, fieldValue: String, creatingField: Field) = this()
  def get_item(index: Double): TaxonomyFieldValue = js.native
  def itemAt(index: Double): TaxonomyFieldValue = js.native
  def populateFromLabelGuidPairs(text: String): Unit = js.native
}

