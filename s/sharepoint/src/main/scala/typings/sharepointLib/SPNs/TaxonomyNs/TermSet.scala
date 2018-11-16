package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TermSet")
@js.native
class TermSet () extends TermSetItem {
  def addStakeholder(stakeholderName: java.lang.String): scala.Unit = js.native
  def copy(): TermSet = js.native
  def deleteStakeholder(stakeholderName: java.lang.String): scala.Unit = js.native
  def exportObject(): sharepointLib.SPNs.StringResult = js.native
  def getAllTerms(): TermCollection = js.native
  def getChanges(changeInformation: ChangeInformation): ChangedItemCollection = js.native
  def getTerm(termId: sharepointLib.SPNs.Guid): Term = js.native
  def getTerms(pagingLimit: scala.Double): TermCollection = js.native
  def getTerms(pagingLimit: LabelMatchInformation): TermCollection = js.native
  def getTerms(termLabel: java.lang.String, trimUnavailable: scala.Boolean): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyName: java.lang.String, trimUnavailable: scala.Boolean): TermCollection = js.native
  def get_contact(): java.lang.String = js.native
  def get_description(): java.lang.String = js.native
  def get_group(): TermGroup = js.native
  def get_isOpenForTermCreation(): scala.Boolean = js.native
  def get_stakeholders(): js.Array[java.lang.String] = js.native
  def move(targetGroup: TermGroup): scala.Unit = js.native
  def set_contact(value: java.lang.String): scala.Unit = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
  def set_isOpenForTermCreation(value: scala.Boolean): scala.Unit = js.native
}

