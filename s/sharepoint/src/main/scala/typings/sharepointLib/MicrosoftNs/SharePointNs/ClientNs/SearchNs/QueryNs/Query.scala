package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Contains information common to all types of search queries.*/
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.Query")
@js.native
class Query ()
  extends sharepointLib.SPNs.ClientObject {
  def getQuerySuggestionsWithResults(
    iNumberOfQuerySuggestions: scala.Double,
    iNumberOfResultSuggestions: scala.Double,
    fPreQuerySuggestions: scala.Boolean,
    fHitHighlighting: scala.Boolean,
    fCapitalizeFirstLetters: scala.Boolean,
    fPrefixMatchAllTerms: scala.Boolean
  ): QuerySuggestionResults = js.native
  def get_blockDedupeMode(): scala.Double = js.native
  def get_bypassResultTypes(): scala.Boolean = js.native
  def get_clientType(): java.lang.String = js.native
  def get_culture(): scala.Double = js.native
  def get_desiredSnippetLength(): scala.Double = js.native
  def get_enableInterleaving(): scala.Boolean = js.native
  def get_enableNicknames(): scala.Boolean = js.native
  def get_enableOrderingHitHighlightedProperty(): scala.Boolean = js.native
  def get_enablePhonetic(): scala.Boolean = js.native
  def get_enableQueryRules(): scala.Boolean = js.native
  def get_enableStemming(): scala.Boolean = js.native
  def get_generateBlockRankLog(): scala.Boolean = js.native
  def get_hitHighlightedMultivaluePropertyLimit(): scala.Double = js.native
  def get_hitHighlightedProperties(): StringCollection = js.native
  def get_ignoreSafeQueryPropertiesTemplateUrl(): scala.Boolean = js.native
  def get_impressionID(): java.lang.String = js.native
  def get_maxSnippetLength(): scala.Double = js.native
  def get_personalizationData(): QueryPersonalizationData = js.native
  def get_processBestBets(): scala.Boolean = js.native
  def get_processPersonalFavorites(): scala.Boolean = js.native
  def get_queryTag(): java.lang.String = js.native
  def get_queryTemplate(): java.lang.String = js.native
  def get_queryTemplateParameters(): ScalablyTyped.runtime.StringDictionary[scala.Boolean] = js.native
  def get_queryText(): java.lang.String = js.native
  def get_rankingModelId(): java.lang.String = js.native
  def get_resultsUrl(): java.lang.String = js.native
  def get_rowLimit(): scala.Double = js.native
  def get_rowsPerPage(): scala.Double = js.native
  def get_safeQueryPropertiesTemplateUrl(): java.lang.String = js.native
  def get_showPeopleNameSuggestions(): scala.Boolean = js.native
  def get_sourceId(): sharepointLib.SPNs.Guid = js.native
  def get_startRow(): scala.Double = js.native
  def get_summaryLength(): scala.Double = js.native
  def get_timeout(): scala.Double = js.native
  def get_totalRowsExactMinimum(): scala.Double = js.native
  def get_trimDuplicates(): scala.Boolean = js.native
  def get_uiLanguage(): scala.Double = js.native
  def set_blockDedupeMode(value: scala.Double): scala.Unit = js.native
  def set_bypassResultTypes(value: scala.Boolean): scala.Unit = js.native
  def set_clientType(value: java.lang.String): scala.Unit = js.native
  def set_culture(value: scala.Double): scala.Unit = js.native
  def set_desiredSnippetLength(value: scala.Double): scala.Unit = js.native
  def set_enableInterleaving(value: scala.Boolean): scala.Unit = js.native
  def set_enableNicknames(value: scala.Boolean): scala.Unit = js.native
  def set_enableOrderingHitHighlightedProperty(value: scala.Boolean): scala.Unit = js.native
  def set_enablePhonetic(value: scala.Boolean): scala.Unit = js.native
  def set_enableQueryRules(value: scala.Boolean): scala.Unit = js.native
  def set_enableStemming(value: scala.Boolean): scala.Unit = js.native
  def set_generateBlockRankLog(value: scala.Boolean): scala.Unit = js.native
  def set_hitHighlightedMultivaluePropertyLimit(value: scala.Double): scala.Unit = js.native
  def set_ignoreSafeQueryPropertiesTemplateUrl(value: scala.Boolean): scala.Unit = js.native
  def set_impressionID(value: java.lang.String): scala.Unit = js.native
  def set_maxSnippetLength(value: scala.Double): scala.Unit = js.native
  def set_personalizationData(value: QueryPersonalizationData): scala.Unit = js.native
  def set_processBestBets(value: scala.Boolean): scala.Unit = js.native
  def set_processPersonalFavorites(value: scala.Boolean): scala.Unit = js.native
  def set_queryTag(value: java.lang.String): scala.Unit = js.native
  def set_queryTemplate(value: java.lang.String): scala.Unit = js.native
  def set_queryText(value: java.lang.String): scala.Unit = js.native
  def set_rankingModelId(value: java.lang.String): scala.Unit = js.native
  def set_resultsUrl(value: java.lang.String): scala.Unit = js.native
  def set_rowLimit(value: scala.Double): scala.Unit = js.native
  def set_rowsPerPage(value: scala.Double): scala.Unit = js.native
  def set_safeQueryPropertiesTemplateUrl(value: java.lang.String): scala.Unit = js.native
  def set_showPeopleNameSuggestions(value: scala.Boolean): scala.Unit = js.native
  def set_sourceId(value: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def set_startRow(value: scala.Double): scala.Unit = js.native
  def set_summaryLength(value: scala.Double): scala.Unit = js.native
  def set_timeout(value: scala.Double): scala.Unit = js.native
  def set_totalRowsExactMinimum(value: scala.Double): scala.Unit = js.native
  def set_trimDuplicates(value: scala.Boolean): scala.Unit = js.native
  def set_uiLanguage(value: scala.Double): scala.Unit = js.native
}

