package typings.sharepoint.Srch

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayControl
  extends StObject
     with ClientControl {
  
  def add_oneTimeResultRendered(value: Any): Unit
  
  def add_queryReady(value: Any): Unit
  
  def add_resultRendered(value: Any): Unit
  
  def dataProvider_QueryIssuing(sender: Any, e: Any): Unit
  
  def dataProvider_ResultReady(sender: Any, e: Any): Unit
  
  def get_currentResultTableCollection(): Any
  
  def get_dataProvider(): DataProvider
  
  def get_emptyMessage(): String
  
  def get_queryGroupName(): String
  
  def get_renderedResult(): Boolean
  
  def get_shouldShowNoResultMessage(): Boolean
  
  def processQueryIssuing(queryState: Any): Unit
  
  def processResultReady(resultTableCollection: Any): Unit
  
  def raiseOneTimeResultRenderedEvent(arg: Any): Unit
  
  def raiseQueryReadyEvent(arg: Any): Unit
  
  def raiseResultRenderedEvent(arg: Any): Unit
  
  def refresh(queryState: Any): Unit
  
  def remove_oneTimeResultRendered(value: Any): Unit
  
  def remove_queryReady(value: Any): Unit
  
  def remove_resultRendered(value: Any): Unit
  
  def render(): Unit
  
  def set_currentResultTableCollection(value: Any): Any
  
  def set_emptyMessage(value: String): String
  
  def set_queryGroupName(value: String): String
  
  def set_renderedResult(value: Boolean): Boolean
  
  def set_shouldShowNoResultMessage(value: Boolean): Boolean
}
object DisplayControl {
  
  inline def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_oneTimeResultRendered: Any => Unit,
    add_propertyChanged: js.Function => Unit,
    add_queryReady: Any => Unit,
    add_resultRendered: Any => Unit,
    alternateRenderContext: Any,
    alternateRenderer: Any,
    beginUpdate: () => Unit,
    clickHandler: Event => Any,
    dataProvider_QueryIssuing: (Any, Any) => Unit,
    dataProvider_ResultReady: (Any, Any) => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_alternateErrorMessage: () => String,
    get_currentResultTableCollection: () => Any,
    get_dataProvider: () => DataProvider,
    get_delayLoadTemplateScripts: () => Boolean,
    get_element: () => HTMLElement,
    get_emptyMessage: () => String,
    get_events: () => Any,
    get_id: () => String,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_messages: () => js.Array[Any],
    get_nextUniqueId: () => String,
    get_queryGroupName: () => String,
    get_renderTemplateId: () => String,
    get_renderedResult: () => Boolean,
    get_shouldShowNoResultMessage: () => Boolean,
    get_showDataErrors: () => Boolean,
    get_states: () => Any,
    hasMessages: () => Any,
    initialize: () => Unit,
    invokeAlternateRender: (Any, Any, Any) => Any,
    invokeClientRenderer: (Any, Any) => Any,
    loadRenderTemplateScripts: (Any, Any, Any, Any, Any) => Boolean,
    loadServerTemplateScripts: () => Unit,
    loaded: Boolean,
    onBubbleEvent: (Any, Any) => Boolean,
    processDataErrorMessages: Any => Any,
    processDataProviderErrors: Any => Unit,
    processQueryIssuing: Any => Unit,
    processRenderingErrorMessages: Any => Any,
    processResultReady: Any => Unit,
    raiseBubbleEvent: (Any, Any) => Unit,
    raiseOneTimeResultRenderedEvent: Any => Unit,
    raisePropertyChanged: String => Unit,
    raiseQueryReadyEvent: Any => Unit,
    raiseResultRenderedEvent: Any => Unit,
    refresh: Any => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_oneTimeResultRendered: Any => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_queryReady: Any => Unit,
    remove_resultRendered: Any => Unit,
    render: () => Unit,
    renderControl: (Any, Any) => Unit,
    scriptApplication_Load: (Any, Any) => Unit,
    scriptApplication_PostLoad: (Any, Any) => Unit,
    scriptApplication_PreLoad: (Any, Any) => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[Any],
    setControlElementVisibility: Boolean => Any,
    set_alternateErrorMessage: String => String,
    set_currentResultTableCollection: Any => Any,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_emptyMessage: String => String,
    set_id: String => Unit,
    set_messages: js.Array[Any] => js.Array[Any],
    set_queryGroupName: String => String,
    set_renderTemplateId: String => String,
    set_renderedResult: Boolean => Boolean,
    set_shouldShowNoResultMessage: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_states: Any => Any,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => Any,
    updated: () => Unit
  ): DisplayControl = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_oneTimeResultRendered = js.Any.fromFunction1(add_oneTimeResultRendered), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_queryReady = js.Any.fromFunction1(add_queryReady), add_resultRendered = js.Any.fromFunction1(add_resultRendered), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2(dataProvider_QueryIssuing), dataProvider_ResultReady = js.Any.fromFunction2(dataProvider_ResultReady), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_currentResultTableCollection = js.Any.fromFunction0(get_currentResultTableCollection), get_dataProvider = js.Any.fromFunction0(get_dataProvider), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_element = js.Any.fromFunction0(get_element), get_emptyMessage = js.Any.fromFunction0(get_emptyMessage), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_queryGroupName = js.Any.fromFunction0(get_queryGroupName), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_renderedResult = js.Any.fromFunction0(get_renderedResult), get_shouldShowNoResultMessage = js.Any.fromFunction0(get_shouldShowNoResultMessage), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_states = js.Any.fromFunction0(get_states), hasMessages = js.Any.fromFunction0(hasMessages), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processQueryIssuing = js.Any.fromFunction1(processQueryIssuing), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), processResultReady = js.Any.fromFunction1(processResultReady), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raiseOneTimeResultRenderedEvent = js.Any.fromFunction1(raiseOneTimeResultRenderedEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), raiseQueryReadyEvent = js.Any.fromFunction1(raiseQueryReadyEvent), raiseResultRenderedEvent = js.Any.fromFunction1(raiseResultRenderedEvent), refresh = js.Any.fromFunction1(refresh), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_oneTimeResultRendered = js.Any.fromFunction1(remove_oneTimeResultRendered), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_queryReady = js.Any.fromFunction1(remove_queryReady), remove_resultRendered = js.Any.fromFunction1(remove_resultRendered), render = js.Any.fromFunction0(render), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentResultTableCollection = js.Any.fromFunction1(set_currentResultTableCollection), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_emptyMessage = js.Any.fromFunction1(set_emptyMessage), set_id = js.Any.fromFunction1(set_id), set_messages = js.Any.fromFunction1(set_messages), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_renderedResult = js.Any.fromFunction1(set_renderedResult), set_shouldShowNoResultMessage = js.Any.fromFunction1(set_shouldShowNoResultMessage), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_states = js.Any.fromFunction1(set_states), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[DisplayControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayControl] (val x: Self) extends AnyVal {
    
    inline def setAdd_oneTimeResultRendered(value: Any => Unit): Self = StObject.set(x, "add_oneTimeResultRendered", js.Any.fromFunction1(value))
    
    inline def setAdd_queryReady(value: Any => Unit): Self = StObject.set(x, "add_queryReady", js.Any.fromFunction1(value))
    
    inline def setAdd_resultRendered(value: Any => Unit): Self = StObject.set(x, "add_resultRendered", js.Any.fromFunction1(value))
    
    inline def setDataProvider_QueryIssuing(value: (Any, Any) => Unit): Self = StObject.set(x, "dataProvider_QueryIssuing", js.Any.fromFunction2(value))
    
    inline def setDataProvider_ResultReady(value: (Any, Any) => Unit): Self = StObject.set(x, "dataProvider_ResultReady", js.Any.fromFunction2(value))
    
    inline def setGet_currentResultTableCollection(value: () => Any): Self = StObject.set(x, "get_currentResultTableCollection", js.Any.fromFunction0(value))
    
    inline def setGet_dataProvider(value: () => DataProvider): Self = StObject.set(x, "get_dataProvider", js.Any.fromFunction0(value))
    
    inline def setGet_emptyMessage(value: () => String): Self = StObject.set(x, "get_emptyMessage", js.Any.fromFunction0(value))
    
    inline def setGet_queryGroupName(value: () => String): Self = StObject.set(x, "get_queryGroupName", js.Any.fromFunction0(value))
    
    inline def setGet_renderedResult(value: () => Boolean): Self = StObject.set(x, "get_renderedResult", js.Any.fromFunction0(value))
    
    inline def setGet_shouldShowNoResultMessage(value: () => Boolean): Self = StObject.set(x, "get_shouldShowNoResultMessage", js.Any.fromFunction0(value))
    
    inline def setProcessQueryIssuing(value: Any => Unit): Self = StObject.set(x, "processQueryIssuing", js.Any.fromFunction1(value))
    
    inline def setProcessResultReady(value: Any => Unit): Self = StObject.set(x, "processResultReady", js.Any.fromFunction1(value))
    
    inline def setRaiseOneTimeResultRenderedEvent(value: Any => Unit): Self = StObject.set(x, "raiseOneTimeResultRenderedEvent", js.Any.fromFunction1(value))
    
    inline def setRaiseQueryReadyEvent(value: Any => Unit): Self = StObject.set(x, "raiseQueryReadyEvent", js.Any.fromFunction1(value))
    
    inline def setRaiseResultRenderedEvent(value: Any => Unit): Self = StObject.set(x, "raiseResultRenderedEvent", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: Any => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    
    inline def setRemove_oneTimeResultRendered(value: Any => Unit): Self = StObject.set(x, "remove_oneTimeResultRendered", js.Any.fromFunction1(value))
    
    inline def setRemove_queryReady(value: Any => Unit): Self = StObject.set(x, "remove_queryReady", js.Any.fromFunction1(value))
    
    inline def setRemove_resultRendered(value: Any => Unit): Self = StObject.set(x, "remove_resultRendered", js.Any.fromFunction1(value))
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setSet_currentResultTableCollection(value: Any => Any): Self = StObject.set(x, "set_currentResultTableCollection", js.Any.fromFunction1(value))
    
    inline def setSet_emptyMessage(value: String => String): Self = StObject.set(x, "set_emptyMessage", js.Any.fromFunction1(value))
    
    inline def setSet_queryGroupName(value: String => String): Self = StObject.set(x, "set_queryGroupName", js.Any.fromFunction1(value))
    
    inline def setSet_renderedResult(value: Boolean => Boolean): Self = StObject.set(x, "set_renderedResult", js.Any.fromFunction1(value))
    
    inline def setSet_shouldShowNoResultMessage(value: Boolean => Boolean): Self = StObject.set(x, "set_shouldShowNoResultMessage", js.Any.fromFunction1(value))
  }
}
