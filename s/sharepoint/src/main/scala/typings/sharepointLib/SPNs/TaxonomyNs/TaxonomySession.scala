package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomySession")
@js.native
class TaxonomySession ()
  extends sharepointLib.SPNs.ClientObject {
  def getDefaultKeywordsTermStore(): TermStore = js.native
  def getDefaultSiteCollectionTermStore(): TermStore = js.native
  def getTerm(guid: sharepointLib.SPNs.Guid): Term = js.native
  def getTermSetsByName(termSetName: java.lang.String, lcid: scala.Double): TermSetCollection = js.native
  def getTermSetsByTermLabel(requiredTermLabels: js.Array[java.lang.String], lcid: scala.Double): TermSetCollection = js.native
  def getTerms(labelMatchInformation: LabelMatchInformation): TermCollection = js.native
  def getTermsById(termIds: js.Array[sharepointLib.SPNs.Guid]): TermCollection = js.native
  def getTermsInDefaultLanguage(
    termLabel: java.lang.String,
    defaultLabelOnly: scala.Boolean,
    stringMatchOption: StringMatchOption,
    resultCollectionSize: scala.Double,
    trimUnavailable: scala.Boolean,
    trimDeprecated: scala.Boolean
  ): TermCollection = js.native
  def getTermsInWorkingLocale(
    termLabel: java.lang.String,
    defaultLabelOnly: scala.Boolean,
    stringMatchOption: StringMatchOption,
    resultCollectionSize: scala.Double,
    trimUnavailable: scala.Boolean,
    trimDeprecated: scala.Boolean
  ): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyName: java.lang.String, trimUnavailable: scala.Boolean): TermCollection = js.native
  def get_offlineTermStoreNames(): js.Array[java.lang.String] = js.native
  def get_termStores(): TermStoreCollection = js.native
  def updateCache(): scala.Unit = js.native
}

@JSGlobal("SP.Taxonomy.TaxonomySession")
@js.native
object TaxonomySession extends js.Object {
  def getTaxonomySession(context: sharepointLib.SPNs.ClientContext): sharepointLib.SPNs.TaxonomyNs.TaxonomySession = js.native
}

