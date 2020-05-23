package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxonomyFieldValueCollection extends ClientObjectCollection[TaxonomyFieldValue] {
  def get_item(index: Double): TaxonomyFieldValue = js.native
  def itemAt(index: Double): TaxonomyFieldValue = js.native
  def populateFromLabelGuidPairs(text: String): Unit = js.native
}

