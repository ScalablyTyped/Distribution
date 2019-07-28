package typings.sharepoint.SrchNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.DataProvider")
@js.native
class DataProvider protected () extends ClientControl {
  def this(elem: Element) = this()
  def add_queryIssuing(value: js.Any): Unit = js.native
  def add_queryStateChanged(value: js.Any): Unit = js.native
  def add_resultReady(value: js.Any): Unit = js.native
  def displayControlMessages(): Unit = js.native
  def displayControl_QueryReady(sender: js.Any, e: js.Any): Unit = js.native
  def getSortName(): String = js.native
  def getSortRankName(): String = js.native
  def get_active(): Boolean = js.native
  def get_availableSorts(): js.Any = js.native
  def get_batched(): Boolean = js.native
  def get_bypassResultTypes(): Boolean = js.native
  def get_clientType(): String = js.native
  def get_collapseSpecification(): String = js.native
  def get_contextualScopeUrl(): String = js.native
  def get_currentQueryState(): js.Any = js.native
  def get_desiredSnippetLength(): Double = js.native
  def get_effectiveQueryLanguage(): js.Any = js.native
  def get_enableInterleaving(): Boolean = js.native
  def get_enableNicknames(): Boolean = js.native
  def get_enableOrderingHitHighlightedProperty(): Boolean = js.native
  def get_enablePhonetic(): Boolean = js.native
  def get_enableQueryRules(): Boolean = js.native
  def get_enableStemming(): Boolean = js.native
  def get_entityInfo(): js.Any = js.native
  def get_fallbackLanguage(): js.Any = js.native
  def get_fallbackRankingModelID(): String = js.native
  def get_fallbackRefinementFilters(): js.Any = js.native
  def get_fallbackSort(): js.Any = js.native
  def get_hitHighlightedMultivaluePropertyLimit(): Double = js.native
  def get_hitHighlightedProperties(): js.Any = js.native
  def get_initialQueryState(): js.Any = js.native
  def get_initialResult(): String = js.native
  def get_initialResultObject(): js.Any = js.native
  def get_initialResultRef(): js.Any = js.native
  def get_maxPagesAfterCurrent(): Double = js.native
  def get_parentImpressionID(): js.Any = js.native
  def get_personalizedQuery(): Boolean = js.native
  def get_processBestBets(): Boolean = js.native
  def get_processPersonalFavorites(): Boolean = js.native
  def get_properties(): js.Any = js.native
  def get_queryCount(): Double = js.native
  def get_queryGroupName(): String = js.native
  def get_queryPropertiesTemplateUrl(): String = js.native
  def get_queryTemplate(): js.Any = js.native
  def get_rankRules(): js.Any = js.native
  def get_refinementInfo(): js.Any = js.native
  /** Number of results displayed per page. 10 by default */
  def get_resultsPerPage(): Double = js.native
  def get_resultsUrl(): js.Any = js.native
  def get_rowCount(): Double = js.native
  def get_selectedProperties(): js.Any = js.native
  def get_selectedRefiners(): js.Any = js.native
  def get_sourceID(): String = js.native
  def get_sourceLevel(): String = js.native
  def get_sourceName(): String = js.native
  def get_summaryLength(): Double = js.native
  def get_totalRows(): Double = js.native
  def get_trimDuplicates(): Boolean = js.native
  def get_upScopeUrl(): js.Any = js.native
  def get_updateAjaxNavigate(): Boolean = js.native
  def get_userAction(): js.Any = js.native
  def issueQuery(): Unit = js.native
  def processInitial(): Unit = js.native
  def raiseEmptyResultReadyEvent(): Unit = js.native
  def raiseQueryIssuingEvent(arg: js.Any): Unit = js.native
  def raiseQueryStateChangedEvent(arg: js.Any): Unit = js.native
  def raiseResultReadyEvent(arg: js.Any): Unit = js.native
  def remove_queryIssuing(value: js.Any): Unit = js.native
  def remove_resultReady(value: js.Any): Unit = js.native
  def searchBox_BatchQueryIssuing(sender: js.Any, e: js.Any): Unit = js.native
  def searchBox_BatchResultReady(sender: js.Any, e: js.Any): Unit = js.native
  def searchBox_QueryReady(sender: js.Any, e: js.Any): Unit = js.native
  def set_active(value: Boolean): Boolean = js.native
  def set_availableSorts(value: js.Any): js.Any = js.native
  def set_batched(value: Boolean): Boolean = js.native
  def set_bypassResultTypes(value: Boolean): Boolean = js.native
  def set_clientType(value: String): String = js.native
  def set_collapseSpecification(value: String): String = js.native
  def set_contextualScopeUrl(value: String): String = js.native
  def set_desiredSnippetLength(value: Double): Double = js.native
  def set_enableInterleaving(value: Boolean): Boolean = js.native
  def set_enableNicknames(value: Boolean): Boolean = js.native
  def set_enableOrderingHitHighlightedProperty(value: Boolean): Boolean = js.native
  def set_enablePhonetic(value: Boolean): Boolean = js.native
  def set_enableQueryRules(value: Boolean): Boolean = js.native
  def set_enableStemming(value: Boolean): Boolean = js.native
  def set_fallbackLanguage(value: js.Any): js.Any = js.native
  def set_fallbackRankingModelID(value: String): String = js.native
  def set_fallbackRefinementFilters(value: js.Any): js.Any = js.native
  def set_fallbackSort(value: js.Any): js.Any = js.native
  def set_hitHighlightedMultivaluePropertyLimit(value: Double): Double = js.native
  def set_hitHighlightedProperties(value: js.Any): js.Any = js.native
  def set_initialQueryState(value: js.Any): js.Any = js.native
  def set_initialResult(value: String): String = js.native
  def set_initialResultRef(value: js.Any): js.Any = js.native
  def set_maxPagesAfterCurrent(value: Double): Double = js.native
  def set_parentImpressionID(value: js.Any): js.Any = js.native
  def set_personalizedQuery(value: Boolean): Boolean = js.native
  def set_processBestBets(value: Boolean): Boolean = js.native
  def set_processPersonalFavorites(value: Boolean): Boolean = js.native
  def set_properties(value: js.Any): js.Any = js.native
  def set_queryCount(value: Double): Double = js.native
  def set_queryGroupName(value: String): String = js.native
  def set_queryPropertiesTemplateUrl(value: String): String = js.native
  def set_queryTemplate(value: js.Any): js.Any = js.native
  def set_rankRules(value: js.Any): js.Any = js.native
  /** Number of results displayed per page. 10 by default */
  def set_resultsPerPage(value: Double): Double = js.native
  def set_resultsUrl(value: js.Any): js.Any = js.native
  def set_rowCount(value: Double): Double = js.native
  def set_selectedProperties(value: js.Any): js.Any = js.native
  def set_selectedRefiners(value: js.Any): js.Any = js.native
  def set_sourceID(value: String): String = js.native
  def set_sourceLevel(value: String): String = js.native
  def set_sourceName(value: String): String = js.native
  def set_summaryLength(value: Double): Double = js.native
  def set_totalRows(value: Double): Double = js.native
  def set_trimDuplicates(value: Boolean): Boolean = js.native
  def set_updateAjaxNavigate(value: Boolean): Boolean = js.native
  def set_userAction(value: js.Any): js.Any = js.native
}

