package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TermSet")
@js.native
class TermSet () extends TermSetItem {
  def addStakeholder(stakeholderName: String): Unit = js.native
  def copy(): TermSet = js.native
  def deleteStakeholder(stakeholderName: String): Unit = js.native
  def exportObject(): StringResult = js.native
  def getAllTerms(): TermCollection = js.native
  def getChanges(changeInformation: ChangeInformation): ChangedItemCollection = js.native
  def getTerm(termId: Guid): Term = js.native
  def getTerms(pagingLimit: Double): TermCollection = js.native
  def getTerms(pagingLimit: LabelMatchInformation): TermCollection = js.native
  def getTerms(termLabel: String, trimUnavailable: Boolean): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyName: String, trimUnavailable: Boolean): TermCollection = js.native
  def get_contact(): String = js.native
  def get_description(): String = js.native
  def get_group(): TermGroup = js.native
  def get_isOpenForTermCreation(): Boolean = js.native
  def get_stakeholders(): js.Array[String] = js.native
  def move(targetGroup: TermGroup): Unit = js.native
  def set_contact(value: String): Unit = js.native
  def set_description(value: String): Unit = js.native
  def set_isOpenForTermCreation(value: Boolean): Unit = js.native
}

