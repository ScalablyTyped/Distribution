package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.Site
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TermStore")
@js.native
class TermStore () extends ClientObject {
  def addLanguage(lcid: Double): Unit = js.native
  def commitAll(): Unit = js.native
  def createGroup(name: String): TermGroup = js.native
  def createGroup(name: String, groupId: Guid): TermGroup = js.native
  def deleteLanguage(lcid: Double): Unit = js.native
  def getChanges(changeInformation: ChangeInformation): ChangedItemCollection = js.native
  def getGroup(id: Guid): TermGroup = js.native
  def getSiteCollectionGroup(currentSite: Site, createIfMissing: Boolean): TermGroup = js.native
  def getTerm(termId: Guid): Term = js.native
  def getTermInTermSet(termSetId: Guid, termId: Guid): Term = js.native
  def getTermSet(termSetId: Guid): TermSet = js.native
  def getTermSetsByName(termSetName: String, lcid: Double): TermSetCollection = js.native
  def getTermSetsByTermLabel(requiredTermLabels: js.Array[String], lcid: Double): TermSetCollection = js.native
  def getTermSetsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermSetCollection = js.native
  def getTerms(labelMatchInformation: LabelMatchInformation): TermCollection = js.native
  def getTerms(termLabel: String, trimUnavailable: Boolean): TermCollection = js.native
  def getTermsById(termIds: js.Array[Guid]): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyName: String, trimUnavailable: Boolean): TermCollection = js.native
  def get_contentTypePublishingHub(): String = js.native
  def get_defaultLanguage(): Double = js.native
  def get_groups(): TermGroupCollection = js.native
  def get_hashTagsTermSet(): TermSet = js.native
  def get_id(): Guid = js.native
  def get_isOnline(): Boolean = js.native
  def get_keywordsTermSet(): TermSet = js.native
  def get_languages(): js.Array[Double] = js.native
  def get_name(): String = js.native
  def get_orphanedTermsTermSet(): TermSet = js.native
  def get_systemGroup(): TermGroup = js.native
  def get_workingLanguage(): Double = js.native
  def rollbackAll(): Unit = js.native
  def set_defaultLanguage(value: Double): Unit = js.native
  def set_workingLanguage(value: Double): Unit = js.native
  def updateCache(): Unit = js.native
  def updateUsedTermsOnSite(currentSite: Site): Unit = js.native
}

