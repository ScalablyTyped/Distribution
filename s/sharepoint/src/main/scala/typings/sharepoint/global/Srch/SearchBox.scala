package typings.sharepoint.global.Srch

import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the search box control */
@JSGlobal("Srch.SearchBox")
@js.native
class SearchBox protected ()
  extends typings.sharepoint.Srch.SearchBox {
  def this(elem: Element) = this()
  /* CompleteClass */
  override var alternateRenderContext: js.Any = js.native
  /* CompleteClass */
  override var alternateRenderer: js.Any = js.native
  /* CompleteClass */
  override var loaded: Boolean = js.native
  /* CompleteClass */
  override var serverTemplateScriptsToLoad: js.Array[_] = js.native
  /* CompleteClass */
  override def activate(
    prompt: String,
    searchBoxInputId: String,
    searchBoxContainerId: String,
    navigationButtonId: String,
    suggestionsListId: String,
    navigationListId: String,
    searchBoxLinkId: String,
    searchBoxProgressClass: String,
    searchBoxPromptClass: String
  ): Unit = js.native
  /* CompleteClass */
  override def activateDefaultNavigationBehavior(): Unit = js.native
  /* CompleteClass */
  override def activateDefaultQuerySuggestionBehavior(): Unit = js.native
  //#endregion
  //#region Methods
  /**
    * Adds a CSS class to the HTML Document Object Model (DOM) element that the control is attached to.
    * Use the addCssClass method to add a CSS class to a control. If the CSS class has already been added to the control, addCssClass makes no changes to the control.
    * @param className
    *          A string that contains the name of the CSS class to add.
    */
  /* CompleteClass */
  override def addCssClass(className: String): Unit = js.native
  /* CompleteClass */
  override def add_batchQueryIssuing(value: js.Any): Unit = js.native
  /* CompleteClass */
  override def add_batchResultReady(value: js.Any): Unit = js.native
  //#endregion
  //#region Events
  /**
    * Raised when the dispose method is called for a component.
    */
  /* CompleteClass */
  override def add_disposing(handler: js.Function): Unit = js.native
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  /* CompleteClass */
  override def add_propertyChanged(handler: js.Function): Unit = js.native
  /* CompleteClass */
  override def add_queryReady(value: js.Any): Unit = js.native
  //#endregion
  //#region Methods
  /**
    * Called by the create method to indicate that the process of setting properties of a component instance has begun.
    */
  /* CompleteClass */
  override def beginUpdate(): Unit = js.native
  /* CompleteClass */
  override def clickHandler(e: Event): js.Any = js.native
  /* CompleteClass */
  override def dataProvider_QueryIssuing(sender: js.Any, e: js.Any): Unit = js.native
  /* CompleteClass */
  override def dataProvider_QueryStateChanged(sender: js.Any, e: js.Any): Unit = js.native
  /* CompleteClass */
  override def dataProvider_ResultReady(sender: js.Any, e: js.Any): Unit = js.native
  /**
    * Raises the disposing event of the current Component and removes the component from the application.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Called by the create method to indicate that the process of setting properties of a component instance has finished.
    * This method is called by the create method ($create).
    * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
    */
  /* CompleteClass */
  override def endUpdate(): Unit = js.native
  /* CompleteClass */
  override def focus(): Unit = js.native
  /* CompleteClass */
  override def get_advancedSearchPageAddress(): String = js.native
  /* CompleteClass */
  override def get_allowEmptySearch(): Boolean = js.native
  /* CompleteClass */
  override def get_alternateErrorMessage(): String = js.native
  /** Gets the search input placeholder text */
  /* CompleteClass */
  override def get_currentPrompt(): String = js.native
  /** Returns the current search term */
  /* CompleteClass */
  override def get_currentTerm(): String = js.native
  /** Returns true if control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  /* CompleteClass */
  override def get_delayLoadTemplateScripts(): Boolean = js.native
  //#endregion
  //#region Properties
  /**
    * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
    * @return The DOM element that the current Control object is associated with.
    */
  /* CompleteClass */
  override def get_element(): HTMLElement = js.native
  //#endregion
  //#region Properties
  /**
    * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
    * This member supports the client-script infrastructure and is not intended to be used directly from your code.
    * @return
    *      An EventHandlerList object that contains references to all the events and handlers for this component.
    */
  /* CompleteClass */
  override def get_events(): js.Any = js.native
  /**
    * Gets the ID of the current Component object.
    * @return
    *       The id
    */
  /* CompleteClass */
  override def get_id(): String = js.native
  /* CompleteClass */
  override def get_initialPrompt(): String = js.native
  /** returns true if control has already been loaded at least once */
  /* CompleteClass */
  override def get_isInitialLoad(): Boolean = js.native
  /**
    * Gets a value indicating whether the current Component object is initialized.
    * @return
    *      true if the current Component is initialized; otherwise, false.
    */
  /* CompleteClass */
  override def get_isInitialized(): Boolean = js.native
  /**
    * Gets a value indicating whether the current Component object is updating.
    * @return
    *      true if the current Component object is updating; otherwise, false.
    */
  /* CompleteClass */
  override def get_isUpdating(): Boolean = js.native
  /* CompleteClass */
  override def get_maintainQueryState(): Boolean = js.native
  /* CompleteClass */
  override def get_messages(): js.Array[_] = js.native
  /* CompleteClass */
  override def get_msBeforeShowingProgress(): Double = js.native
  /* CompleteClass */
  override def get_navigationButtonId(): String = js.native
  /* CompleteClass */
  override def get_navigationListId(): String = js.native
  /* CompleteClass */
  override def get_navigationNodes(): js.Any = js.native
  /** returns next unique identifier for nested controls */
  /* CompleteClass */
  override def get_nextUniqueId(): String = js.native
  /* CompleteClass */
  override def get_pageTitlePrefix(): String = js.native
  /* CompleteClass */
  override def get_personalResultCount(): Double = js.native
  /** Gets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  /* CompleteClass */
  override def get_promptCssClass(): String = js.native
  /* CompleteClass */
  override def get_queryGroupNames(): js.Array[String] = js.native
  /** Gets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
    * Default value is 250.
    */
  /* CompleteClass */
  override def get_querySuggestionCompletionInterval(): Double = js.native
  /** Gets number of suggestions to display. Default is 5. */
  /* CompleteClass */
  override def get_querySuggestionCount(): Double = js.native
  /** Gets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  /* CompleteClass */
  override def get_querySuggestionMinimumPrefixLength(): Double = js.native
  /* CompleteClass */
  override def get_querySuggestionsSourceID(): String = js.native
  /** Gets the id of View display template that is used to render this control.
    * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
    */
  /* CompleteClass */
  override def get_renderTemplateId(): String = js.native
  /** Gets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}' */
  /* CompleteClass */
  override def get_resultsPageAddress(): String = js.native
  /* CompleteClass */
  override def get_searchBoxContainerElement(): Element = js.native
  /* CompleteClass */
  override def get_searchBoxContainerId(): String = js.native
  /* CompleteClass */
  override def get_searchBoxInputElement(): Element = js.native
  /** Gets the id of the search box input element */
  /* CompleteClass */
  override def get_searchBoxInputId(): String = js.native
  /* CompleteClass */
  override def get_searchBoxLinkElement(): Element = js.native
  /* CompleteClass */
  override def get_searchBoxLinkId(): String = js.native
  /* CompleteClass */
  override def get_searchBoxProgressClass(): String = js.native
  /* CompleteClass */
  override def get_serverInitialRender(): Boolean = js.native
  /* CompleteClass */
  override def get_setFocusOnPageLoad(): Boolean = js.native
  /* CompleteClass */
  override def get_showAdvancedLink(): Boolean = js.native
  /* CompleteClass */
  override def get_showDataErrors(): Boolean = js.native
  /* CompleteClass */
  override def get_showNavigation(): Boolean = js.native
  /* CompleteClass */
  override def get_showPeopleNameSuggestions(): Boolean = js.native
  /* CompleteClass */
  override def get_showPreferencesLink(): Boolean = js.native
  /* CompleteClass */
  override def get_showQuerySuggestions(): Boolean = js.native
  /* CompleteClass */
  override def get_states(): js.Any = js.native
  /* CompleteClass */
  override def get_suggestionsListId(): String = js.native
  /* CompleteClass */
  override def get_tryInplaceQuery(): Boolean = js.native
  /* CompleteClass */
  override def get_updatePageTitle(): Boolean = js.native
  /* CompleteClass */
  override def hasMessages(): js.Any = js.native
  /* CompleteClass */
  override def hidePrompt(): Unit = js.native
  /**
    * Initializes the current Component object.
    * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
    */
  /* CompleteClass */
  override def initialize(): Unit = js.native
  /* CompleteClass */
  override def invokeAlternateRender(callback: js.Any, container: js.Any, ctx: js.Any): js.Any = js.native
  /* CompleteClass */
  override def invokeClientRenderer(node: js.Any, ctx: js.Any): js.Any = js.native
  /* CompleteClass */
  override def loadRenderTemplateScripts(
    scriptReferences: js.Any,
    success: js.Any,
    failure: js.Any,
    timeout: js.Any,
    loadStandAloneCustomScripts: js.Any
  ): Boolean = js.native
  /* CompleteClass */
  override def loadServerTemplateScripts(): Unit = js.native
  /**
    * Called when an event is raised by the raiseBubbleEvent method.
    *
    * The onBubbleEvent method returns false to make sure that unhandled events propagate (bubble) to the parent control.
    * In derived classes, you should override the onBubbleEvent method and return true when events are handled to prevent the events from bubbling further.
    * For an explanation of bubbling, see Sys.UI.Control raiseBubbleEvent Method.
    *
    * @param source
    *          The object that triggered the event.
    * @param args
    *          The event arguments.
    * @return
    *      false in all cases.
    */
  /* CompleteClass */
  override def onBubbleEvent(source: js.Any, args: js.Any): Boolean = js.native
  /* CompleteClass */
  override def processDataErrorMessages(dataErrorsList: js.Any): js.Any = js.native
  /* CompleteClass */
  override def processDataProviderErrors(dataProviderToProcess: js.Any): Unit = js.native
  /* CompleteClass */
  override def processRenderingErrorMessages(ctx: js.Any): js.Any = js.native
  /* CompleteClass */
  override def raiseBatchQueryIssuingEvent(arg: js.Any): Unit = js.native
  /* CompleteClass */
  override def raiseBatchResultReadyEvent(arg: js.Any): Unit = js.native
  /**
    * Calls the onBubbleEvent method of the parent control.
    *
    * When the raiseBubbleEvent method is called, the source object and args values are sent to the onBubbleEvent handler of the current control.
    * If onBubbleEvent returns false, they are sent to the onBubbleEvent handler of the parent control.
    * This process continues until an onBubbleEvent event handler returns true, which indicates that the event has been handled.
    * Any event that bubbles to the Sys.Application instance without being handled is ignored.
    *
    * @param source
    *          The object that triggered the event.
    * @param args
    *          The event arguments.
    */
  /* CompleteClass */
  override def raiseBubbleEvent(source: js.Any, args: js.Any): Unit = js.native
  /**
    * Raises the propertyChanged event for the specified property.
    * @param propertyName
    *               The name of the property that changed.
    */
  /* CompleteClass */
  override def raisePropertyChanged(propertyName: String): Unit = js.native
  /* CompleteClass */
  override def raiseQueryReadyEvent(arg: js.Any): Unit = js.native
  /**
    * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
    * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
    *
    * @param className
    *          A string that contains the name of the CSS class to remove.
    */
  /* CompleteClass */
  override def removeCssClass(className: String): Unit = js.native
  /* CompleteClass */
  override def remove_batchQueryIssuing(value: js.Any): Unit = js.native
  /* CompleteClass */
  override def remove_batchResultReady(value: js.Any): Unit = js.native
  /**
    * Raised when the dispose method is called for a component.
    */
  /* CompleteClass */
  override def remove_disposing(handler: js.Function): Unit = js.native
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  /* CompleteClass */
  override def remove_propertyChanged(handler: js.Function): Unit = js.native
  /* CompleteClass */
  override def remove_queryReady(value: js.Any): Unit = js.native
  /* CompleteClass */
  override def renderControl(listData: js.Any, dataProvider: js.Any): Unit = js.native
  /* CompleteClass */
  override def scriptApplication_Load(sender: js.Any, e: js.Any): Unit = js.native
  /* CompleteClass */
  override def scriptApplication_PostLoad(sender: js.Any, e: js.Any): Unit = js.native
  /* CompleteClass */
  override def scriptApplication_PreLoad(sender: js.Any, e: js.Any): Unit = js.native
  /* CompleteClass */
  override def search(term: String): Unit = js.native
  /* CompleteClass */
  override def serverTemplateScriptsCallback(): Unit = js.native
  /* CompleteClass */
  override def setBorder(focused: Boolean): Unit = js.native
  /** show/hide the DOM element associated with control */
  /* CompleteClass */
  override def setControlElementVisibility(showElement: Boolean): js.Any = js.native
  /* CompleteClass */
  override def set_advancedSearchPageAddress(value: String): String = js.native
  /* CompleteClass */
  override def set_allowEmptySearch(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_alternateErrorMessage(value: String): String = js.native
  /** Sets the search input placeholder text */
  /* CompleteClass */
  override def set_currentPrompt(value: String): String = js.native
  /** Sets the current search term.
    * Does not update results or even re-render control automatically, only sets the value.
    * You can call .renderControl() method to re-render control.
    */
  /* CompleteClass */
  override def set_currentTerm(value: String): String = js.native
  /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  /* CompleteClass */
  override def set_delayLoadTemplateScripts(value: Boolean): Boolean = js.native
  /**
    * Sets the ID of the current Component object.
    * @param value A string that contains the ID of the component.
    */
  /* CompleteClass */
  override def set_id(value: String): Unit = js.native
  /* CompleteClass */
  override def set_initialPrompt(value: String): String = js.native
  /* CompleteClass */
  override def set_maintainQueryState(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_messages(value: js.Array[_]): js.Array[_] = js.native
  /* CompleteClass */
  override def set_msBeforeShowingProgress(value: Double): Double = js.native
  /* CompleteClass */
  override def set_navigationButtonId(value: String): String = js.native
  /* CompleteClass */
  override def set_navigationListId(value: String): String = js.native
  /* CompleteClass */
  override def set_navigationNodes(value: js.Any): js.Any = js.native
  /* CompleteClass */
  override def set_pageTitlePrefix(value: String): String = js.native
  /* CompleteClass */
  override def set_personalResultCount(value: Double): Double = js.native
  /** Sets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  /* CompleteClass */
  override def set_promptCssClass(value: String): String = js.native
  /* CompleteClass */
  override def set_queryGroupNames(value: js.Any): js.Array[String] = js.native
  /** Sets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
    * Default value is 250.
    */
  /* CompleteClass */
  override def set_querySuggestionCompletionInterval(value: Double): Double = js.native
  /** Sets number of suggestions to display. Default is 5. */
  /* CompleteClass */
  override def set_querySuggestionCount(value: Double): Double = js.native
  /** Sets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  /* CompleteClass */
  override def set_querySuggestionMinimumPrefixLength(value: Double): Double = js.native
  /* CompleteClass */
  override def set_querySuggestionsSourceID(value: String): String = js.native
  /* CompleteClass */
  override def set_renderTemplateId(value: String): String = js.native
  /** Sets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}'
    * Parameter u is used for setting the url filter for the search, so that only results within
    * e.g. specified site are returned. Omit this parameter if you want to search everywhere.
    */
  /* CompleteClass */
  override def set_resultsPageAddress(value: String): String = js.native
  /* CompleteClass */
  override def set_searchBoxContainerId(value: String): String = js.native
  /** Sets the id of the search box input element */
  /* CompleteClass */
  override def set_searchBoxInputId(value: String): String = js.native
  /* CompleteClass */
  override def set_searchBoxLinkId(value: String): String = js.native
  /* CompleteClass */
  override def set_searchBoxProgressClass(value: String): String = js.native
  /* CompleteClass */
  override def set_serverInitialRender(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_setFocusOnPageLoad(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_showAdvancedLink(value: Boolean): Boolean = js.native
  /** False by default. */
  /* CompleteClass */
  override def set_showDataErrors(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_showNavigation(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_showPeopleNameSuggestions(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_showPreferencesLink(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_showQuerySuggestions(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_states(value: js.Any): js.Any = js.native
  /* CompleteClass */
  override def set_suggestionsListId(value: String): String = js.native
  /* CompleteClass */
  override def set_tryInplaceQuery(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_updatePageTitle(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def showPrompt(): Unit = js.native
  /**
    * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
    * @param className
    *          A string that contains the name of the CSS class to toggle.
    */
  /* CompleteClass */
  override def toggleCssClass(className: String): Unit = js.native
  /* CompleteClass */
  override def updateDisplayControlWithNewMessages(): js.Any = js.native
  /**
    * Called by the endUpdate method as a placeholder for additional logic in derived classes.
    * Override the updated method in a derived class to add custom post-update logic.
    */
  /* CompleteClass */
  override def updated(): Unit = js.native
}

