package typings.sharepoint.global.SP.Taxonomy

import typings.sharepoint.IEnumerator
import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyFieldValueCollection")
@js.native
class TaxonomyFieldValueCollection protected ()
  extends typings.sharepoint.SP.Taxonomy.TaxonomyFieldValueCollection {
  def this(context: ClientContext, fieldValue: String, creatingField: Field) = this()
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[typings.sharepoint.SP.Taxonomy.TaxonomyFieldValue] = js.native
}

