package typings.sharepoint.Srch

import typings.microsoftAjax.Sys.UI.Control
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientControl
  extends StObject
     with Control {
  
  var alternateRenderContext: js.Any
  
  var alternateRenderer: js.Any
  
  def clickHandler(e: Event): js.Any
  
  def get_alternateErrorMessage(): String
  
  /** Returns true if control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def get_delayLoadTemplateScripts(): Boolean
  
  /** returns true if control has already been loaded at least once */
  def get_isInitialLoad(): Boolean
  
  def get_messages(): js.Array[js.Any]
  
  /** returns next unique identifier for nested controls */
  def get_nextUniqueId(): String
  
  /** Gets the id of View display template that is used to render this control.
    * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
    */
  def get_renderTemplateId(): String
  
  def get_showDataErrors(): Boolean
  
  def get_states(): js.Any
  
  def hasMessages(): js.Any
  
  def invokeAlternateRender(callback: js.Any, container: js.Any, ctx: js.Any): js.Any
  
  def invokeClientRenderer(node: js.Any, ctx: js.Any): js.Any
  
  def loadRenderTemplateScripts(
    scriptReferences: js.Any,
    success: js.Any,
    failure: js.Any,
    timeout: js.Any,
    loadStandAloneCustomScripts: js.Any
  ): Boolean
  
  def loadServerTemplateScripts(): Unit
  
  var loaded: Boolean
  
  def processDataErrorMessages(dataErrorsList: js.Any): js.Any
  
  def processDataProviderErrors(dataProviderToProcess: js.Any): Unit
  
  def processRenderingErrorMessages(ctx: js.Any): js.Any
  
  def renderControl(listData: js.Any, dataProvider: js.Any): Unit
  
  def scriptApplication_Load(sender: js.Any, e: js.Any): Unit
  
  def scriptApplication_PostLoad(sender: js.Any, e: js.Any): Unit
  
  def scriptApplication_PreLoad(sender: js.Any, e: js.Any): Unit
  
  def serverTemplateScriptsCallback(): Unit
  
  var serverTemplateScriptsToLoad: js.Array[js.Any]
  
  /** show/hide the DOM element associated with control */
  def setControlElementVisibility(showElement: Boolean): js.Any
  
  def set_alternateErrorMessage(value: String): String
  
  /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def set_delayLoadTemplateScripts(value: Boolean): Boolean
  
  def set_messages(value: js.Array[js.Any]): js.Array[js.Any]
  
  def set_renderTemplateId(value: String): String
  
  /** False by default. */
  def set_showDataErrors(value: Boolean): Boolean
  
  def set_states(value: js.Any): js.Any
  
  def updateDisplayControlWithNewMessages(): js.Any
}
object ClientControl {
  
  inline def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    beginUpdate: () => Unit,
    clickHandler: Event => js.Any,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_alternateErrorMessage: () => String,
    get_delayLoadTemplateScripts: () => Boolean,
    get_element: () => HTMLElement,
    get_events: () => js.Any,
    get_id: () => String,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_messages: () => js.Array[js.Any],
    get_nextUniqueId: () => String,
    get_renderTemplateId: () => String,
    get_showDataErrors: () => Boolean,
    get_states: () => js.Any,
    hasMessages: () => js.Any,
    initialize: () => Unit,
    invokeAlternateRender: (js.Any, js.Any, js.Any) => js.Any,
    invokeClientRenderer: (js.Any, js.Any) => js.Any,
    loadRenderTemplateScripts: (js.Any, js.Any, js.Any, js.Any, js.Any) => Boolean,
    loadServerTemplateScripts: () => Unit,
    loaded: Boolean,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    processDataErrorMessages: js.Any => js.Any,
    processDataProviderErrors: js.Any => Unit,
    processRenderingErrorMessages: js.Any => js.Any,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raisePropertyChanged: String => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    renderControl: (js.Any, js.Any) => Unit,
    scriptApplication_Load: (js.Any, js.Any) => Unit,
    scriptApplication_PostLoad: (js.Any, js.Any) => Unit,
    scriptApplication_PreLoad: (js.Any, js.Any) => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[js.Any],
    setControlElementVisibility: Boolean => js.Any,
    set_alternateErrorMessage: String => String,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_id: String => Unit,
    set_messages: js.Array[js.Any] => js.Array[js.Any],
    set_renderTemplateId: String => String,
    set_showDataErrors: Boolean => Boolean,
    set_states: js.Any => js.Any,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => js.Any,
    updated: () => Unit
  ): ClientControl = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_states = js.Any.fromFunction0(get_states), hasMessages = js.Any.fromFunction0(hasMessages), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_id = js.Any.fromFunction1(set_id), set_messages = js.Any.fromFunction1(set_messages), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_states = js.Any.fromFunction1(set_states), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[ClientControl]
  }
  
  extension [Self <: ClientControl](x: Self) {
    
    inline def setAlternateRenderContext(value: js.Any): Self = StObject.set(x, "alternateRenderContext", value.asInstanceOf[js.Any])
    
    inline def setAlternateRenderer(value: js.Any): Self = StObject.set(x, "alternateRenderer", value.asInstanceOf[js.Any])
    
    inline def setClickHandler(value: Event => js.Any): Self = StObject.set(x, "clickHandler", js.Any.fromFunction1(value))
    
    inline def setGet_alternateErrorMessage(value: () => String): Self = StObject.set(x, "get_alternateErrorMessage", js.Any.fromFunction0(value))
    
    inline def setGet_delayLoadTemplateScripts(value: () => Boolean): Self = StObject.set(x, "get_delayLoadTemplateScripts", js.Any.fromFunction0(value))
    
    inline def setGet_isInitialLoad(value: () => Boolean): Self = StObject.set(x, "get_isInitialLoad", js.Any.fromFunction0(value))
    
    inline def setGet_messages(value: () => js.Array[js.Any]): Self = StObject.set(x, "get_messages", js.Any.fromFunction0(value))
    
    inline def setGet_nextUniqueId(value: () => String): Self = StObject.set(x, "get_nextUniqueId", js.Any.fromFunction0(value))
    
    inline def setGet_renderTemplateId(value: () => String): Self = StObject.set(x, "get_renderTemplateId", js.Any.fromFunction0(value))
    
    inline def setGet_showDataErrors(value: () => Boolean): Self = StObject.set(x, "get_showDataErrors", js.Any.fromFunction0(value))
    
    inline def setGet_states(value: () => js.Any): Self = StObject.set(x, "get_states", js.Any.fromFunction0(value))
    
    inline def setHasMessages(value: () => js.Any): Self = StObject.set(x, "hasMessages", js.Any.fromFunction0(value))
    
    inline def setInvokeAlternateRender(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "invokeAlternateRender", js.Any.fromFunction3(value))
    
    inline def setInvokeClientRenderer(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "invokeClientRenderer", js.Any.fromFunction2(value))
    
    inline def setLoadRenderTemplateScripts(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Boolean): Self = StObject.set(x, "loadRenderTemplateScripts", js.Any.fromFunction5(value))
    
    inline def setLoadServerTemplateScripts(value: () => Unit): Self = StObject.set(x, "loadServerTemplateScripts", js.Any.fromFunction0(value))
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setProcessDataErrorMessages(value: js.Any => js.Any): Self = StObject.set(x, "processDataErrorMessages", js.Any.fromFunction1(value))
    
    inline def setProcessDataProviderErrors(value: js.Any => Unit): Self = StObject.set(x, "processDataProviderErrors", js.Any.fromFunction1(value))
    
    inline def setProcessRenderingErrorMessages(value: js.Any => js.Any): Self = StObject.set(x, "processRenderingErrorMessages", js.Any.fromFunction1(value))
    
    inline def setRenderControl(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "renderControl", js.Any.fromFunction2(value))
    
    inline def setScriptApplication_Load(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "scriptApplication_Load", js.Any.fromFunction2(value))
    
    inline def setScriptApplication_PostLoad(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "scriptApplication_PostLoad", js.Any.fromFunction2(value))
    
    inline def setScriptApplication_PreLoad(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "scriptApplication_PreLoad", js.Any.fromFunction2(value))
    
    inline def setServerTemplateScriptsCallback(value: () => Unit): Self = StObject.set(x, "serverTemplateScriptsCallback", js.Any.fromFunction0(value))
    
    inline def setServerTemplateScriptsToLoad(value: js.Array[js.Any]): Self = StObject.set(x, "serverTemplateScriptsToLoad", value.asInstanceOf[js.Any])
    
    inline def setServerTemplateScriptsToLoadVarargs(value: js.Any*): Self = StObject.set(x, "serverTemplateScriptsToLoad", js.Array(value :_*))
    
    inline def setSetControlElementVisibility(value: Boolean => js.Any): Self = StObject.set(x, "setControlElementVisibility", js.Any.fromFunction1(value))
    
    inline def setSet_alternateErrorMessage(value: String => String): Self = StObject.set(x, "set_alternateErrorMessage", js.Any.fromFunction1(value))
    
    inline def setSet_delayLoadTemplateScripts(value: Boolean => Boolean): Self = StObject.set(x, "set_delayLoadTemplateScripts", js.Any.fromFunction1(value))
    
    inline def setSet_messages(value: js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "set_messages", js.Any.fromFunction1(value))
    
    inline def setSet_renderTemplateId(value: String => String): Self = StObject.set(x, "set_renderTemplateId", js.Any.fromFunction1(value))
    
    inline def setSet_showDataErrors(value: Boolean => Boolean): Self = StObject.set(x, "set_showDataErrors", js.Any.fromFunction1(value))
    
    inline def setSet_states(value: js.Any => js.Any): Self = StObject.set(x, "set_states", js.Any.fromFunction1(value))
    
    inline def setUpdateDisplayControlWithNewMessages(value: () => js.Any): Self = StObject.set(x, "updateDisplayControlWithNewMessages", js.Any.fromFunction0(value))
  }
}
