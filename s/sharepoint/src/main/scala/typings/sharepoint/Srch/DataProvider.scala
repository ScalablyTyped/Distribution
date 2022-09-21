package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProvider
  extends StObject
     with ClientControl {
  
  def add_queryIssuing(value: Any): Unit
  
  def add_queryStateChanged(value: Any): Unit
  
  def add_resultReady(value: Any): Unit
  
  def displayControlMessages(): Unit
  
  def displayControl_QueryReady(sender: Any, e: Any): Unit
  
  def getSortName(): String
  
  def getSortRankName(): String
  
  def get_active(): Boolean
  
  def get_availableSorts(): Any
  
  def get_batched(): Boolean
  
  def get_bypassResultTypes(): Boolean
  
  def get_clientType(): String
  
  def get_collapseSpecification(): String
  
  def get_contextualScopeUrl(): String
  
  def get_currentQueryState(): Any
  
  def get_desiredSnippetLength(): Double
  
  def get_effectiveQueryLanguage(): Any
  
  def get_enableInterleaving(): Boolean
  
  def get_enableNicknames(): Boolean
  
  def get_enableOrderingHitHighlightedProperty(): Boolean
  
  def get_enablePhonetic(): Boolean
  
  def get_enableQueryRules(): Boolean
  
  def get_enableStemming(): Boolean
  
  def get_entityInfo(): Any
  
  def get_fallbackLanguage(): Any
  
  def get_fallbackRankingModelID(): String
  
  def get_fallbackRefinementFilters(): Any
  
  def get_fallbackSort(): Any
  
  def get_hitHighlightedMultivaluePropertyLimit(): Double
  
  def get_hitHighlightedProperties(): Any
  
  def get_initialQueryState(): Any
  
  def get_initialResult(): String
  
  def get_initialResultObject(): Any
  
  def get_initialResultRef(): Any
  
  def get_maxPagesAfterCurrent(): Double
  
  def get_parentImpressionID(): Any
  
  def get_personalizedQuery(): Boolean
  
  def get_processBestBets(): Boolean
  
  def get_processPersonalFavorites(): Boolean
  
  def get_properties(): Any
  
  def get_queryCount(): Double
  
  def get_queryGroupName(): String
  
  def get_queryPropertiesTemplateUrl(): String
  
  def get_queryTemplate(): Any
  
  def get_rankRules(): Any
  
  def get_refinementInfo(): StringDictionary[js.Array[RefinementInfo]]
  
  /** Number of results displayed per page. 10 by default */
  def get_resultsPerPage(): Double
  
  def get_resultsUrl(): Any
  
  def get_rowCount(): Double
  
  def get_selectedProperties(): Any
  
  def get_selectedRefiners(): Any
  
  def get_sourceID(): String
  
  def get_sourceLevel(): String
  
  def get_sourceName(): String
  
  def get_summaryLength(): Double
  
  def get_totalRows(): Double
  
  def get_trimDuplicates(): Boolean
  
  def get_upScopeUrl(): Any
  
  def get_updateAjaxNavigate(): Boolean
  
  def get_userAction(): Any
  
  def issueQuery(): Unit
  
  def processInitial(): Unit
  
  def raiseEmptyResultReadyEvent(): Unit
  
  def raiseQueryIssuingEvent(arg: Any): Unit
  
  def raiseQueryStateChangedEvent(arg: Any): Unit
  
  def raiseResultReadyEvent(arg: Any): Unit
  
  def remove_queryIssuing(value: Any): Unit
  
  def remove_resultReady(value: Any): Unit
  
  def searchBox_BatchQueryIssuing(sender: Any, e: Any): Unit
  
  def searchBox_BatchResultReady(sender: Any, e: Any): Unit
  
  def searchBox_QueryReady(sender: Any, e: Any): Unit
  
  def set_active(value: Boolean): Boolean
  
  def set_availableSorts(value: Any): Any
  
  def set_batched(value: Boolean): Boolean
  
  def set_bypassResultTypes(value: Boolean): Boolean
  
  def set_clientType(value: String): String
  
  def set_collapseSpecification(value: String): String
  
  def set_contextualScopeUrl(value: String): String
  
  def set_desiredSnippetLength(value: Double): Double
  
  def set_enableInterleaving(value: Boolean): Boolean
  
  def set_enableNicknames(value: Boolean): Boolean
  
  def set_enableOrderingHitHighlightedProperty(value: Boolean): Boolean
  
  def set_enablePhonetic(value: Boolean): Boolean
  
  def set_enableQueryRules(value: Boolean): Boolean
  
  def set_enableStemming(value: Boolean): Boolean
  
  def set_fallbackLanguage(value: Any): Any
  
  def set_fallbackRankingModelID(value: String): String
  
  def set_fallbackRefinementFilters(value: Any): Any
  
  def set_fallbackSort(value: Any): Any
  
  def set_hitHighlightedMultivaluePropertyLimit(value: Double): Double
  
  def set_hitHighlightedProperties(value: Any): Any
  
  def set_initialQueryState(value: Any): Any
  
  def set_initialResult(value: String): String
  
  def set_initialResultRef(value: Any): Any
  
  def set_maxPagesAfterCurrent(value: Double): Double
  
  def set_parentImpressionID(value: Any): Any
  
  def set_personalizedQuery(value: Boolean): Boolean
  
  def set_processBestBets(value: Boolean): Boolean
  
  def set_processPersonalFavorites(value: Boolean): Boolean
  
  def set_properties(value: Any): Any
  
  def set_queryCount(value: Double): Double
  
  def set_queryGroupName(value: String): String
  
  def set_queryPropertiesTemplateUrl(value: String): String
  
  def set_queryTemplate(value: Any): Any
  
  def set_rankRules(value: Any): Any
  
  /** Number of results displayed per page. 10 by default */
  def set_resultsPerPage(value: Double): Double
  
  def set_resultsUrl(value: Any): Any
  
  def set_rowCount(value: Double): Double
  
  def set_selectedProperties(value: Any): Any
  
  def set_selectedRefiners(value: Any): Any
  
  def set_sourceID(value: String): String
  
  def set_sourceLevel(value: String): String
  
  def set_sourceName(value: String): String
  
  def set_summaryLength(value: Double): Double
  
  def set_totalRows(value: Double): Double
  
  def set_trimDuplicates(value: Boolean): Boolean
  
  def set_updateAjaxNavigate(value: Boolean): Boolean
  
  def set_userAction(value: Any): Any
}
object DataProvider {
  
  inline def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    add_queryIssuing: Any => Unit,
    add_queryStateChanged: Any => Unit,
    add_resultReady: Any => Unit,
    alternateRenderContext: Any,
    alternateRenderer: Any,
    beginUpdate: () => Unit,
    clickHandler: Event => Any,
    displayControlMessages: () => Unit,
    displayControl_QueryReady: (Any, Any) => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    getSortName: () => String,
    getSortRankName: () => String,
    get_active: () => Boolean,
    get_alternateErrorMessage: () => String,
    get_availableSorts: () => Any,
    get_batched: () => Boolean,
    get_bypassResultTypes: () => Boolean,
    get_clientType: () => String,
    get_collapseSpecification: () => String,
    get_contextualScopeUrl: () => String,
    get_currentQueryState: () => Any,
    get_delayLoadTemplateScripts: () => Boolean,
    get_desiredSnippetLength: () => Double,
    get_effectiveQueryLanguage: () => Any,
    get_element: () => HTMLElement,
    get_enableInterleaving: () => Boolean,
    get_enableNicknames: () => Boolean,
    get_enableOrderingHitHighlightedProperty: () => Boolean,
    get_enablePhonetic: () => Boolean,
    get_enableQueryRules: () => Boolean,
    get_enableStemming: () => Boolean,
    get_entityInfo: () => Any,
    get_events: () => Any,
    get_fallbackLanguage: () => Any,
    get_fallbackRankingModelID: () => String,
    get_fallbackRefinementFilters: () => Any,
    get_fallbackSort: () => Any,
    get_hitHighlightedMultivaluePropertyLimit: () => Double,
    get_hitHighlightedProperties: () => Any,
    get_id: () => String,
    get_initialQueryState: () => Any,
    get_initialResult: () => String,
    get_initialResultObject: () => Any,
    get_initialResultRef: () => Any,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_maxPagesAfterCurrent: () => Double,
    get_messages: () => js.Array[Any],
    get_nextUniqueId: () => String,
    get_parentImpressionID: () => Any,
    get_personalizedQuery: () => Boolean,
    get_processBestBets: () => Boolean,
    get_processPersonalFavorites: () => Boolean,
    get_properties: () => Any,
    get_queryCount: () => Double,
    get_queryGroupName: () => String,
    get_queryPropertiesTemplateUrl: () => String,
    get_queryTemplate: () => Any,
    get_rankRules: () => Any,
    get_refinementInfo: () => StringDictionary[js.Array[RefinementInfo]],
    get_renderTemplateId: () => String,
    get_resultsPerPage: () => Double,
    get_resultsUrl: () => Any,
    get_rowCount: () => Double,
    get_selectedProperties: () => Any,
    get_selectedRefiners: () => Any,
    get_showDataErrors: () => Boolean,
    get_sourceID: () => String,
    get_sourceLevel: () => String,
    get_sourceName: () => String,
    get_states: () => Any,
    get_summaryLength: () => Double,
    get_totalRows: () => Double,
    get_trimDuplicates: () => Boolean,
    get_upScopeUrl: () => Any,
    get_updateAjaxNavigate: () => Boolean,
    get_userAction: () => Any,
    hasMessages: () => Any,
    initialize: () => Unit,
    invokeAlternateRender: (Any, Any, Any) => Any,
    invokeClientRenderer: (Any, Any) => Any,
    issueQuery: () => Unit,
    loadRenderTemplateScripts: (Any, Any, Any, Any, Any) => Boolean,
    loadServerTemplateScripts: () => Unit,
    loaded: Boolean,
    onBubbleEvent: (Any, Any) => Boolean,
    processDataErrorMessages: Any => Any,
    processDataProviderErrors: Any => Unit,
    processInitial: () => Unit,
    processRenderingErrorMessages: Any => Any,
    raiseBubbleEvent: (Any, Any) => Unit,
    raiseEmptyResultReadyEvent: () => Unit,
    raisePropertyChanged: String => Unit,
    raiseQueryIssuingEvent: Any => Unit,
    raiseQueryStateChangedEvent: Any => Unit,
    raiseResultReadyEvent: Any => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_queryIssuing: Any => Unit,
    remove_resultReady: Any => Unit,
    renderControl: (Any, Any) => Unit,
    scriptApplication_Load: (Any, Any) => Unit,
    scriptApplication_PostLoad: (Any, Any) => Unit,
    scriptApplication_PreLoad: (Any, Any) => Unit,
    searchBox_BatchQueryIssuing: (Any, Any) => Unit,
    searchBox_BatchResultReady: (Any, Any) => Unit,
    searchBox_QueryReady: (Any, Any) => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[Any],
    setControlElementVisibility: Boolean => Any,
    set_active: Boolean => Boolean,
    set_alternateErrorMessage: String => String,
    set_availableSorts: Any => Any,
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
    set_fallbackLanguage: Any => Any,
    set_fallbackRankingModelID: String => String,
    set_fallbackRefinementFilters: Any => Any,
    set_fallbackSort: Any => Any,
    set_hitHighlightedMultivaluePropertyLimit: Double => Double,
    set_hitHighlightedProperties: Any => Any,
    set_id: String => Unit,
    set_initialQueryState: Any => Any,
    set_initialResult: String => String,
    set_initialResultRef: Any => Any,
    set_maxPagesAfterCurrent: Double => Double,
    set_messages: js.Array[Any] => js.Array[Any],
    set_parentImpressionID: Any => Any,
    set_personalizedQuery: Boolean => Boolean,
    set_processBestBets: Boolean => Boolean,
    set_processPersonalFavorites: Boolean => Boolean,
    set_properties: Any => Any,
    set_queryCount: Double => Double,
    set_queryGroupName: String => String,
    set_queryPropertiesTemplateUrl: String => String,
    set_queryTemplate: Any => Any,
    set_rankRules: Any => Any,
    set_renderTemplateId: String => String,
    set_resultsPerPage: Double => Double,
    set_resultsUrl: Any => Any,
    set_rowCount: Double => Double,
    set_selectedProperties: Any => Any,
    set_selectedRefiners: Any => Any,
    set_showDataErrors: Boolean => Boolean,
    set_sourceID: String => String,
    set_sourceLevel: String => String,
    set_sourceName: String => String,
    set_states: Any => Any,
    set_summaryLength: Double => Double,
    set_totalRows: Double => Double,
    set_trimDuplicates: Boolean => Boolean,
    set_updateAjaxNavigate: Boolean => Boolean,
    set_userAction: Any => Any,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => Any,
    updated: () => Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_queryIssuing = js.Any.fromFunction1(add_queryIssuing), add_queryStateChanged = js.Any.fromFunction1(add_queryStateChanged), add_resultReady = js.Any.fromFunction1(add_resultReady), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), displayControlMessages = js.Any.fromFunction0(displayControlMessages), displayControl_QueryReady = js.Any.fromFunction2(displayControl_QueryReady), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), getSortName = js.Any.fromFunction0(getSortName), getSortRankName = js.Any.fromFunction0(getSortRankName), get_active = js.Any.fromFunction0(get_active), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_availableSorts = js.Any.fromFunction0(get_availableSorts), get_batched = js.Any.fromFunction0(get_batched), get_bypassResultTypes = js.Any.fromFunction0(get_bypassResultTypes), get_clientType = js.Any.fromFunction0(get_clientType), get_collapseSpecification = js.Any.fromFunction0(get_collapseSpecification), get_contextualScopeUrl = js.Any.fromFunction0(get_contextualScopeUrl), get_currentQueryState = js.Any.fromFunction0(get_currentQueryState), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_desiredSnippetLength = js.Any.fromFunction0(get_desiredSnippetLength), get_effectiveQueryLanguage = js.Any.fromFunction0(get_effectiveQueryLanguage), get_element = js.Any.fromFunction0(get_element), get_enableInterleaving = js.Any.fromFunction0(get_enableInterleaving), get_enableNicknames = js.Any.fromFunction0(get_enableNicknames), get_enableOrderingHitHighlightedProperty = js.Any.fromFunction0(get_enableOrderingHitHighlightedProperty), get_enablePhonetic = js.Any.fromFunction0(get_enablePhonetic), get_enableQueryRules = js.Any.fromFunction0(get_enableQueryRules), get_enableStemming = js.Any.fromFunction0(get_enableStemming), get_entityInfo = js.Any.fromFunction0(get_entityInfo), get_events = js.Any.fromFunction0(get_events), get_fallbackLanguage = js.Any.fromFunction0(get_fallbackLanguage), get_fallbackRankingModelID = js.Any.fromFunction0(get_fallbackRankingModelID), get_fallbackRefinementFilters = js.Any.fromFunction0(get_fallbackRefinementFilters), get_fallbackSort = js.Any.fromFunction0(get_fallbackSort), get_hitHighlightedMultivaluePropertyLimit = js.Any.fromFunction0(get_hitHighlightedMultivaluePropertyLimit), get_hitHighlightedProperties = js.Any.fromFunction0(get_hitHighlightedProperties), get_id = js.Any.fromFunction0(get_id), get_initialQueryState = js.Any.fromFunction0(get_initialQueryState), get_initialResult = js.Any.fromFunction0(get_initialResult), get_initialResultObject = js.Any.fromFunction0(get_initialResultObject), get_initialResultRef = js.Any.fromFunction0(get_initialResultRef), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_maxPagesAfterCurrent = js.Any.fromFunction0(get_maxPagesAfterCurrent), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_parentImpressionID = js.Any.fromFunction0(get_parentImpressionID), get_personalizedQuery = js.Any.fromFunction0(get_personalizedQuery), get_processBestBets = js.Any.fromFunction0(get_processBestBets), get_processPersonalFavorites = js.Any.fromFunction0(get_processPersonalFavorites), get_properties = js.Any.fromFunction0(get_properties), get_queryCount = js.Any.fromFunction0(get_queryCount), get_queryGroupName = js.Any.fromFunction0(get_queryGroupName), get_queryPropertiesTemplateUrl = js.Any.fromFunction0(get_queryPropertiesTemplateUrl), get_queryTemplate = js.Any.fromFunction0(get_queryTemplate), get_rankRules = js.Any.fromFunction0(get_rankRules), get_refinementInfo = js.Any.fromFunction0(get_refinementInfo), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_resultsPerPage = js.Any.fromFunction0(get_resultsPerPage), get_resultsUrl = js.Any.fromFunction0(get_resultsUrl), get_rowCount = js.Any.fromFunction0(get_rowCount), get_selectedProperties = js.Any.fromFunction0(get_selectedProperties), get_selectedRefiners = js.Any.fromFunction0(get_selectedRefiners), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_sourceID = js.Any.fromFunction0(get_sourceID), get_sourceLevel = js.Any.fromFunction0(get_sourceLevel), get_sourceName = js.Any.fromFunction0(get_sourceName), get_states = js.Any.fromFunction0(get_states), get_summaryLength = js.Any.fromFunction0(get_summaryLength), get_totalRows = js.Any.fromFunction0(get_totalRows), get_trimDuplicates = js.Any.fromFunction0(get_trimDuplicates), get_upScopeUrl = js.Any.fromFunction0(get_upScopeUrl), get_updateAjaxNavigate = js.Any.fromFunction0(get_updateAjaxNavigate), get_userAction = js.Any.fromFunction0(get_userAction), hasMessages = js.Any.fromFunction0(hasMessages), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), issueQuery = js.Any.fromFunction0(issueQuery), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processInitial = js.Any.fromFunction0(processInitial), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raiseEmptyResultReadyEvent = js.Any.fromFunction0(raiseEmptyResultReadyEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), raiseQueryIssuingEvent = js.Any.fromFunction1(raiseQueryIssuingEvent), raiseQueryStateChangedEvent = js.Any.fromFunction1(raiseQueryStateChangedEvent), raiseResultReadyEvent = js.Any.fromFunction1(raiseResultReadyEvent), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_queryIssuing = js.Any.fromFunction1(remove_queryIssuing), remove_resultReady = js.Any.fromFunction1(remove_resultReady), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), searchBox_BatchQueryIssuing = js.Any.fromFunction2(searchBox_BatchQueryIssuing), searchBox_BatchResultReady = js.Any.fromFunction2(searchBox_BatchResultReady), searchBox_QueryReady = js.Any.fromFunction2(searchBox_QueryReady), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_active = js.Any.fromFunction1(set_active), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_availableSorts = js.Any.fromFunction1(set_availableSorts), set_batched = js.Any.fromFunction1(set_batched), set_bypassResultTypes = js.Any.fromFunction1(set_bypassResultTypes), set_clientType = js.Any.fromFunction1(set_clientType), set_collapseSpecification = js.Any.fromFunction1(set_collapseSpecification), set_contextualScopeUrl = js.Any.fromFunction1(set_contextualScopeUrl), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_desiredSnippetLength = js.Any.fromFunction1(set_desiredSnippetLength), set_enableInterleaving = js.Any.fromFunction1(set_enableInterleaving), set_enableNicknames = js.Any.fromFunction1(set_enableNicknames), set_enableOrderingHitHighlightedProperty = js.Any.fromFunction1(set_enableOrderingHitHighlightedProperty), set_enablePhonetic = js.Any.fromFunction1(set_enablePhonetic), set_enableQueryRules = js.Any.fromFunction1(set_enableQueryRules), set_enableStemming = js.Any.fromFunction1(set_enableStemming), set_fallbackLanguage = js.Any.fromFunction1(set_fallbackLanguage), set_fallbackRankingModelID = js.Any.fromFunction1(set_fallbackRankingModelID), set_fallbackRefinementFilters = js.Any.fromFunction1(set_fallbackRefinementFilters), set_fallbackSort = js.Any.fromFunction1(set_fallbackSort), set_hitHighlightedMultivaluePropertyLimit = js.Any.fromFunction1(set_hitHighlightedMultivaluePropertyLimit), set_hitHighlightedProperties = js.Any.fromFunction1(set_hitHighlightedProperties), set_id = js.Any.fromFunction1(set_id), set_initialQueryState = js.Any.fromFunction1(set_initialQueryState), set_initialResult = js.Any.fromFunction1(set_initialResult), set_initialResultRef = js.Any.fromFunction1(set_initialResultRef), set_maxPagesAfterCurrent = js.Any.fromFunction1(set_maxPagesAfterCurrent), set_messages = js.Any.fromFunction1(set_messages), set_parentImpressionID = js.Any.fromFunction1(set_parentImpressionID), set_personalizedQuery = js.Any.fromFunction1(set_personalizedQuery), set_processBestBets = js.Any.fromFunction1(set_processBestBets), set_processPersonalFavorites = js.Any.fromFunction1(set_processPersonalFavorites), set_properties = js.Any.fromFunction1(set_properties), set_queryCount = js.Any.fromFunction1(set_queryCount), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_queryPropertiesTemplateUrl = js.Any.fromFunction1(set_queryPropertiesTemplateUrl), set_queryTemplate = js.Any.fromFunction1(set_queryTemplate), set_rankRules = js.Any.fromFunction1(set_rankRules), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_resultsPerPage = js.Any.fromFunction1(set_resultsPerPage), set_resultsUrl = js.Any.fromFunction1(set_resultsUrl), set_rowCount = js.Any.fromFunction1(set_rowCount), set_selectedProperties = js.Any.fromFunction1(set_selectedProperties), set_selectedRefiners = js.Any.fromFunction1(set_selectedRefiners), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_sourceID = js.Any.fromFunction1(set_sourceID), set_sourceLevel = js.Any.fromFunction1(set_sourceLevel), set_sourceName = js.Any.fromFunction1(set_sourceName), set_states = js.Any.fromFunction1(set_states), set_summaryLength = js.Any.fromFunction1(set_summaryLength), set_totalRows = js.Any.fromFunction1(set_totalRows), set_trimDuplicates = js.Any.fromFunction1(set_trimDuplicates), set_updateAjaxNavigate = js.Any.fromFunction1(set_updateAjaxNavigate), set_userAction = js.Any.fromFunction1(set_userAction), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[DataProvider]
  }
  
  extension [Self <: DataProvider](x: Self) {
    
    inline def setAdd_queryIssuing(value: Any => Unit): Self = StObject.set(x, "add_queryIssuing", js.Any.fromFunction1(value))
    
    inline def setAdd_queryStateChanged(value: Any => Unit): Self = StObject.set(x, "add_queryStateChanged", js.Any.fromFunction1(value))
    
    inline def setAdd_resultReady(value: Any => Unit): Self = StObject.set(x, "add_resultReady", js.Any.fromFunction1(value))
    
    inline def setDisplayControlMessages(value: () => Unit): Self = StObject.set(x, "displayControlMessages", js.Any.fromFunction0(value))
    
    inline def setDisplayControl_QueryReady(value: (Any, Any) => Unit): Self = StObject.set(x, "displayControl_QueryReady", js.Any.fromFunction2(value))
    
    inline def setGetSortName(value: () => String): Self = StObject.set(x, "getSortName", js.Any.fromFunction0(value))
    
    inline def setGetSortRankName(value: () => String): Self = StObject.set(x, "getSortRankName", js.Any.fromFunction0(value))
    
    inline def setGet_active(value: () => Boolean): Self = StObject.set(x, "get_active", js.Any.fromFunction0(value))
    
    inline def setGet_availableSorts(value: () => Any): Self = StObject.set(x, "get_availableSorts", js.Any.fromFunction0(value))
    
    inline def setGet_batched(value: () => Boolean): Self = StObject.set(x, "get_batched", js.Any.fromFunction0(value))
    
    inline def setGet_bypassResultTypes(value: () => Boolean): Self = StObject.set(x, "get_bypassResultTypes", js.Any.fromFunction0(value))
    
    inline def setGet_clientType(value: () => String): Self = StObject.set(x, "get_clientType", js.Any.fromFunction0(value))
    
    inline def setGet_collapseSpecification(value: () => String): Self = StObject.set(x, "get_collapseSpecification", js.Any.fromFunction0(value))
    
    inline def setGet_contextualScopeUrl(value: () => String): Self = StObject.set(x, "get_contextualScopeUrl", js.Any.fromFunction0(value))
    
    inline def setGet_currentQueryState(value: () => Any): Self = StObject.set(x, "get_currentQueryState", js.Any.fromFunction0(value))
    
    inline def setGet_desiredSnippetLength(value: () => Double): Self = StObject.set(x, "get_desiredSnippetLength", js.Any.fromFunction0(value))
    
    inline def setGet_effectiveQueryLanguage(value: () => Any): Self = StObject.set(x, "get_effectiveQueryLanguage", js.Any.fromFunction0(value))
    
    inline def setGet_enableInterleaving(value: () => Boolean): Self = StObject.set(x, "get_enableInterleaving", js.Any.fromFunction0(value))
    
    inline def setGet_enableNicknames(value: () => Boolean): Self = StObject.set(x, "get_enableNicknames", js.Any.fromFunction0(value))
    
    inline def setGet_enableOrderingHitHighlightedProperty(value: () => Boolean): Self = StObject.set(x, "get_enableOrderingHitHighlightedProperty", js.Any.fromFunction0(value))
    
    inline def setGet_enablePhonetic(value: () => Boolean): Self = StObject.set(x, "get_enablePhonetic", js.Any.fromFunction0(value))
    
    inline def setGet_enableQueryRules(value: () => Boolean): Self = StObject.set(x, "get_enableQueryRules", js.Any.fromFunction0(value))
    
    inline def setGet_enableStemming(value: () => Boolean): Self = StObject.set(x, "get_enableStemming", js.Any.fromFunction0(value))
    
    inline def setGet_entityInfo(value: () => Any): Self = StObject.set(x, "get_entityInfo", js.Any.fromFunction0(value))
    
    inline def setGet_fallbackLanguage(value: () => Any): Self = StObject.set(x, "get_fallbackLanguage", js.Any.fromFunction0(value))
    
    inline def setGet_fallbackRankingModelID(value: () => String): Self = StObject.set(x, "get_fallbackRankingModelID", js.Any.fromFunction0(value))
    
    inline def setGet_fallbackRefinementFilters(value: () => Any): Self = StObject.set(x, "get_fallbackRefinementFilters", js.Any.fromFunction0(value))
    
    inline def setGet_fallbackSort(value: () => Any): Self = StObject.set(x, "get_fallbackSort", js.Any.fromFunction0(value))
    
    inline def setGet_hitHighlightedMultivaluePropertyLimit(value: () => Double): Self = StObject.set(x, "get_hitHighlightedMultivaluePropertyLimit", js.Any.fromFunction0(value))
    
    inline def setGet_hitHighlightedProperties(value: () => Any): Self = StObject.set(x, "get_hitHighlightedProperties", js.Any.fromFunction0(value))
    
    inline def setGet_initialQueryState(value: () => Any): Self = StObject.set(x, "get_initialQueryState", js.Any.fromFunction0(value))
    
    inline def setGet_initialResult(value: () => String): Self = StObject.set(x, "get_initialResult", js.Any.fromFunction0(value))
    
    inline def setGet_initialResultObject(value: () => Any): Self = StObject.set(x, "get_initialResultObject", js.Any.fromFunction0(value))
    
    inline def setGet_initialResultRef(value: () => Any): Self = StObject.set(x, "get_initialResultRef", js.Any.fromFunction0(value))
    
    inline def setGet_maxPagesAfterCurrent(value: () => Double): Self = StObject.set(x, "get_maxPagesAfterCurrent", js.Any.fromFunction0(value))
    
    inline def setGet_parentImpressionID(value: () => Any): Self = StObject.set(x, "get_parentImpressionID", js.Any.fromFunction0(value))
    
    inline def setGet_personalizedQuery(value: () => Boolean): Self = StObject.set(x, "get_personalizedQuery", js.Any.fromFunction0(value))
    
    inline def setGet_processBestBets(value: () => Boolean): Self = StObject.set(x, "get_processBestBets", js.Any.fromFunction0(value))
    
    inline def setGet_processPersonalFavorites(value: () => Boolean): Self = StObject.set(x, "get_processPersonalFavorites", js.Any.fromFunction0(value))
    
    inline def setGet_properties(value: () => Any): Self = StObject.set(x, "get_properties", js.Any.fromFunction0(value))
    
    inline def setGet_queryCount(value: () => Double): Self = StObject.set(x, "get_queryCount", js.Any.fromFunction0(value))
    
    inline def setGet_queryGroupName(value: () => String): Self = StObject.set(x, "get_queryGroupName", js.Any.fromFunction0(value))
    
    inline def setGet_queryPropertiesTemplateUrl(value: () => String): Self = StObject.set(x, "get_queryPropertiesTemplateUrl", js.Any.fromFunction0(value))
    
    inline def setGet_queryTemplate(value: () => Any): Self = StObject.set(x, "get_queryTemplate", js.Any.fromFunction0(value))
    
    inline def setGet_rankRules(value: () => Any): Self = StObject.set(x, "get_rankRules", js.Any.fromFunction0(value))
    
    inline def setGet_refinementInfo(value: () => StringDictionary[js.Array[RefinementInfo]]): Self = StObject.set(x, "get_refinementInfo", js.Any.fromFunction0(value))
    
    inline def setGet_resultsPerPage(value: () => Double): Self = StObject.set(x, "get_resultsPerPage", js.Any.fromFunction0(value))
    
    inline def setGet_resultsUrl(value: () => Any): Self = StObject.set(x, "get_resultsUrl", js.Any.fromFunction0(value))
    
    inline def setGet_rowCount(value: () => Double): Self = StObject.set(x, "get_rowCount", js.Any.fromFunction0(value))
    
    inline def setGet_selectedProperties(value: () => Any): Self = StObject.set(x, "get_selectedProperties", js.Any.fromFunction0(value))
    
    inline def setGet_selectedRefiners(value: () => Any): Self = StObject.set(x, "get_selectedRefiners", js.Any.fromFunction0(value))
    
    inline def setGet_sourceID(value: () => String): Self = StObject.set(x, "get_sourceID", js.Any.fromFunction0(value))
    
    inline def setGet_sourceLevel(value: () => String): Self = StObject.set(x, "get_sourceLevel", js.Any.fromFunction0(value))
    
    inline def setGet_sourceName(value: () => String): Self = StObject.set(x, "get_sourceName", js.Any.fromFunction0(value))
    
    inline def setGet_summaryLength(value: () => Double): Self = StObject.set(x, "get_summaryLength", js.Any.fromFunction0(value))
    
    inline def setGet_totalRows(value: () => Double): Self = StObject.set(x, "get_totalRows", js.Any.fromFunction0(value))
    
    inline def setGet_trimDuplicates(value: () => Boolean): Self = StObject.set(x, "get_trimDuplicates", js.Any.fromFunction0(value))
    
    inline def setGet_upScopeUrl(value: () => Any): Self = StObject.set(x, "get_upScopeUrl", js.Any.fromFunction0(value))
    
    inline def setGet_updateAjaxNavigate(value: () => Boolean): Self = StObject.set(x, "get_updateAjaxNavigate", js.Any.fromFunction0(value))
    
    inline def setGet_userAction(value: () => Any): Self = StObject.set(x, "get_userAction", js.Any.fromFunction0(value))
    
    inline def setIssueQuery(value: () => Unit): Self = StObject.set(x, "issueQuery", js.Any.fromFunction0(value))
    
    inline def setProcessInitial(value: () => Unit): Self = StObject.set(x, "processInitial", js.Any.fromFunction0(value))
    
    inline def setRaiseEmptyResultReadyEvent(value: () => Unit): Self = StObject.set(x, "raiseEmptyResultReadyEvent", js.Any.fromFunction0(value))
    
    inline def setRaiseQueryIssuingEvent(value: Any => Unit): Self = StObject.set(x, "raiseQueryIssuingEvent", js.Any.fromFunction1(value))
    
    inline def setRaiseQueryStateChangedEvent(value: Any => Unit): Self = StObject.set(x, "raiseQueryStateChangedEvent", js.Any.fromFunction1(value))
    
    inline def setRaiseResultReadyEvent(value: Any => Unit): Self = StObject.set(x, "raiseResultReadyEvent", js.Any.fromFunction1(value))
    
    inline def setRemove_queryIssuing(value: Any => Unit): Self = StObject.set(x, "remove_queryIssuing", js.Any.fromFunction1(value))
    
    inline def setRemove_resultReady(value: Any => Unit): Self = StObject.set(x, "remove_resultReady", js.Any.fromFunction1(value))
    
    inline def setSearchBox_BatchQueryIssuing(value: (Any, Any) => Unit): Self = StObject.set(x, "searchBox_BatchQueryIssuing", js.Any.fromFunction2(value))
    
    inline def setSearchBox_BatchResultReady(value: (Any, Any) => Unit): Self = StObject.set(x, "searchBox_BatchResultReady", js.Any.fromFunction2(value))
    
    inline def setSearchBox_QueryReady(value: (Any, Any) => Unit): Self = StObject.set(x, "searchBox_QueryReady", js.Any.fromFunction2(value))
    
    inline def setSet_active(value: Boolean => Boolean): Self = StObject.set(x, "set_active", js.Any.fromFunction1(value))
    
    inline def setSet_availableSorts(value: Any => Any): Self = StObject.set(x, "set_availableSorts", js.Any.fromFunction1(value))
    
    inline def setSet_batched(value: Boolean => Boolean): Self = StObject.set(x, "set_batched", js.Any.fromFunction1(value))
    
    inline def setSet_bypassResultTypes(value: Boolean => Boolean): Self = StObject.set(x, "set_bypassResultTypes", js.Any.fromFunction1(value))
    
    inline def setSet_clientType(value: String => String): Self = StObject.set(x, "set_clientType", js.Any.fromFunction1(value))
    
    inline def setSet_collapseSpecification(value: String => String): Self = StObject.set(x, "set_collapseSpecification", js.Any.fromFunction1(value))
    
    inline def setSet_contextualScopeUrl(value: String => String): Self = StObject.set(x, "set_contextualScopeUrl", js.Any.fromFunction1(value))
    
    inline def setSet_desiredSnippetLength(value: Double => Double): Self = StObject.set(x, "set_desiredSnippetLength", js.Any.fromFunction1(value))
    
    inline def setSet_enableInterleaving(value: Boolean => Boolean): Self = StObject.set(x, "set_enableInterleaving", js.Any.fromFunction1(value))
    
    inline def setSet_enableNicknames(value: Boolean => Boolean): Self = StObject.set(x, "set_enableNicknames", js.Any.fromFunction1(value))
    
    inline def setSet_enableOrderingHitHighlightedProperty(value: Boolean => Boolean): Self = StObject.set(x, "set_enableOrderingHitHighlightedProperty", js.Any.fromFunction1(value))
    
    inline def setSet_enablePhonetic(value: Boolean => Boolean): Self = StObject.set(x, "set_enablePhonetic", js.Any.fromFunction1(value))
    
    inline def setSet_enableQueryRules(value: Boolean => Boolean): Self = StObject.set(x, "set_enableQueryRules", js.Any.fromFunction1(value))
    
    inline def setSet_enableStemming(value: Boolean => Boolean): Self = StObject.set(x, "set_enableStemming", js.Any.fromFunction1(value))
    
    inline def setSet_fallbackLanguage(value: Any => Any): Self = StObject.set(x, "set_fallbackLanguage", js.Any.fromFunction1(value))
    
    inline def setSet_fallbackRankingModelID(value: String => String): Self = StObject.set(x, "set_fallbackRankingModelID", js.Any.fromFunction1(value))
    
    inline def setSet_fallbackRefinementFilters(value: Any => Any): Self = StObject.set(x, "set_fallbackRefinementFilters", js.Any.fromFunction1(value))
    
    inline def setSet_fallbackSort(value: Any => Any): Self = StObject.set(x, "set_fallbackSort", js.Any.fromFunction1(value))
    
    inline def setSet_hitHighlightedMultivaluePropertyLimit(value: Double => Double): Self = StObject.set(x, "set_hitHighlightedMultivaluePropertyLimit", js.Any.fromFunction1(value))
    
    inline def setSet_hitHighlightedProperties(value: Any => Any): Self = StObject.set(x, "set_hitHighlightedProperties", js.Any.fromFunction1(value))
    
    inline def setSet_initialQueryState(value: Any => Any): Self = StObject.set(x, "set_initialQueryState", js.Any.fromFunction1(value))
    
    inline def setSet_initialResult(value: String => String): Self = StObject.set(x, "set_initialResult", js.Any.fromFunction1(value))
    
    inline def setSet_initialResultRef(value: Any => Any): Self = StObject.set(x, "set_initialResultRef", js.Any.fromFunction1(value))
    
    inline def setSet_maxPagesAfterCurrent(value: Double => Double): Self = StObject.set(x, "set_maxPagesAfterCurrent", js.Any.fromFunction1(value))
    
    inline def setSet_parentImpressionID(value: Any => Any): Self = StObject.set(x, "set_parentImpressionID", js.Any.fromFunction1(value))
    
    inline def setSet_personalizedQuery(value: Boolean => Boolean): Self = StObject.set(x, "set_personalizedQuery", js.Any.fromFunction1(value))
    
    inline def setSet_processBestBets(value: Boolean => Boolean): Self = StObject.set(x, "set_processBestBets", js.Any.fromFunction1(value))
    
    inline def setSet_processPersonalFavorites(value: Boolean => Boolean): Self = StObject.set(x, "set_processPersonalFavorites", js.Any.fromFunction1(value))
    
    inline def setSet_properties(value: Any => Any): Self = StObject.set(x, "set_properties", js.Any.fromFunction1(value))
    
    inline def setSet_queryCount(value: Double => Double): Self = StObject.set(x, "set_queryCount", js.Any.fromFunction1(value))
    
    inline def setSet_queryGroupName(value: String => String): Self = StObject.set(x, "set_queryGroupName", js.Any.fromFunction1(value))
    
    inline def setSet_queryPropertiesTemplateUrl(value: String => String): Self = StObject.set(x, "set_queryPropertiesTemplateUrl", js.Any.fromFunction1(value))
    
    inline def setSet_queryTemplate(value: Any => Any): Self = StObject.set(x, "set_queryTemplate", js.Any.fromFunction1(value))
    
    inline def setSet_rankRules(value: Any => Any): Self = StObject.set(x, "set_rankRules", js.Any.fromFunction1(value))
    
    inline def setSet_resultsPerPage(value: Double => Double): Self = StObject.set(x, "set_resultsPerPage", js.Any.fromFunction1(value))
    
    inline def setSet_resultsUrl(value: Any => Any): Self = StObject.set(x, "set_resultsUrl", js.Any.fromFunction1(value))
    
    inline def setSet_rowCount(value: Double => Double): Self = StObject.set(x, "set_rowCount", js.Any.fromFunction1(value))
    
    inline def setSet_selectedProperties(value: Any => Any): Self = StObject.set(x, "set_selectedProperties", js.Any.fromFunction1(value))
    
    inline def setSet_selectedRefiners(value: Any => Any): Self = StObject.set(x, "set_selectedRefiners", js.Any.fromFunction1(value))
    
    inline def setSet_sourceID(value: String => String): Self = StObject.set(x, "set_sourceID", js.Any.fromFunction1(value))
    
    inline def setSet_sourceLevel(value: String => String): Self = StObject.set(x, "set_sourceLevel", js.Any.fromFunction1(value))
    
    inline def setSet_sourceName(value: String => String): Self = StObject.set(x, "set_sourceName", js.Any.fromFunction1(value))
    
    inline def setSet_summaryLength(value: Double => Double): Self = StObject.set(x, "set_summaryLength", js.Any.fromFunction1(value))
    
    inline def setSet_totalRows(value: Double => Double): Self = StObject.set(x, "set_totalRows", js.Any.fromFunction1(value))
    
    inline def setSet_trimDuplicates(value: Boolean => Boolean): Self = StObject.set(x, "set_trimDuplicates", js.Any.fromFunction1(value))
    
    inline def setSet_updateAjaxNavigate(value: Boolean => Boolean): Self = StObject.set(x, "set_updateAjaxNavigate", js.Any.fromFunction1(value))
    
    inline def setSet_userAction(value: Any => Any): Self = StObject.set(x, "set_userAction", js.Any.fromFunction1(value))
  }
}
