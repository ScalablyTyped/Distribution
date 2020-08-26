package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProvider extends ClientControl {
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
  def get_refinementInfo(): StringDictionary[js.Array[RefinementInfo]] = js.native
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

object DataProvider {
  @scala.inline
  def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    add_queryIssuing: js.Any => Unit,
    add_queryStateChanged: js.Any => Unit,
    add_resultReady: js.Any => Unit,
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    beginUpdate: () => Unit,
    clickHandler: Event => js.Any,
    displayControlMessages: () => Unit,
    displayControl_QueryReady: (js.Any, js.Any) => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    getSortName: () => String,
    getSortRankName: () => String,
    get_active: () => Boolean,
    get_alternateErrorMessage: () => String,
    get_availableSorts: () => js.Any,
    get_batched: () => Boolean,
    get_bypassResultTypes: () => Boolean,
    get_clientType: () => String,
    get_collapseSpecification: () => String,
    get_contextualScopeUrl: () => String,
    get_currentQueryState: () => js.Any,
    get_delayLoadTemplateScripts: () => Boolean,
    get_desiredSnippetLength: () => Double,
    get_effectiveQueryLanguage: () => js.Any,
    get_element: () => HTMLElement,
    get_enableInterleaving: () => Boolean,
    get_enableNicknames: () => Boolean,
    get_enableOrderingHitHighlightedProperty: () => Boolean,
    get_enablePhonetic: () => Boolean,
    get_enableQueryRules: () => Boolean,
    get_enableStemming: () => Boolean,
    get_entityInfo: () => js.Any,
    get_events: () => js.Any,
    get_fallbackLanguage: () => js.Any,
    get_fallbackRankingModelID: () => String,
    get_fallbackRefinementFilters: () => js.Any,
    get_fallbackSort: () => js.Any,
    get_hitHighlightedMultivaluePropertyLimit: () => Double,
    get_hitHighlightedProperties: () => js.Any,
    get_id: () => String,
    get_initialQueryState: () => js.Any,
    get_initialResult: () => String,
    get_initialResultObject: () => js.Any,
    get_initialResultRef: () => js.Any,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_maxPagesAfterCurrent: () => Double,
    get_messages: () => js.Array[_],
    get_nextUniqueId: () => String,
    get_parentImpressionID: () => js.Any,
    get_personalizedQuery: () => Boolean,
    get_processBestBets: () => Boolean,
    get_processPersonalFavorites: () => Boolean,
    get_properties: () => js.Any,
    get_queryCount: () => Double,
    get_queryGroupName: () => String,
    get_queryPropertiesTemplateUrl: () => String,
    get_queryTemplate: () => js.Any,
    get_rankRules: () => js.Any,
    get_refinementInfo: () => StringDictionary[js.Array[RefinementInfo]],
    get_renderTemplateId: () => String,
    get_resultsPerPage: () => Double,
    get_resultsUrl: () => js.Any,
    get_rowCount: () => Double,
    get_selectedProperties: () => js.Any,
    get_selectedRefiners: () => js.Any,
    get_showDataErrors: () => Boolean,
    get_sourceID: () => String,
    get_sourceLevel: () => String,
    get_sourceName: () => String,
    get_states: () => js.Any,
    get_summaryLength: () => Double,
    get_totalRows: () => Double,
    get_trimDuplicates: () => Boolean,
    get_upScopeUrl: () => js.Any,
    get_updateAjaxNavigate: () => Boolean,
    get_userAction: () => js.Any,
    hasMessages: () => js.Any,
    initialize: () => Unit,
    invokeAlternateRender: (js.Any, js.Any, js.Any) => js.Any,
    invokeClientRenderer: (js.Any, js.Any) => js.Any,
    issueQuery: () => Unit,
    loadRenderTemplateScripts: (js.Any, js.Any, js.Any, js.Any, js.Any) => Boolean,
    loadServerTemplateScripts: () => Unit,
    loaded: Boolean,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    processDataErrorMessages: js.Any => js.Any,
    processDataProviderErrors: js.Any => Unit,
    processInitial: () => Unit,
    processRenderingErrorMessages: js.Any => js.Any,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raiseEmptyResultReadyEvent: () => Unit,
    raisePropertyChanged: String => Unit,
    raiseQueryIssuingEvent: js.Any => Unit,
    raiseQueryStateChangedEvent: js.Any => Unit,
    raiseResultReadyEvent: js.Any => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_queryIssuing: js.Any => Unit,
    remove_resultReady: js.Any => Unit,
    renderControl: (js.Any, js.Any) => Unit,
    scriptApplication_Load: (js.Any, js.Any) => Unit,
    scriptApplication_PostLoad: (js.Any, js.Any) => Unit,
    scriptApplication_PreLoad: (js.Any, js.Any) => Unit,
    searchBox_BatchQueryIssuing: (js.Any, js.Any) => Unit,
    searchBox_BatchResultReady: (js.Any, js.Any) => Unit,
    searchBox_QueryReady: (js.Any, js.Any) => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[_],
    setControlElementVisibility: Boolean => js.Any,
    set_active: Boolean => Boolean,
    set_alternateErrorMessage: String => String,
    set_availableSorts: js.Any => js.Any,
    set_batched: Boolean => Boolean,
    set_bypassResultTypes: Boolean => Boolean,
    set_clientType: String => String,
    set_collapseSpecification: String => String,
    set_contextualScopeUrl: String => String,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_desiredSnippetLength: Double => Double,
    set_enableInterleaving: Boolean => Boolean,
    set_enableNicknames: Boolean => Boolean,
    set_enableOrderingHitHighlightedProperty: Boolean => Boolean,
    set_enablePhonetic: Boolean => Boolean,
    set_enableQueryRules: Boolean => Boolean,
    set_enableStemming: Boolean => Boolean,
    set_fallbackLanguage: js.Any => js.Any,
    set_fallbackRankingModelID: String => String,
    set_fallbackRefinementFilters: js.Any => js.Any,
    set_fallbackSort: js.Any => js.Any,
    set_hitHighlightedMultivaluePropertyLimit: Double => Double,
    set_hitHighlightedProperties: js.Any => js.Any,
    set_id: String => Unit,
    set_initialQueryState: js.Any => js.Any,
    set_initialResult: String => String,
    set_initialResultRef: js.Any => js.Any,
    set_maxPagesAfterCurrent: Double => Double,
    set_messages: js.Array[_] => js.Array[_],
    set_parentImpressionID: js.Any => js.Any,
    set_personalizedQuery: Boolean => Boolean,
    set_processBestBets: Boolean => Boolean,
    set_processPersonalFavorites: Boolean => Boolean,
    set_properties: js.Any => js.Any,
    set_queryCount: Double => Double,
    set_queryGroupName: String => String,
    set_queryPropertiesTemplateUrl: String => String,
    set_queryTemplate: js.Any => js.Any,
    set_rankRules: js.Any => js.Any,
    set_renderTemplateId: String => String,
    set_resultsPerPage: Double => Double,
    set_resultsUrl: js.Any => js.Any,
    set_rowCount: Double => Double,
    set_selectedProperties: js.Any => js.Any,
    set_selectedRefiners: js.Any => js.Any,
    set_showDataErrors: Boolean => Boolean,
    set_sourceID: String => String,
    set_sourceLevel: String => String,
    set_sourceName: String => String,
    set_states: js.Any => js.Any,
    set_summaryLength: Double => Double,
    set_totalRows: Double => Double,
    set_trimDuplicates: Boolean => Boolean,
    set_updateAjaxNavigate: Boolean => Boolean,
    set_userAction: js.Any => js.Any,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => js.Any,
    updated: () => Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_queryIssuing = js.Any.fromFunction1(add_queryIssuing), add_queryStateChanged = js.Any.fromFunction1(add_queryStateChanged), add_resultReady = js.Any.fromFunction1(add_resultReady), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), displayControlMessages = js.Any.fromFunction0(displayControlMessages), displayControl_QueryReady = js.Any.fromFunction2(displayControl_QueryReady), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), getSortName = js.Any.fromFunction0(getSortName), getSortRankName = js.Any.fromFunction0(getSortRankName), get_active = js.Any.fromFunction0(get_active), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_availableSorts = js.Any.fromFunction0(get_availableSorts), get_batched = js.Any.fromFunction0(get_batched), get_bypassResultTypes = js.Any.fromFunction0(get_bypassResultTypes), get_clientType = js.Any.fromFunction0(get_clientType), get_collapseSpecification = js.Any.fromFunction0(get_collapseSpecification), get_contextualScopeUrl = js.Any.fromFunction0(get_contextualScopeUrl), get_currentQueryState = js.Any.fromFunction0(get_currentQueryState), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_desiredSnippetLength = js.Any.fromFunction0(get_desiredSnippetLength), get_effectiveQueryLanguage = js.Any.fromFunction0(get_effectiveQueryLanguage), get_element = js.Any.fromFunction0(get_element), get_enableInterleaving = js.Any.fromFunction0(get_enableInterleaving), get_enableNicknames = js.Any.fromFunction0(get_enableNicknames), get_enableOrderingHitHighlightedProperty = js.Any.fromFunction0(get_enableOrderingHitHighlightedProperty), get_enablePhonetic = js.Any.fromFunction0(get_enablePhonetic), get_enableQueryRules = js.Any.fromFunction0(get_enableQueryRules), get_enableStemming = js.Any.fromFunction0(get_enableStemming), get_entityInfo = js.Any.fromFunction0(get_entityInfo), get_events = js.Any.fromFunction0(get_events), get_fallbackLanguage = js.Any.fromFunction0(get_fallbackLanguage), get_fallbackRankingModelID = js.Any.fromFunction0(get_fallbackRankingModelID), get_fallbackRefinementFilters = js.Any.fromFunction0(get_fallbackRefinementFilters), get_fallbackSort = js.Any.fromFunction0(get_fallbackSort), get_hitHighlightedMultivaluePropertyLimit = js.Any.fromFunction0(get_hitHighlightedMultivaluePropertyLimit), get_hitHighlightedProperties = js.Any.fromFunction0(get_hitHighlightedProperties), get_id = js.Any.fromFunction0(get_id), get_initialQueryState = js.Any.fromFunction0(get_initialQueryState), get_initialResult = js.Any.fromFunction0(get_initialResult), get_initialResultObject = js.Any.fromFunction0(get_initialResultObject), get_initialResultRef = js.Any.fromFunction0(get_initialResultRef), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_maxPagesAfterCurrent = js.Any.fromFunction0(get_maxPagesAfterCurrent), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_parentImpressionID = js.Any.fromFunction0(get_parentImpressionID), get_personalizedQuery = js.Any.fromFunction0(get_personalizedQuery), get_processBestBets = js.Any.fromFunction0(get_processBestBets), get_processPersonalFavorites = js.Any.fromFunction0(get_processPersonalFavorites), get_properties = js.Any.fromFunction0(get_properties), get_queryCount = js.Any.fromFunction0(get_queryCount), get_queryGroupName = js.Any.fromFunction0(get_queryGroupName), get_queryPropertiesTemplateUrl = js.Any.fromFunction0(get_queryPropertiesTemplateUrl), get_queryTemplate = js.Any.fromFunction0(get_queryTemplate), get_rankRules = js.Any.fromFunction0(get_rankRules), get_refinementInfo = js.Any.fromFunction0(get_refinementInfo), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_resultsPerPage = js.Any.fromFunction0(get_resultsPerPage), get_resultsUrl = js.Any.fromFunction0(get_resultsUrl), get_rowCount = js.Any.fromFunction0(get_rowCount), get_selectedProperties = js.Any.fromFunction0(get_selectedProperties), get_selectedRefiners = js.Any.fromFunction0(get_selectedRefiners), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_sourceID = js.Any.fromFunction0(get_sourceID), get_sourceLevel = js.Any.fromFunction0(get_sourceLevel), get_sourceName = js.Any.fromFunction0(get_sourceName), get_states = js.Any.fromFunction0(get_states), get_summaryLength = js.Any.fromFunction0(get_summaryLength), get_totalRows = js.Any.fromFunction0(get_totalRows), get_trimDuplicates = js.Any.fromFunction0(get_trimDuplicates), get_upScopeUrl = js.Any.fromFunction0(get_upScopeUrl), get_updateAjaxNavigate = js.Any.fromFunction0(get_updateAjaxNavigate), get_userAction = js.Any.fromFunction0(get_userAction), hasMessages = js.Any.fromFunction0(hasMessages), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), issueQuery = js.Any.fromFunction0(issueQuery), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processInitial = js.Any.fromFunction0(processInitial), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raiseEmptyResultReadyEvent = js.Any.fromFunction0(raiseEmptyResultReadyEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), raiseQueryIssuingEvent = js.Any.fromFunction1(raiseQueryIssuingEvent), raiseQueryStateChangedEvent = js.Any.fromFunction1(raiseQueryStateChangedEvent), raiseResultReadyEvent = js.Any.fromFunction1(raiseResultReadyEvent), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_queryIssuing = js.Any.fromFunction1(remove_queryIssuing), remove_resultReady = js.Any.fromFunction1(remove_resultReady), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), searchBox_BatchQueryIssuing = js.Any.fromFunction2(searchBox_BatchQueryIssuing), searchBox_BatchResultReady = js.Any.fromFunction2(searchBox_BatchResultReady), searchBox_QueryReady = js.Any.fromFunction2(searchBox_QueryReady), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_active = js.Any.fromFunction1(set_active), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_availableSorts = js.Any.fromFunction1(set_availableSorts), set_batched = js.Any.fromFunction1(set_batched), set_bypassResultTypes = js.Any.fromFunction1(set_bypassResultTypes), set_clientType = js.Any.fromFunction1(set_clientType), set_collapseSpecification = js.Any.fromFunction1(set_collapseSpecification), set_contextualScopeUrl = js.Any.fromFunction1(set_contextualScopeUrl), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_desiredSnippetLength = js.Any.fromFunction1(set_desiredSnippetLength), set_enableInterleaving = js.Any.fromFunction1(set_enableInterleaving), set_enableNicknames = js.Any.fromFunction1(set_enableNicknames), set_enableOrderingHitHighlightedProperty = js.Any.fromFunction1(set_enableOrderingHitHighlightedProperty), set_enablePhonetic = js.Any.fromFunction1(set_enablePhonetic), set_enableQueryRules = js.Any.fromFunction1(set_enableQueryRules), set_enableStemming = js.Any.fromFunction1(set_enableStemming), set_fallbackLanguage = js.Any.fromFunction1(set_fallbackLanguage), set_fallbackRankingModelID = js.Any.fromFunction1(set_fallbackRankingModelID), set_fallbackRefinementFilters = js.Any.fromFunction1(set_fallbackRefinementFilters), set_fallbackSort = js.Any.fromFunction1(set_fallbackSort), set_hitHighlightedMultivaluePropertyLimit = js.Any.fromFunction1(set_hitHighlightedMultivaluePropertyLimit), set_hitHighlightedProperties = js.Any.fromFunction1(set_hitHighlightedProperties), set_id = js.Any.fromFunction1(set_id), set_initialQueryState = js.Any.fromFunction1(set_initialQueryState), set_initialResult = js.Any.fromFunction1(set_initialResult), set_initialResultRef = js.Any.fromFunction1(set_initialResultRef), set_maxPagesAfterCurrent = js.Any.fromFunction1(set_maxPagesAfterCurrent), set_messages = js.Any.fromFunction1(set_messages), set_parentImpressionID = js.Any.fromFunction1(set_parentImpressionID), set_personalizedQuery = js.Any.fromFunction1(set_personalizedQuery), set_processBestBets = js.Any.fromFunction1(set_processBestBets), set_processPersonalFavorites = js.Any.fromFunction1(set_processPersonalFavorites), set_properties = js.Any.fromFunction1(set_properties), set_queryCount = js.Any.fromFunction1(set_queryCount), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_queryPropertiesTemplateUrl = js.Any.fromFunction1(set_queryPropertiesTemplateUrl), set_queryTemplate = js.Any.fromFunction1(set_queryTemplate), set_rankRules = js.Any.fromFunction1(set_rankRules), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_resultsPerPage = js.Any.fromFunction1(set_resultsPerPage), set_resultsUrl = js.Any.fromFunction1(set_resultsUrl), set_rowCount = js.Any.fromFunction1(set_rowCount), set_selectedProperties = js.Any.fromFunction1(set_selectedProperties), set_selectedRefiners = js.Any.fromFunction1(set_selectedRefiners), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_sourceID = js.Any.fromFunction1(set_sourceID), set_sourceLevel = js.Any.fromFunction1(set_sourceLevel), set_sourceName = js.Any.fromFunction1(set_sourceName), set_states = js.Any.fromFunction1(set_states), set_summaryLength = js.Any.fromFunction1(set_summaryLength), set_totalRows = js.Any.fromFunction1(set_totalRows), set_trimDuplicates = js.Any.fromFunction1(set_trimDuplicates), set_updateAjaxNavigate = js.Any.fromFunction1(set_updateAjaxNavigate), set_userAction = js.Any.fromFunction1(set_userAction), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[DataProvider]
  }
  @scala.inline
  implicit class DataProviderOps[Self <: DataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd_queryIssuing(value: js.Any => Unit): Self = this.set("add_queryIssuing", js.Any.fromFunction1(value))
    @scala.inline
    def setAdd_queryStateChanged(value: js.Any => Unit): Self = this.set("add_queryStateChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setAdd_resultReady(value: js.Any => Unit): Self = this.set("add_resultReady", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplayControlMessages(value: () => Unit): Self = this.set("displayControlMessages", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayControl_QueryReady(value: (js.Any, js.Any) => Unit): Self = this.set("displayControl_QueryReady", js.Any.fromFunction2(value))
    @scala.inline
    def setGetSortName(value: () => String): Self = this.set("getSortName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSortRankName(value: () => String): Self = this.set("getSortRankName", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_active(value: () => Boolean): Self = this.set("get_active", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_availableSorts(value: () => js.Any): Self = this.set("get_availableSorts", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_batched(value: () => Boolean): Self = this.set("get_batched", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_bypassResultTypes(value: () => Boolean): Self = this.set("get_bypassResultTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_clientType(value: () => String): Self = this.set("get_clientType", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_collapseSpecification(value: () => String): Self = this.set("get_collapseSpecification", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_contextualScopeUrl(value: () => String): Self = this.set("get_contextualScopeUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_currentQueryState(value: () => js.Any): Self = this.set("get_currentQueryState", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_desiredSnippetLength(value: () => Double): Self = this.set("get_desiredSnippetLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_effectiveQueryLanguage(value: () => js.Any): Self = this.set("get_effectiveQueryLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_enableInterleaving(value: () => Boolean): Self = this.set("get_enableInterleaving", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_enableNicknames(value: () => Boolean): Self = this.set("get_enableNicknames", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_enableOrderingHitHighlightedProperty(value: () => Boolean): Self = this.set("get_enableOrderingHitHighlightedProperty", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_enablePhonetic(value: () => Boolean): Self = this.set("get_enablePhonetic", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_enableQueryRules(value: () => Boolean): Self = this.set("get_enableQueryRules", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_enableStemming(value: () => Boolean): Self = this.set("get_enableStemming", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_entityInfo(value: () => js.Any): Self = this.set("get_entityInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_fallbackLanguage(value: () => js.Any): Self = this.set("get_fallbackLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_fallbackRankingModelID(value: () => String): Self = this.set("get_fallbackRankingModelID", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_fallbackRefinementFilters(value: () => js.Any): Self = this.set("get_fallbackRefinementFilters", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_fallbackSort(value: () => js.Any): Self = this.set("get_fallbackSort", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_hitHighlightedMultivaluePropertyLimit(value: () => Double): Self = this.set("get_hitHighlightedMultivaluePropertyLimit", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_hitHighlightedProperties(value: () => js.Any): Self = this.set("get_hitHighlightedProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_initialQueryState(value: () => js.Any): Self = this.set("get_initialQueryState", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_initialResult(value: () => String): Self = this.set("get_initialResult", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_initialResultObject(value: () => js.Any): Self = this.set("get_initialResultObject", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_initialResultRef(value: () => js.Any): Self = this.set("get_initialResultRef", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_maxPagesAfterCurrent(value: () => Double): Self = this.set("get_maxPagesAfterCurrent", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_parentImpressionID(value: () => js.Any): Self = this.set("get_parentImpressionID", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_personalizedQuery(value: () => Boolean): Self = this.set("get_personalizedQuery", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_processBestBets(value: () => Boolean): Self = this.set("get_processBestBets", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_processPersonalFavorites(value: () => Boolean): Self = this.set("get_processPersonalFavorites", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_properties(value: () => js.Any): Self = this.set("get_properties", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_queryCount(value: () => Double): Self = this.set("get_queryCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_queryGroupName(value: () => String): Self = this.set("get_queryGroupName", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_queryPropertiesTemplateUrl(value: () => String): Self = this.set("get_queryPropertiesTemplateUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_queryTemplate(value: () => js.Any): Self = this.set("get_queryTemplate", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_rankRules(value: () => js.Any): Self = this.set("get_rankRules", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_refinementInfo(value: () => StringDictionary[js.Array[RefinementInfo]]): Self = this.set("get_refinementInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_resultsPerPage(value: () => Double): Self = this.set("get_resultsPerPage", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_resultsUrl(value: () => js.Any): Self = this.set("get_resultsUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_rowCount(value: () => Double): Self = this.set("get_rowCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_selectedProperties(value: () => js.Any): Self = this.set("get_selectedProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_selectedRefiners(value: () => js.Any): Self = this.set("get_selectedRefiners", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_sourceID(value: () => String): Self = this.set("get_sourceID", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_sourceLevel(value: () => String): Self = this.set("get_sourceLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_sourceName(value: () => String): Self = this.set("get_sourceName", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_summaryLength(value: () => Double): Self = this.set("get_summaryLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_totalRows(value: () => Double): Self = this.set("get_totalRows", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_trimDuplicates(value: () => Boolean): Self = this.set("get_trimDuplicates", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_upScopeUrl(value: () => js.Any): Self = this.set("get_upScopeUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_updateAjaxNavigate(value: () => Boolean): Self = this.set("get_updateAjaxNavigate", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_userAction(value: () => js.Any): Self = this.set("get_userAction", js.Any.fromFunction0(value))
    @scala.inline
    def setIssueQuery(value: () => Unit): Self = this.set("issueQuery", js.Any.fromFunction0(value))
    @scala.inline
    def setProcessInitial(value: () => Unit): Self = this.set("processInitial", js.Any.fromFunction0(value))
    @scala.inline
    def setRaiseEmptyResultReadyEvent(value: () => Unit): Self = this.set("raiseEmptyResultReadyEvent", js.Any.fromFunction0(value))
    @scala.inline
    def setRaiseQueryIssuingEvent(value: js.Any => Unit): Self = this.set("raiseQueryIssuingEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setRaiseQueryStateChangedEvent(value: js.Any => Unit): Self = this.set("raiseQueryStateChangedEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setRaiseResultReadyEvent(value: js.Any => Unit): Self = this.set("raiseResultReadyEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove_queryIssuing(value: js.Any => Unit): Self = this.set("remove_queryIssuing", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove_resultReady(value: js.Any => Unit): Self = this.set("remove_resultReady", js.Any.fromFunction1(value))
    @scala.inline
    def setSearchBox_BatchQueryIssuing(value: (js.Any, js.Any) => Unit): Self = this.set("searchBox_BatchQueryIssuing", js.Any.fromFunction2(value))
    @scala.inline
    def setSearchBox_BatchResultReady(value: (js.Any, js.Any) => Unit): Self = this.set("searchBox_BatchResultReady", js.Any.fromFunction2(value))
    @scala.inline
    def setSearchBox_QueryReady(value: (js.Any, js.Any) => Unit): Self = this.set("searchBox_QueryReady", js.Any.fromFunction2(value))
    @scala.inline
    def setSet_active(value: Boolean => Boolean): Self = this.set("set_active", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_availableSorts(value: js.Any => js.Any): Self = this.set("set_availableSorts", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_batched(value: Boolean => Boolean): Self = this.set("set_batched", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_bypassResultTypes(value: Boolean => Boolean): Self = this.set("set_bypassResultTypes", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_clientType(value: String => String): Self = this.set("set_clientType", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_collapseSpecification(value: String => String): Self = this.set("set_collapseSpecification", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_contextualScopeUrl(value: String => String): Self = this.set("set_contextualScopeUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_desiredSnippetLength(value: Double => Double): Self = this.set("set_desiredSnippetLength", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_enableInterleaving(value: Boolean => Boolean): Self = this.set("set_enableInterleaving", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_enableNicknames(value: Boolean => Boolean): Self = this.set("set_enableNicknames", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_enableOrderingHitHighlightedProperty(value: Boolean => Boolean): Self = this.set("set_enableOrderingHitHighlightedProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_enablePhonetic(value: Boolean => Boolean): Self = this.set("set_enablePhonetic", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_enableQueryRules(value: Boolean => Boolean): Self = this.set("set_enableQueryRules", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_enableStemming(value: Boolean => Boolean): Self = this.set("set_enableStemming", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_fallbackLanguage(value: js.Any => js.Any): Self = this.set("set_fallbackLanguage", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_fallbackRankingModelID(value: String => String): Self = this.set("set_fallbackRankingModelID", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_fallbackRefinementFilters(value: js.Any => js.Any): Self = this.set("set_fallbackRefinementFilters", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_fallbackSort(value: js.Any => js.Any): Self = this.set("set_fallbackSort", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_hitHighlightedMultivaluePropertyLimit(value: Double => Double): Self = this.set("set_hitHighlightedMultivaluePropertyLimit", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_hitHighlightedProperties(value: js.Any => js.Any): Self = this.set("set_hitHighlightedProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_initialQueryState(value: js.Any => js.Any): Self = this.set("set_initialQueryState", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_initialResult(value: String => String): Self = this.set("set_initialResult", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_initialResultRef(value: js.Any => js.Any): Self = this.set("set_initialResultRef", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_maxPagesAfterCurrent(value: Double => Double): Self = this.set("set_maxPagesAfterCurrent", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_parentImpressionID(value: js.Any => js.Any): Self = this.set("set_parentImpressionID", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_personalizedQuery(value: Boolean => Boolean): Self = this.set("set_personalizedQuery", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_processBestBets(value: Boolean => Boolean): Self = this.set("set_processBestBets", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_processPersonalFavorites(value: Boolean => Boolean): Self = this.set("set_processPersonalFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_properties(value: js.Any => js.Any): Self = this.set("set_properties", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_queryCount(value: Double => Double): Self = this.set("set_queryCount", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_queryGroupName(value: String => String): Self = this.set("set_queryGroupName", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_queryPropertiesTemplateUrl(value: String => String): Self = this.set("set_queryPropertiesTemplateUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_queryTemplate(value: js.Any => js.Any): Self = this.set("set_queryTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_rankRules(value: js.Any => js.Any): Self = this.set("set_rankRules", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_resultsPerPage(value: Double => Double): Self = this.set("set_resultsPerPage", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_resultsUrl(value: js.Any => js.Any): Self = this.set("set_resultsUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_rowCount(value: Double => Double): Self = this.set("set_rowCount", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_selectedProperties(value: js.Any => js.Any): Self = this.set("set_selectedProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_selectedRefiners(value: js.Any => js.Any): Self = this.set("set_selectedRefiners", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_sourceID(value: String => String): Self = this.set("set_sourceID", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_sourceLevel(value: String => String): Self = this.set("set_sourceLevel", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_sourceName(value: String => String): Self = this.set("set_sourceName", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_summaryLength(value: Double => Double): Self = this.set("set_summaryLength", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_totalRows(value: Double => Double): Self = this.set("set_totalRows", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_trimDuplicates(value: Boolean => Boolean): Self = this.set("set_trimDuplicates", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_updateAjaxNavigate(value: Boolean => Boolean): Self = this.set("set_updateAjaxNavigate", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_userAction(value: js.Any => js.Any): Self = this.set("set_userAction", js.Any.fromFunction1(value))
  }
  
}

