package typings.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTableCollection
import typings.sharepoint.SP.ClientRuntimeContext
import typings.sharepoint.Srch.CSRRefinementControl
import typings.sharepoint.Srch.RefinementInfo
import typings.sharepoint.Srch.RenderFunction
import typings.sharepoint.sharepointStrings.Body
import typings.sharepoint.sharepointStrings.Group
import typings.sharepoint.sharepointStrings.IsFirstPinnedResultBlock
import typings.sharepoint.sharepointStrings.IsFirstRankedResultBlock
import typings.sharepoint.sharepointStrings.Item
import typings.sharepoint.sharepointStrings.ParentTableReference
import typings.sharepoint.sharepointStrings.Properties
import typings.sharepoint.sharepointStrings.QueryErrors
import typings.sharepoint.sharepointStrings.QueryId
import typings.sharepoint.sharepointStrings.QueryRuleId
import typings.sharepoint.sharepointStrings.RenderTemplateId
import typings.sharepoint.sharepointStrings.RenderTemplates
import typings.sharepoint.sharepointStrings.ResultRows
import typings.sharepoint.sharepointStrings.ResultTables
import typings.sharepoint.sharepointStrings.RowCount
import typings.sharepoint.sharepointStrings.TableType
import typings.sharepoint.sharepointStrings.TotalRows
import typings.sharepoint.sharepointStrings.TotalRowsIncludingDuplicates
import typings.sharepoint.sharepointStrings.View
import typings.sharepoint.sharepointStrings._deepLinks
import typings.sharepoint.sharepointStrings._discussions
import typings.sharepoint.sharepointStrings._group
import typings.sharepoint.sharepointStrings._groupContent
import typings.sharepoint.sharepointStrings._groupLink
import typings.sharepoint.sharepointStrings._groupTitle
import typings.sharepoint.sharepointStrings._hover
import typings.sharepoint.sharepointStrings._item
import typings.sharepoint.sharepointStrings._itemBody
import typings.sharepoint.sharepointStrings._itemIcon
import typings.sharepoint.sharepointStrings._itemPath
import typings.sharepoint.sharepointStrings._itemPreview
import typings.sharepoint.sharepointStrings._itemSummary
import typings.sharepoint.sharepointStrings._itemTitle
import typings.sharepoint.sharepointStrings._itemTitleLink
import typings.sharepoint.sharepointStrings._likes
import typings.sharepoint.sharepointStrings._members
import typings.sharepoint.sharepointStrings._postInfo
import typings.sharepoint.sharepointStrings._replies
import typings.sharepoint.sharepointStrings._visualBestBet
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ------- Srch namespace -------
object Srch {
  
  @JSGlobal("Srch.ClientControl")
  @js.native
  open class ClientControl protected ()
    extends StObject
       with typings.sharepoint.Srch.ClientControl {
    def this(elem: Element) = this()
    
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
    var alternateRenderContext: Any = js.native
    
    /* CompleteClass */
    var alternateRenderer: Any = js.native
    
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def clickHandler(e: Event): Any = js.native
    
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
    override def get_alternateErrorMessage(): String = js.native
    
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
    override def get_events(): Any = js.native
    
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
    override def get_messages(): js.Array[Any] = js.native
    
    /** returns next unique identifier for nested controls */
    /* CompleteClass */
    override def get_nextUniqueId(): String = js.native
    
    /** Gets the id of View display template that is used to render this control.
      * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
      */
    /* CompleteClass */
    override def get_renderTemplateId(): String = js.native
    
    /* CompleteClass */
    override def get_showDataErrors(): Boolean = js.native
    
    /* CompleteClass */
    override def get_states(): Any = js.native
    
    /* CompleteClass */
    override def hasMessages(): Any = js.native
    
    /**
      * Initializes the current Component object.
      * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def invokeAlternateRender(callback: Any, container: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def invokeClientRenderer(node: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def loadRenderTemplateScripts(scriptReferences: Any, success: Any, failure: Any, timeout: Any, loadStandAloneCustomScripts: Any): Boolean = js.native
    
    /* CompleteClass */
    override def loadServerTemplateScripts(): Unit = js.native
    
    /* CompleteClass */
    var loaded: Boolean = js.native
    
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
    override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
    
    /* CompleteClass */
    override def processDataErrorMessages(dataErrorsList: Any): Any = js.native
    
    /* CompleteClass */
    override def processDataProviderErrors(dataProviderToProcess: Any): Unit = js.native
    
    /* CompleteClass */
    override def processRenderingErrorMessages(ctx: Any): Any = js.native
    
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
    override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
    
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    
    /**
      * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
      * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
      *
      * @param className
      *          A string that contains the name of the CSS class to remove.
      */
    /* CompleteClass */
    override def removeCssClass(className: String): Unit = js.native
    
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
    override def renderControl(listData: Any, dataProvider: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_Load(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PostLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PreLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def serverTemplateScriptsCallback(): Unit = js.native
    
    /* CompleteClass */
    var serverTemplateScriptsToLoad: js.Array[Any] = js.native
    
    /** show/hide the DOM element associated with control */
    /* CompleteClass */
    override def setControlElementVisibility(showElement: Boolean): Any = js.native
    
    /* CompleteClass */
    override def set_alternateErrorMessage(value: String): String = js.native
    
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
    override def set_messages(value: js.Array[Any]): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def set_renderTemplateId(value: String): String = js.native
    
    /** False by default. */
    /* CompleteClass */
    override def set_showDataErrors(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_states(value: Any): Any = js.native
    
    /**
      * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
      * @param className
      *          A string that contains the name of the CSS class to toggle.
      */
    /* CompleteClass */
    override def toggleCssClass(className: String): Unit = js.native
    
    /* CompleteClass */
    override def updateDisplayControlWithNewMessages(): Any = js.native
    
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
  }
  object ClientControl {
    
    @JSGlobal("Srch.ClientControl")
    @js.native
    val ^ : js.Any = js.native
    
    /** toggles visibility of children controls of the messageContainer */
    /* static member */
    inline def toggleMessageDetails(messageContainer: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMessageDetails")(messageContainer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Srch.DataProvider")
  @js.native
  open class DataProvider protected ()
    extends StObject
       with typings.sharepoint.Srch.DataProvider {
    def this(elem: Element) = this()
    
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
    override def add_queryIssuing(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def add_queryStateChanged(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def add_resultReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    var alternateRenderContext: Any = js.native
    
    /* CompleteClass */
    var alternateRenderer: Any = js.native
    
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def clickHandler(e: Event): Any = js.native
    
    /* CompleteClass */
    override def displayControlMessages(): Unit = js.native
    
    /* CompleteClass */
    override def displayControl_QueryReady(sender: Any, e: Any): Unit = js.native
    
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
    override def getSortName(): String = js.native
    
    /* CompleteClass */
    override def getSortRankName(): String = js.native
    
    /* CompleteClass */
    override def get_active(): Boolean = js.native
    
    /* CompleteClass */
    override def get_alternateErrorMessage(): String = js.native
    
    /* CompleteClass */
    override def get_availableSorts(): Any = js.native
    
    /* CompleteClass */
    override def get_batched(): Boolean = js.native
    
    /* CompleteClass */
    override def get_bypassResultTypes(): Boolean = js.native
    
    /* CompleteClass */
    override def get_clientType(): String = js.native
    
    /* CompleteClass */
    override def get_collapseSpecification(): String = js.native
    
    /* CompleteClass */
    override def get_contextualScopeUrl(): String = js.native
    
    /* CompleteClass */
    override def get_currentQueryState(): Any = js.native
    
    /** Returns true if control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
    /* CompleteClass */
    override def get_delayLoadTemplateScripts(): Boolean = js.native
    
    /* CompleteClass */
    override def get_desiredSnippetLength(): Double = js.native
    
    /* CompleteClass */
    override def get_effectiveQueryLanguage(): Any = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
      * @return The DOM element that the current Control object is associated with.
      */
    /* CompleteClass */
    override def get_element(): HTMLElement = js.native
    
    /* CompleteClass */
    override def get_enableInterleaving(): Boolean = js.native
    
    /* CompleteClass */
    override def get_enableNicknames(): Boolean = js.native
    
    /* CompleteClass */
    override def get_enableOrderingHitHighlightedProperty(): Boolean = js.native
    
    /* CompleteClass */
    override def get_enablePhonetic(): Boolean = js.native
    
    /* CompleteClass */
    override def get_enableQueryRules(): Boolean = js.native
    
    /* CompleteClass */
    override def get_enableStemming(): Boolean = js.native
    
    /* CompleteClass */
    override def get_entityInfo(): Any = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
      * This member supports the client-script infrastructure and is not intended to be used directly from your code.
      * @return
      *      An EventHandlerList object that contains references to all the events and handlers for this component.
      */
    /* CompleteClass */
    override def get_events(): Any = js.native
    
    /* CompleteClass */
    override def get_fallbackLanguage(): Any = js.native
    
    /* CompleteClass */
    override def get_fallbackRankingModelID(): String = js.native
    
    /* CompleteClass */
    override def get_fallbackRefinementFilters(): Any = js.native
    
    /* CompleteClass */
    override def get_fallbackSort(): Any = js.native
    
    /* CompleteClass */
    override def get_hitHighlightedMultivaluePropertyLimit(): Double = js.native
    
    /* CompleteClass */
    override def get_hitHighlightedProperties(): Any = js.native
    
    /**
      * Gets the ID of the current Component object.
      * @return
      *       The id
      */
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_initialQueryState(): Any = js.native
    
    /* CompleteClass */
    override def get_initialResult(): String = js.native
    
    /* CompleteClass */
    override def get_initialResultObject(): Any = js.native
    
    /* CompleteClass */
    override def get_initialResultRef(): Any = js.native
    
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
    override def get_maxPagesAfterCurrent(): Double = js.native
    
    /* CompleteClass */
    override def get_messages(): js.Array[Any] = js.native
    
    /** returns next unique identifier for nested controls */
    /* CompleteClass */
    override def get_nextUniqueId(): String = js.native
    
    /* CompleteClass */
    override def get_parentImpressionID(): Any = js.native
    
    /* CompleteClass */
    override def get_personalizedQuery(): Boolean = js.native
    
    /* CompleteClass */
    override def get_processBestBets(): Boolean = js.native
    
    /* CompleteClass */
    override def get_processPersonalFavorites(): Boolean = js.native
    
    /* CompleteClass */
    override def get_properties(): Any = js.native
    
    /* CompleteClass */
    override def get_queryCount(): Double = js.native
    
    /* CompleteClass */
    override def get_queryGroupName(): String = js.native
    
    /* CompleteClass */
    override def get_queryPropertiesTemplateUrl(): String = js.native
    
    /* CompleteClass */
    override def get_queryTemplate(): Any = js.native
    
    /* CompleteClass */
    override def get_rankRules(): Any = js.native
    
    /* CompleteClass */
    override def get_refinementInfo(): StringDictionary[js.Array[RefinementInfo]] = js.native
    
    /** Gets the id of View display template that is used to render this control.
      * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
      */
    /* CompleteClass */
    override def get_renderTemplateId(): String = js.native
    
    /** Number of results displayed per page. 10 by default */
    /* CompleteClass */
    override def get_resultsPerPage(): Double = js.native
    
    /* CompleteClass */
    override def get_resultsUrl(): Any = js.native
    
    /* CompleteClass */
    override def get_rowCount(): Double = js.native
    
    /* CompleteClass */
    override def get_selectedProperties(): Any = js.native
    
    /* CompleteClass */
    override def get_selectedRefiners(): Any = js.native
    
    /* CompleteClass */
    override def get_showDataErrors(): Boolean = js.native
    
    /* CompleteClass */
    override def get_sourceID(): String = js.native
    
    /* CompleteClass */
    override def get_sourceLevel(): String = js.native
    
    /* CompleteClass */
    override def get_sourceName(): String = js.native
    
    /* CompleteClass */
    override def get_states(): Any = js.native
    
    /* CompleteClass */
    override def get_summaryLength(): Double = js.native
    
    /* CompleteClass */
    override def get_totalRows(): Double = js.native
    
    /* CompleteClass */
    override def get_trimDuplicates(): Boolean = js.native
    
    /* CompleteClass */
    override def get_upScopeUrl(): Any = js.native
    
    /* CompleteClass */
    override def get_updateAjaxNavigate(): Boolean = js.native
    
    /* CompleteClass */
    override def get_userAction(): Any = js.native
    
    /* CompleteClass */
    override def hasMessages(): Any = js.native
    
    /**
      * Initializes the current Component object.
      * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def invokeAlternateRender(callback: Any, container: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def invokeClientRenderer(node: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def issueQuery(): Unit = js.native
    
    /* CompleteClass */
    override def loadRenderTemplateScripts(scriptReferences: Any, success: Any, failure: Any, timeout: Any, loadStandAloneCustomScripts: Any): Boolean = js.native
    
    /* CompleteClass */
    override def loadServerTemplateScripts(): Unit = js.native
    
    /* CompleteClass */
    var loaded: Boolean = js.native
    
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
    override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
    
    /* CompleteClass */
    override def processDataErrorMessages(dataErrorsList: Any): Any = js.native
    
    /* CompleteClass */
    override def processDataProviderErrors(dataProviderToProcess: Any): Unit = js.native
    
    /* CompleteClass */
    override def processInitial(): Unit = js.native
    
    /* CompleteClass */
    override def processRenderingErrorMessages(ctx: Any): Any = js.native
    
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
    override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseEmptyResultReadyEvent(): Unit = js.native
    
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    
    /* CompleteClass */
    override def raiseQueryIssuingEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseQueryStateChangedEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseResultReadyEvent(arg: Any): Unit = js.native
    
    /**
      * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
      * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
      *
      * @param className
      *          A string that contains the name of the CSS class to remove.
      */
    /* CompleteClass */
    override def removeCssClass(className: String): Unit = js.native
    
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
    override def remove_queryIssuing(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def remove_resultReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def renderControl(listData: Any, dataProvider: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_Load(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PostLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PreLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def searchBox_BatchQueryIssuing(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def searchBox_BatchResultReady(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def searchBox_QueryReady(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def serverTemplateScriptsCallback(): Unit = js.native
    
    /* CompleteClass */
    var serverTemplateScriptsToLoad: js.Array[Any] = js.native
    
    /** show/hide the DOM element associated with control */
    /* CompleteClass */
    override def setControlElementVisibility(showElement: Boolean): Any = js.native
    
    /* CompleteClass */
    override def set_active(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_alternateErrorMessage(value: String): String = js.native
    
    /* CompleteClass */
    override def set_availableSorts(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_batched(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_bypassResultTypes(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_clientType(value: String): String = js.native
    
    /* CompleteClass */
    override def set_collapseSpecification(value: String): String = js.native
    
    /* CompleteClass */
    override def set_contextualScopeUrl(value: String): String = js.native
    
    /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
    /* CompleteClass */
    override def set_delayLoadTemplateScripts(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_desiredSnippetLength(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_enableInterleaving(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_enableNicknames(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_enableOrderingHitHighlightedProperty(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_enablePhonetic(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_enableQueryRules(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_enableStemming(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_fallbackLanguage(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_fallbackRankingModelID(value: String): String = js.native
    
    /* CompleteClass */
    override def set_fallbackRefinementFilters(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_fallbackSort(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_hitHighlightedMultivaluePropertyLimit(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_hitHighlightedProperties(value: Any): Any = js.native
    
    /**
      * Sets the ID of the current Component object.
      * @param value A string that contains the ID of the component.
      */
    /* CompleteClass */
    override def set_id(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_initialQueryState(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_initialResult(value: String): String = js.native
    
    /* CompleteClass */
    override def set_initialResultRef(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_maxPagesAfterCurrent(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_messages(value: js.Array[Any]): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def set_parentImpressionID(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_personalizedQuery(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_processBestBets(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_processPersonalFavorites(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_properties(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_queryCount(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_queryGroupName(value: String): String = js.native
    
    /* CompleteClass */
    override def set_queryPropertiesTemplateUrl(value: String): String = js.native
    
    /* CompleteClass */
    override def set_queryTemplate(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_rankRules(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_renderTemplateId(value: String): String = js.native
    
    /** Number of results displayed per page. 10 by default */
    /* CompleteClass */
    override def set_resultsPerPage(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_resultsUrl(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_rowCount(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_selectedProperties(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_selectedRefiners(value: Any): Any = js.native
    
    /** False by default. */
    /* CompleteClass */
    override def set_showDataErrors(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_sourceID(value: String): String = js.native
    
    /* CompleteClass */
    override def set_sourceLevel(value: String): String = js.native
    
    /* CompleteClass */
    override def set_sourceName(value: String): String = js.native
    
    /* CompleteClass */
    override def set_states(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_summaryLength(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_totalRows(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_trimDuplicates(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_updateAjaxNavigate(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_userAction(value: Any): Any = js.native
    
    /**
      * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
      * @param className
      *          A string that contains the name of the CSS class to toggle.
      */
    /* CompleteClass */
    override def toggleCssClass(className: String): Unit = js.native
    
    /* CompleteClass */
    override def updateDisplayControlWithNewMessages(): Any = js.native
    
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
  }
  
  @JSGlobal("Srch.DateTimeKind")
  @js.native
  object DateTimeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.Srch.DateTimeKind & Double] = js.native
    
    /* 2 */ val local: typings.sharepoint.Srch.DateTimeKind.local & Double = js.native
    
    /* 0 */ val unspecified: typings.sharepoint.Srch.DateTimeKind.unspecified & Double = js.native
    
    /* 1 */ val utc: typings.sharepoint.Srch.DateTimeKind.utc & Double = js.native
  }
  
  @JSGlobal("Srch.DisplayControl")
  @js.native
  open class DisplayControl ()
    extends StObject
       with typings.sharepoint.Srch.DisplayControl {
    
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
    
    //#endregion
    //#region Events
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def add_disposing(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def add_oneTimeResultRendered(value: Any): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def add_propertyChanged(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def add_queryReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def add_resultRendered(value: Any): Unit = js.native
    
    /* CompleteClass */
    var alternateRenderContext: Any = js.native
    
    /* CompleteClass */
    var alternateRenderer: Any = js.native
    
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def clickHandler(e: Event): Any = js.native
    
    /* CompleteClass */
    override def dataProvider_QueryIssuing(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def dataProvider_ResultReady(sender: Any, e: Any): Unit = js.native
    
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
    override def get_alternateErrorMessage(): String = js.native
    
    /* CompleteClass */
    override def get_currentResultTableCollection(): Any = js.native
    
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
    
    //#endregion
    //#region Properties
    /**
      * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
      * This member supports the client-script infrastructure and is not intended to be used directly from your code.
      * @return
      *      An EventHandlerList object that contains references to all the events and handlers for this component.
      */
    /* CompleteClass */
    override def get_events(): Any = js.native
    
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
    override def get_messages(): js.Array[Any] = js.native
    
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
    override def get_shouldShowNoResultMessage(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showDataErrors(): Boolean = js.native
    
    /* CompleteClass */
    override def get_states(): Any = js.native
    
    /* CompleteClass */
    override def hasMessages(): Any = js.native
    
    /**
      * Initializes the current Component object.
      * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def invokeAlternateRender(callback: Any, container: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def invokeClientRenderer(node: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def loadRenderTemplateScripts(scriptReferences: Any, success: Any, failure: Any, timeout: Any, loadStandAloneCustomScripts: Any): Boolean = js.native
    
    /* CompleteClass */
    override def loadServerTemplateScripts(): Unit = js.native
    
    /* CompleteClass */
    var loaded: Boolean = js.native
    
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
    override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
    
    /* CompleteClass */
    override def processDataErrorMessages(dataErrorsList: Any): Any = js.native
    
    /* CompleteClass */
    override def processDataProviderErrors(dataProviderToProcess: Any): Unit = js.native
    
    /* CompleteClass */
    override def processQueryIssuing(queryState: Any): Unit = js.native
    
    /* CompleteClass */
    override def processRenderingErrorMessages(ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def processResultReady(resultTableCollection: Any): Unit = js.native
    
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
    override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseOneTimeResultRenderedEvent(arg: Any): Unit = js.native
    
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    
    /* CompleteClass */
    override def raiseQueryReadyEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseResultRenderedEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def refresh(queryState: Any): Unit = js.native
    
    /**
      * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
      * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
      *
      * @param className
      *          A string that contains the name of the CSS class to remove.
      */
    /* CompleteClass */
    override def removeCssClass(className: String): Unit = js.native
    
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def remove_disposing(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def remove_oneTimeResultRendered(value: Any): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def remove_propertyChanged(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def remove_queryReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def remove_resultRendered(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def render(): Unit = js.native
    
    /* CompleteClass */
    override def renderControl(listData: Any, dataProvider: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_Load(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PostLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PreLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def serverTemplateScriptsCallback(): Unit = js.native
    
    /* CompleteClass */
    var serverTemplateScriptsToLoad: js.Array[Any] = js.native
    
    /** show/hide the DOM element associated with control */
    /* CompleteClass */
    override def setControlElementVisibility(showElement: Boolean): Any = js.native
    
    /* CompleteClass */
    override def set_alternateErrorMessage(value: String): String = js.native
    
    /* CompleteClass */
    override def set_currentResultTableCollection(value: Any): Any = js.native
    
    /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
    /* CompleteClass */
    override def set_delayLoadTemplateScripts(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_emptyMessage(value: String): String = js.native
    
    /**
      * Sets the ID of the current Component object.
      * @param value A string that contains the ID of the component.
      */
    /* CompleteClass */
    override def set_id(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_messages(value: js.Array[Any]): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def set_queryGroupName(value: String): String = js.native
    
    /* CompleteClass */
    override def set_renderTemplateId(value: String): String = js.native
    
    /* CompleteClass */
    override def set_renderedResult(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_shouldShowNoResultMessage(value: Boolean): Boolean = js.native
    
    /** False by default. */
    /* CompleteClass */
    override def set_showDataErrors(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_states(value: Any): Any = js.native
    
    /**
      * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
      * @param className
      *          A string that contains the name of the CSS class to toggle.
      */
    /* CompleteClass */
    override def toggleCssClass(className: String): Unit = js.native
    
    /* CompleteClass */
    override def updateDisplayControlWithNewMessages(): Any = js.native
    
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
  }
  
  @JSGlobal("Srch.EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.Srch.EventType & Double] = js.native
    
    /* 3 */ val batchQueryIssuing: typings.sharepoint.Srch.EventType.batchQueryIssuing & Double = js.native
    
    /* 5 */ val batchResultReady: typings.sharepoint.Srch.EventType.batchResultReady & Double = js.native
    
    /* 9 */ val load: typings.sharepoint.Srch.EventType.load & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.Srch.EventType.none & Double = js.native
    
    /* 10 */ val postLoad: typings.sharepoint.Srch.EventType.postLoad & Double = js.native
    
    /* 8 */ val preLoad: typings.sharepoint.Srch.EventType.preLoad & Double = js.native
    
    /* 2 */ val queryIssuing: typings.sharepoint.Srch.EventType.queryIssuing & Double = js.native
    
    /* 1 */ val queryReady: typings.sharepoint.Srch.EventType.queryReady & Double = js.native
    
    /* 6 */ val queryStateChanged: typings.sharepoint.Srch.EventType.queryStateChanged & Double = js.native
    
    /* 4 */ val resultReady: typings.sharepoint.Srch.EventType.resultReady & Double = js.native
    
    /* 7 */ val resultRendered: typings.sharepoint.Srch.EventType.resultRendered & Double = js.native
  }
  
  @JSGlobal("Srch.MessageLevel")
  @js.native
  object MessageLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.Srch.MessageLevel & Double] = js.native
    
    /* 2 */ val error: typings.sharepoint.Srch.MessageLevel.error & Double = js.native
    
    /* 0 */ val information: typings.sharepoint.Srch.MessageLevel.information & Double = js.native
    
    /* 1 */ val warning: typings.sharepoint.Srch.MessageLevel.warning & Double = js.native
  }
  
  @JSGlobal("Srch.Refinement")
  @js.native
  open class Refinement protected ()
    extends StObject
       with typings.sharepoint.Srch.Refinement {
    def this(elem: Element) = this()
    
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
    override def addRefinementFilter(filterName: String, filterToken: Any): Unit = js.native
    
    /* CompleteClass */
    override def addRefinementFilters(refiners: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    override def addRefinementFiltersJSON(refinersJSON: String): Unit = js.native
    
    /* CompleteClass */
    override def addRefinementFiltersJSONWithOr(refinersJSON: String): Unit = js.native
    
    /* CompleteClass */
    override def addRefinementFiltersWithOp(refiners: js.Array[Any], op: String): Unit = js.native
    
    //#endregion
    //#region Events
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def add_disposing(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def add_oneTimeResultRendered(value: Any): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def add_propertyChanged(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def add_queryReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def add_resultRendered(value: Any): Unit = js.native
    
    /* CompleteClass */
    var alternateRenderContext: Any = js.native
    
    /* CompleteClass */
    var alternateRenderer: Any = js.native
    
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def clickHandler(e: Event): Any = js.native
    
    /* CompleteClass */
    override def dataProvider_QueryIssuing(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def dataProvider_ResultReady(sender: Any, e: Any): Unit = js.native
    
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
    override def getCurrentRefinementCategory(refinementName: String): Any = js.native
    
    /** Gets refinement control with the specified propertyName */
    /* CompleteClass */
    override def getRefinementControl(refinerName: String): typings.sharepoint.Srch.RefinementControl = js.native
    
    /* CompleteClass */
    override def get_alternateErrorMessage(): String = js.native
    
    /* CompleteClass */
    override def get_currentResultTableCollection(): Any = js.native
    
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
    override def get_events(): Any = js.native
    
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
    override def get_messages(): js.Array[Any] = js.native
    
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
    override def get_states(): Any = js.native
    
    /* CompleteClass */
    override def get_useManagedNavigationRefiners(): Boolean = js.native
    
    /* CompleteClass */
    override def hasAllRefinementFilters(filterName: String, filterTokens: js.Array[String]): Boolean = js.native
    
    /* CompleteClass */
    override def hasMessages(): Any = js.native
    
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
    override def invokeAlternateRender(callback: Any, container: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def invokeClientRenderer(node: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def loadRenderTemplateScripts(scriptReferences: Any, success: Any, failure: Any, timeout: Any, loadStandAloneCustomScripts: Any): Boolean = js.native
    
    /* CompleteClass */
    override def loadServerTemplateScripts(): Unit = js.native
    
    /* CompleteClass */
    var loaded: Boolean = js.native
    
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
    override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
    
    /* CompleteClass */
    override def processDataErrorMessages(dataErrorsList: Any): Any = js.native
    
    /* CompleteClass */
    override def processDataProviderErrors(dataProviderToProcess: Any): Unit = js.native
    
    /* CompleteClass */
    override def processQueryIssuing(queryState: Any): Unit = js.native
    
    /* CompleteClass */
    override def processRenderingErrorMessages(ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def processResultReady(resultTableCollection: Any): Unit = js.native
    
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
    override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseOneTimeResultRenderedEvent(arg: Any): Unit = js.native
    
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    
    /* CompleteClass */
    override def raiseQueryReadyEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseResultRenderedEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def refresh(queryState: Any): Unit = js.native
    
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
    override def removeRefinementCategory(rcs: Any, filterName: String): Unit = js.native
    
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
    override def remove_oneTimeResultRendered(value: Any): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def remove_propertyChanged(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def remove_queryReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def remove_resultRendered(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def render(): Unit = js.native
    
    /* CompleteClass */
    override def renderControl(listData: Any, dataProvider: Any): Unit = js.native
    
    /* CompleteClass */
    override def replaceRefinementFilter(oldRefinementFilter: Any, newRefinementFilter: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_Load(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PostLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PreLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def serverTemplateScriptsCallback(): Unit = js.native
    
    /* CompleteClass */
    var serverTemplateScriptsToLoad: js.Array[Any] = js.native
    
    /** show/hide the DOM element associated with control */
    /* CompleteClass */
    override def setControlElementVisibility(showElement: Boolean): Any = js.native
    
    /* CompleteClass */
    override def set_alternateErrorMessage(value: String): String = js.native
    
    /* CompleteClass */
    override def set_currentResultTableCollection(value: Any): Any = js.native
    
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
    override def set_messages(value: js.Array[Any]): js.Array[Any] = js.native
    
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
    override def set_states(value: Any): Any = js.native
    
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
    override def updateDisplayControlWithNewMessages(): Any = js.native
    
    /** Replaces the refinement controls */
    /* CompleteClass */
    override def updateRefinementControls(newControls: js.Array[typings.sharepoint.Srch.RefinementControl]): Unit = js.native
    
    /* CompleteClass */
    override def updateRefinementFilters(
      filterName: String,
      filterTokens: js.Array[String],
      op: String,
      useKQL: Boolean,
      tokenToDisplayValueMap: Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def updateRefiners(refiners: js.Array[Any], op: String, useKQL: Boolean, tokenToDisplayValueMap: Any): Unit = js.native
    
    /* CompleteClass */
    override def updateRefinersJSON(refinersJSON: String): Unit = js.native
    
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
  }
  object Refinement {
    
    @JSGlobal("Srch.Refinement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createRefinementTextbox(name: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createRefinementTextbox")(name.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /* static member */
    inline def ensureUserSpecifiedRefinerValueHasWhiteSpaceQuotes(inputText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureUserSpecifiedRefinerValueHasWhiteSpaceQuotes")(inputText.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Gets expanded state of the specified filter from cookie */
    /* static member */
    inline def getExpanded(filterName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpanded")(filterName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def getRefinementLocalizedTitle(propertyName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefinementLocalizedTitle")(propertyName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def getRefinementTitle(currentRefinemntControl: typings.sharepoint.Srch.RefinementControl): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefinementTitle")(currentRefinemntControl.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def multiRefinerSpecifyOtherFilterValue(
      refinerName: String,
      clientControl: typings.sharepoint.Srch.Refinement,
      useContains: Boolean,
      useKQL: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("multiRefinerSpecifyOtherFilterValue")(refinerName.asInstanceOf[js.Any], clientControl.asInstanceOf[js.Any], useContains.asInstanceOf[js.Any], useKQL.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Save expanded state of the specified filter to cookie */
    /* static member */
    inline def setExpanded(filterName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExpanded")(filterName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def submitMultiRefinement(name: String, control: typings.sharepoint.Srch.Refinement, useContains: Boolean, useKQL: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("submitMultiRefinement")(name.asInstanceOf[js.Any], control.asInstanceOf[js.Any], useContains.asInstanceOf[js.Any], useKQL.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Srch.RefinementControl")
  @js.native
  open class RefinementControl protected ()
    extends StObject
       with typings.sharepoint.Srch.RefinementControl {
    def this(propertyName: String, spec: String, renderTemplateId: String) = this()
    
    /* CompleteClass */
    var alternateRenderContext: Any = js.native
    
    /* CompleteClass */
    var alternateRenderer: Any = js.native
    
    /* CompleteClass */
    var containerId: String = js.native
    
    /* CompleteClass */
    var countDisplay: String = js.native
    
    /* CompleteClass */
    var deepHits: Double = js.native
    
    /* CompleteClass */
    var overrideDisplayName: String = js.native
    
    /* CompleteClass */
    var propertyName: String = js.native
    
    /* CompleteClass */
    var renderTemplateId: String = js.native
    
    /* CompleteClass */
    var spec: String = js.native
    
    /* CompleteClass */
    var useDefaultDateIntervals: Boolean = js.native
  }
  
  @JSGlobal("Srch.RefinementUtil")
  @js.native
  open class RefinementUtil ()
    extends StObject
       with typings.sharepoint.Srch.RefinementUtil
  object RefinementUtil {
    
    @JSGlobal("Srch.RefinementUtil")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def peoplePickerApplyIdPrefix(control: typings.sharepoint.Srch.ClientControl): String = ^.asInstanceOf[js.Dynamic].applyDynamic("peoplePickerApplyIdPrefix")(control.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def peoplePickerApplyIdPrefix(control: typings.sharepoint.Srch.RefinementControl): String = ^.asInstanceOf[js.Dynamic].applyDynamic("peoplePickerApplyIdPrefix")(control.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def peoplePickerPrep(
      id: String,
      refiner: typings.sharepoint.Srch.RefinementControl,
      clientControl: typings.sharepoint.Srch.Refinement
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("peoplePickerPrep")(id.asInstanceOf[js.Any], refiner.asInstanceOf[js.Any], clientControl.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def stringValueToEqualsToken(x: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringValueToEqualsToken")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("Srch.Res")
  @js.native
  open class Res ()
    extends StObject
       with typings.sharepoint.Srch.Res
  object Res {
    
    @JSGlobal("Srch.Res")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.ar_Explanation")
    @js.native
    def arExplanation: String = js.native
    
    inline def arExplanation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_Explanation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_Follow")
    @js.native
    def arHtvFollow: String = js.native
    
    inline def arHtvFollow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_Follow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_IsFollowed")
    @js.native
    def arHtvIsFollowed: String = js.native
    
    inline def arHtvIsFollowed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_IsFollowed")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_IsNotFollowed")
    @js.native
    def arHtvIsNotFollowed: String = js.native
    
    inline def arHtvIsNotFollowed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_IsNotFollowed")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_StartFollowing")
    @js.native
    def arHtvStartFollowing: String = js.native
    
    inline def arHtvStartFollowing_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_StartFollowing")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_htv_StopFollowing")
    @js.native
    def arHtvStopFollowing: String = js.native
    
    inline def arHtvStopFollowing_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_htv_StopFollowing")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ar_rec_NoResults")
    @js.native
    def arRecNoResults: String = js.native
    
    inline def arRecNoResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ar_rec_NoResults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_CorrelationIdMessage")
    @js.native
    def ccErrCorrelationIdMessage: String = js.native
    
    inline def ccErrCorrelationIdMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_CorrelationIdMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_CustomLocStringWarningDisplayHeaderFormat")
    @js.native
    def ccErrCustomLocStringWarningDisplayHeaderFormat: String = js.native
    
    inline def ccErrCustomLocStringWarningDisplayHeaderFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_CustomLocStringWarningDisplayHeaderFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_DataErrorMessageDisplayHeader")
    @js.native
    def ccErrDataErrorMessageDisplayHeader: String = js.native
    
    inline def ccErrDataErrorMessageDisplayHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_DataErrorMessageDisplayHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_HiddenWithNoResultsWarningMessage")
    @js.native
    def ccErrHiddenWithNoResultsWarningMessage: String = js.native
    
    inline def ccErrHiddenWithNoResultsWarningMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_HiddenWithNoResultsWarningMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_HideMessageDetails")
    @js.native
    def ccErrHideMessageDetails: String = js.native
    
    inline def ccErrHideMessageDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_HideMessageDetails")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_MalformedHeader")
    @js.native
    def ccErrMalformedHeader: String = js.native
    
    inline def ccErrMalformedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_MalformedHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_NoCustomLoadedLocStringWarningDisplayHeaderFormat")
    @js.native
    def ccErrNoCustomLoadedLocStringWarningDisplayHeaderFormat: String = js.native
    
    inline def ccErrNoCustomLoadedLocStringWarningDisplayHeaderFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_NoCustomLoadedLocStringWarningDisplayHeaderFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_QueryThrottledDetailsHeader")
    @js.native
    def ccErrQueryThrottledDetailsHeader: String = js.native
    
    inline def ccErrQueryThrottledDetailsHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_QueryThrottledDetailsHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_RenderingErrorMessageDisplayHeader")
    @js.native
    def ccErrRenderingErrorMessageDisplayHeader: String = js.native
    
    inline def ccErrRenderingErrorMessageDisplayHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_RenderingErrorMessageDisplayHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_ShowMessageDetails")
    @js.native
    def ccErrShowMessageDetails: String = js.native
    
    inline def ccErrShowMessageDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_ShowMessageDetails")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_TemplateNotFoundMessage")
    @js.native
    def ccErrTemplateNotFoundMessage: String = js.native
    
    inline def ccErrTemplateNotFoundMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_TemplateNotFoundMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_err_WebPartErrorMessageDisplayHeader")
    @js.native
    def ccErrWebPartErrorMessageDisplayHeader: String = js.native
    
    inline def ccErrWebPartErrorMessageDisplayHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_err_WebPartErrorMessageDisplayHeader")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list")
    @js.native
    def ccStsList: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_announcements")
    @js.native
    def ccStsListAnnouncements: String = js.native
    
    inline def ccStsListAnnouncements_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_announcements")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_contacts")
    @js.native
    def ccStsListContacts: String = js.native
    
    inline def ccStsListContacts_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_contacts")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_discussionboard")
    @js.native
    def ccStsListDiscussionboard: String = js.native
    
    inline def ccStsListDiscussionboard_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_discussionboard")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_documentlibrary")
    @js.native
    def ccStsListDocumentlibrary: String = js.native
    
    inline def ccStsListDocumentlibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_documentlibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_events")
    @js.native
    def ccStsListEvents: String = js.native
    
    inline def ccStsListEvents_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_events")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_links")
    @js.native
    def ccStsListLinks: String = js.native
    
    inline def ccStsListLinks_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_links")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_picturelibrary")
    @js.native
    def ccStsListPicturelibrary: String = js.native
    
    inline def ccStsListPicturelibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_picturelibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_survey")
    @js.native
    def ccStsListSurvey: String = js.native
    
    inline def ccStsListSurvey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_survey")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_tasks")
    @js.native
    def ccStsListTasks: String = js.native
    
    inline def ccStsListTasks_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_tasks")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_list_xmlform")
    @js.native
    def ccStsListXmlform: String = js.native
    
    inline def ccStsListXmlform_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list_xmlform")(x.asInstanceOf[js.Any])
    
    inline def ccStsList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_list")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_listitem")
    @js.native
    def ccStsListitem: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_listitem_documentlibrary")
    @js.native
    def ccStsListitemDocumentlibrary: String = js.native
    
    inline def ccStsListitemDocumentlibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_listitem_documentlibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_listitem_picturelibrary")
    @js.native
    def ccStsListitemPicturelibrary: String = js.native
    
    inline def ccStsListitemPicturelibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_listitem_picturelibrary")(x.asInstanceOf[js.Any])
    
    inline def ccStsListitem_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_listitem")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_site")
    @js.native
    def ccStsSite: String = js.native
    
    inline def ccStsSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_site")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_sts_web")
    @js.native
    def ccStsWeb: String = js.native
    
    inline def ccStsWeb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_sts_web")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_BooleanNo")
    @js.native
    def ccValueRendererBooleanNo: String = js.native
    
    inline def ccValueRendererBooleanNo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_BooleanNo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_BooleanYes")
    @js.native
    def ccValueRendererBooleanYes: String = js.native
    
    inline def ccValueRendererBooleanYes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_BooleanYes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_FileSizeGigabyte")
    @js.native
    def ccValueRendererFileSizeGigabyte: String = js.native
    
    inline def ccValueRendererFileSizeGigabyte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_FileSizeGigabyte")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_FileSizeKilobyte")
    @js.native
    def ccValueRendererFileSizeKilobyte: String = js.native
    
    inline def ccValueRendererFileSizeKilobyte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_FileSizeKilobyte")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.cc_ValueRenderer_FileSizeMegabyte")
    @js.native
    def ccValueRendererFileSizeMegabyte: String = js.native
    
    inline def ccValueRendererFileSizeMegabyte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cc_ValueRenderer_FileSizeMegabyte")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_Content_NoResultsDisplayMode")
    @js.native
    def controlContentNoResultsDisplayMode: String = js.native
    
    inline def controlContentNoResultsDisplayMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_Content_NoResultsDisplayMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_Content_NoResultsEditMode")
    @js.native
    def controlContentNoResultsEditMode: String = js.native
    
    inline def controlContentNoResultsEditMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_Content_NoResultsEditMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Author")
    @js.native
    def controlEDiscAuthor: String = js.native
    
    inline def controlEDiscAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Author")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_DateModified")
    @js.native
    def controlEDiscDateModified: String = js.native
    
    inline def controlEDiscDateModified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_DateModified")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_DateSent")
    @js.native
    def controlEDiscDateSent: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_DateSentTooltip")
    @js.native
    def controlEDiscDateSentTooltip: String = js.native
    
    inline def controlEDiscDateSentTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_DateSentTooltip")(x.asInstanceOf[js.Any])
    
    inline def controlEDiscDateSent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_DateSent")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Recipients")
    @js.native
    def controlEDiscRecipients: String = js.native
    
    inline def controlEDiscRecipients_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Recipients")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Sender")
    @js.native
    def controlEDiscSender: String = js.native
    
    inline def controlEDiscSender_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Sender")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Subject")
    @js.native
    def controlEDiscSubject: String = js.native
    
    inline def controlEDiscSubject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Subject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_EDisc_Title")
    @js.native
    def controlEDiscTitle: String = js.native
    
    inline def controlEDiscTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_EDisc_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_NoResultsDisplayMode")
    @js.native
    def controlNoResultsDisplayMode: String = js.native
    
    inline def controlNoResultsDisplayMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_NoResultsDisplayMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_NoResultsEditMode")
    @js.native
    def controlNoResultsEditMode: String = js.native
    
    inline def controlNoResultsEditMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_NoResultsEditMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.control_RollupPage_NoResultsDisplayMode")
    @js.native
    def controlRollupPageNoResultsDisplayMode: String = js.native
    
    inline def controlRollupPageNoResultsDisplayMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("control_RollupPage_NoResultsDisplayMode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ct_Folder")
    @js.native
    def ctFolder: String = js.native
    
    inline def ctFolder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ct_Folder")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.ct_Image")
    @js.native
    def ctImage: String = js.native
    
    inline def ctImage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ct_Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.dp_ScriptLoadFailed")
    @js.native
    def dpScriptLoadFailed: String = js.native
    
    inline def dpScriptLoadFailed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dp_ScriptLoadFailed")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edisc_ControlPagingFormat")
    @js.native
    def ediscControlPagingFormat: String = js.native
    
    inline def ediscControlPagingFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edisc_ControlPagingFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edisc_MultiValueFormat")
    @js.native
    def ediscMultiValueFormat: String = js.native
    
    inline def ediscMultiValueFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edisc_MultiValueFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edisc_NoSubject")
    @js.native
    def ediscNoSubject: String = js.native
    
    inline def ediscNoSubject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edisc_NoSubject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentCategory")
    @js.native
    def eduAssignmentCategory: String = js.native
    
    inline def eduAssignmentCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentCategory")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormat")
    @js.native
    def eduAssignmentFormat: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatInClass")
    @js.native
    def eduAssignmentFormatInClass: String = js.native
    
    inline def eduAssignmentFormatInClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatInClass")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatNone")
    @js.native
    def eduAssignmentFormatNone: String = js.native
    
    inline def eduAssignmentFormatNone_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatNone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatOnlineFile")
    @js.native
    def eduAssignmentFormatOnlineFile: String = js.native
    
    inline def eduAssignmentFormatOnlineFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatOnlineFile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatOnlineQuiz")
    @js.native
    def eduAssignmentFormatOnlineQuiz: String = js.native
    
    inline def eduAssignmentFormatOnlineQuiz_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatOnlineQuiz")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentFormatUnknown")
    @js.native
    def eduAssignmentFormatUnknown: String = js.native
    
    inline def eduAssignmentFormatUnknown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormatUnknown")(x.asInstanceOf[js.Any])
    
    inline def eduAssignmentFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentLabel")
    @js.native
    def eduAssignmentLabel: String = js.native
    
    inline def eduAssignmentLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentLabel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_AssignmentMaxPoints")
    @js.native
    def eduAssignmentMaxPoints: String = js.native
    
    inline def eduAssignmentMaxPoints_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_AssignmentMaxPoints")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookAuthor")
    @js.native
    def eduBookAuthor: String = js.native
    
    inline def eduBookAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookCategory")
    @js.native
    def eduBookCategory: String = js.native
    
    inline def eduBookCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookCategory")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookHomePageLink")
    @js.native
    def eduBookHomePageLink: String = js.native
    
    inline def eduBookHomePageLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookHomePageLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookLabel")
    @js.native
    def eduBookLabel: String = js.native
    
    inline def eduBookLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookLabel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookReleaseDate")
    @js.native
    def eduBookReleaseDate: String = js.native
    
    inline def eduBookReleaseDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookReleaseDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_BookRights")
    @js.native
    def eduBookRights: String = js.native
    
    inline def eduBookRights_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_BookRights")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_Class")
    @js.native
    def eduClass: String = js.native
    
    inline def eduClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_Class")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_DueDate")
    @js.native
    def eduDueDate: String = js.native
    
    inline def eduDueDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_DueDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_EnableScriptPermission")
    @js.native
    def eduEnableScriptPermission: String = js.native
    
    inline def eduEnableScriptPermission_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_EnableScriptPermission")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_LessonLabel")
    @js.native
    def eduLessonLabel: String = js.native
    
    inline def eduLessonLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_LessonLabel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_PrintPermission")
    @js.native
    def eduPrintPermission: String = js.native
    
    inline def eduPrintPermission_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_PrintPermission")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_ReadPermission")
    @js.native
    def eduReadPermission: String = js.native
    
    inline def eduReadPermission_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_ReadPermission")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.edu_WritePermission")
    @js.native
    def eduWritePermission: String = js.native
    
    inline def eduWritePermission_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edu_WritePermission")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Access")
    @js.native
    def fileAccess: String = js.native
    
    inline def fileAccess_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Access")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Audio")
    @js.native
    def fileAudio: String = js.native
    
    inline def fileAudio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Audio")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_CSS")
    @js.native
    def fileCSS: String = js.native
    
    inline def fileCSS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_CSS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Document")
    @js.native
    def fileDocument: String = js.native
    
    inline def fileDocument_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Document")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Excel")
    @js.native
    def fileExcel: String = js.native
    
    inline def fileExcel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Excel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Help")
    @js.native
    def fileHelp: String = js.native
    
    inline def fileHelp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Help")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_InfoPath")
    @js.native
    def fileInfoPath: String = js.native
    
    inline def fileInfoPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_InfoPath")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Installer")
    @js.native
    def fileInstaller: String = js.native
    
    inline def fileInstaller_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Installer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_JavaScript")
    @js.native
    def fileJavaScript: String = js.native
    
    inline def fileJavaScript_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_JavaScript")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Log")
    @js.native
    def fileLog: String = js.native
    
    inline def fileLog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Log")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Mail")
    @js.native
    def fileMail: String = js.native
    
    inline def fileMail_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Mail")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_OneNote")
    @js.native
    def fileOneNote: String = js.native
    
    inline def fileOneNote_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_OneNote")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_PowerPoint")
    @js.native
    def filePowerPoint: String = js.native
    
    inline def filePowerPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_PowerPoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Project")
    @js.native
    def fileProject: String = js.native
    
    inline def fileProject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Project")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Publisher")
    @js.native
    def filePublisher: String = js.native
    
    inline def filePublisher_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Publisher")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_RTF")
    @js.native
    def fileRTF: String = js.native
    
    inline def fileRTF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_RTF")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_SPDesigner")
    @js.native
    def fileSPDesigner: String = js.native
    
    inline def fileSPDesigner_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_SPDesigner")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Text")
    @js.native
    def fileText: String = js.native
    
    inline def fileText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Text")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Visio")
    @js.native
    def fileVisio: String = js.native
    
    inline def fileVisio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Visio")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_WebPage")
    @js.native
    def fileWebPage: String = js.native
    
    inline def fileWebPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_WebPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Word")
    @js.native
    def fileWord: String = js.native
    
    inline def fileWord_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Word")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_XML")
    @js.native
    def fileXML: String = js.native
    
    inline def fileXML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_XML")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_XPS")
    @js.native
    def fileXPS: String = js.native
    
    inline def fileXPS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_XPS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_XSL")
    @js.native
    def fileXSL: String = js.native
    
    inline def fileXSL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_XSL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.file_Zip")
    @js.native
    def fileZip: String = js.native
    
    inline def fileZip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file_Zip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Alt_ImagePreview")
    @js.native
    def hpAltImagePreview: String = js.native
    
    inline def hpAltImagePreview_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Alt_ImagePreview")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Alt_SiteLogo")
    @js.native
    def hpAltSiteLogo: String = js.native
    
    inline def hpAltSiteLogo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Alt_SiteLogo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors2")
    @js.native
    def hpAuthors2: String = js.native
    
    inline def hpAuthors2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors3")
    @js.native
    def hpAuthors3: String = js.native
    
    inline def hpAuthors3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors3")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors4")
    @js.native
    def hpAuthors4: String = js.native
    
    inline def hpAuthors4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors4")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors5Plural")
    @js.native
    def hpAuthors5Plural: String = js.native
    
    inline def hpAuthors5Plural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors5Plural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Authors5Singular")
    @js.native
    def hpAuthors5Singular: String = js.native
    
    inline def hpAuthors5Singular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Authors5Singular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ChangedByAuthorDate")
    @js.native
    def hpChangedByAuthorDate: String = js.native
    
    inline def hpChangedByAuthorDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ChangedByAuthorDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Community")
    @js.native
    def hpCommunity: String = js.native
    
    inline def hpCommunity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Community")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_DateTaken")
    @js.native
    def hpDateTaken: String = js.native
    
    inline def hpDateTaken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_DateTaken")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Discussion")
    @js.native
    def hpDiscussion: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_DiscussionCategory")
    @js.native
    def hpDiscussionCategory: String = js.native
    
    inline def hpDiscussionCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_DiscussionCategory")(x.asInstanceOf[js.Any])
    
    inline def hpDiscussion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Discussion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Duration")
    @js.native
    def hpDuration: String = js.native
    
    inline def hpDuration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Duration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_AttachmentsTooltip")
    @js.native
    def hpEDiscAttachmentsTooltip: String = js.native
    
    inline def hpEDiscAttachmentsTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_AttachmentsTooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_Bcc")
    @js.native
    def hpEDiscBcc: String = js.native
    
    inline def hpEDiscBcc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_Bcc")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_Cc")
    @js.native
    def hpEDiscCc: String = js.native
    
    inline def hpEDiscCc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_Cc")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_From")
    @js.native
    def hpEDiscFrom: String = js.native
    
    inline def hpEDiscFrom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_From")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_EDisc_To")
    @js.native
    def hpEDiscTo: String = js.native
    
    inline def hpEDiscTo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_EDisc_To")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Edit")
    @js.native
    def hpEdit: String = js.native
    
    inline def hpEdit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Edit")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Follow")
    @js.native
    def hpFollow: String = js.native
    
    inline def hpFollow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Follow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_GoToVideoPage")
    @js.native
    def hpGoToVideoPage: String = js.native
    
    inline def hpGoToVideoPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_GoToVideoPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_LastModified")
    @js.native
    def hpLastModified: String = js.native
    
    inline def hpLastModified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_LastModified")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_MicroBlog")
    @js.native
    def hpMicroBlog: String = js.native
    
    inline def hpMicroBlog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_MicroBlog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NoData")
    @js.native
    def hpNoData: String = js.native
    
    inline def hpNoData_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NoData")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_DaysAgo")
    @js.native
    def hpNowDateTimeDaysAgo: String = js.native
    
    inline def hpNowDateTimeDaysAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_DaysAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_MonthAgo")
    @js.native
    def hpNowDateTimeMonthAgo: String = js.native
    
    inline def hpNowDateTimeMonthAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_MonthAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_MonthsAgo")
    @js.native
    def hpNowDateTimeMonthsAgo: String = js.native
    
    inline def hpNowDateTimeMonthsAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_MonthsAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_Today")
    @js.native
    def hpNowDateTimeToday: String = js.native
    
    inline def hpNowDateTimeToday_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_Today")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_YearAgo")
    @js.native
    def hpNowDateTimeYearAgo: String = js.native
    
    inline def hpNowDateTimeYearAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_YearAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_YearsAgo")
    @js.native
    def hpNowDateTimeYearsAgo: String = js.native
    
    inline def hpNowDateTimeYearsAgo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_YearsAgo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_NowDateTime_Yesterday")
    @js.native
    def hpNowDateTimeYesterday: String = js.native
    
    inline def hpNowDateTimeYesterday_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_NowDateTime_Yesterday")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Open")
    @js.native
    def hpOpen: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_OpenInClient")
    @js.native
    def hpOpenInClient: String = js.native
    
    inline def hpOpenInClient_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_OpenInClient")(x.asInstanceOf[js.Any])
    
    inline def hpOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Open")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_OriginalPost")
    @js.native
    def hpOriginalPost: String = js.native
    
    inline def hpOriginalPost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_OriginalPost")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleInVideo")
    @js.native
    def hpPeopleInVideo: String = js.native
    
    inline def hpPeopleInVideo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleInVideo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Authorship")
    @js.native
    def hpPeopleItemAuthorship: String = js.native
    
    inline def hpPeopleItemAuthorship_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Authorship")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Interests")
    @js.native
    def hpPeopleItemInterests: String = js.native
    
    inline def hpPeopleItemInterests_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Interests")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Memberships")
    @js.native
    def hpPeopleItemMemberships: String = js.native
    
    inline def hpPeopleItemMemberships_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Memberships")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_MoreItems")
    @js.native
    def hpPeopleItemMoreItems: String = js.native
    
    inline def hpPeopleItemMoreItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_MoreItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_NoInformationAvailable")
    @js.native
    def hpPeopleItemNoInformationAvailable: String = js.native
    
    inline def hpPeopleItemNoInformationAvailable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_NoInformationAvailable")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_PastProjects")
    @js.native
    def hpPeopleItemPastProjects: String = js.native
    
    inline def hpPeopleItemPastProjects_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_PastProjects")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Related")
    @js.native
    def hpPeopleItemRelated: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_RelatedThrough")
    @js.native
    def hpPeopleItemRelatedThrough: String = js.native
    
    inline def hpPeopleItemRelatedThrough_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_RelatedThrough")(x.asInstanceOf[js.Any])
    
    inline def hpPeopleItemRelated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Related")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Schools")
    @js.native
    def hpPeopleItemSchools: String = js.native
    
    inline def hpPeopleItemSchools_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Schools")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Skills")
    @js.native
    def hpPeopleItemSkills: String = js.native
    
    inline def hpPeopleItemSkills_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Skills")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_Summary")
    @js.native
    def hpPeopleItemSummary: String = js.native
    
    inline def hpPeopleItemSummary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_Summary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PeopleItem_ViewProfile")
    @js.native
    def hpPeopleItemViewProfile: String = js.native
    
    inline def hpPeopleItemViewProfile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PeopleItem_ViewProfile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PictureDimensions")
    @js.native
    def hpPictureDimensions: String = js.native
    
    inline def hpPictureDimensions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PictureDimensions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PictureHeightWidth")
    @js.native
    def hpPictureHeightWidth: String = js.native
    
    inline def hpPictureHeightWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PictureHeightWidth")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularDiscussions")
    @js.native
    def hpPopularDiscussions: String = js.native
    
    inline def hpPopularDiscussions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularDiscussions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Popularity")
    @js.native
    def hpPopularity: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimePlural")
    @js.native
    def hpPopularityLifeTimePlural: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimePluralAndRecentPlural")
    @js.native
    def hpPopularityLifeTimePluralAndRecentPlural: String = js.native
    
    inline def hpPopularityLifeTimePluralAndRecentPlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimePluralAndRecentPlural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimePluralAndRecentSingular")
    @js.native
    def hpPopularityLifeTimePluralAndRecentSingular: String = js.native
    
    inline def hpPopularityLifeTimePluralAndRecentSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimePluralAndRecentSingular")(x.asInstanceOf[js.Any])
    
    inline def hpPopularityLifeTimePlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimePlural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimeSingular")
    @js.native
    def hpPopularityLifeTimeSingular: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PopularityLifeTimeSingularAndRecentSingular")
    @js.native
    def hpPopularityLifeTimeSingularAndRecentSingular: String = js.native
    
    inline def hpPopularityLifeTimeSingularAndRecentSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimeSingularAndRecentSingular")(x.asInstanceOf[js.Any])
    
    inline def hpPopularityLifeTimeSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PopularityLifeTimeSingular")(x.asInstanceOf[js.Any])
    
    inline def hpPopularity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Popularity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Post")
    @js.native
    def hpPost: String = js.native
    
    inline def hpPost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Post")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_PostedBy")
    @js.native
    def hpPostedBy: String = js.native
    
    inline def hpPostedBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_PostedBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Preview_LoadingImgAlt")
    @js.native
    def hpPreviewLoadingImgAlt: String = js.native
    
    inline def hpPreviewLoadingImgAlt_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Preview_LoadingImgAlt")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_RecentReplies")
    @js.native
    def hpRecentReplies: String = js.native
    
    inline def hpRecentReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_RecentReplies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_RecentlyEdited")
    @js.native
    def hpRecentlyEdited: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_RecentlyEdited_eDiscovery")
    @js.native
    def hpRecentlyEditedEDiscovery: String = js.native
    
    inline def hpRecentlyEditedEDiscovery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_RecentlyEdited_eDiscovery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_RecentlyEdited_More")
    @js.native
    def hpRecentlyEditedMore: String = js.native
    
    inline def hpRecentlyEditedMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_RecentlyEdited_More")(x.asInstanceOf[js.Any])
    
    inline def hpRecentlyEdited_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_RecentlyEdited")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Reply")
    @js.native
    def hpReply: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ReplyCategory")
    @js.native
    def hpReplyCategory: String = js.native
    
    inline def hpReplyCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ReplyCategory")(x.asInstanceOf[js.Any])
    
    inline def hpReply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Reply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_SectionHeadings")
    @js.native
    def hpSectionHeadings: String = js.native
    
    inline def hpSectionHeadings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_SectionHeadings")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send")
    @js.native
    def hpSend: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_Open")
    @js.native
    def hpSendOpen: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_OpenInClient")
    @js.native
    def hpSendOpenInClient: String = js.native
    
    inline def hpSendOpenInClient_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_OpenInClient")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_OpenInWeb")
    @js.native
    def hpSendOpenInWeb: String = js.native
    
    inline def hpSendOpenInWeb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_OpenInWeb")(x.asInstanceOf[js.Any])
    
    inline def hpSendOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_Open")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_Title")
    @js.native
    def hpSendTitle: String = js.native
    
    inline def hpSendTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Send_ViewRelated")
    @js.native
    def hpSendViewRelated: String = js.native
    
    inline def hpSendViewRelated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send_ViewRelated")(x.asInstanceOf[js.Any])
    
    inline def hpSend_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Send")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_SiteDescription")
    @js.native
    def hpSiteDescription: String = js.native
    
    inline def hpSiteDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_SiteDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Size")
    @js.native
    def hpSize: String = js.native
    
    inline def hpSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Size")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Summary")
    @js.native
    def hpSummary: String = js.native
    
    inline def hpSummary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Summary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Close")
    @js.native
    def hpTooltipClose: String = js.native
    
    inline def hpTooltipClose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Close")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Contributors")
    @js.native
    def hpTooltipContributors: String = js.native
    
    inline def hpTooltipContributors_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Contributors")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Follow")
    @js.native
    def hpTooltipFollow: String = js.native
    
    inline def hpTooltipFollow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Follow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_LastModified")
    @js.native
    def hpTooltipLastModified: String = js.native
    
    inline def hpTooltipLastModified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_LastModified")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Open")
    @js.native
    def hpTooltipOpen: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_OpenInClient")
    @js.native
    def hpTooltipOpenInClient: String = js.native
    
    inline def hpTooltipOpenInClient_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_OpenInClient")(x.asInstanceOf[js.Any])
    
    inline def hpTooltipOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Open")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Post")
    @js.native
    def hpTooltipPost: String = js.native
    
    inline def hpTooltipPost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Post")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_RecentlyEdited_More")
    @js.native
    def hpTooltipRecentlyEditedMore: String = js.native
    
    inline def hpTooltipRecentlyEditedMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_RecentlyEdited_More")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Send")
    @js.native
    def hpTooltipSend: String = js.native
    
    inline def hpTooltipSend_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Send")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_StopFollowing")
    @js.native
    def hpTooltipStopFollowing: String = js.native
    
    inline def hpTooltipStopFollowing_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_StopFollowing")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_ViewDuplicates")
    @js.native
    def hpTooltipViewDuplicates: String = js.native
    
    inline def hpTooltipViewDuplicates_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_ViewDuplicates")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_ViewLibrary")
    @js.native
    def hpTooltipViewLibrary: String = js.native
    
    inline def hpTooltipViewLibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_ViewLibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_Views")
    @js.native
    def hpTooltipViews: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_ViewsLifeTime")
    @js.native
    def hpTooltipViewsLifeTime: String = js.native
    
    inline def hpTooltipViewsLifeTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_ViewsLifeTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Tooltip_ViewsRecent")
    @js.native
    def hpTooltipViewsRecent: String = js.native
    
    inline def hpTooltipViewsRecent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_ViewsRecent")(x.asInstanceOf[js.Any])
    
    inline def hpTooltipViews_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Tooltip_Views")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_VideoDescription")
    @js.native
    def hpVideoDescription: String = js.native
    
    inline def hpVideoDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_VideoDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewConversation")
    @js.native
    def hpViewConversation: String = js.native
    
    inline def hpViewConversation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewConversation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewDiscussion")
    @js.native
    def hpViewDiscussion: String = js.native
    
    inline def hpViewDiscussion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewDiscussion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewDuplicates")
    @js.native
    def hpViewDuplicates: String = js.native
    
    inline def hpViewDuplicates_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewDuplicates")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewLibrary")
    @js.native
    def hpViewLibrary: String = js.native
    
    inline def hpViewLibrary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewLibrary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_ViewsLifeTime")
    @js.native
    def hpViewsLifeTime: String = js.native
    
    inline def hpViewsLifeTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_ViewsLifeTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Views_Plural")
    @js.native
    def hpViewsPlural: String = js.native
    
    inline def hpViewsPlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Views_Plural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_Views_Singular")
    @js.native
    def hpViewsSingular: String = js.native
    
    inline def hpViewsSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_Views_Singular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_VisitCommunity")
    @js.native
    def hpVisitCommunity: String = js.native
    
    inline def hpVisitCommunity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_VisitCommunity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_WebPageItem_MoreResults_Label")
    @js.native
    def hpWebPageItemMoreResultsLabel: String = js.native
    
    inline def hpWebPageItemMoreResultsLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_WebPageItem_MoreResults_Label")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.hp_WebPageItem_Results")
    @js.native
    def hpWebPageItemResults: String = js.native
    
    inline def hpWebPageItemResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hp_WebPageItem_Results")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Alt_Preview")
    @js.native
    def itemAltPreview: String = js.native
    
    inline def itemAltPreview_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Alt_Preview")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_BestReply")
    @js.native
    def itemBestReply: String = js.native
    
    inline def itemBestReply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_BestReply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_Discussion")
    @js.native
    def itemCommunityDiscussion: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_DiscussionLabel")
    @js.native
    def itemCommunityDiscussionLabel: String = js.native
    
    inline def itemCommunityDiscussionLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_DiscussionLabel")(x.asInstanceOf[js.Any])
    
    inline def itemCommunityDiscussion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_Discussion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_Discussions")
    @js.native
    def itemCommunityDiscussions: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_DiscussionsLabel")
    @js.native
    def itemCommunityDiscussionsLabel: String = js.native
    
    inline def itemCommunityDiscussionsLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_DiscussionsLabel")(x.asInstanceOf[js.Any])
    
    inline def itemCommunityDiscussions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_Discussions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_Member")
    @js.native
    def itemCommunityMember: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_MemberLabel")
    @js.native
    def itemCommunityMemberLabel: String = js.native
    
    inline def itemCommunityMemberLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_MemberLabel")(x.asInstanceOf[js.Any])
    
    inline def itemCommunityMember_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_Member")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_Members")
    @js.native
    def itemCommunityMembers: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_Community_MembersLabel")
    @js.native
    def itemCommunityMembersLabel: String = js.native
    
    inline def itemCommunityMembersLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_MembersLabel")(x.asInstanceOf[js.Any])
    
    inline def itemCommunityMembers_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Community_Members")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_Date")
    @js.native
    def itemCommunityPortalDate: String = js.native
    
    inline def itemCommunityPortalDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_Date")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_DetailsDiscussions")
    @js.native
    def itemCommunityPortalDetailsDiscussions: String = js.native
    
    inline def itemCommunityPortalDetailsDiscussions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_DetailsDiscussions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_DetailsIntervals")
    @js.native
    def itemCommunityPortalDetailsIntervals: String = js.native
    
    inline def itemCommunityPortalDetailsIntervals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_DetailsIntervals")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_DetailsMembers")
    @js.native
    def itemCommunityPortalDetailsMembers: String = js.native
    
    inline def itemCommunityPortalDetailsMembers_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_DetailsMembers")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_DetailsReplies")
    @js.native
    def itemCommunityPortalDetailsReplies: String = js.native
    
    inline def itemCommunityPortalDetailsReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_DetailsReplies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CommunityPortal_MoreDetails")
    @js.native
    def itemCommunityPortalMoreDetails: String = js.native
    
    inline def itemCommunityPortalMoreDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CommunityPortal_MoreDetails")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Content_GenericNoImageSymbol")
    @js.native
    def itemContentGenericNoImageSymbol: String = js.native
    
    inline def itemContentGenericNoImageSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Content_GenericNoImageSymbol")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_CopyLink")
    @js.native
    def itemCopyLink: String = js.native
    
    inline def itemCopyLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_CopyLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_DefaultTitle")
    @js.native
    def itemDefaultTitle: String = js.native
    
    inline def itemDefaultTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_DefaultTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_ItemTitleFormat")
    @js.native
    def itemDiagnosticItemTitleFormat: String = js.native
    
    inline def itemDiagnosticItemTitleFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_ItemTitleFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_MappedManagedProperty")
    @js.native
    def itemDiagnosticMappedManagedProperty: String = js.native
    
    inline def itemDiagnosticMappedManagedProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_MappedManagedProperty")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_PathSlot")
    @js.native
    def itemDiagnosticPathSlot: String = js.native
    
    inline def itemDiagnosticPathSlot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_PathSlot")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_PictureSlot")
    @js.native
    def itemDiagnosticPictureSlot: String = js.native
    
    inline def itemDiagnosticPictureSlot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_PictureSlot")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_Preview")
    @js.native
    def itemDiagnosticPreview: String = js.native
    
    inline def itemDiagnosticPreview_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_Preview")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_PropertyMappings")
    @js.native
    def itemDiagnosticPropertyMappings: String = js.native
    
    inline def itemDiagnosticPropertyMappings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_PropertyMappings")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_SlotNameFormat")
    @js.native
    def itemDiagnosticSlotNameFormat: String = js.native
    
    inline def itemDiagnosticSlotNameFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_SlotNameFormat")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Diagnostic_Value")
    @js.native
    def itemDiagnosticValue: String = js.native
    
    inline def itemDiagnosticValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Diagnostic_Value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Generic_OpenCalloutTooltip")
    @js.native
    def itemGenericOpenCalloutTooltip: String = js.native
    
    inline def itemGenericOpenCalloutTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Generic_OpenCalloutTooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Like")
    @js.native
    def itemLike: String = js.native
    
    inline def itemLike_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Like")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Likes")
    @js.native
    def itemLikes: String = js.native
    
    inline def itemLikes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Likes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_Like")
    @js.native
    def itemMicroBlogLike: String = js.native
    
    inline def itemMicroBlogLike_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_Like")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_Likes")
    @js.native
    def itemMicroBlogLikes: String = js.native
    
    inline def itemMicroBlogLikes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_Likes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_NoReplies")
    @js.native
    def itemMicroBlogNoReplies: String = js.native
    
    inline def itemMicroBlogNoReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_NoReplies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_Replies")
    @js.native
    def itemMicroBlogReplies: String = js.native
    
    inline def itemMicroBlogReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_Replies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_Reply")
    @js.native
    def itemMicroBlogReply: String = js.native
    
    inline def itemMicroBlogReply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_Reply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_RootPostTitle")
    @js.native
    def itemMicroBlogRootPostTitle: String = js.native
    
    inline def itemMicroBlogRootPostTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_RootPostTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MicroBlog_SeeFullConversation")
    @js.native
    def itemMicroBlogSeeFullConversation: String = js.native
    
    inline def itemMicroBlogSeeFullConversation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MicroBlog_SeeFullConversation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_MoreThan")
    @js.native
    def itemMoreThan: String = js.native
    
    inline def itemMoreThan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_MoreThan")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_NoImageMessage")
    @js.native
    def itemNoImageMessage: String = js.native
    
    inline def itemNoImageMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_NoImageMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_NoLikes")
    @js.native
    def itemNoLikes: String = js.native
    
    inline def itemNoLikes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_NoLikes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_NoReplies")
    @js.native
    def itemNoReplies: String = js.native
    
    inline def itemNoReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_NoReplies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_EditProfileLink")
    @js.native
    def itemPeopleEditProfileLink: String = js.native
    
    inline def itemPeopleEditProfileLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_EditProfileLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Interests")
    @js.native
    def itemPeopleInterests: String = js.native
    
    inline def itemPeopleInterests_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Interests")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_LastModified")
    @js.native
    def itemPeopleLastModified: String = js.native
    
    inline def itemPeopleLastModified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_LastModified")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Memberships")
    @js.native
    def itemPeopleMemberships: String = js.native
    
    inline def itemPeopleMemberships_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Memberships")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_NoPresenceAvailable")
    @js.native
    def itemPeopleNoPresenceAvailable: String = js.native
    
    inline def itemPeopleNoPresenceAvailable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_NoPresenceAvailable")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_PastProjects")
    @js.native
    def itemPeoplePastProjects: String = js.native
    
    inline def itemPeoplePastProjects_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_PastProjects")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Responsibilities")
    @js.native
    def itemPeopleResponsibilities: String = js.native
    
    inline def itemPeopleResponsibilities_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Responsibilities")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Schools")
    @js.native
    def itemPeopleSchools: String = js.native
    
    inline def itemPeopleSchools_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Schools")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency")
    @js.native
    def itemPeopleSelfSearchFrequency: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency_ViewsMonths_Plural")
    @js.native
    def itemPeopleSelfSearchFrequencyViewsMonthsPlural: String = js.native
    
    inline def itemPeopleSelfSearchFrequencyViewsMonthsPlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency_ViewsMonths_Plural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency_ViewsMonths_Singular")
    @js.native
    def itemPeopleSelfSearchFrequencyViewsMonthsSingular: String = js.native
    
    inline def itemPeopleSelfSearchFrequencyViewsMonthsSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency_ViewsMonths_Singular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency_ViewsWeeks_Plural")
    @js.native
    def itemPeopleSelfSearchFrequencyViewsWeeksPlural: String = js.native
    
    inline def itemPeopleSelfSearchFrequencyViewsWeeksPlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency_ViewsWeeks_Plural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchFrequency_ViewsWeeks_Singular")
    @js.native
    def itemPeopleSelfSearchFrequencyViewsWeeksSingular: String = js.native
    
    inline def itemPeopleSelfSearchFrequencyViewsWeeksSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency_ViewsWeeks_Singular")(x.asInstanceOf[js.Any])
    
    inline def itemPeopleSelfSearchFrequency_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchFrequency")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_SelfSearchKeywords")
    @js.native
    def itemPeopleSelfSearchKeywords: String = js.native
    
    inline def itemPeopleSelfSearchKeywords_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_SelfSearchKeywords")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_People_Skills")
    @js.native
    def itemPeopleSkills: String = js.native
    
    inline def itemPeopleSkills_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_People_Skills")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_postAuthor")
    @js.native
    def itemPostAuthor: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_postAuthorDate")
    @js.native
    def itemPostAuthorDate: String = js.native
    
    inline def itemPostAuthorDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_postAuthorDate")(x.asInstanceOf[js.Any])
    
    inline def itemPostAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_postAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_postDate")
    @js.native
    def itemPostDate: String = js.native
    
    inline def itemPostDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_postDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Replies")
    @js.native
    def itemReplies: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_RepliesAndLikes")
    @js.native
    def itemRepliesAndLikes: String = js.native
    
    inline def itemRepliesAndLikes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_RepliesAndLikes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_RepliesLabel")
    @js.native
    def itemRepliesLabel: String = js.native
    
    inline def itemRepliesLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_RepliesLabel")(x.asInstanceOf[js.Any])
    
    inline def itemReplies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Replies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Reply")
    @js.native
    def itemReply: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_replyAuthor")
    @js.native
    def itemReplyAuthor: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.item_replyAuthorDate")
    @js.native
    def itemReplyAuthorDate: String = js.native
    
    inline def itemReplyAuthorDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_replyAuthorDate")(x.asInstanceOf[js.Any])
    
    inline def itemReplyAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_replyAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_replyDate")
    @js.native
    def itemReplyDate: String = js.native
    
    inline def itemReplyDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_replyDate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_ReplyLabel")
    @js.native
    def itemReplyLabel: String = js.native
    
    inline def itemReplyLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_ReplyLabel")(x.asInstanceOf[js.Any])
    
    inline def itemReply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Reply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.item_Tooltip_CopyLink")
    @js.native
    def itemTooltipCopyLink: String = js.native
    
    inline def itemTooltipCopyLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item_Tooltip_CopyLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.pkr_CatalogPickerMoreLink")
    @js.native
    def pkrCatalogPickerMoreLink: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.pkr_CatalogPickerMoreLinkToolTip")
    @js.native
    def pkrCatalogPickerMoreLinkToolTip: String = js.native
    
    inline def pkrCatalogPickerMoreLinkToolTip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkr_CatalogPickerMoreLinkToolTip")(x.asInstanceOf[js.Any])
    
    inline def pkrCatalogPickerMoreLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkr_CatalogPickerMoreLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.pkr_CatalogPickerSelectLinkToolTip")
    @js.native
    def pkrCatalogPickerSelectLinkToolTip: String = js.native
    
    inline def pkrCatalogPickerSelectLinkToolTip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkr_CatalogPickerSelectLinkToolTip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_CatalogPicker_Title")
    @js.native
    def qbCatalogPickerTitle: String = js.native
    
    inline def qbCatalogPickerTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_CatalogPicker_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ComplexObject")
    @js.native
    def qbComplexObject: String = js.native
    
    inline def qbComplexObject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ComplexObject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Article")
    @js.native
    def qbContentTypeArticle: String = js.native
    
    inline def qbContentTypeArticle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Article")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Audio")
    @js.native
    def qbContentTypeAudio: String = js.native
    
    inline def qbContentTypeAudio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Audio")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_DocSet")
    @js.native
    def qbContentTypeDocSet: String = js.native
    
    inline def qbContentTypeDocSet_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_DocSet")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Page")
    @js.native
    def qbContentTypePage: String = js.native
    
    inline def qbContentTypePage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Page")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Picture")
    @js.native
    def qbContentTypePicture: String = js.native
    
    inline def qbContentTypePicture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Picture")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Report")
    @js.native
    def qbContentTypeReport: String = js.native
    
    inline def qbContentTypeReport_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Report")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Task")
    @js.native
    def qbContentTypeTask: String = js.native
    
    inline def qbContentTypeTask_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Task")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_Video")
    @js.native
    def qbContentTypeVideo: String = js.native
    
    inline def qbContentTypeVideo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_Video")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ContentType_WikiPage")
    @js.native
    def qbContentTypeWikiPage: String = js.native
    
    inline def qbContentTypeWikiPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ContentType_WikiPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Error_SourceIdInvalid")
    @js.native
    def qbErrorSourceIdInvalid: String = js.native
    
    inline def qbErrorSourceIdInvalid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Error_SourceIdInvalid")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_FallbackResultTitle")
    @js.native
    def qbFallbackResultTitle: String = js.native
    
    inline def qbFallbackResultTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_FallbackResultTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_FillInKeywords")
    @js.native
    def qbFillInKeywords: String = js.native
    
    inline def qbFillInKeywords_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_FillInKeywords")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_FillInPopular")
    @js.native
    def qbFillInPopular: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_FillInPopularScope")
    @js.native
    def qbFillInPopularScope: String = js.native
    
    inline def qbFillInPopularScope_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_FillInPopularScope")(x.asInstanceOf[js.Any])
    
    inline def qbFillInPopular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_FillInPopular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_GetFillIn")
    @js.native
    def qbGetFillIn: String = js.native
    
    inline def qbGetFillIn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_GetFillIn")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_GetRecItems")
    @js.native
    def qbGetRecItems: String = js.native
    
    inline def qbGetRecItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_GetRecItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_NoCollapseString")
    @js.native
    def qbNoCollapseString: String = js.native
    
    inline def qbNoCollapseString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_NoCollapseString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_NotApplicable")
    @js.native
    def qbNotApplicable: String = js.native
    
    inline def qbNotApplicable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_NotApplicable")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_Catalog")
    @js.native
    def qbPathCatalog: String = js.native
    
    inline def qbPathCatalog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_Catalog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseQueryString")
    @js.native
    def qbPathControlChooseQueryString: String = js.native
    
    inline def qbPathControlChooseQueryString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseQueryString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag")
    @js.native
    def qbPathControlChooseTag: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag_None")
    @js.native
    def qbPathControlChooseTagNone: String = js.native
    
    inline def qbPathControlChooseTagNone_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag_None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag_SubTopic")
    @js.native
    def qbPathControlChooseTagSubTopic: String = js.native
    
    inline def qbPathControlChooseTagSubTopic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag_SubTopic")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag_ThisTag")
    @js.native
    def qbPathControlChooseTagThisTag: String = js.native
    
    inline def qbPathControlChooseTagThisTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag_ThisTag")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseTag_Topic")
    @js.native
    def qbPathControlChooseTagTopic: String = js.native
    
    inline def qbPathControlChooseTagTopic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag_Topic")(x.asInstanceOf[js.Any])
    
    inline def qbPathControlChooseTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseTag")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PathControl_ChooseURL")
    @js.native
    def qbPathControlChooseURL: String = js.native
    
    inline def qbPathControlChooseURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PathControl_ChooseURL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_List")
    @js.native
    def qbPathList: String = js.native
    
    inline def qbPathList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_List")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_None")
    @js.native
    def qbPathNone: String = js.native
    
    inline def qbPathNone_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_Page")
    @js.native
    def qbPathPage: String = js.native
    
    inline def qbPathPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_Page")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_QueryString")
    @js.native
    def qbPathQueryString: String = js.native
    
    inline def qbPathQueryString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_QueryString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_Site")
    @js.native
    def qbPathSite: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_SiteCollection")
    @js.native
    def qbPathSiteCollection: String = js.native
    
    inline def qbPathSiteCollection_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_SiteCollection")(x.asInstanceOf[js.Any])
    
    inline def qbPathSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_Site")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_URL")
    @js.native
    def qbPathURL: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_path_URL_token")
    @js.native
    def qbPathURLToken: String = js.native
    
    inline def qbPathURLToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_URL_token")(x.asInstanceOf[js.Any])
    
    inline def qbPathURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_path_URL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PreviewResult_CouldNotResolveTemplateVariables")
    @js.native
    def qbPreviewResultCouldNotResolveTemplateVariables: String = js.native
    
    inline def qbPreviewResultCouldNotResolveTemplateVariables_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PreviewResult_CouldNotResolveTemplateVariables")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PreviewResult_EmptyQuery")
    @js.native
    def qbPreviewResultEmptyQuery: String = js.native
    
    inline def qbPreviewResultEmptyQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PreviewResult_EmptyQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PreviewResult_ErrorExpandTokens")
    @js.native
    def qbPreviewResultErrorExpandTokens: String = js.native
    
    inline def qbPreviewResultErrorExpandTokens_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PreviewResult_ErrorExpandTokens")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_PreviewResult_NoTemplateVariables")
    @js.native
    def qbPreviewResultNoTemplateVariables: String = js.native
    
    inline def qbPreviewResultNoTemplateVariables_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_PreviewResult_NoTemplateVariables")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_Catalog")
    @js.native
    def qbQueryTypeCatalog: String = js.native
    
    inline def qbQueryTypeCatalog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_Catalog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_ContentType")
    @js.native
    def qbQueryTypeContentType: String = js.native
    
    inline def qbQueryTypeContentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_ContentType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_Latest")
    @js.native
    def qbQueryTypeLatest: String = js.native
    
    inline def qbQueryTypeLatest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_Latest")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_Popular")
    @js.native
    def qbQueryTypePopular: String = js.native
    
    inline def qbQueryTypePopular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_Popular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_RecommendedItems")
    @js.native
    def qbQueryTypeRecommendedItems: String = js.native
    
    inline def qbQueryTypeRecommendedItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_RecommendedItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_UserQuery")
    @js.native
    def qbQueryTypeUserQuery: String = js.native
    
    inline def qbQueryTypeUserQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_UserQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_QueryType_Video")
    @js.native
    def qbQueryTypeVideo: String = js.native
    
    inline def qbQueryTypeVideo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_QueryType_Video")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_RecsFromURLToken")
    @js.native
    def qbRecsFromURLToken: String = js.native
    
    inline def qbRecsFromURLToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_RecsFromURLToken")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Remove")
    @js.native
    def qbRemove: String = js.native
    
    inline def qbRemove_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Remove")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ScopeRecItems")
    @js.native
    def qbScopeRecItems: String = js.native
    
    inline def qbScopeRecItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ScopeRecItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ShowAllCollapseString")
    @js.native
    def qbShowAllCollapseString: String = js.native
    
    inline def qbShowAllCollapseString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ShowAllCollapseString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ShowRecsOnly")
    @js.native
    def qbShowRecsOnly: String = js.native
    
    inline def qbShowRecsOnly_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ShowRecsOnly")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_ShowRefinersOnly")
    @js.native
    def qbShowRefinersOnly: String = js.native
    
    inline def qbShowRefinersOnly_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_ShowRefinersOnly")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_SortTab_ChangeRankingWhen")
    @js.native
    def qbSortTabChangeRankingWhen: String = js.native
    
    inline def qbSortTabChangeRankingWhen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_SortTab_ChangeRankingWhen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_SortTab_OrWhen")
    @js.native
    def qbSortTabOrWhen: String = js.native
    
    inline def qbSortTabOrWhen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_SortTab_OrWhen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_SortTab_ThenBy")
    @js.native
    def qbSortTabThenBy: String = js.native
    
    inline def qbSortTabThenBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_SortTab_ThenBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_FilterBy")
    @js.native
    def qbTabFilterBy: String = js.native
    
    inline def qbTabFilterBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_FilterBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_QueryHelper")
    @js.native
    def qbTabQueryHelper: String = js.native
    
    inline def qbTabQueryHelper_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_QueryHelper")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_Settings")
    @js.native
    def qbTabSettings: String = js.native
    
    inline def qbTabSettings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_Settings")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_SortBy")
    @js.native
    def qbTabSortBy: String = js.native
    
    inline def qbTabSortBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_SortBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_Tab_TestQuery")
    @js.native
    def qbTabTestQuery: String = js.native
    
    inline def qbTabTestQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_Tab_TestQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_TestQueryTab_HideAdvanced")
    @js.native
    def qbTestQueryTabHideAdvanced: String = js.native
    
    inline def qbTestQueryTabHideAdvanced_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_TestQueryTab_HideAdvanced")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_TestQueryTab_ShowAdvanced")
    @js.native
    def qbTestQueryTabShowAdvanced: String = js.native
    
    inline def qbTestQueryTabShowAdvanced_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_TestQueryTab_ShowAdvanced")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Contains")
    @js.native
    def qbTokenContains: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_ContainsStartsWith")
    @js.native
    def qbTokenContainsStartsWith: String = js.native
    
    inline def qbTokenContainsStartsWith_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_ContainsStartsWith")(x.asInstanceOf[js.Any])
    
    inline def qbTokenContains_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Contains")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Date")
    @js.native
    def qbTokenDate: String = js.native
    
    inline def qbTokenDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Date")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_DisplayLanguage")
    @js.native
    def qbTokenDisplayLanguage: String = js.native
    
    inline def qbTokenDisplayLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_DisplayLanguage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Equals")
    @js.native
    def qbTokenEquals: String = js.native
    
    inline def qbTokenEquals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Equals")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_GreaterThan")
    @js.native
    def qbTokenGreaterThan: String = js.native
    
    inline def qbTokenGreaterThan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_GreaterThan")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_LessThan")
    @js.native
    def qbTokenLessThan: String = js.native
    
    inline def qbTokenLessThan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_LessThan")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_NotContains")
    @js.native
    def qbTokenNotContains: String = js.native
    
    inline def qbTokenNotContains_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_NotContains")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_NotEquals")
    @js.native
    def qbTokenNotEquals: String = js.native
    
    inline def qbTokenNotEquals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_NotEquals")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_NotStartsWith")
    @js.native
    def qbTokenNotStartsWith: String = js.native
    
    inline def qbTokenNotStartsWith_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_NotStartsWith")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_OnlyListItems")
    @js.native
    def qbTokenOnlyListItems: String = js.native
    
    inline def qbTokenOnlyListItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_OnlyListItems")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_OnlyLists")
    @js.native
    def qbTokenOnlyLists: String = js.native
    
    inline def qbTokenOnlyLists_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_OnlyLists")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_OnlySites")
    @js.native
    def qbTokenOnlySites: String = js.native
    
    inline def qbTokenOnlySites_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_OnlySites")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Page")
    @js.native
    def qbTokenPage: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_PageField")
    @js.native
    def qbTokenPageField: String = js.native
    
    inline def qbTokenPageField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_PageField")(x.asInstanceOf[js.Any])
    
    inline def qbTokenPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Page")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_PreferredContentLanguage")
    @js.native
    def qbTokenPreferredContentLanguage: String = js.native
    
    inline def qbTokenPreferredContentLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_PreferredContentLanguage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_QueryString")
    @js.native
    def qbTokenQueryString: String = js.native
    
    inline def qbTokenQueryString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_QueryString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_SearchBoxQuery")
    @js.native
    def qbTokenSearchBoxQuery: String = js.native
    
    inline def qbTokenSearchBoxQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_SearchBoxQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_SearchTerms")
    @js.native
    def qbTokenSearchTerms: String = js.native
    
    inline def qbTokenSearchTerms_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_SearchTerms")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Site")
    @js.native
    def qbTokenSite: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_SiteColletion")
    @js.native
    def qbTokenSiteColletion: String = js.native
    
    inline def qbTokenSiteColletion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_SiteColletion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_SiteLocale")
    @js.native
    def qbTokenSiteLocale: String = js.native
    
    inline def qbTokenSiteLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_SiteLocale")(x.asInstanceOf[js.Any])
    
    inline def qbTokenSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Site")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_StartsWith")
    @js.native
    def qbTokenStartsWith: String = js.native
    
    inline def qbTokenStartsWith_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_StartsWith")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_Topic")
    @js.native
    def qbTokenTopic: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_TopicIdWithChildren")
    @js.native
    def qbTokenTopicIdWithChildren: String = js.native
    
    inline def qbTokenTopicIdWithChildren_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_TopicIdWithChildren")(x.asInstanceOf[js.Any])
    
    inline def qbTokenTopic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_Topic")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_URLToken")
    @js.native
    def qbTokenURLToken: String = js.native
    
    inline def qbTokenURLToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_URLToken")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_token_UserName")
    @js.native
    def qbTokenUserName: String = js.native
    
    inline def qbTokenUserName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_token_UserName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UseDefinedSort")
    @js.native
    def qbUseDefinedSort: String = js.native
    
    inline def qbUseDefinedSort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UseDefinedSort")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_AddAdditionalFilter")
    @js.native
    def qbUserQueryAddAdditionalFilter: String = js.native
    
    inline def qbUserQueryAddAdditionalFilter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_AddAdditionalFilter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_AddToken")
    @js.native
    def qbUserQueryAddToken: String = js.native
    
    inline def qbUserQueryAddToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_AddToken")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ChooseContentType")
    @js.native
    def qbUserQueryChooseContentType: String = js.native
    
    inline def qbUserQueryChooseContentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ChooseContentType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ChooseSort")
    @js.native
    def qbUserQueryChooseSort: String = js.native
    
    inline def qbUserQueryChooseSort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ChooseSort")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ConfigureCatalog")
    @js.native
    def qbUserQueryConfigureCatalog: String = js.native
    
    inline def qbUserQueryConfigureCatalog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ConfigureCatalog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ManualValue")
    @js.native
    def qbUserQueryManualValue: String = js.native
    
    inline def qbUserQueryManualValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ManualValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_PickCatalog2")
    @js.native
    def qbUserQueryPickCatalog2: String = js.native
    
    inline def qbUserQueryPickCatalog2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_PickCatalog2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_Properties")
    @js.native
    def qbUserQueryProperties: String = js.native
    
    inline def qbUserQueryProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_Properties")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_SelectProperty")
    @js.native
    def qbUserQuerySelectProperty: String = js.native
    
    inline def qbUserQuerySelectProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_SelectProperty")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_SelectValue")
    @js.native
    def qbUserQuerySelectValue: String = js.native
    
    inline def qbUserQuerySelectValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_SelectValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_ShowAllProperties")
    @js.native
    def qbUserQueryShowAllProperties: String = js.native
    
    inline def qbUserQueryShowAllProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_ShowAllProperties")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qb_UserQuery_TypeQuery")
    @js.native
    def qbUserQueryTypeQuery: String = js.native
    
    inline def qbUserQueryTypeQuery_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qb_UserQuery_TypeQuery")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qs_NameSuggestionsTitle")
    @js.native
    def qsNameSuggestionsTitle: String = js.native
    
    inline def qsNameSuggestionsTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs_NameSuggestionsTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qs_PersonalResultTitlePlural")
    @js.native
    def qsPersonalResultTitlePlural: String = js.native
    
    inline def qsPersonalResultTitlePlural_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs_PersonalResultTitlePlural")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qs_PersonalResultTitleSingular")
    @js.native
    def qsPersonalResultTitleSingular: String = js.native
    
    inline def qsPersonalResultTitleSingular_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs_PersonalResultTitleSingular")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.qs_SuggestionListAriaLabel")
    @js.native
    def qsSuggestionListAriaLabel: String = js.native
    
    inline def qsSuggestionListAriaLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs_SuggestionListAriaLabel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_AltIcon")
    @js.native
    def recsAltIcon: String = js.native
    
    inline def recsAltIcon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_AltIcon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_ControlTitle")
    @js.native
    def recsControlTitle: String = js.native
    
    inline def recsControlTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_ControlTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_Fillin")
    @js.native
    def recsFillin: String = js.native
    
    inline def recsFillin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_Fillin")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_LastEditedBy")
    @js.native
    def recsLastEditedBy: String = js.native
    
    inline def recsLastEditedBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_LastEditedBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_Location")
    @js.native
    def recsLocation: String = js.native
    
    inline def recsLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_Location")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_Open")
    @js.native
    def recsOpen: String = js.native
    
    inline def recsOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_Open")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_Recommended")
    @js.native
    def recsRecommended: String = js.native
    
    inline def recsRecommended_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_Recommended")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_SaveLink")
    @js.native
    def recsSaveLink: String = js.native
    
    inline def recsSaveLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_SaveLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.recs_ShowDetails")
    @js.native
    def recsShowDetails: String = js.native
    
    inline def recsShowDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recs_ShowDetails")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_FacetedNavigationProgressTitle")
    @js.native
    def refconfDCRFacetedNavigationProgressTitle: String = js.native
    
    inline def refconfDCRFacetedNavigationProgressTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_FacetedNavigationProgressTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_No")
    @js.native
    def refconfDCRNo: String = js.native
    
    inline def refconfDCRNo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_No")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialog_InvalidSelectedRefiner_Warning")
    @js.native
    def refconfDCRRefinementConfigurationDialogInvalidSelectedRefinerWarning: String = js.native
    
    inline def refconfDCRRefinementConfigurationDialogInvalidSelectedRefinerWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialog_InvalidSelectedRefiner_Warning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltip")
    @js.native
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltip: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltipNoAliases")
    @js.native
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltipNoAliases: String = js.native
    
    inline def refconfDCRRefinementConfigurationDialogManagedPropertyTooltipNoAliases_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltipNoAliases")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltipSeparator")
    @js.native
    def refconfDCRRefinementConfigurationDialogManagedPropertyTooltipSeparator: String = js.native
    
    inline def refconfDCRRefinementConfigurationDialogManagedPropertyTooltipSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltipSeparator")(x.asInstanceOf[js.Any])
    
    inline def refconfDCRRefinementConfigurationDialogManagedPropertyTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialogManagedPropertyTooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialog_NoSuggestedRefiners_Warning")
    @js.native
    def refconfDCRRefinementConfigurationDialogNoSuggestedRefinersWarning: String = js.native
    
    inline def refconfDCRRefinementConfigurationDialogNoSuggestedRefinersWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialog_NoSuggestedRefiners_Warning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialogProgressTitle")
    @js.native
    def refconfDCRRefinementConfigurationDialogProgressTitle: String = js.native
    
    inline def refconfDCRRefinementConfigurationDialogProgressTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialogProgressTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialog_TooManyRefiners_Error")
    @js.native
    def refconfDCRRefinementConfigurationDialogTooManyRefinersError: String = js.native
    
    inline def refconfDCRRefinementConfigurationDialogTooManyRefinersError_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialog_TooManyRefiners_Error")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_RefinementConfigurationDialog_TooManyRefiners_Warning")
    @js.native
    def refconfDCRRefinementConfigurationDialogTooManyRefinersWarning: String = js.native
    
    inline def refconfDCRRefinementConfigurationDialogTooManyRefinersWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_RefinementConfigurationDialog_TooManyRefiners_Warning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_DCR_Yes")
    @js.native
    def refconfDCRYes: String = js.native
    
    inline def refconfDCRYes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_DCR_Yes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_Error_FailedToRestoreConfiguration")
    @js.native
    def refconfErrorFailedToRestoreConfiguration: String = js.native
    
    inline def refconfErrorFailedToRestoreConfiguration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_Error_FailedToRestoreConfiguration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_ConfigurationLoadFailure")
    @js.native
    def refconfFNTConfigurationLoadFailure: String = js.native
    
    inline def refconfFNTConfigurationLoadFailure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_ConfigurationLoadFailure")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_ConfigurationLoadWarning")
    @js.native
    def refconfFNTConfigurationLoadWarning: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_ConfigurationLoadWarningNullResponse")
    @js.native
    def refconfFNTConfigurationLoadWarningNullResponse: String = js.native
    
    inline def refconfFNTConfigurationLoadWarningNullResponse_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_ConfigurationLoadWarningNullResponse")(x.asInstanceOf[js.Any])
    
    inline def refconfFNTConfigurationLoadWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_ConfigurationLoadWarning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_CustomRefiners")
    @js.native
    def refconfFNTDCRCustomRefiners: String = js.native
    
    inline def refconfFNTDCRCustomRefiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_CustomRefiners")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantInfo_ChildTermsNotInheriting")
    @js.native
    def refconfFNTDCRDescendantInfoChildTermsNotInheriting: String = js.native
    
    inline def refconfFNTDCRDescendantInfoChildTermsNotInheriting_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantInfo_ChildTermsNotInheriting")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantInfo_ChildTermsStoppingInheriting")
    @js.native
    def refconfFNTDCRDescendantInfoChildTermsStoppingInheriting: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantInfo_ChildTermsStoppingInheritingLinkAnchor")
    @js.native
    def refconfFNTDCRDescendantInfoChildTermsStoppingInheritingLinkAnchor: String = js.native
    
    inline def refconfFNTDCRDescendantInfoChildTermsStoppingInheritingLinkAnchor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantInfo_ChildTermsStoppingInheritingLinkAnchor")(x.asInstanceOf[js.Any])
    
    inline def refconfFNTDCRDescendantInfoChildTermsStoppingInheriting_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantInfo_ChildTermsStoppingInheriting")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantInfo_ChildTermsTotal")
    @js.native
    def refconfFNTDCRDescendantInfoChildTermsTotal: String = js.native
    
    inline def refconfFNTDCRDescendantInfoChildTermsTotal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantInfo_ChildTermsTotal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_DescendantStoppingInheritancePopupTitle")
    @js.native
    def refconfFNTDCRDescendantStoppingInheritancePopupTitle: String = js.native
    
    inline def refconfFNTDCRDescendantStoppingInheritancePopupTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_DescendantStoppingInheritancePopupTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_GeneratingPreview")
    @js.native
    def refconfFNTDCRGeneratingPreview: String = js.native
    
    inline def refconfFNTDCRGeneratingPreview_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_GeneratingPreview")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_InheritModeAnotherTermset")
    @js.native
    def refconfFNTDCRInheritModeAnotherTermset: String = js.native
    
    inline def refconfFNTDCRInheritModeAnotherTermset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_InheritModeAnotherTermset")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_InheritPopupTitle")
    @js.native
    def refconfFNTDCRInheritPopupTitle: String = js.native
    
    inline def refconfFNTDCRInheritPopupTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_InheritPopupTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_LoadingConfiguration")
    @js.native
    def refconfFNTDCRLoadingConfiguration: String = js.native
    
    inline def refconfFNTDCRLoadingConfiguration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_LoadingConfiguration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_PropertiesFor")
    @js.native
    def refconfFNTDCRPropertiesFor: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_PropertiesForFriendly")
    @js.native
    def refconfFNTDCRPropertiesForFriendly: String = js.native
    
    inline def refconfFNTDCRPropertiesForFriendly_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_PropertiesForFriendly")(x.asInstanceOf[js.Any])
    
    inline def refconfFNTDCRPropertiesFor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_PropertiesFor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_RefinementConfigurationDialogTitle")
    @js.native
    def refconfFNTDCRRefinementConfigurationDialogTitle: String = js.native
    
    inline def refconfFNTDCRRefinementConfigurationDialogTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_RefinementConfigurationDialogTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_RefinementPreviewPopupTitle")
    @js.native
    def refconfFNTDCRRefinementPreviewPopupTitle: String = js.native
    
    inline def refconfFNTDCRRefinementPreviewPopupTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_RefinementPreviewPopupTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_StopInheritingPopupTitle")
    @js.native
    def refconfFNTDCRStopInheritingPopupTitle: String = js.native
    
    inline def refconfFNTDCRStopInheritingPopupTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_StopInheritingPopupTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_TotalResultsTooltip")
    @js.native
    def refconfFNTDCRTotalResultsTooltip: String = js.native
    
    inline def refconfFNTDCRTotalResultsTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_TotalResultsTooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_DCR_UseManualIntervals")
    @js.native
    def refconfFNTDCRUseManualIntervals: String = js.native
    
    inline def refconfFNTDCRUseManualIntervals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_DCR_UseManualIntervals")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_FNT_InheritModeTermInfoSingularFormatString")
    @js.native
    def refconfFNTInheritModeTermInfoSingularFormatString: String = js.native
    
    inline def refconfFNTInheritModeTermInfoSingularFormatString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_FNT_InheritModeTermInfoSingularFormatString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_NoSampleValues")
    @js.native
    def refconfNoSampleValues: String = js.native
    
    inline def refconfNoSampleValues_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_NoSampleValues")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_ResultsWithValues")
    @js.native
    def refconfResultsWithValues: String = js.native
    
    inline def refconfResultsWithValues_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_ResultsWithValues")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SampleValuesDialog_Title")
    @js.native
    def refconfSampleValuesDialogTitle: String = js.native
    
    inline def refconfSampleValuesDialogTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SampleValuesDialog_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_Section_OtherRefiners")
    @js.native
    def refconfSectionOtherRefiners: String = js.native
    
    inline def refconfSectionOtherRefiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_Section_OtherRefiners")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_Section_Separator")
    @js.native
    def refconfSectionSeparator: String = js.native
    
    inline def refconfSectionSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_Section_Separator")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_Section_SuggestedRefiners")
    @js.native
    def refconfSectionSuggestedRefiners: String = js.native
    
    inline def refconfSectionSuggestedRefiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_Section_SuggestedRefiners")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortBy_Count")
    @js.native
    def refconfSortByCount: String = js.native
    
    inline def refconfSortByCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortBy_Count")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortBy_Name")
    @js.native
    def refconfSortByName: String = js.native
    
    inline def refconfSortByName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortBy_Name")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortBy_Number")
    @js.native
    def refconfSortByNumber: String = js.native
    
    inline def refconfSortByNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortBy_Number")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortDirection_Ascending")
    @js.native
    def refconfSortDirectionAscending: String = js.native
    
    inline def refconfSortDirectionAscending_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortDirection_Ascending")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_SortDirection_Descending")
    @js.native
    def refconfSortDirectionDescending: String = js.native
    
    inline def refconfSortDirectionDescending_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_SortDirection_Descending")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.refconf_TotalResults")
    @js.native
    def refconfTotalResults: String = js.native
    
    inline def refconfTotalResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refconf_TotalResults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_AddProperty")
    @js.native
    def rfAddProperty: String = js.native
    
    inline def rfAddProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_AddProperty")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_All")
    @js.native
    def rfAll: String = js.native
    
    inline def rfAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_Apply")
    @js.native
    def rfApply: String = js.native
    
    inline def rfApply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_Apply")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ClearAll")
    @js.native
    def rfClearAll: String = js.native
    
    inline def rfClearAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ClearAll")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateBoundaryLabels_0")
    @js.native
    def rfDefaultDateBoundaryLabels0: String = js.native
    
    inline def rfDefaultDateBoundaryLabels0_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateBoundaryLabels_0")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateBoundaryLabels_1")
    @js.native
    def rfDefaultDateBoundaryLabels1: String = js.native
    
    inline def rfDefaultDateBoundaryLabels1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateBoundaryLabels_1")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateBoundaryLabels_2")
    @js.native
    def rfDefaultDateBoundaryLabels2: String = js.native
    
    inline def rfDefaultDateBoundaryLabels2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateBoundaryLabels_2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateBoundaryLabels_3")
    @js.native
    def rfDefaultDateBoundaryLabels3: String = js.native
    
    inline def rfDefaultDateBoundaryLabels3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateBoundaryLabels_3")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateRangeLabels_max")
    @js.native
    def rfDefaultDateRangeLabelsMax: String = js.native
    
    inline def rfDefaultDateRangeLabelsMax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateRangeLabels_max")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateRangeLabels_min")
    @js.native
    def rfDefaultDateRangeLabelsMin: String = js.native
    
    inline def rfDefaultDateRangeLabelsMin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateRangeLabels_min")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateRangeLabels_range")
    @js.native
    def rfDefaultDateRangeLabelsRange: String = js.native
    
    inline def rfDefaultDateRangeLabelsRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateRangeLabels_range")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultDateRangeLabels_value")
    @js.native
    def rfDefaultDateRangeLabelsValue: String = js.native
    
    inline def rfDefaultDateRangeLabelsValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultDateRangeLabels_value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultMinutesLabels_max")
    @js.native
    def rfDefaultMinutesLabelsMax: String = js.native
    
    inline def rfDefaultMinutesLabelsMax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultMinutesLabels_max")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultMinutesLabels_min")
    @js.native
    def rfDefaultMinutesLabelsMin: String = js.native
    
    inline def rfDefaultMinutesLabelsMin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultMinutesLabels_min")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultMinutesLabels_range")
    @js.native
    def rfDefaultMinutesLabelsRange: String = js.native
    
    inline def rfDefaultMinutesLabelsRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultMinutesLabels_range")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultMinutesLabels_value")
    @js.native
    def rfDefaultMinutesLabelsValue: String = js.native
    
    inline def rfDefaultMinutesLabelsValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultMinutesLabels_value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultNumberLabels_max")
    @js.native
    def rfDefaultNumberLabelsMax: String = js.native
    
    inline def rfDefaultNumberLabelsMax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultNumberLabels_max")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultNumberLabels_min")
    @js.native
    def rfDefaultNumberLabelsMin: String = js.native
    
    inline def rfDefaultNumberLabelsMin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultNumberLabels_min")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultNumberLabels_range")
    @js.native
    def rfDefaultNumberLabelsRange: String = js.native
    
    inline def rfDefaultNumberLabelsRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultNumberLabels_range")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_DefaultNumberLabels_value")
    @js.native
    def rfDefaultNumberLabelsValue: String = js.native
    
    inline def rfDefaultNumberLabelsValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_DefaultNumberLabels_value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Contacts")
    @js.native
    def rfEDiscExTypeRefinerValueContacts: String = js.native
    
    inline def rfEDiscExTypeRefinerValueContacts_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Contacts")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Documents")
    @js.native
    def rfEDiscExTypeRefinerValueDocuments: String = js.native
    
    inline def rfEDiscExTypeRefinerValueDocuments_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Documents")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Email")
    @js.native
    def rfEDiscExTypeRefinerValueEmail: String = js.native
    
    inline def rfEDiscExTypeRefinerValueEmail_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Email")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_IM")
    @js.native
    def rfEDiscExTypeRefinerValueIM: String = js.native
    
    inline def rfEDiscExTypeRefinerValueIM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_IM")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Journal")
    @js.native
    def rfEDiscExTypeRefinerValueJournal: String = js.native
    
    inline def rfEDiscExTypeRefinerValueJournal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Journal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Meetings")
    @js.native
    def rfEDiscExTypeRefinerValueMeetings: String = js.native
    
    inline def rfEDiscExTypeRefinerValueMeetings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Meetings")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Notes")
    @js.native
    def rfEDiscExTypeRefinerValueNotes: String = js.native
    
    inline def rfEDiscExTypeRefinerValueNotes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Notes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EDiscExTypeRefinerValue_Tasks")
    @js.native
    def rfEDiscExTypeRefinerValueTasks: String = js.native
    
    inline def rfEDiscExTypeRefinerValueTasks_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EDiscExTypeRefinerValue_Tasks")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_EmptyRefinement")
    @js.native
    def rfEmptyRefinement: String = js.native
    
    inline def rfEmptyRefinement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_EmptyRefinement")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_OtherValue")
    @js.native
    def rfOtherValue: String = js.native
    
    inline def rfOtherValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_OtherValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RangeBoundariesAnyValue")
    @js.native
    def rfRangeBoundariesAnyValue: String = js.native
    
    inline def rfRangeBoundariesAnyValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RangeBoundariesAnyValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefineBy")
    @js.native
    def rfRefineBy: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefineByAuthorGoButton")
    @js.native
    def rfRefineByAuthorGoButton: String = js.native
    
    inline def rfRefineByAuthorGoButton_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefineByAuthorGoButton")(x.asInstanceOf[js.Any])
    
    inline def rfRefineBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefineBy")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementLabel_EnterName")
    @js.native
    def rfRefinementLabelEnterName: String = js.native
    
    inline def rfRefinementLabelEnterName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementLabel_EnterName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementLabel_Less")
    @js.native
    def rfRefinementLabelLess: String = js.native
    
    inline def rfRefinementLabelLess_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementLabel_Less")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementLabel_More")
    @js.native
    def rfRefinementLabelMore: String = js.native
    
    inline def rfRefinementLabelMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementLabel_More")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle")
    @js.native
    def rfRefinementTitle: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_AttachmentType")
    @js.native
    def rfRefinementTitleAttachmentType: String = js.native
    
    inline def rfRefinementTitleAttachmentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_AttachmentType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Author")
    @js.native
    def rfRefinementTitleAuthor: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_AuthorOWSUSER")
    @js.native
    def rfRefinementTitleAuthorOWSUSER: String = js.native
    
    inline def rfRefinementTitleAuthorOWSUSER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_AuthorOWSUSER")(x.asInstanceOf[js.Any])
    
    inline def rfRefinementTitleAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Author")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_BaseOfficeLocation")
    @js.native
    def rfRefinementTitleBaseOfficeLocation: String = js.native
    
    inline def rfRefinementTitleBaseOfficeLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_BaseOfficeLocation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_companies")
    @js.native
    def rfRefinementTitleCompanies: String = js.native
    
    inline def rfRefinementTitleCompanies_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_companies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ContentClass")
    @js.native
    def rfRefinementTitleContentClass: String = js.native
    
    inline def rfRefinementTitleContentClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ContentClass")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ContentType")
    @js.native
    def rfRefinementTitleContentType: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ContentTypeId")
    @js.native
    def rfRefinementTitleContentTypeId: String = js.native
    
    inline def rfRefinementTitleContentTypeId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ContentTypeId")(x.asInstanceOf[js.Any])
    
    inline def rfRefinementTitleContentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ContentType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Created")
    @js.native
    def rfRefinementTitleCreated: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_CreatedBy")
    @js.native
    def rfRefinementTitleCreatedBy: String = js.native
    
    inline def rfRefinementTitleCreatedBy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_CreatedBy")(x.asInstanceOf[js.Any])
    
    inline def rfRefinementTitleCreated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Created")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_DMSCategory")
    @js.native
    def rfRefinementTitleDMSCategory: String = js.native
    
    inline def rfRefinementTitleDMSCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_DMSCategory")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_DMSDocAuthor")
    @js.native
    def rfRefinementTitleDMSDocAuthor: String = js.native
    
    inline def rfRefinementTitleDMSDocAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_DMSDocAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Department")
    @js.native
    def rfRefinementTitleDepartment: String = js.native
    
    inline def rfRefinementTitleDepartment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Department")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_DisplayAuthor")
    @js.native
    def rfRefinementTitleDisplayAuthor: String = js.native
    
    inline def rfRefinementTitleDisplayAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_DisplayAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_EDiscSpecifyProperty")
    @js.native
    def rfRefinementTitleEDiscSpecifyProperty: String = js.native
    
    inline def rfRefinementTitleEDiscSpecifyProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_EDiscSpecifyProperty")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_FileExtension")
    @js.native
    def rfRefinementTitleFileExtension: String = js.native
    
    inline def rfRefinementTitleFileExtension_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_FileExtension")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_FileType")
    @js.native
    def rfRefinementTitleFileType: String = js.native
    
    inline def rfRefinementTitleFileType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_FileType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_format")
    @js.native
    def rfRefinementTitleFormat: String = js.native
    
    inline def rfRefinementTitleFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_format")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_from")
    @js.native
    def rfRefinementTitleFrom: String = js.native
    
    inline def rfRefinementTitleFrom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_from")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ImageDateCreated")
    @js.native
    def rfRefinementTitleImageDateCreated: String = js.native
    
    inline def rfRefinementTitleImageDateCreated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ImageDateCreated")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_JobTitle")
    @js.native
    def rfRefinementTitleJobTitle: String = js.native
    
    inline def rfRefinementTitleJobTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_JobTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Kind")
    @js.native
    def rfRefinementTitleKind: String = js.native
    
    inline def rfRefinementTitleKind_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Kind")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_languages")
    @js.native
    def rfRefinementTitleLanguages: String = js.native
    
    inline def rfRefinementTitleLanguages_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_languages")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_LastModifiedTime")
    @js.native
    def rfRefinementTitleLastModifiedTime: String = js.native
    
    inline def rfRefinementTitleLastModifiedTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_LastModifiedTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Location")
    @js.native
    def rfRefinementTitleLocation: String = js.native
    
    inline def rfRefinementTitleLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Location")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_locations")
    @js.native
    def rfRefinementTitleLocations: String = js.native
    
    inline def rfRefinementTitleLocations_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_locations")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_ManagedProperties")
    @js.native
    def rfRefinementTitleManagedProperties: String = js.native
    
    inline def rfRefinementTitleManagedProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_ManagedProperties")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_MediaDuration")
    @js.native
    def rfRefinementTitleMediaDuration: String = js.native
    
    inline def rfRefinementTitleMediaDuration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_MediaDuration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_owsmetadatafacetinfo")
    @js.native
    def rfRefinementTitleOwsmetadatafacetinfo: String = js.native
    
    inline def rfRefinementTitleOwsmetadatafacetinfo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_owsmetadatafacetinfo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_owstaxidmetadataalltagsinfo")
    @js.native
    def rfRefinementTitleOwstaxidmetadataalltagsinfo: String = js.native
    
    inline def rfRefinementTitleOwstaxidmetadataalltagsinfo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_owstaxidmetadataalltagsinfo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_participants")
    @js.native
    def rfRefinementTitleParticipants: String = js.native
    
    inline def rfRefinementTitleParticipants_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_participants")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_People")
    @js.native
    def rfRefinementTitlePeople: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PeopleInMedia")
    @js.native
    def rfRefinementTitlePeopleInMedia: String = js.native
    
    inline def rfRefinementTitlePeopleInMedia_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PeopleInMedia")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PeopleKeywords")
    @js.native
    def rfRefinementTitlePeopleKeywords: String = js.native
    
    inline def rfRefinementTitlePeopleKeywords_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PeopleKeywords")(x.asInstanceOf[js.Any])
    
    inline def rfRefinementTitlePeople_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_People")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_personnames")
    @js.native
    def rfRefinementTitlePersonnames: String = js.native
    
    inline def rfRefinementTitlePersonnames_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_personnames")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PictureHeight")
    @js.native
    def rfRefinementTitlePictureHeight: String = js.native
    
    inline def rfRefinementTitlePictureHeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PictureHeight")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PictureWidth")
    @js.native
    def rfRefinementTitlePictureWidth: String = js.native
    
    inline def rfRefinementTitlePictureWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PictureWidth")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_PostAuthor")
    @js.native
    def rfRefinementTitlePostAuthor: String = js.native
    
    inline def rfRefinementTitlePostAuthor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_PostAuthor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_recipients")
    @js.native
    def rfRefinementTitleRecipients: String = js.native
    
    inline def rfRefinementTitleRecipients_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_recipients")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_recommendedfor")
    @js.native
    def rfRefinementTitleRecommendedfor: String = js.native
    
    inline def rfRefinementTitleRecommendedfor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_recommendedfor")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Responsibilities")
    @js.native
    def rfRefinementTitleResponsibilities: String = js.native
    
    inline def rfRefinementTitleResponsibilities_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Responsibilities")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_SharedWithInternal")
    @js.native
    def rfRefinementTitleSharedWithInternal: String = js.native
    
    inline def rfRefinementTitleSharedWithInternal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_SharedWithInternal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Site")
    @js.native
    def rfRefinementTitleSite: String = js.native
    
    inline def rfRefinementTitleSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Site")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_sitename")
    @js.native
    def rfRefinementTitleSitename: String = js.native
    
    inline def rfRefinementTitleSitename_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_sitename")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Size")
    @js.native
    def rfRefinementTitleSize: String = js.native
    
    inline def rfRefinementTitleSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Size")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_subject")
    @js.native
    def rfRefinementTitleSubject: String = js.native
    
    inline def rfRefinementTitleSubject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_subject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Tags")
    @js.native
    def rfRefinementTitleTags: String = js.native
    
    inline def rfRefinementTitleTags_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Tags")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Title")
    @js.native
    def rfRefinementTitleTitle: String = js.native
    
    inline def rfRefinementTitleTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Title")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_UrlDepth")
    @js.native
    def rfRefinementTitleUrlDepth: String = js.native
    
    inline def rfRefinementTitleUrlDepth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_UrlDepth")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_WebTemplate")
    @js.native
    def rfRefinementTitleWebTemplate: String = js.native
    
    inline def rfRefinementTitleWebTemplate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_WebTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_RefinementTitle_Write")
    @js.native
    def rfRefinementTitleWrite: String = js.native
    
    inline def rfRefinementTitleWrite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle_Write")(x.asInstanceOf[js.Any])
    
    inline def rfRefinementTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_RefinementTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_AdobePDF")
    @js.native
    def rfResultTypeRefinerValueAdobePDF: String = js.native
    
    inline def rfResultTypeRefinerValueAdobePDF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_AdobePDF")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Archive")
    @js.native
    def rfResultTypeRefinerValueArchive: String = js.native
    
    inline def rfResultTypeRefinerValueArchive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Archive")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Assignment")
    @js.native
    def rfResultTypeRefinerValueAssignment: String = js.native
    
    inline def rfResultTypeRefinerValueAssignment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Assignment")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Blog")
    @js.native
    def rfResultTypeRefinerValueBlog: String = js.native
    
    inline def rfResultTypeRefinerValueBlog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Blog")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Book")
    @js.native
    def rfResultTypeRefinerValueBook: String = js.native
    
    inline def rfResultTypeRefinerValueBook_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Book")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Community")
    @js.native
    def rfResultTypeRefinerValueCommunity: String = js.native
    
    inline def rfResultTypeRefinerValueCommunity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Community")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Course")
    @js.native
    def rfResultTypeRefinerValueCourse: String = js.native
    
    inline def rfResultTypeRefinerValueCourse_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Course")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Discussion")
    @js.native
    def rfResultTypeRefinerValueDiscussion: String = js.native
    
    inline def rfResultTypeRefinerValueDiscussion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Discussion")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Email")
    @js.native
    def rfResultTypeRefinerValueEmail: String = js.native
    
    inline def rfResultTypeRefinerValueEmail_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Email")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Image")
    @js.native
    def rfResultTypeRefinerValueImage: String = js.native
    
    inline def rfResultTypeRefinerValueImage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Lesson")
    @js.native
    def rfResultTypeRefinerValueLesson: String = js.native
    
    inline def rfResultTypeRefinerValueLesson_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Lesson")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_LotusNotes")
    @js.native
    def rfResultTypeRefinerValueLotusNotes: String = js.native
    
    inline def rfResultTypeRefinerValueLotusNotes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_LotusNotes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSAccess")
    @js.native
    def rfResultTypeRefinerValueMSAccess: String = js.native
    
    inline def rfResultTypeRefinerValueMSAccess_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSAccess")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSExcel")
    @js.native
    def rfResultTypeRefinerValueMSExcel: String = js.native
    
    inline def rfResultTypeRefinerValueMSExcel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSExcel")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSOneNote")
    @js.native
    def rfResultTypeRefinerValueMSOneNote: String = js.native
    
    inline def rfResultTypeRefinerValueMSOneNote_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSOneNote")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSPowerPoint")
    @js.native
    def rfResultTypeRefinerValueMSPowerPoint: String = js.native
    
    inline def rfResultTypeRefinerValueMSPowerPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSPowerPoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSProject")
    @js.native
    def rfResultTypeRefinerValueMSProject: String = js.native
    
    inline def rfResultTypeRefinerValueMSProject_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSProject")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSPublisher")
    @js.native
    def rfResultTypeRefinerValueMSPublisher: String = js.native
    
    inline def rfResultTypeRefinerValueMSPublisher_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSPublisher")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_MSWord")
    @js.native
    def rfResultTypeRefinerValueMSWord: String = js.native
    
    inline def rfResultTypeRefinerValueMSWord_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_MSWord")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_NewsfeedPost")
    @js.native
    def rfResultTypeRefinerValueNewsfeedPost: String = js.native
    
    inline def rfResultTypeRefinerValueNewsfeedPost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_NewsfeedPost")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_SharePointSite")
    @js.native
    def rfResultTypeRefinerValueSharePointSite: String = js.native
    
    inline def rfResultTypeRefinerValueSharePointSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_SharePointSite")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Task")
    @js.native
    def rfResultTypeRefinerValueTask: String = js.native
    
    inline def rfResultTypeRefinerValueTask_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Task")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_TeamSite")
    @js.native
    def rfResultTypeRefinerValueTeamSite: String = js.native
    
    inline def rfResultTypeRefinerValueTeamSite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_TeamSite")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Text")
    @js.native
    def rfResultTypeRefinerValueText: String = js.native
    
    inline def rfResultTypeRefinerValueText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Text")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Video")
    @js.native
    def rfResultTypeRefinerValueVideo: String = js.native
    
    inline def rfResultTypeRefinerValueVideo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Video")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Visio")
    @js.native
    def rfResultTypeRefinerValueVisio: String = js.native
    
    inline def rfResultTypeRefinerValueVisio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Visio")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Webpage")
    @js.native
    def rfResultTypeRefinerValueWebpage: String = js.native
    
    inline def rfResultTypeRefinerValueWebpage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Webpage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_Wiki")
    @js.native
    def rfResultTypeRefinerValueWiki: String = js.native
    
    inline def rfResultTypeRefinerValueWiki_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_Wiki")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ResultTypeRefinerValue_XML")
    @js.native
    def rfResultTypeRefinerValueXML: String = js.native
    
    inline def rfResultTypeRefinerValueXML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ResultTypeRefinerValue_XML")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rf_ShowMoreResults_Tooltip")
    @js.native
    def rfShowMoreResultsTooltip: String = js.native
    
    inline def rfShowMoreResultsTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rf_ShowMoreResults_Tooltip")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Advanced")
    @js.native
    def rsAdvanced: String = js.native
    
    inline def rsAdvanced_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Advanced")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_AlertMe")
    @js.native
    def rsAlertMe: String = js.native
    
    inline def rsAlertMe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_AlertMe")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_ApproximateResultCount")
    @js.native
    def rsApproximateResultCount: String = js.native
    
    inline def rsApproximateResultCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_ApproximateResultCount")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_DidYouMean")
    @js.native
    def rsDidYouMean: String = js.native
    
    inline def rsDidYouMean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_DidYouMean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_EdiscoveryTopResultCount")
    @js.native
    def rsEdiscoveryTopResultCount: String = js.native
    
    inline def rsEdiscoveryTopResultCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_EdiscoveryTopResultCount")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ConfigureSearchResults")
    @js.native
    def rsEditConfigureSearchResults: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ConfigureSearchResults_Link")
    @js.native
    def rsEditConfigureSearchResultsLink: String = js.native
    
    inline def rsEditConfigureSearchResultsLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ConfigureSearchResults_Link")(x.asInstanceOf[js.Any])
    
    inline def rsEditConfigureSearchResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ConfigureSearchResults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_DisplayTemplate")
    @js.native
    def rsEditDisplayTemplate: String = js.native
    
    inline def rsEditDisplayTemplate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_DisplayTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_PromotedDescription")
    @js.native
    def rsEditPromotedDescription: String = js.native
    
    inline def rsEditPromotedDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_PromotedDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_PromotedTitle")
    @js.native
    def rsEditPromotedTitle: String = js.native
    
    inline def rsEditPromotedTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_PromotedTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_QueryRules")
    @js.native
    def rsEditQueryRules: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_QueryRulesDescription")
    @js.native
    def rsEditQueryRulesDescription: String = js.native
    
    inline def rsEditQueryRulesDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_QueryRulesDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_QueryRulesTitle")
    @js.native
    def rsEditQueryRulesTitle: String = js.native
    
    inline def rsEditQueryRulesTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_QueryRulesTitle")(x.asInstanceOf[js.Any])
    
    inline def rsEditQueryRules_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_QueryRules")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_RankedDescription")
    @js.native
    def rsEditRankedDescription: String = js.native
    
    inline def rsEditRankedDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_RankedDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_RankedTitle")
    @js.native
    def rsEditRankedTitle: String = js.native
    
    inline def rsEditRankedTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_RankedTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultSources")
    @js.native
    def rsEditResultSources: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultSourcesDescription")
    @js.native
    def rsEditResultSourcesDescription: String = js.native
    
    inline def rsEditResultSourcesDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultSourcesDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultSourcesTitle")
    @js.native
    def rsEditResultSourcesTitle: String = js.native
    
    inline def rsEditResultSourcesTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultSourcesTitle")(x.asInstanceOf[js.Any])
    
    inline def rsEditResultSources_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultSources")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultType")
    @js.native
    def rsEditResultType: String = js.native
    
    inline def rsEditResultType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultTypesDescription")
    @js.native
    def rsEditResultTypesDescription: String = js.native
    
    inline def rsEditResultTypesDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultTypesDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Edit_ResultTypesTitle")
    @js.native
    def rsEditResultTypesTitle: String = js.native
    
    inline def rsEditResultTypesTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Edit_ResultTypesTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_GroupMoreLink")
    @js.native
    def rsGroupMoreLink: String = js.native
    
    inline def rsGroupMoreLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_GroupMoreLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_HasParseExceptionWarning_Line1")
    @js.native
    def rsHasParseExceptionWarningLine1: String = js.native
    
    inline def rsHasParseExceptionWarningLine1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_HasParseExceptionWarning_Line1")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_HasParseExceptionWarning_Line2")
    @js.native
    def rsHasParseExceptionWarningLine2: String = js.native
    
    inline def rsHasParseExceptionWarningLine2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_HasParseExceptionWarning_Line2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Hide_Results")
    @js.native
    def rsHideResults: String = js.native
    
    inline def rsHideResults_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Hide_Results")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_LanguageDescription")
    @js.native
    def rsLanguageDescription: String = js.native
    
    inline def rsLanguageDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_LanguageDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_LanguagePreferences")
    @js.native
    def rsLanguagePreferences: String = js.native
    
    inline def rsLanguagePreferences_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_LanguagePreferences")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_MoreLanguages")
    @js.native
    def rsMoreLanguages: String = js.native
    
    inline def rsMoreLanguages_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_MoreLanguages")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_MoveToNextPage")
    @js.native
    def rsMoveToNextPage: String = js.native
    
    inline def rsMoveToNextPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_MoveToNextPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_MoveToPage")
    @js.native
    def rsMoveToPage: String = js.native
    
    inline def rsMoveToPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_MoveToPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_MoveToPrevPage")
    @js.native
    def rsMoveToPrevPage: String = js.native
    
    inline def rsMoveToPrevPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_MoveToPrevPage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResult")
    @js.native
    def rsNoResult: String = js.native
    
    inline def rsNoResult_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResult")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsDifferentTerms")
    @js.native
    def rsNoResultsDifferentTerms: String = js.native
    
    inline def rsNoResultsDifferentTerms_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsDifferentTerms")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsFewerTerms")
    @js.native
    def rsNoResultsFewerTerms: String = js.native
    
    inline def rsNoResultsFewerTerms_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsFewerTerms")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsGeneralTerms")
    @js.native
    def rsNoResultsGeneralTerms: String = js.native
    
    inline def rsNoResultsGeneralTerms_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsGeneralTerms")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsMessageWhenSearchSkipped")
    @js.native
    def rsNoResultsMessageWhenSearchSkipped: String = js.native
    
    inline def rsNoResultsMessageWhenSearchSkipped_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsMessageWhenSearchSkipped")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsRefiners")
    @js.native
    def rsNoResultsRefiners: String = js.native
    
    inline def rsNoResultsRefiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsRefiners")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsSpelling")
    @js.native
    def rsNoResultsSpelling: String = js.native
    
    inline def rsNoResultsSpelling_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsSpelling")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsSuggestions")
    @js.native
    def rsNoResultsSuggestions: String = js.native
    
    inline def rsNoResultsSuggestions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsSuggestions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsTips")
    @js.native
    def rsNoResultsTips: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsTips_Link")
    @js.native
    def rsNoResultsTipsLink: String = js.native
    
    inline def rsNoResultsTipsLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsTips_Link")(x.asInstanceOf[js.Any])
    
    inline def rsNoResultsTips_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsTips")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_NoResultsTitle")
    @js.native
    def rsNoResultsTitle: String = js.native
    
    inline def rsNoResultsTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_NoResultsTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_PartialResultWarning_Line1")
    @js.native
    def rsPartialResultWarningLine1: String = js.native
    
    inline def rsPartialResultWarningLine1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_PartialResultWarning_Line1")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_PartialResultWarning_Line2")
    @js.native
    def rsPartialResultWarningLine2: String = js.native
    
    inline def rsPartialResultWarningLine2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_PartialResultWarning_Line2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Preferences")
    @js.native
    def rsPreferences: String = js.native
    
    inline def rsPreferences_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Preferences")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_PreferredSearchLanguage")
    @js.native
    def rsPreferredSearchLanguage: String = js.native
    
    inline def rsPreferredSearchLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_PreferredSearchLanguage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_ResultCount")
    @js.native
    def rsResultCount: String = js.native
    
    inline def rsResultCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_ResultCount")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_ResultsTitle")
    @js.native
    def rsResultsTitle: String = js.native
    
    inline def rsResultsTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_ResultsTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SearchScope")
    @js.native
    def rsSearchScope: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SearchScopeTooltip")
    @js.native
    def rsSearchScopeTooltip: String = js.native
    
    inline def rsSearchScopeTooltip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SearchScopeTooltip")(x.asInstanceOf[js.Any])
    
    inline def rsSearchScope_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SearchScope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SelectPreferredSearchLanguage")
    @js.native
    def rsSelectPreferredSearchLanguage: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SelectPreferredSearchLanguage_Language")
    @js.native
    def rsSelectPreferredSearchLanguageLanguage: String = js.native
    
    inline def rsSelectPreferredSearchLanguageLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SelectPreferredSearchLanguage_Language")(x.asInstanceOf[js.Any])
    
    inline def rsSelectPreferredSearchLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SelectPreferredSearchLanguage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SingleResultCount")
    @js.native
    def rsSingleResultCount: String = js.native
    
    inline def rsSingleResultCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SingleResultCount")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SocialDistanceSort")
    @js.native
    def rsSocialDistanceSort: String = js.native
    
    inline def rsSocialDistanceSort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SocialDistanceSort")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_SortDescription")
    @js.native
    def rsSortDescription: String = js.native
    
    inline def rsSortDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_SortDescription")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_UpScopeActionPhrase")
    @js.native
    def rsUpScopeActionPhrase: String = js.native
    
    inline def rsUpScopeActionPhrase_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_UpScopeActionPhrase")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.rs_Upscope")
    @js.native
    def rsUpscope: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.rs_UpscopeTitle")
    @js.native
    def rsUpscopeTitle: String = js.native
    
    inline def rsUpscopeTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_UpscopeTitle")(x.asInstanceOf[js.Any])
    
    inline def rsUpscope_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rs_Upscope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_AccessKey")
    @js.native
    def sbAccessKey: String = js.native
    
    inline def sbAccessKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_AccessKey")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_AdvancedLink")
    @js.native
    def sbAdvancedLink: String = js.native
    
    inline def sbAdvancedLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_AdvancedLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_EmptyQueryWarning")
    @js.native
    def sbEmptyQueryWarning: String = js.native
    
    inline def sbEmptyQueryWarning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_EmptyQueryWarning")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_GoNav")
    @js.native
    def sbGoNav: String = js.native
    
    inline def sbGoNav_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_GoNav")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_GoSearch")
    @js.native
    def sbGoSearch: String = js.native
    
    inline def sbGoSearch_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_GoSearch")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_InvalidResultPageURL")
    @js.native
    def sbInvalidResultPageURL: String = js.native
    
    inline def sbInvalidResultPageURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_InvalidResultPageURL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_PreferencesLink")
    @js.native
    def sbPreferencesLink: String = js.native
    
    inline def sbPreferencesLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_PreferencesLink")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_Prompt")
    @js.native
    def sbPrompt: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.sb_Prompt_NavNode")
    @js.native
    def sbPromptNavNode: String = js.native
    
    inline def sbPromptNavNode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_Prompt_NavNode")(x.asInstanceOf[js.Any])
    
    inline def sbPrompt_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_Prompt")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_ResultsPageTitle")
    @js.native
    def sbResultsPageTitle: String = js.native
    
    inline def sbResultsPageTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_ResultsPageTitle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_SearchInProgress")
    @js.native
    def sbSearchInProgress: String = js.native
    
    inline def sbSearchInProgress_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_SearchInProgress")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.sb_SitePrompt")
    @js.native
    def sbSitePrompt: String = js.native
    
    inline def sbSitePrompt_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sb_SitePrompt")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.searchResult_NoResult")
    @js.native
    def searchResultNoResult: String = js.native
    
    inline def searchResultNoResult_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchResult_NoResult")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.tprprt_excel_report_entrypoint")
    @js.native
    def tprprtExcelReportEntrypoint: String = js.native
    
    inline def tprprtExcelReportEntrypoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tprprt_excel_report_entrypoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.tprprt_Lifetime")
    @js.native
    def tprprtLifetime: String = js.native
    
    inline def tprprtLifetime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tprprt_Lifetime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.tprprt_Recent")
    @js.native
    def tprprtRecent: String = js.native
    
    inline def tprprtRecent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tprprt_Recent")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.u_ScriptLoadFail")
    @js.native
    def uScriptLoadFail: String = js.native
    
    /* static member */
    @JSGlobal("Srch.Res.u_ScriptLoadFailForViewer")
    @js.native
    def uScriptLoadFailForViewer: String = js.native
    
    inline def uScriptLoadFailForViewer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("u_ScriptLoadFailForViewer")(x.asInstanceOf[js.Any])
    
    inline def uScriptLoadFail_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("u_ScriptLoadFail")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.Res.us_NoTerm_Error")
    @js.native
    def usNoTermError: String = js.native
    
    inline def usNoTermError_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("us_NoTerm_Error")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Srch.Result")
  @js.native
  open class Result protected ()
    extends StObject
       with typings.sharepoint.Srch.Result {
    def this(elem: Element) = this()
    
    /* CompleteClass */
    override def activate(
      prompt: String,
      searchBoxId: String,
      searchBoxDivId: String,
      navButtonId: String,
      suggestionsListId: String,
      navListId: String,
      searchBoxLinkId: String,
      searchBoxProgressClass: String,
      searchBoxPromptClass: String
    ): Unit = js.native
    
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
    
    //#endregion
    //#region Events
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def add_disposing(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def add_oneTimeResultRendered(value: Any): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def add_propertyChanged(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def add_queryReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def add_resultRendered(value: Any): Unit = js.native
    
    /* CompleteClass */
    var alternateRenderContext: Any = js.native
    
    /* CompleteClass */
    var alternateRenderer: Any = js.native
    
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def changeQueryLanguage(queryLanguage: Double): Unit = js.native
    
    /* CompleteClass */
    override def changeQueryTerm(queryTerm: Any): Unit = js.native
    
    /* CompleteClass */
    override def clickHandler(e: Event): Any = js.native
    
    /* CompleteClass */
    override def dataProvider_QueryIssuing(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def dataProvider_ResultReady(sender: Any, e: Any): Unit = js.native
    
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
    override def get_advancedSearchPageAddress(): String = js.native
    
    /* CompleteClass */
    override def get_advancedUrl(): String = js.native
    
    /* CompleteClass */
    override def get_alternateErrorMessage(): String = js.native
    
    /* CompleteClass */
    override def get_currentPageNumber(): Double = js.native
    
    /* CompleteClass */
    override def get_currentResultTableCollection(): Any = js.native
    
    /* CompleteClass */
    override def get_currentTerm(): String = js.native
    
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
    override def get_events(): Any = js.native
    
    /* CompleteClass */
    override def get_groupTemplateId(): String = js.native
    
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
    override def get_itemBodyTemplateId(): String = js.native
    
    /* CompleteClass */
    override def get_itemTemplateId(): String = js.native
    
    /* CompleteClass */
    override def get_maxPagesAfterCurrent(): Double = js.native
    
    /* CompleteClass */
    override def get_maxPagesBeforeCurrent(): Double = js.native
    
    /* CompleteClass */
    override def get_messages(): js.Array[Any] = js.native
    
    /** returns next unique identifier for nested controls */
    /* CompleteClass */
    override def get_nextUniqueId(): String = js.native
    
    /* CompleteClass */
    override def get_pagingInfo(): Any = js.native
    
    /* CompleteClass */
    override def get_preloadedItemTemplateIds(): js.Array[String] = js.native
    
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
    override def get_repositionLanguageDropDown(): Boolean = js.native
    
    /* CompleteClass */
    override def get_scrollToTopOnRedraw(): Boolean = js.native
    
    /* CompleteClass */
    override def get_selectedRefinementControls(): js.Array[CSRRefinementControl] = js.native
    
    /* CompleteClass */
    override def get_shouldShowNoResultMessage(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showAdvancedLink(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showAlertMe(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showBestBets(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showDataErrors(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showDefinitions(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showDidYouMean(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showLanguageOptions(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showNavigation(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showPaging(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showPersonalFavorites(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showPreferencesLink(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showQuerySuggestions(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showResultCount(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showResults(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showSortOptions(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showUpScopeMessage(): Boolean = js.native
    
    /* CompleteClass */
    override def get_showViewDuplicates(): Boolean = js.native
    
    /* CompleteClass */
    override def get_states(): Any = js.native
    
    /* CompleteClass */
    override def get_useSimplifiedQueryBuilder(): Boolean = js.native
    
    /* CompleteClass */
    override def handleClickOnCategoryLink(id: String): Unit = js.native
    
    /* CompleteClass */
    override def hasMessages(): Any = js.native
    
    /**
      * Initializes the current Component object.
      * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def invokeAlternateRender(callback: Any, container: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def invokeClientRenderer(node: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def loadRenderTemplateScripts(scriptReferences: Any, success: Any, failure: Any, timeout: Any, loadStandAloneCustomScripts: Any): Boolean = js.native
    
    /* CompleteClass */
    override def loadServerTemplateScripts(): Unit = js.native
    
    /* CompleteClass */
    var loaded: Boolean = js.native
    
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
    override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
    
    /* CompleteClass */
    override def page(startAt: Double): Unit = js.native
    
    /* CompleteClass */
    override def processDataErrorMessages(dataErrorsList: Any): Any = js.native
    
    /* CompleteClass */
    override def processDataProviderErrors(dataProviderToProcess: Any): Unit = js.native
    
    /* CompleteClass */
    override def processQueryIssuing(queryState: Any): Unit = js.native
    
    /* CompleteClass */
    override def processRenderingErrorMessages(ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def processResultReady(resultTableCollection: Any): Unit = js.native
    /* CompleteClass */
    override def processResultReady(resultTableCollection: ResultTableCollection): Unit = js.native
    
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
    override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseOneTimeResultRenderedEvent(arg: Any): Unit = js.native
    
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    
    /* CompleteClass */
    override def raiseQueryReadyEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseResultRenderedEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def refresh(queryState: Any): Unit = js.native
    
    /**
      * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
      * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
      *
      * @param className
      *          A string that contains the name of the CSS class to remove.
      */
    /* CompleteClass */
    override def removeCssClass(className: String): Unit = js.native
    
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def remove_disposing(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def remove_oneTimeResultRendered(value: Any): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def remove_propertyChanged(handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def remove_queryReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def remove_resultRendered(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def render(): Unit = js.native
    
    /* CompleteClass */
    override def renderControl(listData: Any, dataProvider: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_Load(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PostLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PreLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def serverTemplateScriptsCallback(): Unit = js.native
    
    /* CompleteClass */
    var serverTemplateScriptsToLoad: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def setAriaCollapsed(element: HTMLElement): Unit = js.native
    
    /** show/hide the DOM element associated with control */
    /* CompleteClass */
    override def setControlElementVisibility(showElement: Boolean): Any = js.native
    
    /* CompleteClass */
    override def set_advancedUrl(value: String): String = js.native
    
    /* CompleteClass */
    override def set_alternateErrorMessage(value: String): String = js.native
    
    /* CompleteClass */
    override def set_currentPageNumber(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_currentResultTableCollection(value: Any): Any = js.native
    
    /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
    /* CompleteClass */
    override def set_delayLoadTemplateScripts(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_emptyMessage(value: String): String = js.native
    
    /* CompleteClass */
    override def set_groupTemplateId(value: String): String = js.native
    
    /**
      * Sets the ID of the current Component object.
      * @param value A string that contains the ID of the component.
      */
    /* CompleteClass */
    override def set_id(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_itemBodyTemplateId(value: String): String = js.native
    
    /* CompleteClass */
    override def set_itemTemplateId(value: String): String = js.native
    
    /* CompleteClass */
    override def set_maxPagesAfterCurrent(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_maxPagesBeforeCurrent(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_messages(value: js.Array[Any]): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def set_preloadedItemTemplateIds(value: js.Array[String]): js.Array[String] = js.native
    
    /* CompleteClass */
    override def set_queryGroupName(value: String): String = js.native
    
    /* CompleteClass */
    override def set_renderTemplateId(value: String): String = js.native
    
    /* CompleteClass */
    override def set_renderedResult(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_repositionLanguageDropDown(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_scrollToTopOnRedraw(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_shouldShowNoResultMessage(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showAdvancedLink(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showAlertMe(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showBestBets(value: Boolean): Boolean = js.native
    
    /** False by default. */
    /* CompleteClass */
    override def set_showDataErrors(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showDefinitions(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showDidYouMean(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showLanguageOptions(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showPaging(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showPersonalFavorites(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showPreferencesLink(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showResultCount(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showResults(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showSortOptions(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showUpScopeMessage(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_showViewDuplicates(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_states(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_useSimplifiedQueryBuilder(value: Boolean): Boolean = js.native
    
    /** Returns true if the specified table has results and is enabled to be shown by this control */
    /* CompleteClass */
    override def shouldShowTable(resultTable: ResultTable): Boolean = js.native
    
    /* CompleteClass */
    override def sort(sortName: String): Unit = js.native
    
    /* CompleteClass */
    override def sortOrRank(sortRankName: String): Unit = js.native
    
    /**
      * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
      * @param className
      *          A string that contains the name of the CSS class to toggle.
      */
    /* CompleteClass */
    override def toggleCssClass(className: String): Unit = js.native
    
    /* CompleteClass */
    override def updateDisplayControlWithNewMessages(): Any = js.native
    
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
    
    /* CompleteClass */
    override def viewDuplicates(docId: Double): Unit = js.native
  }
  object Result {
    
    @JSGlobal("Srch.Result")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getSelectedPropertiesFromMappingDictionary(propMappings: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedPropertiesFromMappingDictionary")(propMappings.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    /* static member */
    inline def parsePropertyMappingWithSlotDisplayNames(mappings: Any): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePropertyMappingWithSlotDisplayNames")(mappings.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    
    /* static member */
    inline def parsePropertyMappingsString(mappings: Any): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePropertyMappingsString")(mappings.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  }
  
  @JSGlobal("Srch.ScriptApplicationManager")
  @js.native
  open class ScriptApplicationManager ()
    extends StObject
       with typings.sharepoint.Srch.ScriptApplicationManager
  object ScriptApplicationManager {
    
    @JSGlobal("Srch.ScriptApplicationManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getClientRuntimeContext(): ClientRuntimeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("get_clientRuntimeContext")().asInstanceOf[ClientRuntimeContext]
    
    /* static member */
    inline def getCurrent(): typings.sharepoint.Srch.ScriptApplicationManager = ^.asInstanceOf[js.Dynamic].applyDynamic("get_current")().asInstanceOf[typings.sharepoint.Srch.ScriptApplicationManager]
  }
  
  /** Represents the search box control */
  @JSGlobal("Srch.SearchBox")
  @js.native
  open class SearchBox protected ()
    extends StObject
       with typings.sharepoint.Srch.SearchBox {
    def this(elem: Element) = this()
    
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
    override def add_batchQueryIssuing(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def add_batchResultReady(value: Any): Unit = js.native
    
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
    override def add_queryReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    var alternateRenderContext: Any = js.native
    
    /* CompleteClass */
    var alternateRenderer: Any = js.native
    
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def clickHandler(e: Event): Any = js.native
    
    /* CompleteClass */
    override def dataProvider_QueryIssuing(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def dataProvider_QueryStateChanged(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def dataProvider_ResultReady(sender: Any, e: Any): Unit = js.native
    
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
    override def get_events(): Any = js.native
    
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
    override def get_messages(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def get_msBeforeShowingProgress(): Double = js.native
    
    /* CompleteClass */
    override def get_navigationButtonId(): String = js.native
    
    /* CompleteClass */
    override def get_navigationListId(): String = js.native
    
    /* CompleteClass */
    override def get_navigationNodes(): Any = js.native
    
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
    override def get_states(): Any = js.native
    
    /* CompleteClass */
    override def get_suggestionsListId(): String = js.native
    
    /* CompleteClass */
    override def get_tryInplaceQuery(): Boolean = js.native
    
    /* CompleteClass */
    override def get_updatePageTitle(): Boolean = js.native
    
    /* CompleteClass */
    override def hasMessages(): Any = js.native
    
    /* CompleteClass */
    override def hidePrompt(): Unit = js.native
    
    /**
      * Initializes the current Component object.
      * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def invokeAlternateRender(callback: Any, container: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def invokeClientRenderer(node: Any, ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def loadRenderTemplateScripts(scriptReferences: Any, success: Any, failure: Any, timeout: Any, loadStandAloneCustomScripts: Any): Boolean = js.native
    
    /* CompleteClass */
    override def loadServerTemplateScripts(): Unit = js.native
    
    /* CompleteClass */
    var loaded: Boolean = js.native
    
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
    override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
    
    /* CompleteClass */
    override def processDataErrorMessages(dataErrorsList: Any): Any = js.native
    
    /* CompleteClass */
    override def processDataProviderErrors(dataProviderToProcess: Any): Unit = js.native
    
    /* CompleteClass */
    override def processRenderingErrorMessages(ctx: Any): Any = js.native
    
    /* CompleteClass */
    override def raiseBatchQueryIssuingEvent(arg: Any): Unit = js.native
    
    /* CompleteClass */
    override def raiseBatchResultReadyEvent(arg: Any): Unit = js.native
    
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
    override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
    
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    
    /* CompleteClass */
    override def raiseQueryReadyEvent(arg: Any): Unit = js.native
    
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
    override def remove_batchQueryIssuing(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def remove_batchResultReady(value: Any): Unit = js.native
    
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
    override def remove_queryReady(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def renderControl(listData: Any, dataProvider: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_Load(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PostLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def scriptApplication_PreLoad(sender: Any, e: Any): Unit = js.native
    
    /* CompleteClass */
    override def search(term: String): Unit = js.native
    
    /* CompleteClass */
    override def serverTemplateScriptsCallback(): Unit = js.native
    
    /* CompleteClass */
    var serverTemplateScriptsToLoad: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def setBorder(focused: Boolean): Unit = js.native
    
    /** show/hide the DOM element associated with control */
    /* CompleteClass */
    override def setControlElementVisibility(showElement: Boolean): Any = js.native
    
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
    override def set_messages(value: js.Array[Any]): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def set_msBeforeShowingProgress(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_navigationButtonId(value: String): String = js.native
    
    /* CompleteClass */
    override def set_navigationListId(value: String): String = js.native
    
    /* CompleteClass */
    override def set_navigationNodes(value: Any): Any = js.native
    
    /* CompleteClass */
    override def set_pageTitlePrefix(value: String): String = js.native
    
    /* CompleteClass */
    override def set_personalResultCount(value: Double): Double = js.native
    
    /** Sets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
    /* CompleteClass */
    override def set_promptCssClass(value: String): String = js.native
    
    /* CompleteClass */
    override def set_queryGroupNames(value: Any): js.Array[String] = js.native
    
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
    override def set_states(value: Any): Any = js.native
    
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
    override def updateDisplayControlWithNewMessages(): Any = js.native
    
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
  }
  
  @JSGlobal("Srch.U")
  @js.native
  open class U ()
    extends StObject
       with typings.sharepoint.Srch.U
  object U {
    
    @JSGlobal("Srch.U")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Srch.U.Ids")
    @js.native
    open class Ids ()
      extends StObject
         with typings.sharepoint.Srch.U.Ids
    object Ids {
      
      @JSGlobal("Srch.U.Ids")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Srch.U.Ids.body")
      @js.native
      def body: _itemBody = js.native
      inline def body_=(x: _itemBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("body")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.deepLinks")
      @js.native
      def deepLinks: _deepLinks = js.native
      inline def deepLinks_=(x: _deepLinks): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepLinks")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.discussions")
      @js.native
      def discussions: _discussions = js.native
      inline def discussions_=(x: _discussions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("discussions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.group")
      @js.native
      def group: _group = js.native
      
      /* static member */
      @JSGlobal("Srch.U.Ids.groupContent")
      @js.native
      def groupContent: _groupContent = js.native
      inline def groupContent_=(x: _groupContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupContent")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.groupLink")
      @js.native
      def groupLink: _groupLink = js.native
      inline def groupLink_=(x: _groupLink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupLink")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.groupTitle")
      @js.native
      def groupTitle: _groupTitle = js.native
      inline def groupTitle_=(x: _groupTitle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupTitle")(x.asInstanceOf[js.Any])
      
      inline def group_=(x: _group): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("group")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.hover")
      @js.native
      def hover: _hover = js.native
      inline def hover_=(x: _hover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.icon")
      @js.native
      def icon: _itemIcon = js.native
      inline def icon_=(x: _itemIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.item")
      @js.native
      def item: _item = js.native
      inline def item_=(x: _item): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("item")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.likes")
      @js.native
      def likes: _likes = js.native
      inline def likes_=(x: _likes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("likes")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.members")
      @js.native
      def members: _members = js.native
      inline def members_=(x: _members): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("members")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.path")
      @js.native
      def path: _itemPath = js.native
      inline def path_=(x: _itemPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.postInfo")
      @js.native
      def postInfo: _postInfo = js.native
      inline def postInfo_=(x: _postInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postInfo")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.preview")
      @js.native
      def preview: _itemPreview = js.native
      inline def preview_=(x: _itemPreview): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preview")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.replies")
      @js.native
      def replies: _replies = js.native
      inline def replies_=(x: _replies): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replies")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.summary")
      @js.native
      def summary: _itemSummary = js.native
      inline def summary_=(x: _itemSummary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summary")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.title")
      @js.native
      def title: _itemTitle = js.native
      
      /* static member */
      @JSGlobal("Srch.U.Ids.titleLink")
      @js.native
      def titleLink: _itemTitleLink = js.native
      inline def titleLink_=(x: _itemTitleLink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLink")(x.asInstanceOf[js.Any])
      
      inline def title_=(x: _itemTitle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.Ids.visualBestBet")
      @js.native
      def visualBestBet: _visualBestBet = js.native
      inline def visualBestBet_=(x: _visualBestBet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visualBestBet")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Srch.U.LoadScriptsProgress")
    @js.native
    object LoadScriptsProgress extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.sharepoint.Srch.U.LoadScriptsProgress & Double] = js.native
      
      /* 2 */ val failure: typings.sharepoint.Srch.U.LoadScriptsProgress.failure & Double = js.native
      
      /* 0 */ val loading: typings.sharepoint.Srch.U.LoadScriptsProgress.loading & Double = js.native
      
      /* 1 */ val success: typings.sharepoint.Srch.U.LoadScriptsProgress.success & Double = js.native
    }
    
    @JSGlobal("Srch.U.LoadScriptsState")
    @js.native
    open class LoadScriptsState ()
      extends StObject
         with typings.sharepoint.Srch.U.LoadScriptsState {
      
      /* CompleteClass */
      var progress: Double = js.native
      
      /* CompleteClass */
      var scriptsToLoad: Any = js.native
      
      /* CompleteClass */
      var timeoutHandle: Any = js.native
    }
    
    @JSGlobal("Srch.U.PropNames")
    @js.native
    open class PropNames ()
      extends StObject
         with typings.sharepoint.Srch.U.PropNames
    object PropNames {
      
      @JSGlobal("Srch.U.PropNames")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.isFirstPinnedBlock")
      @js.native
      def isFirstPinnedBlock: IsFirstPinnedResultBlock = js.native
      inline def isFirstPinnedBlock_=(x: IsFirstPinnedResultBlock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFirstPinnedBlock")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.isFirstRankedBlock")
      @js.native
      def isFirstRankedBlock: IsFirstRankedResultBlock = js.native
      inline def isFirstRankedBlock_=(x: IsFirstRankedResultBlock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFirstRankedBlock")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.parentTableReference")
      @js.native
      def parentTableReference: ParentTableReference = js.native
      inline def parentTableReference_=(x: ParentTableReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentTableReference")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.properties")
      @js.native
      def properties: Properties = js.native
      inline def properties_=(x: Properties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.queryErrors")
      @js.native
      def queryErrors: QueryErrors = js.native
      inline def queryErrors_=(x: QueryErrors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryErrors")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.queryId")
      @js.native
      def queryId: QueryId = js.native
      inline def queryId_=(x: QueryId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryId")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.queryRuleId")
      @js.native
      def queryRuleId: QueryRuleId = js.native
      inline def queryRuleId_=(x: QueryRuleId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryRuleId")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.renderTemplateId")
      @js.native
      def renderTemplateId: RenderTemplateId = js.native
      inline def renderTemplateId_=(x: RenderTemplateId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderTemplateId")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.renderTemplates")
      @js.native
      def renderTemplates: RenderTemplates = js.native
      inline def renderTemplates_=(x: RenderTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderTemplates")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.resultRows")
      @js.native
      def resultRows: ResultRows = js.native
      inline def resultRows_=(x: ResultRows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resultRows")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.resultTables")
      @js.native
      def resultTables: ResultTables = js.native
      inline def resultTables_=(x: ResultTables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resultTables")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.rowCount")
      @js.native
      def rowCount: RowCount = js.native
      inline def rowCount_=(x: RowCount): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.tableType")
      @js.native
      def tableType: TableType = js.native
      inline def tableType_=(x: TableType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableType")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.totalRows")
      @js.native
      def totalRows: TotalRows = js.native
      
      /* static member */
      @JSGlobal("Srch.U.PropNames.totalRowsIncludingDuplicates")
      @js.native
      def totalRowsIncludingDuplicates: TotalRowsIncludingDuplicates = js.native
      inline def totalRowsIncludingDuplicates_=(x: TotalRowsIncludingDuplicates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalRowsIncludingDuplicates")(x.asInstanceOf[js.Any])
      
      inline def totalRows_=(x: TotalRows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalRows")(x.asInstanceOf[js.Any])
    }
    
    /** Same as $addHandler with safety checks */
    /* static member */
    inline def addHandler(
      element: Element,
      eventName: String,
      handler: js.Function2[/* instance */ Any, /* eventArgs */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addRenderContextCallback(
      renderCtx: Any,
      callbackType: Any,
      callbackFunction: Any,
      enforceUnique: Any,
      templateFunction: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRenderContextCallback")(renderCtx.asInstanceOf[js.Any], callbackType.asInstanceOf[js.Any], callbackFunction.asInstanceOf[js.Any], enforceUnique.asInstanceOf[js.Any], templateFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Uses SPAnimation to animate an element */
    /* static member */
    inline def animate(element: Element, animationID: Any, finishFunc: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(element.asInstanceOf[js.Any], animationID.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def animateResults(result: typings.sharepoint.Srch.Result, userAction: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animateResults")(result.asInstanceOf[js.Any], userAction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Safely pushes item to array (does nothing if the array is null or undefined) */
    /* static member */
    inline def appendArray(array: js.Array[Any], item: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def appendScriptsToLoad(scripts: js.Array[String], script: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendScriptsToLoad")(scripts.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Appends specified parameter key and value string to the specified URL */
    /* static member */
    inline def appendUrlParameter(url: String, keyAndValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendUrlParameter")(url.asInstanceOf[js.Any], keyAndValue.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Prevents default event action and stops further propagation of the event in the DOM */
    /* static member */
    inline def cancelEvent(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Prevents default event action or/and stops further propagation of the event in the DOM */
    /* static member */
    inline def cancelEventEx(e: Event, preventDefault: Boolean, stopPropagation: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cancelEventEx")(e.asInstanceOf[js.Any], preventDefault.asInstanceOf[js.Any], stopPropagation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Returns HTML for collapsible refiner title */
    /* static member */
    inline def collapsibleRefinerTitle(
      propertyName: String,
      idPrefix: String,
      title: String,
      iconClass: String,
      customOnClick: String,
      isExpanded: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("collapsibleRefinerTitle")(propertyName.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], title.asInstanceOf[js.Any], iconClass.asInstanceOf[js.Any], customOnClick.asInstanceOf[js.Any], isExpanded.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def collapsibleRefinerTitle(
      propertyName: String,
      idPrefix: String,
      title: String,
      iconClass: String,
      customOnClick: Null,
      isExpanded: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("collapsibleRefinerTitle")(propertyName.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any], title.asInstanceOf[js.Any], iconClass.asInstanceOf[js.Any], customOnClick.asInstanceOf[js.Any], isExpanded.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Concatenates two URL fragments and returns resulting URL */
    /* static member */
    inline def concatUrl(firstPart: String, secondPart: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("concatUrl")(firstPart.asInstanceOf[js.Any], secondPart.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    @JSGlobal("Srch.U.contentFixedWidthLength")
    @js.native
    def contentFixedWidthLength: Double = js.native
    inline def contentFixedWidthLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentFixedWidthLength")(x.asInstanceOf[js.Any])
    
    /** Returns copy of the passed source dictionary */
    /* static member */
    inline def copyDictionary(source: StringDictionary[Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyDictionary")(source.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    
    /** Copies the specified string to clipboard, if possible */
    /* static member */
    inline def copyLink(link: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyLink")(link.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def createBehavior(id: String, `type`: Any, properties: Any, targetElementId: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBehavior")(id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], targetElementId.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def createErrorObjectWithExecContext(messageText: Any, operationName: Any, templateFuncOrRenderCtx: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createErrorObjectWithExecContext")(messageText.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any], templateFuncOrRenderCtx.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def createFileIconAltText(container: Boolean, b: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileIconAltText")(container.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def createXMLDocument(xml: String): XMLDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createXMLDocument")(xml.asInstanceOf[js.Any]).asInstanceOf[XMLDocument]
    
    /** Returns true if the value parameter is null or empty string */
    /* static member */
    inline def e(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("e")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Ensures that the given URL protocol value is allowed. Returns the specified URL value if the protocol is allowed; empty string otherwise. */
    /* static member */
    inline def ensureAllowedProtocol(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureAllowedProtocol")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Adds the specified CSS class to element (if not there already) */
    /* static member */
    inline def ensureCSSClassNameExist(e: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureCSSClassNameExist")(e.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Removes the specified CSS class from the element */
    /* static member */
    inline def ensureCSSClassNameNotExist(e: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureCSSClassNameNotExist")(e.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Ensures that the given value is not null, undefined or empty; throws an exception otherwise. */
    /* static member */
    inline def ensureNotNullOrEmptyString(value: String, context: Any, methodName: String, paraName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNotNullOrEmptyString")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], paraName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Ensures that the given value is not null or undefined; throws an exception otherwise. */
    /* static member */
    inline def ensureNotNullOrUndefined(value: Any, context: Any, methodName: String, paraName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNotNullOrUndefined")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], paraName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def extractReplyTitleFromSummary(hitHighlightedSummary: String, titleLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractReplyTitleFromSummary")(hitHighlightedSummary.asInstanceOf[js.Any], titleLength.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def fillKeywordQuery(query: Any, dp: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillKeywordQuery")(query.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def findResultObjectFromDOM(e: Element, `type`: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findResultObjectFromDOM")(e.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Parses SharePoint array field value and returns array of strings */
    /* static member */
    inline def getArray(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /** Gets calendar type according to the current regional settings */
    /* static member */
    inline def getCalendarType(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalendarType")().asInstanceOf[Any]
    
    /** Returns the ClientControl associated with specified DOM element */
    /* static member */
    inline def getClientComponent(e: Element): typings.sharepoint.Srch.ClientControl = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientComponent")(e.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.Srch.ClientControl]
    
    /** Gets cookie by name */
    /* static member */
    inline def getCookie(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookie")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def getDeepLinks(deeplinks: String, maxRows: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepLinks")(deeplinks.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Parses user display name out from SharePoint user field value */
    /* static member */
    inline def getDisplayNameFromAuthorField(authorField: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayNameFromAuthorField")(authorField.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Safely gets field of an object (returns null if object is null or undefined) */
    /* static member */
    inline def getFieldOnObject(targetObject: Any, fieldName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldOnObject")(targetObject.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Returns URL to the folder.gif image */
    /* static member */
    inline def getFolderIconUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFolderIconUrl")().asInstanceOf[String]
    
    /** Returns formatted time string from seconds string, which contains a number that represents amount of seconds passed since 00:00:00 today */
    /* static member */
    inline def getFormattedTimeFromSeconds(secondsStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedTimeFromSeconds")(secondsStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Converts file extension to a more friendly representation, e.g. 'doc' => 'file_Word' */
    /* static member */
    inline def getFriendlyNameForFileExtension(fileExtension: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFriendlyNameForFileExtension")(fileExtension.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Returns human-friendly representation of the datetime value, e.g. "A few seconds ago"" */
    /* static member */
    inline def getFriendlyTimeInterval(dateTimeSince: js.Date, calendarType: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFriendlyTimeInterval")(dateTimeSince.asInstanceOf[js.Any], calendarType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Returns string that contains safe call to HP.Hide */
    /* static member */
    inline def getHideHoverPanelCallback(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHideHoverPanelCallback")().asInstanceOf[String]
    
    /* static member */
    inline def getHighlightedProperty(key: String, result: Any, property: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighlightedProperty")(key.asInstanceOf[js.Any], result.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Returns the hostname of current page */
    /* static member */
    inline def getHostName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostName")().asInstanceOf[String]
    
    /** Returns URL to the html16.png image */
    /* static member */
    inline def getIconUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconUrl")().asInstanceOf[String]
    
    /** Returns URL of the appropriate file image based on the file type identifier (see getFriendlyNameForFileExtension) */
    /* static member */
    inline def getIconUrlByFileExtension(item: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconUrlByFileExtension")(item.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getIconUrlByFileExtension(item: String, defaultIconPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconUrlByFileExtension")(item.asInstanceOf[js.Any], defaultIconPath.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def getImageSourceWithRendition(imageInfo: Any, width: Double, height: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceWithRendition")(imageInfo.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def getMultipleHHXMLNodeValues(xmlDoc: XMLDocument, nodeName: String, numItems: Double, rawDelimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleHHXMLNodeValues")(xmlDoc.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any], numItems.asInstanceOf[js.Any], rawDelimiter.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Safely gets field of an object or creates it if it is null or undefined */
    /* static member */
    inline def getOrCreateFieldOnObject(targetObject: Any, fieldName: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateFieldOnObject")(targetObject.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Returns specified by attributeName attribute of startingElement or of it's closest parent who has it */
    /* static member */
    inline def getParentAttributeByName(startingElement: Element, attributeName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentAttributeByName")(startingElement.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Returns the closest to startingElement parent of the specified tag name */
    /* static member */
    inline def getParentElementByName(startingElement: Element, tagName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentElementByName")(startingElement.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /** Returns display template registered (can be either string or function) */
    /* static member */
    inline def getRenderTemplateByName(name: String, renderCtx: Any): String | RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderTemplateByName")(name.asInstanceOf[js.Any], renderCtx.asInstanceOf[js.Any])).asInstanceOf[String | RenderFunction]
    
    /* static member */
    inline def getResultObject(id: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getResultObject")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** Returns string that contains safe call to HP.Show, passing over the itemId, hpContainerId and templateUrl parameters, and supplying false for wide parameter. */
    /* static member */
    inline def getShowHoverPanelCallback(itemId: String, hpContainerId: String, templateUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getShowHoverPanelCallback")(itemId.asInstanceOf[js.Any], hpContainerId.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Returns string that contains safe call to HP.Show, passing over the itemId, hpContainerId and templateUrl parameters, and supplying true for wide parameter. */
    /* static member */
    inline def getShowHoverPanelCallbackWide(itemId: String, hpContainerId: String, templateUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getShowHoverPanelCallbackWide")(itemId.asInstanceOf[js.Any], hpContainerId.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def getSingleHHXMLNodeValue(xmlDoc: XMLDocument, nodeName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingleHHXMLNodeValue")(xmlDoc.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Safely gets field of an object (returns empty string instead of null as "getFieldOnObject") */
    /* static member */
    inline def getStringFieldOnObject(targetObject: Any, fieldName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringFieldOnObject")(targetObject.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def getTableOfType(tableCollection: ResultTableCollection, tableTypeName: String): ResultTable = (^.asInstanceOf[js.Dynamic].applyDynamic("getTableOfType")(tableCollection.asInstanceOf[js.Any], tableTypeName.asInstanceOf[js.Any])).asInstanceOf[ResultTable]
    
    /** Gets a value from 'Properties' field object of the specified parent object */
    /* static member */
    inline def getTableProperty(parent: Any, propName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTableProperty")(parent.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Gets the URL of template based on display template function or the rendering context */
    /* static member */
    inline def getTemplateUrlFromFunctionOrRenderCtx(templateFunctionOrRenderCtx: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateUrlFromFunctionOrRenderCtx")(templateFunctionOrRenderCtx.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def getTrimmedProcessedHHXMLString(value: String, cutOff: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTrimmedProcessedHHXMLString")(value.asInstanceOf[js.Any], cutOff.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def getTrimmedString(value: String, cutOff: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTrimmedString")(value.asInstanceOf[js.Any], cutOff.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def getUnEncodedMultiValuedResults(multiValue: String, maxItems: Double, rawDelimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnEncodedMultiValuedResults")(multiValue.asInstanceOf[js.Any], maxItems.asInstanceOf[js.Any], rawDelimiter.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Parses username out from SharePoint user field value */
    /* static member */
    inline def getUsernameFromAuthorField(authorField: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsernameFromAuthorField")(authorField.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def getVideoImageWithFallbackSource(valueObject: Any, width: Double, height: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getVideoImageWithFallbackSource")(valueObject.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Returns the #s4-workspace element or if not found, then the fallback element */
    /* static member */
    inline def getWorkspace(fallback: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(fallback.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /* static member */
    inline def hideElement(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    @JSGlobal("Srch.U.hitHighlightingCloseTag")
    @js.native
    def hitHighlightingCloseTag: String = js.native
    inline def hitHighlightingCloseTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitHighlightingCloseTag")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.hitHighlightingOpenTag")
    @js.native
    def hitHighlightingOpenTag: String = js.native
    inline def hitHighlightingOpenTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitHighlightingOpenTag")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def htmlEncodeNonBase64ImageUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncodeNonBase64ImageUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def includeCSS(templateLink: String, relativeLink: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("includeCSS")(templateLink.asInstanceOf[js.Any], relativeLink.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def includeLanguageScript(templateLink: String, scriptLink: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("includeLanguageScript")(templateLink.asInstanceOf[js.Any], scriptLink.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def includeScript(templateLink: String, scriptLink: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("includeScript")(templateLink.asInstanceOf[js.Any], scriptLink.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Returns true if the obj parameter is array */
    /* static member */
    inline def isArray(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Returns true if specified by logoUrl image is one of default site logos */
    /* static member */
    inline def isDefaultSiteLogo(logoUrl: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultSiteLogo")(logoUrl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Returns true if current page is osssearchresults.aspx */
    /* static member */
    inline def isDefaultSiteSearchPage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultSiteSearchPage")().asInstanceOf[Boolean]
    
    /** Returns true if the specified element is a descendant of the container element */
    /* static member */
    inline def isDescendant(element: Element, container: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDescendant")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** Returns true if the keyCode is \n or \r */
    /* static member */
    inline def isEnterKey(keyCode: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnterKey")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def isFirstPromotedBlock(resultTable: ResultTable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstPromotedBlock")(resultTable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def isFirstRankedBlock(resultTable: ResultTable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstRankedBlock")(resultTable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Returns true if the specified item is found in the specified array (uses '===' for comparing) */
    /* static member */
    inline def isInArray(array: js.Array[Any], item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def isIntentTable(resultTable: ResultTable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntentTable")(resultTable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Returns true if current page is in edit mode */
    /* static member */
    inline def isPageInEditMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPageInEditMode")().asInstanceOf[Boolean]
    
    /** Returns true if current page is displayed in the Minimal Download Strategy (MDS) mode */
    /* static member */
    inline def isPageInMdsMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPageInMdsMode")().asInstanceOf[Boolean]
    
    /* static member */
    inline def isPagePartialLoad(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPagePartialLoad")().asInstanceOf[Boolean]
    
    /** Returns true if the obj parameter is null, undefined, number or string */
    /* static member */
    inline def isPrimitive(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Indicates whether the specified protocol is allowed. */
    /* static member */
    inline def isProtocolAllowed(value: String, allowRelativeUrl: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProtocolAllowed")(value.asInstanceOf[js.Any], allowRelativeUrl.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** Returns true if the current page uses right-to-left mode (RTL) */
    /* static member */
    inline def isRTL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")().asInstanceOf[Boolean]
    
    /* static member */
    inline def isSPFSKU(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSPFSKU")().asInstanceOf[Boolean]
    
    /** Returns true if the specified URL belongs to the specified host name */
    /* static member */
    inline def isSameHost(url: String, hostName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameHost")(url.asInstanceOf[js.Any], hostName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def isSubstrateTable(resultTable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubstrateTable")(resultTable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def isTableTypeof(resultTable: Any, tableTypeName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTableTypeof")(resultTable.asInstanceOf[js.Any], tableTypeName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** Returns true if the URL is a relative URL, but not a server-relative URL */
    /* static member */
    inline def isUrlPagelRelative(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlPagelRelative")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Returns true if the URL is a relative URL */
    /* static member */
    inline def isUrlRelative(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlRelative")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Returns true if the URL is a server-relative URL (i.e. starts with '/') */
    /* static member */
    inline def isUrlServerRelative(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlServerRelative")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Returns true if the fileExtension belongs to a webpage, e.g. 'ascx', 'aspx', 'html', 'php', etc.  */
    /* static member */
    inline def isWebPage(fileExtension: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebPage")(fileExtension.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Retrieves localized string with the specified id */
    /* static member */
    inline def loadResource(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loadResource")(id.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Retrieves localized string with the specified id */
    /* static member */
    inline def loadResourceForTemplate(id: String, templateFunc: js.Function1[/* ctx */ Any, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("loadResourceForTemplate")(id.asInstanceOf[js.Any], templateFunc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def loadScripts(scriptReferences: js.Array[String], success: Any, failure: Any, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadScripts")(scriptReferences.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def logClick(e: Any, clickType: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logClick")(e.asInstanceOf[js.Any], clickType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def logRenderingErrorMessageToContext(renderCtx: Any, messageText: Any, operationName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logRenderingErrorMessageToContext")(renderCtx.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @JSGlobal("Srch.U.maximumSocialMetadataValue")
    @js.native
    def maximumSocialMetadataValue: Double = js.native
    inline def maximumSocialMetadataValue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximumSocialMetadataValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def modifyMediaDurationRefinementName(resultRow: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyMediaDurationRefinementName")(resultRow.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Returns true if the value parameter is null or undefined */
    /* static member */
    inline def n(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("n")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def parseTypedRangeToken(rangeFilterToken: String, objToStoreFilterTokenType: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypedRangeToken")(rangeFilterToken.asInstanceOf[js.Any], objToStoreFilterTokenType.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    @JSGlobal("Srch.U.pathTruncationLength")
    @js.native
    def pathTruncationLength: Double = js.native
    
    /* static member */
    @JSGlobal("Srch.U.pathTruncationLengthWithMetadata")
    @js.native
    def pathTruncationLengthWithMetadata: Double = js.native
    inline def pathTruncationLengthWithMetadata_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathTruncationLengthWithMetadata")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.pathTruncationLengthWithPreview")
    @js.native
    def pathTruncationLengthWithPreview: Double = js.native
    inline def pathTruncationLengthWithPreview_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathTruncationLengthWithPreview")(x.asInstanceOf[js.Any])
    
    inline def pathTruncationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathTruncationLength")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.personaControlRenderedThreshold")
    @js.native
    def personaControlRenderedThreshold: Double = js.native
    inline def personaControlRenderedThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("personaControlRenderedThreshold")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def positionElement(element: Element, offset: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("positionElement")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def processHHXML(pre: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("processHHXML")(pre.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def registerLoadedScripts(scripts: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadedScripts")(scripts.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Registers display template function in the system.
      *  @param name Identifier of the template. Usually template is registered twice: by URL and by name.
      *  @param template The display template. It can be either string, or function, that gets the CSR context object and returns HTML string
      */
    /* static member */
    inline def registerRenderTemplateByName(name: String, templateFunction: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenderTemplateByName")(name.asInstanceOf[js.Any], templateFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerRenderTemplateByName(name: String, templateFunction: RenderFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenderTemplateByName")(name.asInstanceOf[js.Any], templateFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Registers in system resources defined by the dictionary object */
    /* static member */
    inline def registerResourceDictionary(locale: String, dict: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceDictionary")(locale.asInstanceOf[js.Any], dict.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Removes the specified item from the specified array and returns array that has the deleted item */
    /* static member */
    inline def removeArray(array: js.Array[Any], item: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /** Same as $removeHandler with safety checks */
    /* static member */
    inline def removeHandler(
      element: Element,
      eventName: String,
      handler: js.Function2[/* instance */ Any, /* eventArgs */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHandler")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Renders datetime value in friendly format into element specified by targetElementID */
    /* static member */
    inline def renderFriendlyTimeIntervalString(dateTimeSinceUTC: js.Date, targetElementID: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFriendlyTimeIntervalString")(dateTimeSinceUTC.asInstanceOf[js.Any], targetElementID.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def renderFriendlyTimeIntervalString(dateTimeSinceUTC: js.Date, targetElementID: String, calendarType: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFriendlyTimeIntervalString")(dateTimeSinceUTC.asInstanceOf[js.Any], targetElementID.asInstanceOf[js.Any], calendarType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Replaces tokens {searchcenterurl}, {contexturl}, {resultsurl}, {defaultpageslistname}, {Locale} and others, and converts URL to server-relative */
    /* static member */
    inline def replaceUrlTokens(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceUrlTokens")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def resetElement(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Returns the CSR template that was previously registered using 'registerRenderTemplateByName' based on CSR template level */
    /* static member */
    inline def resolveRenderTemplate(
      renderCtx: Any,
      component: typings.sharepoint.Srch.ClientControl,
      level: Item | Group | View | Body
    ): String | RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRenderTemplate")(renderCtx.asInstanceOf[js.Any], component.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String | RenderFunction]
    
    /* static member */
    inline def restorePath(el: Element, originalText: String, selectText: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restorePath")(el.asInstanceOf[js.Any], originalText.asInstanceOf[js.Any], selectText.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def restoreText(el: Element, originalText: String, selectText: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreText")(el.asInstanceOf[js.Any], originalText.asInstanceOf[js.Any], selectText.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def selectPath(text: String, el: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectPath")(text.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def selectText(text: String, el: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectText")(text.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Adds cookie with specified parameters */
    /* static member */
    inline def setCookie(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCookie(name: String, value: String, expires: js.Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCookie(name: String, value: String, expires: js.Date, domain: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCookie(name: String, value: String, expires: js.Date, domain: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCookie(name: String, value: String, expires: js.Date, domain: Unit, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCookie(name: String, value: String, expires: Unit, domain: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCookie(name: String, value: String, expires: Unit, domain: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setCookie(name: String, value: String, expires: Unit, domain: Unit, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Safely sets field of an object (does nothing if either object or fieldName is null/empty); returns true if value was set */
    /* static member */
    inline def setFieldOnObject(targetObject: Any, fieldName: String, fieldValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setFieldOnObject")(targetObject.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], fieldValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def setItemRenderWrapper(renderCtx: Any, itemRenderWrapperFunction: Any, templateFunction: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setItemRenderWrapper")(renderCtx.asInstanceOf[js.Any], itemRenderWrapperFunction.asInstanceOf[js.Any], templateFunction.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def setPath(e: Event, el: Element, text: String, originalText: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(e.asInstanceOf[js.Any], el.asInstanceOf[js.Any], text.asInstanceOf[js.Any], originalText.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def setResultObject(id: String, resultObject: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setResultObject")(id.asInstanceOf[js.Any], resultObject.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def shouldAnimate(dp: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldAnimate")(dp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def showElement(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    @JSGlobal("Srch.U.summaryTruncationLength")
    @js.native
    def summaryTruncationLength: Double = js.native
    
    /* static member */
    @JSGlobal("Srch.U.summaryTruncationLengthWithPreview")
    @js.native
    def summaryTruncationLengthWithPreview: Double = js.native
    inline def summaryTruncationLengthWithPreview_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryTruncationLengthWithPreview")(x.asInstanceOf[js.Any])
    
    inline def summaryTruncationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryTruncationLength")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.titleTruncationLength")
    @js.native
    def titleTruncationLength: Double = js.native
    
    /* static member */
    @JSGlobal("Srch.U.titleTruncationLengthWithMetadata")
    @js.native
    def titleTruncationLengthWithMetadata: Double = js.native
    inline def titleTruncationLengthWithMetadata_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleTruncationLengthWithMetadata")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Srch.U.titleTruncationLengthWithPreview")
    @js.native
    def titleTruncationLengthWithPreview: Double = js.native
    inline def titleTruncationLengthWithPreview_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleTruncationLengthWithPreview")(x.asInstanceOf[js.Any])
    
    inline def titleTruncationLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleTruncationLength")(x.asInstanceOf[js.Any])
    
    /** Returns human-readable size in kilobytes/megabytes etc. (the captions are localized) */
    /* static member */
    inline def toFileSizeDisplay(numberOfBytes: Double, showDecimalPart: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileSizeDisplay")(numberOfBytes.asInstanceOf[js.Any], showDecimalPart.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Returns formatted date */
    /* static member */
    inline def toFormattedDate(dateValue: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toFormattedDate")(dateValue.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toFormattedDate(dateValue: js.Date, dateTimeFormatId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toFormattedDate")(dateValue.asInstanceOf[js.Any], dateTimeFormatId.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Returns formatted number */
    /* static member */
    inline def toFormattedNumber(num: Double, defaultDecimalPlacesIfNotInt: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toFormattedNumber")(num.asInstanceOf[js.Any], defaultDecimalPlacesIfNotInt.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** If number is more than 1000, rounds up three last digits, e.g. 72389 => '72,000+'. If number is more than 100000, returns '100,000+' */
    /* static member */
    inline def toFriendlyNumber(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toFriendlyNumber")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def trace(c: typings.sharepoint.Srch.ClientControl, method: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(c.asInstanceOf[js.Any], method.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def traceFormatted(c: typings.sharepoint.Srch.ClientControl, method: String, format: String, values: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traceFormatted")((List(c.asInstanceOf[js.Any], method.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(values.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
    
    /** Removes trailing spaces and also replaces double spaces inside string to single spaces */
    /* static member */
    inline def trimExtraSpaces(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimExtraSpaces")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def trimTitle(title: String, maximumLengthInChars: Double, numberOfTermsToUse: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimTitle")(title.asInstanceOf[js.Any], maximumLengthInChars.asInstanceOf[js.Any], numberOfTermsToUse.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Truncates the string to specified maximum allowed amount of characters (if max amount is not exceeded - does nothing) */
    /* static member */
    inline def truncateEnd(original: String, maxChars: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateEnd")(original.asInstanceOf[js.Any], maxChars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def truncateHighlightedUrl(url: String, maxChars: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateHighlightedUrl")(url.asInstanceOf[js.Any], maxChars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def truncateUrl(url: String, maxChars: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateUrl")(url.asInstanceOf[js.Any], maxChars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Adds ctag parameter to the URL and replaces URL tokens */
    /* static member */
    inline def urlTokenExpansion(jsLink: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlTokenExpansion")(jsLink.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Returns true if the value parameter is empty string */
    /* static member */
    inline def w(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("w")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("Srch.UserActionType")
  @js.native
  object UserActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.Srch.UserActionType & Double] = js.native
    
    /* 5 */ val filterLanguage: typings.sharepoint.Srch.UserActionType.filterLanguage & Double = js.native
    
    /* 1 */ val pageNext: typings.sharepoint.Srch.UserActionType.pageNext & Double = js.native
    
    /* 2 */ val pagePrev: typings.sharepoint.Srch.UserActionType.pagePrev & Double = js.native
    
    /* 3 */ val refine: typings.sharepoint.Srch.UserActionType.refine & Double = js.native
    
    /* 0 */ val search: typings.sharepoint.Srch.UserActionType.search & Double = js.native
    
    /* 4 */ val sort: typings.sharepoint.Srch.UserActionType.sort & Double = js.native
  }
}
