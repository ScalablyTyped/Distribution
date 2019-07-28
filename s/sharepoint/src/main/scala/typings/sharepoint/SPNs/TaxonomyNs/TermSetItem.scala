package typings.sharepoint.SPNs.TaxonomyNs

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TermSetItem")
@js.native
class TermSetItem () extends TaxonomyItem {
  def createTerm(name: String, lcid: Double, newTermId: Guid): Term = js.native
  def deleteAllCustomProperties(): Unit = js.native
  def deleteCustomProperty(name: String): Unit = js.native
  def get_customProperties(): StringDictionary[String] = js.native
  def get_customSortOrder(): String = js.native
  def get_isAvailableForTagging(): Boolean = js.native
  def get_owner(): String = js.native
  def get_terms(): TermCollection = js.native
  /*getTerms(pagingLimit: number): TermCollection;*/ // Moved to descendants to void TypeScript errors
  def reuseTerm(sourceTerm: Term, reuseBranch: Boolean): Term = js.native
  def reuseTermWithPinning(sourceTerm: Term): Term = js.native
  def setCustomProperty(name: String, value: String): Unit = js.native
  def set_customSortOrder(value: String): Unit = js.native
  def set_isAvailableForTagging(value: Boolean): Unit = js.native
  def set_owner(value: String): Unit = js.native
}

