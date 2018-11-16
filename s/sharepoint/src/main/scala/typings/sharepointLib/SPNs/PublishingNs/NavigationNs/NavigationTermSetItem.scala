package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.NavigationTermSetItem")
@js.native
class NavigationTermSetItem ()
  extends sharepointLib.SPNs.ClientObject {
  def createTerm(termName: java.lang.String, linkType: NavigationLinkType, termId: sharepointLib.SPNs.Guid): sharepointLib.SPNs.TaxonomyNs.Term = js.native
  def getResolvedDisplayUrl(browserQueryString: java.lang.String): sharepointLib.SPNs.StringResult = js.native
  def getTaxonomyTermStore(): sharepointLib.SPNs.TaxonomyNs.TermStore = js.native
  def get_catalogTargetUrlForChildTerms(): sharepointLib.SPNs.PublishingNs.CustomizableString = js.native
  def get_id(): sharepointLib.SPNs.Guid = js.native
  def get_isReadOnly(): scala.Boolean = js.native
  def get_linkType(): NavigationLinkType = js.native
  def get_targetUrlForChildTerms(): sharepointLib.SPNs.PublishingNs.CustomizableString = js.native
  def get_taxonomyName(): java.lang.String = js.native
  def get_terms(): NavigationTermCollection = js.native
  def get_title(): sharepointLib.SPNs.PublishingNs.CustomizableString = js.native
  def get_view(): NavigationTermSetView = js.native
  def set_linkType(value: NavigationLinkType): NavigationLinkType = js.native
}

