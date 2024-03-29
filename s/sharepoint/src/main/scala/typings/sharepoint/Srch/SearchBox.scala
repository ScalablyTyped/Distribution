package typings.sharepoint.Srch

import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the search box control */
trait SearchBox
  extends StObject
     with ClientControl {
  
  def activate(
    prompt: String,
    searchBoxInputId: String,
    searchBoxContainerId: String,
    navigationButtonId: String,
    suggestionsListId: String,
    navigationListId: String,
    searchBoxLinkId: String,
    searchBoxProgressClass: String,
    searchBoxPromptClass: String
  ): Unit
  
  def activateDefaultNavigationBehavior(): Unit
  
  def activateDefaultQuerySuggestionBehavior(): Unit
  
  def add_batchQueryIssuing(value: Any): Unit
  
  def add_batchResultReady(value: Any): Unit
  
  def add_queryReady(value: Any): Unit
  
  def dataProvider_QueryIssuing(sender: Any, e: Any): Unit
  
  def dataProvider_QueryStateChanged(sender: Any, e: Any): Unit
  
  def dataProvider_ResultReady(sender: Any, e: Any): Unit
  
  def focus(): Unit
  
  def get_advancedSearchPageAddress(): String
  
  def get_allowEmptySearch(): Boolean
  
  /** Gets the search input placeholder text */
  def get_currentPrompt(): String
  
  /** Returns the current search term */
  def get_currentTerm(): String
  
  def get_initialPrompt(): String
  
  def get_maintainQueryState(): Boolean
  
  def get_msBeforeShowingProgress(): Double
  
  def get_navigationButtonId(): String
  
  def get_navigationListId(): String
  
  def get_navigationNodes(): Any
  
  def get_pageTitlePrefix(): String
  
  def get_personalResultCount(): Double
  
  /** Gets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  def get_promptCssClass(): String
  
  def get_queryGroupNames(): js.Array[String]
  
  /** Gets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
    * Default value is 250.
    */
  def get_querySuggestionCompletionInterval(): Double
  
  /** Gets number of suggestions to display. Default is 5. */
  def get_querySuggestionCount(): Double
  
  /** Gets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  def get_querySuggestionMinimumPrefixLength(): Double
  
  def get_querySuggestionsSourceID(): String
  
  /** Gets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}' */
  def get_resultsPageAddress(): String
  
  def get_searchBoxContainerElement(): Element
  
  def get_searchBoxContainerId(): String
  
  def get_searchBoxInputElement(): Element
  
  /** Gets the id of the search box input element */
  def get_searchBoxInputId(): String
  
  def get_searchBoxLinkElement(): Element
  
  def get_searchBoxLinkId(): String
  
  def get_searchBoxProgressClass(): String
  
  def get_serverInitialRender(): Boolean
  
  def get_setFocusOnPageLoad(): Boolean
  
  def get_showAdvancedLink(): Boolean
  
  def get_showNavigation(): Boolean
  
  def get_showPeopleNameSuggestions(): Boolean
  
  def get_showPreferencesLink(): Boolean
  
  def get_showQuerySuggestions(): Boolean
  
  def get_suggestionsListId(): String
  
  def get_tryInplaceQuery(): Boolean
  
  def get_updatePageTitle(): Boolean
  
  def hidePrompt(): Unit
  
  def raiseBatchQueryIssuingEvent(arg: Any): Unit
  
  def raiseBatchResultReadyEvent(arg: Any): Unit
  
  def raiseQueryReadyEvent(arg: Any): Unit
  
  def remove_batchQueryIssuing(value: Any): Unit
  
  def remove_batchResultReady(value: Any): Unit
  
  def remove_queryReady(value: Any): Unit
  
  def search(term: String): Unit
  
  def setBorder(focused: Boolean): Unit
  
  def set_advancedSearchPageAddress(value: String): String
  
  def set_allowEmptySearch(value: Boolean): Boolean
  
  /** Sets the search input placeholder text */
  def set_currentPrompt(value: String): String
  
  /** Sets the current search term.
    * Does not update results or even re-render control automatically, only sets the value.
    * You can call .renderControl() method to re-render control.
    */
  def set_currentTerm(value: String): String
  
  def set_initialPrompt(value: String): String
  
  def set_maintainQueryState(value: Boolean): Boolean
  
  def set_msBeforeShowingProgress(value: Double): Double
  
  def set_navigationButtonId(value: String): String
  
  def set_navigationListId(value: String): String
  
  def set_navigationNodes(value: Any): Any
  
  def set_pageTitlePrefix(value: String): String
  
  def set_personalResultCount(value: Double): Double
  
  /** Sets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  def set_promptCssClass(value: String): String
  
  def set_queryGroupNames(value: Any): js.Array[String]
  
  /** Sets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
    * Default value is 250.
    */
  def set_querySuggestionCompletionInterval(value: Double): Double
  
  /** Sets number of suggestions to display. Default is 5. */
  def set_querySuggestionCount(value: Double): Double
  
  /** Sets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  def set_querySuggestionMinimumPrefixLength(value: Double): Double
  
  def set_querySuggestionsSourceID(value: String): String
  
  /** Sets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}'
    * Parameter u is used for setting the url filter for the search, so that only results within
    * e.g. specified site are returned. Omit this parameter if you want to search everywhere.
    */
  def set_resultsPageAddress(value: String): String
  
  def set_searchBoxContainerId(value: String): String
  
  /** Sets the id of the search box input element */
  def set_searchBoxInputId(value: String): String
  
  def set_searchBoxLinkId(value: String): String
  
  def set_searchBoxProgressClass(value: String): String
  
  def set_serverInitialRender(value: Boolean): Boolean
  
  def set_setFocusOnPageLoad(value: Boolean): Boolean
  
  def set_showAdvancedLink(value: Boolean): Boolean
  
  def set_showNavigation(value: Boolean): Boolean
  
  def set_showPeopleNameSuggestions(value: Boolean): Boolean
  
  def set_showPreferencesLink(value: Boolean): Boolean
  
  def set_showQuerySuggestions(value: Boolean): Boolean
  
  def set_suggestionsListId(value: String): String
  
  def set_tryInplaceQuery(value: Boolean): Boolean
  
  def set_updatePageTitle(value: Boolean): Boolean
  
  def showPrompt(): Unit
}
object SearchBox {
  
  inline def apply(
    activate: (String, String, String, String, String, String, String, String, String) => Unit,
    activateDefaultNavigationBehavior: () => Unit,
    activateDefaultQuerySuggestionBehavior: () => Unit,
    addCssClass: String => Unit,
    add_batchQueryIssuing: Any => Unit,
    add_batchResultReady: Any => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    add_queryReady: Any => Unit,
    alternateRenderContext: Any,
    alternateRenderer: Any,
    beginUpdate: () => Unit,
    clickHandler: Event => Any,
    dataProvider_QueryIssuing: (Any, Any) => Unit,
    dataProvider_QueryStateChanged: (Any, Any) => Unit,
    dataProvider_ResultReady: (Any, Any) => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    focus: () => Unit,
    get_advancedSearchPageAddress: () => String,
    get_allowEmptySearch: () => Boolean,
    get_alternateErrorMessage: () => String,
    get_currentPrompt: () => String,
    get_currentTerm: () => String,
    get_delayLoadTemplateScripts: () => Boolean,
    get_element: () => HTMLElement,
    get_events: () => Any,
    get_id: () => String,
    get_initialPrompt: () => String,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_maintainQueryState: () => Boolean,
    get_messages: () => js.Array[Any],
    get_msBeforeShowingProgress: () => Double,
    get_navigationButtonId: () => String,
    get_navigationListId: () => String,
    get_navigationNodes: () => Any,
    get_nextUniqueId: () => String,
    get_pageTitlePrefix: () => String,
    get_personalResultCount: () => Double,
    get_promptCssClass: () => String,
    get_queryGroupNames: () => js.Array[String],
    get_querySuggestionCompletionInterval: () => Double,
    get_querySuggestionCount: () => Double,
    get_querySuggestionMinimumPrefixLength: () => Double,
    get_querySuggestionsSourceID: () => String,
    get_renderTemplateId: () => String,
    get_resultsPageAddress: () => String,
    get_searchBoxContainerElement: () => Element,
    get_searchBoxContainerId: () => String,
    get_searchBoxInputElement: () => Element,
    get_searchBoxInputId: () => String,
    get_searchBoxLinkElement: () => Element,
    get_searchBoxLinkId: () => String,
    get_searchBoxProgressClass: () => String,
    get_serverInitialRender: () => Boolean,
    get_setFocusOnPageLoad: () => Boolean,
    get_showAdvancedLink: () => Boolean,
    get_showDataErrors: () => Boolean,
    get_showNavigation: () => Boolean,
    get_showPeopleNameSuggestions: () => Boolean,
    get_showPreferencesLink: () => Boolean,
    get_showQuerySuggestions: () => Boolean,
    get_states: () => Any,
    get_suggestionsListId: () => String,
    get_tryInplaceQuery: () => Boolean,
    get_updatePageTitle: () => Boolean,
    hasMessages: () => Any,
    hidePrompt: () => Unit,
    initialize: () => Unit,
    invokeAlternateRender: (Any, Any, Any) => Any,
    invokeClientRenderer: (Any, Any) => Any,
    loadRenderTemplateScripts: (Any, Any, Any, Any, Any) => Boolean,
    loadServerTemplateScripts: () => Unit,
    loaded: Boolean,
    onBubbleEvent: (Any, Any) => Boolean,
    processDataErrorMessages: Any => Any,
    processDataProviderErrors: Any => Unit,
    processRenderingErrorMessages: Any => Any,
    raiseBatchQueryIssuingEvent: Any => Unit,
    raiseBatchResultReadyEvent: Any => Unit,
    raiseBubbleEvent: (Any, Any) => Unit,
    raisePropertyChanged: String => Unit,
    raiseQueryReadyEvent: Any => Unit,
    removeCssClass: String => Unit,
    remove_batchQueryIssuing: Any => Unit,
    remove_batchResultReady: Any => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_queryReady: Any => Unit,
    renderControl: (Any, Any) => Unit,
    scriptApplication_Load: (Any, Any) => Unit,
    scriptApplication_PostLoad: (Any, Any) => Unit,
    scriptApplication_PreLoad: (Any, Any) => Unit,
    search: String => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[Any],
    setBorder: Boolean => Unit,
    setControlElementVisibility: Boolean => Any,
    set_advancedSearchPageAddress: String => String,
    set_allowEmptySearch: Boolean => Boolean,
    set_alternateErrorMessage: String => String,
    set_currentPrompt: String => String,
    set_currentTerm: String => String,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_id: String => Unit,
    set_initialPrompt: String => String,
    set_maintainQueryState: Boolean => Boolean,
    set_messages: js.Array[Any] => js.Array[Any],
    set_msBeforeShowingProgress: Double => Double,
    set_navigationButtonId: String => String,
    set_navigationListId: String => String,
    set_navigationNodes: Any => Any,
    set_pageTitlePrefix: String => String,
    set_personalResultCount: Double => Double,
    set_promptCssClass: String => String,
    set_queryGroupNames: Any => js.Array[String],
    set_querySuggestionCompletionInterval: Double => Double,
    set_querySuggestionCount: Double => Double,
    set_querySuggestionMinimumPrefixLength: Double => Double,
    set_querySuggestionsSourceID: String => String,
    set_renderTemplateId: String => String,
    set_resultsPageAddress: String => String,
    set_searchBoxContainerId: String => String,
    set_searchBoxInputId: String => String,
    set_searchBoxLinkId: String => String,
    set_searchBoxProgressClass: String => String,
    set_serverInitialRender: Boolean => Boolean,
    set_setFocusOnPageLoad: Boolean => Boolean,
    set_showAdvancedLink: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_showNavigation: Boolean => Boolean,
    set_showPeopleNameSuggestions: Boolean => Boolean,
    set_showPreferencesLink: Boolean => Boolean,
    set_showQuerySuggestions: Boolean => Boolean,
    set_states: Any => Any,
    set_suggestionsListId: String => String,
    set_tryInplaceQuery: Boolean => Boolean,
    set_updatePageTitle: Boolean => Boolean,
    showPrompt: () => Unit,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => Any,
    updated: () => Unit
  ): SearchBox = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction9(activate), activateDefaultNavigationBehavior = js.Any.fromFunction0(activateDefaultNavigationBehavior), activateDefaultQuerySuggestionBehavior = js.Any.fromFunction0(activateDefaultQuerySuggestionBehavior), addCssClass = js.Any.fromFunction1(addCssClass), add_batchQueryIssuing = js.Any.fromFunction1(add_batchQueryIssuing), add_batchResultReady = js.Any.fromFunction1(add_batchResultReady), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_queryReady = js.Any.fromFunction1(add_queryReady), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2(dataProvider_QueryIssuing), dataProvider_QueryStateChanged = js.Any.fromFunction2(dataProvider_QueryStateChanged), dataProvider_ResultReady = js.Any.fromFunction2(dataProvider_ResultReady), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), focus = js.Any.fromFunction0(focus), get_advancedSearchPageAddress = js.Any.fromFunction0(get_advancedSearchPageAddress), get_allowEmptySearch = js.Any.fromFunction0(get_allowEmptySearch), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_currentPrompt = js.Any.fromFunction0(get_currentPrompt), get_currentTerm = js.Any.fromFunction0(get_currentTerm), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_initialPrompt = js.Any.fromFunction0(get_initialPrompt), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_maintainQueryState = js.Any.fromFunction0(get_maintainQueryState), get_messages = js.Any.fromFunction0(get_messages), get_msBeforeShowingProgress = js.Any.fromFunction0(get_msBeforeShowingProgress), get_navigationButtonId = js.Any.fromFunction0(get_navigationButtonId), get_navigationListId = js.Any.fromFunction0(get_navigationListId), get_navigationNodes = js.Any.fromFunction0(get_navigationNodes), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_pageTitlePrefix = js.Any.fromFunction0(get_pageTitlePrefix), get_personalResultCount = js.Any.fromFunction0(get_personalResultCount), get_promptCssClass = js.Any.fromFunction0(get_promptCssClass), get_queryGroupNames = js.Any.fromFunction0(get_queryGroupNames), get_querySuggestionCompletionInterval = js.Any.fromFunction0(get_querySuggestionCompletionInterval), get_querySuggestionCount = js.Any.fromFunction0(get_querySuggestionCount), get_querySuggestionMinimumPrefixLength = js.Any.fromFunction0(get_querySuggestionMinimumPrefixLength), get_querySuggestionsSourceID = js.Any.fromFunction0(get_querySuggestionsSourceID), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_resultsPageAddress = js.Any.fromFunction0(get_resultsPageAddress), get_searchBoxContainerElement = js.Any.fromFunction0(get_searchBoxContainerElement), get_searchBoxContainerId = js.Any.fromFunction0(get_searchBoxContainerId), get_searchBoxInputElement = js.Any.fromFunction0(get_searchBoxInputElement), get_searchBoxInputId = js.Any.fromFunction0(get_searchBoxInputId), get_searchBoxLinkElement = js.Any.fromFunction0(get_searchBoxLinkElement), get_searchBoxLinkId = js.Any.fromFunction0(get_searchBoxLinkId), get_searchBoxProgressClass = js.Any.fromFunction0(get_searchBoxProgressClass), get_serverInitialRender = js.Any.fromFunction0(get_serverInitialRender), get_setFocusOnPageLoad = js.Any.fromFunction0(get_setFocusOnPageLoad), get_showAdvancedLink = js.Any.fromFunction0(get_showAdvancedLink), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_showNavigation = js.Any.fromFunction0(get_showNavigation), get_showPeopleNameSuggestions = js.Any.fromFunction0(get_showPeopleNameSuggestions), get_showPreferencesLink = js.Any.fromFunction0(get_showPreferencesLink), get_showQuerySuggestions = js.Any.fromFunction0(get_showQuerySuggestions), get_states = js.Any.fromFunction0(get_states), get_suggestionsListId = js.Any.fromFunction0(get_suggestionsListId), get_tryInplaceQuery = js.Any.fromFunction0(get_tryInplaceQuery), get_updatePageTitle = js.Any.fromFunction0(get_updatePageTitle), hasMessages = js.Any.fromFunction0(hasMessages), hidePrompt = js.Any.fromFunction0(hidePrompt), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBatchQueryIssuingEvent = js.Any.fromFunction1(raiseBatchQueryIssuingEvent), raiseBatchResultReadyEvent = js.Any.fromFunction1(raiseBatchResultReadyEvent), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), raiseQueryReadyEvent = js.Any.fromFunction1(raiseQueryReadyEvent), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_batchQueryIssuing = js.Any.fromFunction1(remove_batchQueryIssuing), remove_batchResultReady = js.Any.fromFunction1(remove_batchResultReady), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_queryReady = js.Any.fromFunction1(remove_queryReady), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), search = js.Any.fromFunction1(search), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setBorder = js.Any.fromFunction1(setBorder), setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_advancedSearchPageAddress = js.Any.fromFunction1(set_advancedSearchPageAddress), set_allowEmptySearch = js.Any.fromFunction1(set_allowEmptySearch), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentPrompt = js.Any.fromFunction1(set_currentPrompt), set_currentTerm = js.Any.fromFunction1(set_currentTerm), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_id = js.Any.fromFunction1(set_id), set_initialPrompt = js.Any.fromFunction1(set_initialPrompt), set_maintainQueryState = js.Any.fromFunction1(set_maintainQueryState), set_messages = js.Any.fromFunction1(set_messages), set_msBeforeShowingProgress = js.Any.fromFunction1(set_msBeforeShowingProgress), set_navigationButtonId = js.Any.fromFunction1(set_navigationButtonId), set_navigationListId = js.Any.fromFunction1(set_navigationListId), set_navigationNodes = js.Any.fromFunction1(set_navigationNodes), set_pageTitlePrefix = js.Any.fromFunction1(set_pageTitlePrefix), set_personalResultCount = js.Any.fromFunction1(set_personalResultCount), set_promptCssClass = js.Any.fromFunction1(set_promptCssClass), set_queryGroupNames = js.Any.fromFunction1(set_queryGroupNames), set_querySuggestionCompletionInterval = js.Any.fromFunction1(set_querySuggestionCompletionInterval), set_querySuggestionCount = js.Any.fromFunction1(set_querySuggestionCount), set_querySuggestionMinimumPrefixLength = js.Any.fromFunction1(set_querySuggestionMinimumPrefixLength), set_querySuggestionsSourceID = js.Any.fromFunction1(set_querySuggestionsSourceID), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_resultsPageAddress = js.Any.fromFunction1(set_resultsPageAddress), set_searchBoxContainerId = js.Any.fromFunction1(set_searchBoxContainerId), set_searchBoxInputId = js.Any.fromFunction1(set_searchBoxInputId), set_searchBoxLinkId = js.Any.fromFunction1(set_searchBoxLinkId), set_searchBoxProgressClass = js.Any.fromFunction1(set_searchBoxProgressClass), set_serverInitialRender = js.Any.fromFunction1(set_serverInitialRender), set_setFocusOnPageLoad = js.Any.fromFunction1(set_setFocusOnPageLoad), set_showAdvancedLink = js.Any.fromFunction1(set_showAdvancedLink), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_showNavigation = js.Any.fromFunction1(set_showNavigation), set_showPeopleNameSuggestions = js.Any.fromFunction1(set_showPeopleNameSuggestions), set_showPreferencesLink = js.Any.fromFunction1(set_showPreferencesLink), set_showQuerySuggestions = js.Any.fromFunction1(set_showQuerySuggestions), set_states = js.Any.fromFunction1(set_states), set_suggestionsListId = js.Any.fromFunction1(set_suggestionsListId), set_tryInplaceQuery = js.Any.fromFunction1(set_tryInplaceQuery), set_updatePageTitle = js.Any.fromFunction1(set_updatePageTitle), showPrompt = js.Any.fromFunction0(showPrompt), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[SearchBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchBox] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: (String, String, String, String, String, String, String, String, String) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction9(value))
    
    inline def setActivateDefaultNavigationBehavior(value: () => Unit): Self = StObject.set(x, "activateDefaultNavigationBehavior", js.Any.fromFunction0(value))
    
    inline def setActivateDefaultQuerySuggestionBehavior(value: () => Unit): Self = StObject.set(x, "activateDefaultQuerySuggestionBehavior", js.Any.fromFunction0(value))
    
    inline def setAdd_batchQueryIssuing(value: Any => Unit): Self = StObject.set(x, "add_batchQueryIssuing", js.Any.fromFunction1(value))
    
    inline def setAdd_batchResultReady(value: Any => Unit): Self = StObject.set(x, "add_batchResultReady", js.Any.fromFunction1(value))
    
    inline def setAdd_queryReady(value: Any => Unit): Self = StObject.set(x, "add_queryReady", js.Any.fromFunction1(value))
    
    inline def setDataProvider_QueryIssuing(value: (Any, Any) => Unit): Self = StObject.set(x, "dataProvider_QueryIssuing", js.Any.fromFunction2(value))
    
    inline def setDataProvider_QueryStateChanged(value: (Any, Any) => Unit): Self = StObject.set(x, "dataProvider_QueryStateChanged", js.Any.fromFunction2(value))
    
    inline def setDataProvider_ResultReady(value: (Any, Any) => Unit): Self = StObject.set(x, "dataProvider_ResultReady", js.Any.fromFunction2(value))
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setGet_advancedSearchPageAddress(value: () => String): Self = StObject.set(x, "get_advancedSearchPageAddress", js.Any.fromFunction0(value))
    
    inline def setGet_allowEmptySearch(value: () => Boolean): Self = StObject.set(x, "get_allowEmptySearch", js.Any.fromFunction0(value))
    
    inline def setGet_currentPrompt(value: () => String): Self = StObject.set(x, "get_currentPrompt", js.Any.fromFunction0(value))
    
    inline def setGet_currentTerm(value: () => String): Self = StObject.set(x, "get_currentTerm", js.Any.fromFunction0(value))
    
    inline def setGet_initialPrompt(value: () => String): Self = StObject.set(x, "get_initialPrompt", js.Any.fromFunction0(value))
    
    inline def setGet_maintainQueryState(value: () => Boolean): Self = StObject.set(x, "get_maintainQueryState", js.Any.fromFunction0(value))
    
    inline def setGet_msBeforeShowingProgress(value: () => Double): Self = StObject.set(x, "get_msBeforeShowingProgress", js.Any.fromFunction0(value))
    
    inline def setGet_navigationButtonId(value: () => String): Self = StObject.set(x, "get_navigationButtonId", js.Any.fromFunction0(value))
    
    inline def setGet_navigationListId(value: () => String): Self = StObject.set(x, "get_navigationListId", js.Any.fromFunction0(value))
    
    inline def setGet_navigationNodes(value: () => Any): Self = StObject.set(x, "get_navigationNodes", js.Any.fromFunction0(value))
    
    inline def setGet_pageTitlePrefix(value: () => String): Self = StObject.set(x, "get_pageTitlePrefix", js.Any.fromFunction0(value))
    
    inline def setGet_personalResultCount(value: () => Double): Self = StObject.set(x, "get_personalResultCount", js.Any.fromFunction0(value))
    
    inline def setGet_promptCssClass(value: () => String): Self = StObject.set(x, "get_promptCssClass", js.Any.fromFunction0(value))
    
    inline def setGet_queryGroupNames(value: () => js.Array[String]): Self = StObject.set(x, "get_queryGroupNames", js.Any.fromFunction0(value))
    
    inline def setGet_querySuggestionCompletionInterval(value: () => Double): Self = StObject.set(x, "get_querySuggestionCompletionInterval", js.Any.fromFunction0(value))
    
    inline def setGet_querySuggestionCount(value: () => Double): Self = StObject.set(x, "get_querySuggestionCount", js.Any.fromFunction0(value))
    
    inline def setGet_querySuggestionMinimumPrefixLength(value: () => Double): Self = StObject.set(x, "get_querySuggestionMinimumPrefixLength", js.Any.fromFunction0(value))
    
    inline def setGet_querySuggestionsSourceID(value: () => String): Self = StObject.set(x, "get_querySuggestionsSourceID", js.Any.fromFunction0(value))
    
    inline def setGet_resultsPageAddress(value: () => String): Self = StObject.set(x, "get_resultsPageAddress", js.Any.fromFunction0(value))
    
    inline def setGet_searchBoxContainerElement(value: () => Element): Self = StObject.set(x, "get_searchBoxContainerElement", js.Any.fromFunction0(value))
    
    inline def setGet_searchBoxContainerId(value: () => String): Self = StObject.set(x, "get_searchBoxContainerId", js.Any.fromFunction0(value))
    
    inline def setGet_searchBoxInputElement(value: () => Element): Self = StObject.set(x, "get_searchBoxInputElement", js.Any.fromFunction0(value))
    
    inline def setGet_searchBoxInputId(value: () => String): Self = StObject.set(x, "get_searchBoxInputId", js.Any.fromFunction0(value))
    
    inline def setGet_searchBoxLinkElement(value: () => Element): Self = StObject.set(x, "get_searchBoxLinkElement", js.Any.fromFunction0(value))
    
    inline def setGet_searchBoxLinkId(value: () => String): Self = StObject.set(x, "get_searchBoxLinkId", js.Any.fromFunction0(value))
    
    inline def setGet_searchBoxProgressClass(value: () => String): Self = StObject.set(x, "get_searchBoxProgressClass", js.Any.fromFunction0(value))
    
    inline def setGet_serverInitialRender(value: () => Boolean): Self = StObject.set(x, "get_serverInitialRender", js.Any.fromFunction0(value))
    
    inline def setGet_setFocusOnPageLoad(value: () => Boolean): Self = StObject.set(x, "get_setFocusOnPageLoad", js.Any.fromFunction0(value))
    
    inline def setGet_showAdvancedLink(value: () => Boolean): Self = StObject.set(x, "get_showAdvancedLink", js.Any.fromFunction0(value))
    
    inline def setGet_showNavigation(value: () => Boolean): Self = StObject.set(x, "get_showNavigation", js.Any.fromFunction0(value))
    
    inline def setGet_showPeopleNameSuggestions(value: () => Boolean): Self = StObject.set(x, "get_showPeopleNameSuggestions", js.Any.fromFunction0(value))
    
    inline def setGet_showPreferencesLink(value: () => Boolean): Self = StObject.set(x, "get_showPreferencesLink", js.Any.fromFunction0(value))
    
    inline def setGet_showQuerySuggestions(value: () => Boolean): Self = StObject.set(x, "get_showQuerySuggestions", js.Any.fromFunction0(value))
    
    inline def setGet_suggestionsListId(value: () => String): Self = StObject.set(x, "get_suggestionsListId", js.Any.fromFunction0(value))
    
    inline def setGet_tryInplaceQuery(value: () => Boolean): Self = StObject.set(x, "get_tryInplaceQuery", js.Any.fromFunction0(value))
    
    inline def setGet_updatePageTitle(value: () => Boolean): Self = StObject.set(x, "get_updatePageTitle", js.Any.fromFunction0(value))
    
    inline def setHidePrompt(value: () => Unit): Self = StObject.set(x, "hidePrompt", js.Any.fromFunction0(value))
    
    inline def setRaiseBatchQueryIssuingEvent(value: Any => Unit): Self = StObject.set(x, "raiseBatchQueryIssuingEvent", js.Any.fromFunction1(value))
    
    inline def setRaiseBatchResultReadyEvent(value: Any => Unit): Self = StObject.set(x, "raiseBatchResultReadyEvent", js.Any.fromFunction1(value))
    
    inline def setRaiseQueryReadyEvent(value: Any => Unit): Self = StObject.set(x, "raiseQueryReadyEvent", js.Any.fromFunction1(value))
    
    inline def setRemove_batchQueryIssuing(value: Any => Unit): Self = StObject.set(x, "remove_batchQueryIssuing", js.Any.fromFunction1(value))
    
    inline def setRemove_batchResultReady(value: Any => Unit): Self = StObject.set(x, "remove_batchResultReady", js.Any.fromFunction1(value))
    
    inline def setRemove_queryReady(value: Any => Unit): Self = StObject.set(x, "remove_queryReady", js.Any.fromFunction1(value))
    
    inline def setSearch(value: String => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    inline def setSetBorder(value: Boolean => Unit): Self = StObject.set(x, "setBorder", js.Any.fromFunction1(value))
    
    inline def setSet_advancedSearchPageAddress(value: String => String): Self = StObject.set(x, "set_advancedSearchPageAddress", js.Any.fromFunction1(value))
    
    inline def setSet_allowEmptySearch(value: Boolean => Boolean): Self = StObject.set(x, "set_allowEmptySearch", js.Any.fromFunction1(value))
    
    inline def setSet_currentPrompt(value: String => String): Self = StObject.set(x, "set_currentPrompt", js.Any.fromFunction1(value))
    
    inline def setSet_currentTerm(value: String => String): Self = StObject.set(x, "set_currentTerm", js.Any.fromFunction1(value))
    
    inline def setSet_initialPrompt(value: String => String): Self = StObject.set(x, "set_initialPrompt", js.Any.fromFunction1(value))
    
    inline def setSet_maintainQueryState(value: Boolean => Boolean): Self = StObject.set(x, "set_maintainQueryState", js.Any.fromFunction1(value))
    
    inline def setSet_msBeforeShowingProgress(value: Double => Double): Self = StObject.set(x, "set_msBeforeShowingProgress", js.Any.fromFunction1(value))
    
    inline def setSet_navigationButtonId(value: String => String): Self = StObject.set(x, "set_navigationButtonId", js.Any.fromFunction1(value))
    
    inline def setSet_navigationListId(value: String => String): Self = StObject.set(x, "set_navigationListId", js.Any.fromFunction1(value))
    
    inline def setSet_navigationNodes(value: Any => Any): Self = StObject.set(x, "set_navigationNodes", js.Any.fromFunction1(value))
    
    inline def setSet_pageTitlePrefix(value: String => String): Self = StObject.set(x, "set_pageTitlePrefix", js.Any.fromFunction1(value))
    
    inline def setSet_personalResultCount(value: Double => Double): Self = StObject.set(x, "set_personalResultCount", js.Any.fromFunction1(value))
    
    inline def setSet_promptCssClass(value: String => String): Self = StObject.set(x, "set_promptCssClass", js.Any.fromFunction1(value))
    
    inline def setSet_queryGroupNames(value: Any => js.Array[String]): Self = StObject.set(x, "set_queryGroupNames", js.Any.fromFunction1(value))
    
    inline def setSet_querySuggestionCompletionInterval(value: Double => Double): Self = StObject.set(x, "set_querySuggestionCompletionInterval", js.Any.fromFunction1(value))
    
    inline def setSet_querySuggestionCount(value: Double => Double): Self = StObject.set(x, "set_querySuggestionCount", js.Any.fromFunction1(value))
    
    inline def setSet_querySuggestionMinimumPrefixLength(value: Double => Double): Self = StObject.set(x, "set_querySuggestionMinimumPrefixLength", js.Any.fromFunction1(value))
    
    inline def setSet_querySuggestionsSourceID(value: String => String): Self = StObject.set(x, "set_querySuggestionsSourceID", js.Any.fromFunction1(value))
    
    inline def setSet_resultsPageAddress(value: String => String): Self = StObject.set(x, "set_resultsPageAddress", js.Any.fromFunction1(value))
    
    inline def setSet_searchBoxContainerId(value: String => String): Self = StObject.set(x, "set_searchBoxContainerId", js.Any.fromFunction1(value))
    
    inline def setSet_searchBoxInputId(value: String => String): Self = StObject.set(x, "set_searchBoxInputId", js.Any.fromFunction1(value))
    
    inline def setSet_searchBoxLinkId(value: String => String): Self = StObject.set(x, "set_searchBoxLinkId", js.Any.fromFunction1(value))
    
    inline def setSet_searchBoxProgressClass(value: String => String): Self = StObject.set(x, "set_searchBoxProgressClass", js.Any.fromFunction1(value))
    
    inline def setSet_serverInitialRender(value: Boolean => Boolean): Self = StObject.set(x, "set_serverInitialRender", js.Any.fromFunction1(value))
    
    inline def setSet_setFocusOnPageLoad(value: Boolean => Boolean): Self = StObject.set(x, "set_setFocusOnPageLoad", js.Any.fromFunction1(value))
    
    inline def setSet_showAdvancedLink(value: Boolean => Boolean): Self = StObject.set(x, "set_showAdvancedLink", js.Any.fromFunction1(value))
    
    inline def setSet_showNavigation(value: Boolean => Boolean): Self = StObject.set(x, "set_showNavigation", js.Any.fromFunction1(value))
    
    inline def setSet_showPeopleNameSuggestions(value: Boolean => Boolean): Self = StObject.set(x, "set_showPeopleNameSuggestions", js.Any.fromFunction1(value))
    
    inline def setSet_showPreferencesLink(value: Boolean => Boolean): Self = StObject.set(x, "set_showPreferencesLink", js.Any.fromFunction1(value))
    
    inline def setSet_showQuerySuggestions(value: Boolean => Boolean): Self = StObject.set(x, "set_showQuerySuggestions", js.Any.fromFunction1(value))
    
    inline def setSet_suggestionsListId(value: String => String): Self = StObject.set(x, "set_suggestionsListId", js.Any.fromFunction1(value))
    
    inline def setSet_tryInplaceQuery(value: Boolean => Boolean): Self = StObject.set(x, "set_tryInplaceQuery", js.Any.fromFunction1(value))
    
    inline def setSet_updatePageTitle(value: Boolean => Boolean): Self = StObject.set(x, "set_updatePageTitle", js.Any.fromFunction1(value))
    
    inline def setShowPrompt(value: () => Unit): Self = StObject.set(x, "showPrompt", js.Any.fromFunction0(value))
  }
}
