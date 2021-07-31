package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**Contains information common to all types of search queries.*/
@js.native
trait Query
  extends StObject
     with ClientObject {
  
  def getQuerySuggestionsWithResults(
    iNumberOfQuerySuggestions: Double,
    iNumberOfResultSuggestions: Double,
    fPreQuerySuggestions: Boolean,
    fHitHighlighting: Boolean,
    fCapitalizeFirstLetters: Boolean,
    fPrefixMatchAllTerms: Boolean
  ): QuerySuggestionResults = js.native
  
  def get_blockDedupeMode(): Double = js.native
  
  def get_bypassResultTypes(): Boolean = js.native
  
  def get_clientType(): String = js.native
  
  def get_culture(): Double = js.native
  
  def get_desiredSnippetLength(): Double = js.native
  
  def get_enableInterleaving(): Boolean = js.native
  
  def get_enableNicknames(): Boolean = js.native
  
  def get_enableOrderingHitHighlightedProperty(): Boolean = js.native
  
  def get_enablePhonetic(): Boolean = js.native
  
  def get_enableQueryRules(): Boolean = js.native
  
  def get_enableStemming(): Boolean = js.native
  
  def get_generateBlockRankLog(): Boolean = js.native
  
  def get_hitHighlightedMultivaluePropertyLimit(): Double = js.native
  
  def get_hitHighlightedProperties(): StringCollection = js.native
  
  def get_ignoreSafeQueryPropertiesTemplateUrl(): Boolean = js.native
  
  def get_impressionID(): String = js.native
  
  def get_maxSnippetLength(): Double = js.native
  
  def get_personalizationData(): QueryPersonalizationData = js.native
  
  def get_processBestBets(): Boolean = js.native
  
  def get_processPersonalFavorites(): Boolean = js.native
  
  def get_queryTag(): String = js.native
  
  def get_queryTemplate(): String = js.native
  
  def get_queryTemplateParameters(): StringDictionary[Boolean] = js.native
  
  def get_queryText(): String = js.native
  
  def get_rankingModelId(): String = js.native
  
  def get_resultsUrl(): String = js.native
  
  def get_rowLimit(): Double = js.native
  
  def get_rowsPerPage(): Double = js.native
  
  def get_safeQueryPropertiesTemplateUrl(): String = js.native
  
  def get_showPeopleNameSuggestions(): Boolean = js.native
  
  def get_sourceId(): Guid = js.native
  
  def get_startRow(): Double = js.native
  
  def get_summaryLength(): Double = js.native
  
  def get_timeout(): Double = js.native
  
  def get_totalRowsExactMinimum(): Double = js.native
  
  def get_trimDuplicates(): Boolean = js.native
  
  def get_uiLanguage(): Double = js.native
  
  def set_blockDedupeMode(value: Double): Unit = js.native
  
  def set_bypassResultTypes(value: Boolean): Unit = js.native
  
  def set_clientType(value: String): Unit = js.native
  
  def set_culture(value: Double): Unit = js.native
  
  def set_desiredSnippetLength(value: Double): Unit = js.native
  
  def set_enableInterleaving(value: Boolean): Unit = js.native
  
  def set_enableNicknames(value: Boolean): Unit = js.native
  
  def set_enableOrderingHitHighlightedProperty(value: Boolean): Unit = js.native
  
  def set_enablePhonetic(value: Boolean): Unit = js.native
  
  def set_enableQueryRules(value: Boolean): Unit = js.native
  
  def set_enableStemming(value: Boolean): Unit = js.native
  
  def set_generateBlockRankLog(value: Boolean): Unit = js.native
  
  def set_hitHighlightedMultivaluePropertyLimit(value: Double): Unit = js.native
  
  def set_ignoreSafeQueryPropertiesTemplateUrl(value: Boolean): Unit = js.native
  
  def set_impressionID(value: String): Unit = js.native
  
  def set_maxSnippetLength(value: Double): Unit = js.native
  
  def set_personalizationData(value: QueryPersonalizationData): Unit = js.native
  
  def set_processBestBets(value: Boolean): Unit = js.native
  
  def set_processPersonalFavorites(value: Boolean): Unit = js.native
  
  def set_queryTag(value: String): Unit = js.native
  
  def set_queryTemplate(value: String): Unit = js.native
  
  def set_queryText(value: String): Unit = js.native
  
  def set_rankingModelId(value: String): Unit = js.native
  
  def set_resultsUrl(value: String): Unit = js.native
  
  def set_rowLimit(value: Double): Unit = js.native
  
  def set_rowsPerPage(value: Double): Unit = js.native
  
  def set_safeQueryPropertiesTemplateUrl(value: String): Unit = js.native
  
  def set_showPeopleNameSuggestions(value: Boolean): Unit = js.native
  
  def set_sourceId(value: Guid): Unit = js.native
  
  def set_startRow(value: Double): Unit = js.native
  
  def set_summaryLength(value: Double): Unit = js.native
  
  def set_timeout(value: Double): Unit = js.native
  
  def set_totalRowsExactMinimum(value: Double): Unit = js.native
  
  def set_trimDuplicates(value: Boolean): Unit = js.native
  
  def set_uiLanguage(value: Double): Unit = js.native
}
