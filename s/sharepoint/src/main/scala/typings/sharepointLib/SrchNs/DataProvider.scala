package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.DataProvider")
@js.native
class DataProvider protected () extends ClientControl {
  def this(elem: stdLib.Element) = this()
  def add_queryIssuing(value: js.Any): scala.Unit = js.native
  def add_queryStateChanged(value: js.Any): scala.Unit = js.native
  def add_resultReady(value: js.Any): scala.Unit = js.native
  def displayControlMessages(): scala.Unit = js.native
  def displayControl_QueryReady(sender: js.Any, e: js.Any): scala.Unit = js.native
  def getSortName(): java.lang.String = js.native
  def getSortRankName(): java.lang.String = js.native
  def get_active(): scala.Boolean = js.native
  def get_availableSorts(): js.Any = js.native
  def get_batched(): scala.Boolean = js.native
  def get_bypassResultTypes(): scala.Boolean = js.native
  def get_clientType(): java.lang.String = js.native
  def get_collapseSpecification(): java.lang.String = js.native
  def get_contextualScopeUrl(): java.lang.String = js.native
  def get_currentQueryState(): js.Any = js.native
  def get_desiredSnippetLength(): scala.Double = js.native
  def get_effectiveQueryLanguage(): js.Any = js.native
  def get_enableInterleaving(): scala.Boolean = js.native
  def get_enableNicknames(): scala.Boolean = js.native
  def get_enableOrderingHitHighlightedProperty(): scala.Boolean = js.native
  def get_enablePhonetic(): scala.Boolean = js.native
  def get_enableQueryRules(): scala.Boolean = js.native
  def get_enableStemming(): scala.Boolean = js.native
  def get_entityInfo(): js.Any = js.native
  def get_fallbackLanguage(): js.Any = js.native
  def get_fallbackRankingModelID(): java.lang.String = js.native
  def get_fallbackRefinementFilters(): js.Any = js.native
  def get_fallbackSort(): js.Any = js.native
  def get_hitHighlightedMultivaluePropertyLimit(): scala.Double = js.native
  def get_hitHighlightedProperties(): js.Any = js.native
  def get_initialQueryState(): js.Any = js.native
  def get_initialResult(): java.lang.String = js.native
  def get_initialResultObject(): js.Any = js.native
  def get_initialResultRef(): js.Any = js.native
  def get_maxPagesAfterCurrent(): scala.Double = js.native
  def get_parentImpressionID(): js.Any = js.native
  def get_personalizedQuery(): scala.Boolean = js.native
  def get_processBestBets(): scala.Boolean = js.native
  def get_processPersonalFavorites(): scala.Boolean = js.native
  def get_properties(): js.Any = js.native
  def get_queryCount(): scala.Double = js.native
  def get_queryGroupName(): java.lang.String = js.native
  def get_queryPropertiesTemplateUrl(): java.lang.String = js.native
  def get_queryTemplate(): js.Any = js.native
  def get_rankRules(): js.Any = js.native
  def get_refinementInfo(): js.Any = js.native
  /** Number of results displayed per page. 10 by default */
  def get_resultsPerPage(): scala.Double = js.native
  def get_resultsUrl(): js.Any = js.native
  def get_rowCount(): scala.Double = js.native
  def get_selectedProperties(): js.Any = js.native
  def get_selectedRefiners(): js.Any = js.native
  def get_sourceID(): java.lang.String = js.native
  def get_sourceLevel(): java.lang.String = js.native
  def get_sourceName(): java.lang.String = js.native
  def get_summaryLength(): scala.Double = js.native
  def get_totalRows(): scala.Double = js.native
  def get_trimDuplicates(): scala.Boolean = js.native
  def get_upScopeUrl(): js.Any = js.native
  def get_updateAjaxNavigate(): scala.Boolean = js.native
  def get_userAction(): js.Any = js.native
  def issueQuery(): scala.Unit = js.native
  def processInitial(): scala.Unit = js.native
  def raiseEmptyResultReadyEvent(): scala.Unit = js.native
  def raiseQueryIssuingEvent(arg: js.Any): scala.Unit = js.native
  def raiseQueryStateChangedEvent(arg: js.Any): scala.Unit = js.native
  def raiseResultReadyEvent(arg: js.Any): scala.Unit = js.native
  def remove_queryIssuing(value: js.Any): scala.Unit = js.native
  def remove_resultReady(value: js.Any): scala.Unit = js.native
  def searchBox_BatchQueryIssuing(sender: js.Any, e: js.Any): scala.Unit = js.native
  def searchBox_BatchResultReady(sender: js.Any, e: js.Any): scala.Unit = js.native
  def searchBox_QueryReady(sender: js.Any, e: js.Any): scala.Unit = js.native
  def set_active(value: scala.Boolean): scala.Boolean = js.native
  def set_availableSorts(value: js.Any): js.Any = js.native
  def set_batched(value: scala.Boolean): scala.Boolean = js.native
  def set_bypassResultTypes(value: scala.Boolean): scala.Boolean = js.native
  def set_clientType(value: java.lang.String): java.lang.String = js.native
  def set_collapseSpecification(value: java.lang.String): java.lang.String = js.native
  def set_contextualScopeUrl(value: java.lang.String): java.lang.String = js.native
  def set_desiredSnippetLength(value: scala.Double): scala.Double = js.native
  def set_enableInterleaving(value: scala.Boolean): scala.Boolean = js.native
  def set_enableNicknames(value: scala.Boolean): scala.Boolean = js.native
  def set_enableOrderingHitHighlightedProperty(value: scala.Boolean): scala.Boolean = js.native
  def set_enablePhonetic(value: scala.Boolean): scala.Boolean = js.native
  def set_enableQueryRules(value: scala.Boolean): scala.Boolean = js.native
  def set_enableStemming(value: scala.Boolean): scala.Boolean = js.native
  def set_fallbackLanguage(value: js.Any): js.Any = js.native
  def set_fallbackRankingModelID(value: java.lang.String): java.lang.String = js.native
  def set_fallbackRefinementFilters(value: js.Any): js.Any = js.native
  def set_fallbackSort(value: js.Any): js.Any = js.native
  def set_hitHighlightedMultivaluePropertyLimit(value: scala.Double): scala.Double = js.native
  def set_hitHighlightedProperties(value: js.Any): js.Any = js.native
  def set_initialQueryState(value: js.Any): js.Any = js.native
  def set_initialResult(value: java.lang.String): java.lang.String = js.native
  def set_initialResultRef(value: js.Any): js.Any = js.native
  def set_maxPagesAfterCurrent(value: scala.Double): scala.Double = js.native
  def set_parentImpressionID(value: js.Any): js.Any = js.native
  def set_personalizedQuery(value: scala.Boolean): scala.Boolean = js.native
  def set_processBestBets(value: scala.Boolean): scala.Boolean = js.native
  def set_processPersonalFavorites(value: scala.Boolean): scala.Boolean = js.native
  def set_properties(value: js.Any): js.Any = js.native
  def set_queryCount(value: scala.Double): scala.Double = js.native
  def set_queryGroupName(value: java.lang.String): java.lang.String = js.native
  def set_queryPropertiesTemplateUrl(value: java.lang.String): java.lang.String = js.native
  def set_queryTemplate(value: js.Any): js.Any = js.native
  def set_rankRules(value: js.Any): js.Any = js.native
  /** Number of results displayed per page. 10 by default */
  def set_resultsPerPage(value: scala.Double): scala.Double = js.native
  def set_resultsUrl(value: js.Any): js.Any = js.native
  def set_rowCount(value: scala.Double): scala.Double = js.native
  def set_selectedProperties(value: js.Any): js.Any = js.native
  def set_selectedRefiners(value: js.Any): js.Any = js.native
  def set_sourceID(value: java.lang.String): java.lang.String = js.native
  def set_sourceLevel(value: java.lang.String): java.lang.String = js.native
  def set_sourceName(value: java.lang.String): java.lang.String = js.native
  def set_summaryLength(value: scala.Double): scala.Double = js.native
  def set_totalRows(value: scala.Double): scala.Double = js.native
  def set_trimDuplicates(value: scala.Boolean): scala.Boolean = js.native
  def set_updateAjaxNavigate(value: scala.Boolean): scala.Boolean = js.native
  def set_userAction(value: js.Any): js.Any = js.native
}

