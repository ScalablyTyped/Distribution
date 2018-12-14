package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TermSetItem")
@js.native
class TermSetItem () extends TaxonomyItem {
  def createTerm(name: java.lang.String, lcid: scala.Double, newTermId: sharepointLib.SPNs.Guid): Term = js.native
  def deleteAllCustomProperties(): scala.Unit = js.native
  def deleteCustomProperty(name: java.lang.String): scala.Unit = js.native
  def get_customProperties(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def get_customSortOrder(): java.lang.String = js.native
  def get_isAvailableForTagging(): scala.Boolean = js.native
  def get_owner(): java.lang.String = js.native
  def get_terms(): TermCollection = js.native
  /*getTerms(pagingLimit: number): TermCollection;*/ // Moved to descendants to void TypeScript errors
  def reuseTerm(sourceTerm: Term, reuseBranch: scala.Boolean): Term = js.native
  def reuseTermWithPinning(sourceTerm: Term): Term = js.native
  def setCustomProperty(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set_customSortOrder(value: java.lang.String): scala.Unit = js.native
  def set_isAvailableForTagging(value: scala.Boolean): scala.Unit = js.native
  def set_owner(value: java.lang.String): scala.Unit = js.native
}

