package typings.sharepoint.global.Srch

import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.Refinement")
@js.native
class Refinement protected ()
  extends typings.sharepoint.Srch.Refinement {
  def this(elem: Element) = this()
  /* CompleteClass */
  override var alternateRenderContext: js.Any = js.native
  /* CompleteClass */
  override var alternateRenderer: js.Any = js.native
  /* CompleteClass */
  override var loaded: Boolean = js.native
  /* CompleteClass */
  override var serverTemplateScriptsToLoad: js.Array[_] = js.native
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
  override def addRefinementFilter(filterName: String, filterToken: js.Any): Unit = js.native
  /* CompleteClass */
  override def addRefinementFilters(refiners: js.Array[_]): Unit = js.native
  /* CompleteClass */
  override def addRefinementFiltersJSON(refinersJSON: String): Unit = js.native
  /* CompleteClass */
  override def addRefinementFiltersJSONWithOr(refinersJSON: String): Unit = js.native
  /* CompleteClass */
  override def addRefinementFiltersWithOp(refiners: js.Array[_], op: String): Unit = js.native
  //#endregion
  //#region Events
  /**
    * Raised when the dispose method is called for a component.
    */
  /* CompleteClass */
  override def add_disposing(handler: js.Function): Unit = js.native
  /* CompleteClass */
  override def add_oneTimeResultRendered(value: js.Any): Unit = js.native
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  /* CompleteClass */
  override def add_propertyChanged(handler: js.Function): Unit = js.native
  /* CompleteClass */
  override def add_queryReady(value: js.Any): Unit = js.native
  /* CompleteClass */
  override def add_resultRendered(value: js.Any): Unit = js.native
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
  override def getCurrentRefinementCategory(refinementName: String): js.Any = js.native
  /** Gets refinement control with the specified propertyName */
  /* CompleteClass */
  override def getRefinementControl(refinerName: String): typings.sharepoint.Srch.RefinementControl = js.native
  /* CompleteClass */
  override def get_alternateErrorMessage(): String = js.native
  /* CompleteClass */
  override def get_currentResultTableCollection(): js.Any = js.native
  /* CompleteClass */
  override def get_dataProvider(): typings.sharepoint.Srch.DataProvider = js.native
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
  /* CompleteClass */
  override def get_emptyMessage(): String = js.native
  /* CompleteClass */
  override def get_emptyRefinementMessageId(): String = js.native
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
  override def get_messages(): js.Array[_] = js.native
  /** returns next unique identifier for nested controls */
  /* CompleteClass */
  override def get_nextUniqueId(): String = js.native
  /* CompleteClass */
  override def get_queryGroupName(): String = js.native
  /** Gets the id of View display template that is used to render this control.
    * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
    */
  /* CompleteClass */
  override def get_renderTemplateId(): String = js.native
  /* CompleteClass */
  override def get_renderedResult(): Boolean = js.native
  /* CompleteClass */
  override def get_selectedRefinementControls(): js.Array[typings.sharepoint.Srch.RefinementControl] = js.native
  /* CompleteClass */
  override def get_shouldShowNoResultMessage(): Boolean = js.native
  /* CompleteClass */
  override def get_showDataErrors(): Boolean = js.native
  /* CompleteClass */
  override def get_states(): js.Any = js.native
  /* CompleteClass */
  override def get_useManagedNavigationRefiners(): Boolean = js.native
  /* CompleteClass */
  override def hasAllRefinementFilters(filterName: String, filterTokens: js.Array[String]): Boolean = js.native
  /* CompleteClass */
  override def hasMessages(): js.Any = js.native
  /* CompleteClass */
  override def hasRefinementCategory(refinementName: String): Boolean = js.native
  /* CompleteClass */
  override def hasRefinementFilter(filterName: String, filterToken: String): Boolean = js.native
  /** Returns true if selected refinement controls collection contains a control with the specified propertyName */
  /* CompleteClass */
  override def hasRefiner(refinerName: String): Boolean = js.native
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
  override def processQueryIssuing(queryState: js.Any): Unit = js.native
  /* CompleteClass */
  override def processRenderingErrorMessages(ctx: js.Any): js.Any = js.native
  /* CompleteClass */
  override def processResultReady(resultTableCollection: js.Any): Unit = js.native
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
  /* CompleteClass */
  override def raiseOneTimeResultRenderedEvent(arg: js.Any): Unit = js.native
  /**
    * Raises the propertyChanged event for the specified property.
    * @param propertyName
    *               The name of the property that changed.
    */
  /* CompleteClass */
  override def raisePropertyChanged(propertyName: String): Unit = js.native
  /* CompleteClass */
  override def raiseQueryReadyEvent(arg: js.Any): Unit = js.native
  /* CompleteClass */
  override def raiseResultRenderedEvent(arg: js.Any): Unit = js.native
  /* CompleteClass */
  override def refresh(queryState: js.Any): Unit = js.native
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
  override def removeRefinementCategory(rcs: js.Any, filterName: String): Unit = js.native
  /* CompleteClass */
  override def removeRefinementFilter(filterName: String, filterToken: String): Unit = js.native
  /* CompleteClass */
  override def removeRefinementFiltersJSON(refinersJSON: String): Unit = js.native
  /**
    * Raised when the dispose method is called for a component.
    */
  /* CompleteClass */
  override def remove_disposing(handler: js.Function): Unit = js.native
  /* CompleteClass */
  override def remove_oneTimeResultRendered(value: js.Any): Unit = js.native
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  /* CompleteClass */
  override def remove_propertyChanged(handler: js.Function): Unit = js.native
  /* CompleteClass */
  override def remove_queryReady(value: js.Any): Unit = js.native
  /* CompleteClass */
  override def remove_resultRendered(value: js.Any): Unit = js.native
  /* CompleteClass */
  override def render(): Unit = js.native
  /* CompleteClass */
  override def renderControl(listData: js.Any, dataProvider: js.Any): Unit = js.native
  /* CompleteClass */
  override def replaceRefinementFilter(oldRefinementFilter: js.Any, newRefinementFilter: js.Any): Unit = js.native
  /* CompleteClass */
  override def scriptApplication_Load(sender: js.Any, e: js.Any): Unit = js.native
  /* CompleteClass */
  override def scriptApplication_PostLoad(sender: js.Any, e: js.Any): Unit = js.native
  /* CompleteClass */
  override def scriptApplication_PreLoad(sender: js.Any, e: js.Any): Unit = js.native
  /* CompleteClass */
  override def serverTemplateScriptsCallback(): Unit = js.native
  /** show/hide the DOM element associated with control */
  /* CompleteClass */
  override def setControlElementVisibility(showElement: Boolean): js.Any = js.native
  /* CompleteClass */
  override def set_alternateErrorMessage(value: String): String = js.native
  /* CompleteClass */
  override def set_currentResultTableCollection(value: js.Any): js.Any = js.native
  /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  /* CompleteClass */
  override def set_delayLoadTemplateScripts(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_emptyMessage(value: String): String = js.native
  /* CompleteClass */
  override def set_emptyRefinementMessageId(value: String): String = js.native
  /**
    * Sets the ID of the current Component object.
    * @param value A string that contains the ID of the component.
    */
  /* CompleteClass */
  override def set_id(value: String): Unit = js.native
  /* CompleteClass */
  override def set_messages(value: js.Array[_]): js.Array[_] = js.native
  /* CompleteClass */
  override def set_queryGroupName(value: String): String = js.native
  /* CompleteClass */
  override def set_renderTemplateId(value: String): String = js.native
  /* CompleteClass */
  override def set_renderedResult(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_selectedRefinementControls(value: js.Array[typings.sharepoint.Srch.RefinementControl]): js.Array[typings.sharepoint.Srch.RefinementControl] = js.native
  /* CompleteClass */
  override def set_shouldShowNoResultMessage(value: Boolean): Boolean = js.native
  /** False by default. */
  /* CompleteClass */
  override def set_showDataErrors(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_states(value: js.Any): js.Any = js.native
  /* CompleteClass */
  override def set_useManagedNavigationRefiners(value: Boolean): Boolean = js.native
  /**
    * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
    * @param className
    *          A string that contains the name of the CSS class to toggle.
    */
  /* CompleteClass */
  override def toggleCssClass(className: String): Unit = js.native
  /* CompleteClass */
  override def updateDisplayControlWithNewMessages(): js.Any = js.native
  /** Replaces the refinement controls */
  /* CompleteClass */
  override def updateRefinementControls(newControls: js.Array[typings.sharepoint.Srch.RefinementControl]): Unit = js.native
  /* CompleteClass */
  override def updateRefinementFilters(
    filterName: String,
    filterTokens: js.Array[String],
    op: String,
    useKQL: Boolean,
    tokenToDisplayValueMap: js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def updateRefiners(refiners: js.Array[_], op: String, useKQL: Boolean, tokenToDisplayValueMap: js.Any): Unit = js.native
  /* CompleteClass */
  override def updateRefinersJSON(refinersJSON: String): Unit = js.native
  /**
    * Called by the endUpdate method as a placeholder for additional logic in derived classes.
    * Override the updated method in a derived class to add custom post-update logic.
    */
  /* CompleteClass */
  override def updated(): Unit = js.native
}

/* static members */
@JSGlobal("Srch.Refinement")
@js.native
object Refinement extends js.Object {
  def createRefinementTextbox(name: String): Element = js.native
  def ensureUserSpecifiedRefinerValueHasWhiteSpaceQuotes(inputText: String): String = js.native
  /** Gets expanded state of the specified filter from cookie */
  def getExpanded(filterName: String): String = js.native
  def getRefinementLocalizedTitle(propertyName: String): String = js.native
  def getRefinementTitle(currentRefinemntControl: typings.sharepoint.Srch.RefinementControl): String = js.native
  def multiRefinerSpecifyOtherFilterValue(
    refinerName: String,
    clientControl: typings.sharepoint.Srch.Refinement,
    useContains: Boolean,
    useKQL: Boolean
  ): Unit = js.native
  /** Save expanded state of the specified filter to cookie */
  def setExpanded(filterName: String, value: String): Unit = js.native
  def submitMultiRefinement(name: String, control: typings.sharepoint.Srch.Refinement, useContains: Boolean, useKQL: Boolean): Unit = js.native
}

