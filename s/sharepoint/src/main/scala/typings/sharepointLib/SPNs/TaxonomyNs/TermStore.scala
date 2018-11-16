package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TermStore")
@js.native
class TermStore ()
  extends sharepointLib.SPNs.ClientObject {
  def addLanguage(lcid: scala.Double): scala.Unit = js.native
  def commitAll(): scala.Unit = js.native
  def createGroup(name: java.lang.String): TermGroup = js.native
  def createGroup(name: java.lang.String, groupId: sharepointLib.SPNs.Guid): TermGroup = js.native
  def deleteLanguage(lcid: scala.Double): scala.Unit = js.native
  def getChanges(changeInformation: ChangeInformation): ChangedItemCollection = js.native
  def getGroup(id: sharepointLib.SPNs.Guid): TermGroup = js.native
  def getSiteCollectionGroup(currentSite: sharepointLib.SPNs.Site, createIfMissing: scala.Boolean): TermGroup = js.native
  def getTerm(termId: sharepointLib.SPNs.Guid): Term = js.native
  def getTermInTermSet(termSetId: sharepointLib.SPNs.Guid, termId: sharepointLib.SPNs.Guid): Term = js.native
  def getTermSet(termSetId: sharepointLib.SPNs.Guid): TermSet = js.native
  def getTermSetsByName(termSetName: java.lang.String, lcid: scala.Double): TermSetCollection = js.native
  def getTermSetsByTermLabel(requiredTermLabels: js.Array[java.lang.String], lcid: scala.Double): TermSetCollection = js.native
  def getTermSetsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermSetCollection = js.native
  def getTerms(labelMatchInformation: LabelMatchInformation): TermCollection = js.native
  def getTerms(termLabel: java.lang.String, trimUnavailable: scala.Boolean): TermCollection = js.native
  def getTermsById(termIds: js.Array[sharepointLib.SPNs.Guid]): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyName: java.lang.String, trimUnavailable: scala.Boolean): TermCollection = js.native
  def get_contentTypePublishingHub(): java.lang.String = js.native
  def get_defaultLanguage(): scala.Double = js.native
  def get_groups(): TermGroupCollection = js.native
  def get_hashTagsTermSet(): TermSet = js.native
  def get_id(): sharepointLib.SPNs.Guid = js.native
  def get_isOnline(): scala.Boolean = js.native
  def get_keywordsTermSet(): TermSet = js.native
  def get_languages(): js.Array[scala.Double] = js.native
  def get_name(): java.lang.String = js.native
  def get_orphanedTermsTermSet(): TermSet = js.native
  def get_systemGroup(): TermGroup = js.native
  def get_workingLanguage(): scala.Double = js.native
  def rollbackAll(): scala.Unit = js.native
  def set_defaultLanguage(value: scala.Double): scala.Unit = js.native
  def set_workingLanguage(value: scala.Double): scala.Unit = js.native
  def updateCache(): scala.Unit = js.native
  def updateUsedTermsOnSite(currentSite: sharepointLib.SPNs.Site): scala.Unit = js.native
}

