package typings.sharepoint.Srch

import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTableCollection
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result
  extends StObject
     with DisplayControl {
  
  def activate(
    prompt: String,
    searchBoxId: String,
    searchBoxDivId: String,
    navButtonId: String,
    suggestionsListId: String,
    navListId: String,
    searchBoxLinkId: String,
    searchBoxProgressClass: String,
    searchBoxPromptClass: String
  ): Unit
  
  def changeQueryLanguage(queryLanguage: Double): Unit
  
  def changeQueryTerm(queryTerm: js.Any): Unit
  
  def get_advancedSearchPageAddress(): String
  
  def get_advancedUrl(): String
  
  def get_currentPageNumber(): Double
  
  def get_currentTerm(): String
  
  def get_emptyRefinementMessageId(): String
  
  def get_groupTemplateId(): String
  
  def get_initialPrompt(): String
  
  def get_itemBodyTemplateId(): String
  
  def get_itemTemplateId(): String
  
  def get_maxPagesAfterCurrent(): Double
  
  def get_maxPagesBeforeCurrent(): Double
  
  def get_pagingInfo(): js.Any
  
  def get_preloadedItemTemplateIds(): js.Array[String]
  
  def get_repositionLanguageDropDown(): Boolean
  
  def get_scrollToTopOnRedraw(): Boolean
  
  def get_selectedRefinementControls(): js.Array[CSRRefinementControl]
  
  def get_showAdvancedLink(): Boolean
  
  def get_showAlertMe(): Boolean
  
  def get_showBestBets(): Boolean
  
  def get_showDefinitions(): Boolean
  
  def get_showDidYouMean(): Boolean
  
  def get_showLanguageOptions(): Boolean
  
  def get_showNavigation(): Boolean
  
  def get_showPaging(): Boolean
  
  def get_showPersonalFavorites(): Boolean
  
  def get_showPreferencesLink(): Boolean
  
  def get_showQuerySuggestions(): Boolean
  
  def get_showResultCount(): Boolean
  
  def get_showResults(): Boolean
  
  def get_showSortOptions(): Boolean
  
  def get_showUpScopeMessage(): Boolean
  
  def get_showViewDuplicates(): Boolean
  
  def get_useSimplifiedQueryBuilder(): Boolean
  
  def handleClickOnCategoryLink(id: String): Unit
  
  def page(startAt: Double): Unit
  
  def processResultReady(resultTableCollection: ResultTableCollection): Unit
  
  def setAriaCollapsed(element: HTMLElement): Unit
  
  def set_advancedUrl(value: String): String
  
  def set_currentPageNumber(value: Double): Double
  
  def set_groupTemplateId(value: String): String
  
  def set_itemBodyTemplateId(value: String): String
  
  def set_itemTemplateId(value: String): String
  
  def set_maxPagesAfterCurrent(value: Double): Double
  
  def set_maxPagesBeforeCurrent(value: Double): Double
  
  def set_preloadedItemTemplateIds(value: js.Array[String]): js.Array[String]
  
  def set_repositionLanguageDropDown(value: Boolean): Boolean
  
  def set_scrollToTopOnRedraw(value: Boolean): Boolean
  
  def set_showAdvancedLink(value: Boolean): Boolean
  
  def set_showAlertMe(value: Boolean): Boolean
  
  def set_showBestBets(value: Boolean): Boolean
  
  def set_showDefinitions(value: Boolean): Boolean
  
  def set_showDidYouMean(value: Boolean): Boolean
  
  def set_showLanguageOptions(value: Boolean): Boolean
  
  def set_showPaging(value: Boolean): Boolean
  
  def set_showPersonalFavorites(value: Boolean): Boolean
  
  def set_showPreferencesLink(value: Boolean): Boolean
  
  def set_showResultCount(value: Boolean): Boolean
  
  def set_showResults(value: Boolean): Boolean
  
  def set_showSortOptions(value: Boolean): Boolean
  
  def set_showUpScopeMessage(value: Boolean): Boolean
  
  def set_showViewDuplicates(value: Boolean): Boolean
  
  def set_useSimplifiedQueryBuilder(value: Boolean): Boolean
  
  /** Returns true if the specified table has results and is enabled to be shown by this control */
  def shouldShowTable(resultTable: ResultTable): Boolean
  
  def sort(sortName: String): Unit
  
  def sortOrRank(sortRankName: String): Unit
  
  def viewDuplicates(docId: Double): Unit
}
object Result {
  
  inline def apply(
    activate: (String, String, String, String, String, String, String, String, String) => Unit,
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_oneTimeResultRendered: js.Any => Unit,
    add_propertyChanged: js.Function => Unit,
    add_queryReady: js.Any => Unit,
    add_resultRendered: js.Any => Unit,
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    beginUpdate: () => Unit,
    changeQueryLanguage: Double => Unit,
    changeQueryTerm: js.Any => Unit,
    clickHandler: Event => js.Any,
    dataProvider_QueryIssuing: (js.Any, js.Any) => Unit,
    dataProvider_ResultReady: (js.Any, js.Any) => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_advancedSearchPageAddress: () => String,
    get_advancedUrl: () => String,
    get_alternateErrorMessage: () => String,
    get_currentPageNumber: () => Double,
    get_currentResultTableCollection: () => js.Any,
    get_currentTerm: () => String,
    get_dataProvider: () => DataProvider,
    get_delayLoadTemplateScripts: () => Boolean,
    get_element: () => HTMLElement,
    get_emptyMessage: () => String,
    get_emptyRefinementMessageId: () => String,
    get_events: () => js.Any,
    get_groupTemplateId: () => String,
    get_id: () => String,
    get_initialPrompt: () => String,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_itemBodyTemplateId: () => String,
    get_itemTemplateId: () => String,
    get_maxPagesAfterCurrent: () => Double,
    get_maxPagesBeforeCurrent: () => Double,
    get_messages: () => js.Array[js.Any],
    get_nextUniqueId: () => String,
    get_pagingInfo: () => js.Any,
    get_preloadedItemTemplateIds: () => js.Array[String],
    get_queryGroupName: () => String,
    get_renderTemplateId: () => String,
    get_renderedResult: () => Boolean,
    get_repositionLanguageDropDown: () => Boolean,
    get_scrollToTopOnRedraw: () => Boolean,
    get_selectedRefinementControls: () => js.Array[CSRRefinementControl],
    get_shouldShowNoResultMessage: () => Boolean,
    get_showAdvancedLink: () => Boolean,
    get_showAlertMe: () => Boolean,
    get_showBestBets: () => Boolean,
    get_showDataErrors: () => Boolean,
    get_showDefinitions: () => Boolean,
    get_showDidYouMean: () => Boolean,
    get_showLanguageOptions: () => Boolean,
    get_showNavigation: () => Boolean,
    get_showPaging: () => Boolean,
    get_showPersonalFavorites: () => Boolean,
    get_showPreferencesLink: () => Boolean,
    get_showQuerySuggestions: () => Boolean,
    get_showResultCount: () => Boolean,
    get_showResults: () => Boolean,
    get_showSortOptions: () => Boolean,
    get_showUpScopeMessage: () => Boolean,
    get_showViewDuplicates: () => Boolean,
    get_states: () => js.Any,
    get_useSimplifiedQueryBuilder: () => Boolean,
    handleClickOnCategoryLink: String => Unit,
    hasMessages: () => js.Any,
    initialize: () => Unit,
    invokeAlternateRender: (js.Any, js.Any, js.Any) => js.Any,
    invokeClientRenderer: (js.Any, js.Any) => js.Any,
    loadRenderTemplateScripts: (js.Any, js.Any, js.Any, js.Any, js.Any) => Boolean,
    loadServerTemplateScripts: () => Unit,
    loaded: Boolean,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    page: Double => Unit,
    processDataErrorMessages: js.Any => js.Any,
    processDataProviderErrors: js.Any => Unit,
    processQueryIssuing: js.Any => Unit,
    processRenderingErrorMessages: js.Any => js.Any,
    processResultReady: ResultTableCollection => Unit,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raiseOneTimeResultRenderedEvent: js.Any => Unit,
    raisePropertyChanged: String => Unit,
    raiseQueryReadyEvent: js.Any => Unit,
    raiseResultRenderedEvent: js.Any => Unit,
    refresh: js.Any => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_oneTimeResultRendered: js.Any => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_queryReady: js.Any => Unit,
    remove_resultRendered: js.Any => Unit,
    render: () => Unit,
    renderControl: (js.Any, js.Any) => Unit,
    scriptApplication_Load: (js.Any, js.Any) => Unit,
    scriptApplication_PostLoad: (js.Any, js.Any) => Unit,
    scriptApplication_PreLoad: (js.Any, js.Any) => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[js.Any],
    setAriaCollapsed: HTMLElement => Unit,
    setControlElementVisibility: Boolean => js.Any,
    set_advancedUrl: String => String,
    set_alternateErrorMessage: String => String,
    set_currentPageNumber: Double => Double,
    set_currentResultTableCollection: js.Any => js.Any,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_emptyMessage: String => String,
    set_groupTemplateId: String => String,
    set_id: String => Unit,
    set_itemBodyTemplateId: String => String,
    set_itemTemplateId: String => String,
    set_maxPagesAfterCurrent: Double => Double,
    set_maxPagesBeforeCurrent: Double => Double,
    set_messages: js.Array[js.Any] => js.Array[js.Any],
    set_preloadedItemTemplateIds: js.Array[String] => js.Array[String],
    set_queryGroupName: String => String,
    set_renderTemplateId: String => String,
    set_renderedResult: Boolean => Boolean,
    set_repositionLanguageDropDown: Boolean => Boolean,
    set_scrollToTopOnRedraw: Boolean => Boolean,
    set_shouldShowNoResultMessage: Boolean => Boolean,
    set_showAdvancedLink: Boolean => Boolean,
    set_showAlertMe: Boolean => Boolean,
    set_showBestBets: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_showDefinitions: Boolean => Boolean,
    set_showDidYouMean: Boolean => Boolean,
    set_showLanguageOptions: Boolean => Boolean,
    set_showPaging: Boolean => Boolean,
    set_showPersonalFavorites: Boolean => Boolean,
    set_showPreferencesLink: Boolean => Boolean,
    set_showResultCount: Boolean => Boolean,
    set_showResults: Boolean => Boolean,
    set_showSortOptions: Boolean => Boolean,
    set_showUpScopeMessage: Boolean => Boolean,
    set_showViewDuplicates: Boolean => Boolean,
    set_states: js.Any => js.Any,
    set_useSimplifiedQueryBuilder: Boolean => Boolean,
    shouldShowTable: ResultTable => Boolean,
    sort: String => Unit,
    sortOrRank: String => Unit,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => js.Any,
    updated: () => Unit,
    viewDuplicates: Double => Unit
  ): Result = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction9(activate), addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_oneTimeResultRendered = js.Any.fromFunction1(add_oneTimeResultRendered), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_queryReady = js.Any.fromFunction1(add_queryReady), add_resultRendered = js.Any.fromFunction1(add_resultRendered), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), changeQueryLanguage = js.Any.fromFunction1(changeQueryLanguage), changeQueryTerm = js.Any.fromFunction1(changeQueryTerm), clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2(dataProvider_QueryIssuing), dataProvider_ResultReady = js.Any.fromFunction2(dataProvider_ResultReady), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_advancedSearchPageAddress = js.Any.fromFunction0(get_advancedSearchPageAddress), get_advancedUrl = js.Any.fromFunction0(get_advancedUrl), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_currentPageNumber = js.Any.fromFunction0(get_currentPageNumber), get_currentResultTableCollection = js.Any.fromFunction0(get_currentResultTableCollection), get_currentTerm = js.Any.fromFunction0(get_currentTerm), get_dataProvider = js.Any.fromFunction0(get_dataProvider), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_element = js.Any.fromFunction0(get_element), get_emptyMessage = js.Any.fromFunction0(get_emptyMessage), get_emptyRefinementMessageId = js.Any.fromFunction0(get_emptyRefinementMessageId), get_events = js.Any.fromFunction0(get_events), get_groupTemplateId = js.Any.fromFunction0(get_groupTemplateId), get_id = js.Any.fromFunction0(get_id), get_initialPrompt = js.Any.fromFunction0(get_initialPrompt), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_itemBodyTemplateId = js.Any.fromFunction0(get_itemBodyTemplateId), get_itemTemplateId = js.Any.fromFunction0(get_itemTemplateId), get_maxPagesAfterCurrent = js.Any.fromFunction0(get_maxPagesAfterCurrent), get_maxPagesBeforeCurrent = js.Any.fromFunction0(get_maxPagesBeforeCurrent), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_pagingInfo = js.Any.fromFunction0(get_pagingInfo), get_preloadedItemTemplateIds = js.Any.fromFunction0(get_preloadedItemTemplateIds), get_queryGroupName = js.Any.fromFunction0(get_queryGroupName), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_renderedResult = js.Any.fromFunction0(get_renderedResult), get_repositionLanguageDropDown = js.Any.fromFunction0(get_repositionLanguageDropDown), get_scrollToTopOnRedraw = js.Any.fromFunction0(get_scrollToTopOnRedraw), get_selectedRefinementControls = js.Any.fromFunction0(get_selectedRefinementControls), get_shouldShowNoResultMessage = js.Any.fromFunction0(get_shouldShowNoResultMessage), get_showAdvancedLink = js.Any.fromFunction0(get_showAdvancedLink), get_showAlertMe = js.Any.fromFunction0(get_showAlertMe), get_showBestBets = js.Any.fromFunction0(get_showBestBets), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_showDefinitions = js.Any.fromFunction0(get_showDefinitions), get_showDidYouMean = js.Any.fromFunction0(get_showDidYouMean), get_showLanguageOptions = js.Any.fromFunction0(get_showLanguageOptions), get_showNavigation = js.Any.fromFunction0(get_showNavigation), get_showPaging = js.Any.fromFunction0(get_showPaging), get_showPersonalFavorites = js.Any.fromFunction0(get_showPersonalFavorites), get_showPreferencesLink = js.Any.fromFunction0(get_showPreferencesLink), get_showQuerySuggestions = js.Any.fromFunction0(get_showQuerySuggestions), get_showResultCount = js.Any.fromFunction0(get_showResultCount), get_showResults = js.Any.fromFunction0(get_showResults), get_showSortOptions = js.Any.fromFunction0(get_showSortOptions), get_showUpScopeMessage = js.Any.fromFunction0(get_showUpScopeMessage), get_showViewDuplicates = js.Any.fromFunction0(get_showViewDuplicates), get_states = js.Any.fromFunction0(get_states), get_useSimplifiedQueryBuilder = js.Any.fromFunction0(get_useSimplifiedQueryBuilder), handleClickOnCategoryLink = js.Any.fromFunction1(handleClickOnCategoryLink), hasMessages = js.Any.fromFunction0(hasMessages), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), page = js.Any.fromFunction1(page), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processQueryIssuing = js.Any.fromFunction1(processQueryIssuing), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), processResultReady = js.Any.fromFunction1(processResultReady), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raiseOneTimeResultRenderedEvent = js.Any.fromFunction1(raiseOneTimeResultRenderedEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), raiseQueryReadyEvent = js.Any.fromFunction1(raiseQueryReadyEvent), raiseResultRenderedEvent = js.Any.fromFunction1(raiseResultRenderedEvent), refresh = js.Any.fromFunction1(refresh), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_oneTimeResultRendered = js.Any.fromFunction1(remove_oneTimeResultRendered), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_queryReady = js.Any.fromFunction1(remove_queryReady), remove_resultRendered = js.Any.fromFunction1(remove_resultRendered), render = js.Any.fromFunction0(render), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setAriaCollapsed = js.Any.fromFunction1(setAriaCollapsed), setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_advancedUrl = js.Any.fromFunction1(set_advancedUrl), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentPageNumber = js.Any.fromFunction1(set_currentPageNumber), set_currentResultTableCollection = js.Any.fromFunction1(set_currentResultTableCollection), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_emptyMessage = js.Any.fromFunction1(set_emptyMessage), set_groupTemplateId = js.Any.fromFunction1(set_groupTemplateId), set_id = js.Any.fromFunction1(set_id), set_itemBodyTemplateId = js.Any.fromFunction1(set_itemBodyTemplateId), set_itemTemplateId = js.Any.fromFunction1(set_itemTemplateId), set_maxPagesAfterCurrent = js.Any.fromFunction1(set_maxPagesAfterCurrent), set_maxPagesBeforeCurrent = js.Any.fromFunction1(set_maxPagesBeforeCurrent), set_messages = js.Any.fromFunction1(set_messages), set_preloadedItemTemplateIds = js.Any.fromFunction1(set_preloadedItemTemplateIds), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_renderedResult = js.Any.fromFunction1(set_renderedResult), set_repositionLanguageDropDown = js.Any.fromFunction1(set_repositionLanguageDropDown), set_scrollToTopOnRedraw = js.Any.fromFunction1(set_scrollToTopOnRedraw), set_shouldShowNoResultMessage = js.Any.fromFunction1(set_shouldShowNoResultMessage), set_showAdvancedLink = js.Any.fromFunction1(set_showAdvancedLink), set_showAlertMe = js.Any.fromFunction1(set_showAlertMe), set_showBestBets = js.Any.fromFunction1(set_showBestBets), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_showDefinitions = js.Any.fromFunction1(set_showDefinitions), set_showDidYouMean = js.Any.fromFunction1(set_showDidYouMean), set_showLanguageOptions = js.Any.fromFunction1(set_showLanguageOptions), set_showPaging = js.Any.fromFunction1(set_showPaging), set_showPersonalFavorites = js.Any.fromFunction1(set_showPersonalFavorites), set_showPreferencesLink = js.Any.fromFunction1(set_showPreferencesLink), set_showResultCount = js.Any.fromFunction1(set_showResultCount), set_showResults = js.Any.fromFunction1(set_showResults), set_showSortOptions = js.Any.fromFunction1(set_showSortOptions), set_showUpScopeMessage = js.Any.fromFunction1(set_showUpScopeMessage), set_showViewDuplicates = js.Any.fromFunction1(set_showViewDuplicates), set_states = js.Any.fromFunction1(set_states), set_useSimplifiedQueryBuilder = js.Any.fromFunction1(set_useSimplifiedQueryBuilder), shouldShowTable = js.Any.fromFunction1(shouldShowTable), sort = js.Any.fromFunction1(sort), sortOrRank = js.Any.fromFunction1(sortOrRank), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated), viewDuplicates = js.Any.fromFunction1(viewDuplicates))
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setActivate(value: (String, String, String, String, String, String, String, String, String) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction9(value))
    
    inline def setChangeQueryLanguage(value: Double => Unit): Self = StObject.set(x, "changeQueryLanguage", js.Any.fromFunction1(value))
    
    inline def setChangeQueryTerm(value: js.Any => Unit): Self = StObject.set(x, "changeQueryTerm", js.Any.fromFunction1(value))
    
    inline def setGet_advancedSearchPageAddress(value: () => String): Self = StObject.set(x, "get_advancedSearchPageAddress", js.Any.fromFunction0(value))
    
    inline def setGet_advancedUrl(value: () => String): Self = StObject.set(x, "get_advancedUrl", js.Any.fromFunction0(value))
    
    inline def setGet_currentPageNumber(value: () => Double): Self = StObject.set(x, "get_currentPageNumber", js.Any.fromFunction0(value))
    
    inline def setGet_currentTerm(value: () => String): Self = StObject.set(x, "get_currentTerm", js.Any.fromFunction0(value))
    
    inline def setGet_emptyRefinementMessageId(value: () => String): Self = StObject.set(x, "get_emptyRefinementMessageId", js.Any.fromFunction0(value))
    
    inline def setGet_groupTemplateId(value: () => String): Self = StObject.set(x, "get_groupTemplateId", js.Any.fromFunction0(value))
    
    inline def setGet_initialPrompt(value: () => String): Self = StObject.set(x, "get_initialPrompt", js.Any.fromFunction0(value))
    
    inline def setGet_itemBodyTemplateId(value: () => String): Self = StObject.set(x, "get_itemBodyTemplateId", js.Any.fromFunction0(value))
    
    inline def setGet_itemTemplateId(value: () => String): Self = StObject.set(x, "get_itemTemplateId", js.Any.fromFunction0(value))
    
    inline def setGet_maxPagesAfterCurrent(value: () => Double): Self = StObject.set(x, "get_maxPagesAfterCurrent", js.Any.fromFunction0(value))
    
    inline def setGet_maxPagesBeforeCurrent(value: () => Double): Self = StObject.set(x, "get_maxPagesBeforeCurrent", js.Any.fromFunction0(value))
    
    inline def setGet_pagingInfo(value: () => js.Any): Self = StObject.set(x, "get_pagingInfo", js.Any.fromFunction0(value))
    
    inline def setGet_preloadedItemTemplateIds(value: () => js.Array[String]): Self = StObject.set(x, "get_preloadedItemTemplateIds", js.Any.fromFunction0(value))
    
    inline def setGet_repositionLanguageDropDown(value: () => Boolean): Self = StObject.set(x, "get_repositionLanguageDropDown", js.Any.fromFunction0(value))
    
    inline def setGet_scrollToTopOnRedraw(value: () => Boolean): Self = StObject.set(x, "get_scrollToTopOnRedraw", js.Any.fromFunction0(value))
    
    inline def setGet_selectedRefinementControls(value: () => js.Array[CSRRefinementControl]): Self = StObject.set(x, "get_selectedRefinementControls", js.Any.fromFunction0(value))
    
    inline def setGet_showAdvancedLink(value: () => Boolean): Self = StObject.set(x, "get_showAdvancedLink", js.Any.fromFunction0(value))
    
    inline def setGet_showAlertMe(value: () => Boolean): Self = StObject.set(x, "get_showAlertMe", js.Any.fromFunction0(value))
    
    inline def setGet_showBestBets(value: () => Boolean): Self = StObject.set(x, "get_showBestBets", js.Any.fromFunction0(value))
    
    inline def setGet_showDefinitions(value: () => Boolean): Self = StObject.set(x, "get_showDefinitions", js.Any.fromFunction0(value))
    
    inline def setGet_showDidYouMean(value: () => Boolean): Self = StObject.set(x, "get_showDidYouMean", js.Any.fromFunction0(value))
    
    inline def setGet_showLanguageOptions(value: () => Boolean): Self = StObject.set(x, "get_showLanguageOptions", js.Any.fromFunction0(value))
    
    inline def setGet_showNavigation(value: () => Boolean): Self = StObject.set(x, "get_showNavigation", js.Any.fromFunction0(value))
    
    inline def setGet_showPaging(value: () => Boolean): Self = StObject.set(x, "get_showPaging", js.Any.fromFunction0(value))
    
    inline def setGet_showPersonalFavorites(value: () => Boolean): Self = StObject.set(x, "get_showPersonalFavorites", js.Any.fromFunction0(value))
    
    inline def setGet_showPreferencesLink(value: () => Boolean): Self = StObject.set(x, "get_showPreferencesLink", js.Any.fromFunction0(value))
    
    inline def setGet_showQuerySuggestions(value: () => Boolean): Self = StObject.set(x, "get_showQuerySuggestions", js.Any.fromFunction0(value))
    
    inline def setGet_showResultCount(value: () => Boolean): Self = StObject.set(x, "get_showResultCount", js.Any.fromFunction0(value))
    
    inline def setGet_showResults(value: () => Boolean): Self = StObject.set(x, "get_showResults", js.Any.fromFunction0(value))
    
    inline def setGet_showSortOptions(value: () => Boolean): Self = StObject.set(x, "get_showSortOptions", js.Any.fromFunction0(value))
    
    inline def setGet_showUpScopeMessage(value: () => Boolean): Self = StObject.set(x, "get_showUpScopeMessage", js.Any.fromFunction0(value))
    
    inline def setGet_showViewDuplicates(value: () => Boolean): Self = StObject.set(x, "get_showViewDuplicates", js.Any.fromFunction0(value))
    
    inline def setGet_useSimplifiedQueryBuilder(value: () => Boolean): Self = StObject.set(x, "get_useSimplifiedQueryBuilder", js.Any.fromFunction0(value))
    
    inline def setHandleClickOnCategoryLink(value: String => Unit): Self = StObject.set(x, "handleClickOnCategoryLink", js.Any.fromFunction1(value))
    
    inline def setPage(value: Double => Unit): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
    
    inline def setProcessResultReady(value: ResultTableCollection => Unit): Self = StObject.set(x, "processResultReady", js.Any.fromFunction1(value))
    
    inline def setSetAriaCollapsed(value: HTMLElement => Unit): Self = StObject.set(x, "setAriaCollapsed", js.Any.fromFunction1(value))
    
    inline def setSet_advancedUrl(value: String => String): Self = StObject.set(x, "set_advancedUrl", js.Any.fromFunction1(value))
    
    inline def setSet_currentPageNumber(value: Double => Double): Self = StObject.set(x, "set_currentPageNumber", js.Any.fromFunction1(value))
    
    inline def setSet_groupTemplateId(value: String => String): Self = StObject.set(x, "set_groupTemplateId", js.Any.fromFunction1(value))
    
    inline def setSet_itemBodyTemplateId(value: String => String): Self = StObject.set(x, "set_itemBodyTemplateId", js.Any.fromFunction1(value))
    
    inline def setSet_itemTemplateId(value: String => String): Self = StObject.set(x, "set_itemTemplateId", js.Any.fromFunction1(value))
    
    inline def setSet_maxPagesAfterCurrent(value: Double => Double): Self = StObject.set(x, "set_maxPagesAfterCurrent", js.Any.fromFunction1(value))
    
    inline def setSet_maxPagesBeforeCurrent(value: Double => Double): Self = StObject.set(x, "set_maxPagesBeforeCurrent", js.Any.fromFunction1(value))
    
    inline def setSet_preloadedItemTemplateIds(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "set_preloadedItemTemplateIds", js.Any.fromFunction1(value))
    
    inline def setSet_repositionLanguageDropDown(value: Boolean => Boolean): Self = StObject.set(x, "set_repositionLanguageDropDown", js.Any.fromFunction1(value))
    
    inline def setSet_scrollToTopOnRedraw(value: Boolean => Boolean): Self = StObject.set(x, "set_scrollToTopOnRedraw", js.Any.fromFunction1(value))
    
    inline def setSet_showAdvancedLink(value: Boolean => Boolean): Self = StObject.set(x, "set_showAdvancedLink", js.Any.fromFunction1(value))
    
    inline def setSet_showAlertMe(value: Boolean => Boolean): Self = StObject.set(x, "set_showAlertMe", js.Any.fromFunction1(value))
    
    inline def setSet_showBestBets(value: Boolean => Boolean): Self = StObject.set(x, "set_showBestBets", js.Any.fromFunction1(value))
    
    inline def setSet_showDefinitions(value: Boolean => Boolean): Self = StObject.set(x, "set_showDefinitions", js.Any.fromFunction1(value))
    
    inline def setSet_showDidYouMean(value: Boolean => Boolean): Self = StObject.set(x, "set_showDidYouMean", js.Any.fromFunction1(value))
    
    inline def setSet_showLanguageOptions(value: Boolean => Boolean): Self = StObject.set(x, "set_showLanguageOptions", js.Any.fromFunction1(value))
    
    inline def setSet_showPaging(value: Boolean => Boolean): Self = StObject.set(x, "set_showPaging", js.Any.fromFunction1(value))
    
    inline def setSet_showPersonalFavorites(value: Boolean => Boolean): Self = StObject.set(x, "set_showPersonalFavorites", js.Any.fromFunction1(value))
    
    inline def setSet_showPreferencesLink(value: Boolean => Boolean): Self = StObject.set(x, "set_showPreferencesLink", js.Any.fromFunction1(value))
    
    inline def setSet_showResultCount(value: Boolean => Boolean): Self = StObject.set(x, "set_showResultCount", js.Any.fromFunction1(value))
    
    inline def setSet_showResults(value: Boolean => Boolean): Self = StObject.set(x, "set_showResults", js.Any.fromFunction1(value))
    
    inline def setSet_showSortOptions(value: Boolean => Boolean): Self = StObject.set(x, "set_showSortOptions", js.Any.fromFunction1(value))
    
    inline def setSet_showUpScopeMessage(value: Boolean => Boolean): Self = StObject.set(x, "set_showUpScopeMessage", js.Any.fromFunction1(value))
    
    inline def setSet_showViewDuplicates(value: Boolean => Boolean): Self = StObject.set(x, "set_showViewDuplicates", js.Any.fromFunction1(value))
    
    inline def setSet_useSimplifiedQueryBuilder(value: Boolean => Boolean): Self = StObject.set(x, "set_useSimplifiedQueryBuilder", js.Any.fromFunction1(value))
    
    inline def setShouldShowTable(value: ResultTable => Boolean): Self = StObject.set(x, "shouldShowTable", js.Any.fromFunction1(value))
    
    inline def setSort(value: String => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def setSortOrRank(value: String => Unit): Self = StObject.set(x, "sortOrRank", js.Any.fromFunction1(value))
    
    inline def setViewDuplicates(value: Double => Unit): Self = StObject.set(x, "viewDuplicates", js.Any.fromFunction1(value))
  }
}
