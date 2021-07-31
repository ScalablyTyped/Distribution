package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObjectCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxonomyFieldValueCollection
  extends StObject
     with ClientObjectCollection[TaxonomyFieldValue] {
  
  def get_item(index: Double): TaxonomyFieldValue = js.native
  
  def itemAt(index: Double): TaxonomyFieldValue = js.native
  
  def populateFromLabelGuidPairs(text: String): Unit = js.native
}
