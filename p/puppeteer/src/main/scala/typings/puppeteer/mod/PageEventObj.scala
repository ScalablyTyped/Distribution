package typings.puppeteer.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageEventObj extends StObject {
  
  /** Emitted when the page closes. */
  var close: Unit
  
  /**
    * Emitted when JavaScript within the page calls one of console API methods, e.g. console.log or console.dir.
    * Also emitted if the page throws an error or a warning.
    */
  var console: ConsoleMessage
  
  /**
    * Emitted when a JavaScript dialog appears, such as alert, prompt, confirm or beforeunload.
    * Puppeteer can respond to the dialog via Dialog's accept or dismiss methods.
    */
  var dialog: Dialog
  
  /** Emitted when the page crashes. */
  var error: Error
  
  /** Emitted when a frame is attached. */
  var frameattached: Frame
  
  /** Emitted when a frame is detached. */
  var framedetached: Frame
  
  /** Emitted when a frame is navigated to a new url. */
  var framenavigated: Frame
  
  /** Emitted when the JavaScript load event is dispatched. */
  var load: Unit
  
  /**
    * Emitted when the JavaScript code makes a call to `console.timeStamp`.
    * For the list of metrics see `page.metrics`.
    */
  var metrics: typings.puppeteer.anon.Metrics
  
  /** Emitted when an uncaught exception happens within the page. */
  var pageerror: Error
  
  /** Emitted when the page opens a new tab or window. */
  var popup: Page
  
  /**
    * Emitted when a page issues a request. The request object is read-only.
    * In order to intercept and mutate requests, see page.setRequestInterceptionEnabled.
    */
  var request: Request
  
  /** Emitted when a request fails, for example by timing out. */
  var requestfailed: Request
  
  /** Emitted when a request finishes successfully. */
  var requestfinished: Request
  
  /** Emitted when a response is received. */
  var response: Response
  
  /** Emitted when a dedicated WebWorker is spawned by the page. */
  var workercreated: Worker
  
  /** Emitted when a dedicated WebWorker is terminated. */
  var workerdestroyed: Worker
}
object PageEventObj {
  
  inline def apply(
    close: Unit,
    console: ConsoleMessage,
    dialog: Dialog,
    error: Error,
    frameattached: Frame,
    framedetached: Frame,
    framenavigated: Frame,
    load: Unit,
    metrics: typings.puppeteer.anon.Metrics,
    pageerror: Error,
    popup: Page,
    request: Request,
    requestfailed: Request,
    requestfinished: Request,
    response: Response,
    workercreated: Worker,
    workerdestroyed: Worker
  ): PageEventObj = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], frameattached = frameattached.asInstanceOf[js.Any], framedetached = framedetached.asInstanceOf[js.Any], framenavigated = framenavigated.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], pageerror = pageerror.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestfailed = requestfailed.asInstanceOf[js.Any], requestfinished = requestfinished.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], workercreated = workercreated.asInstanceOf[js.Any], workerdestroyed = workerdestroyed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageEventObj]
  }
  
  extension [Self <: PageEventObj](x: Self) {
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setConsole(value: ConsoleMessage): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFrameattached(value: Frame): Self = StObject.set(x, "frameattached", value.asInstanceOf[js.Any])
    
    inline def setFramedetached(value: Frame): Self = StObject.set(x, "framedetached", value.asInstanceOf[js.Any])
    
    inline def setFramenavigated(value: Frame): Self = StObject.set(x, "framenavigated", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: Unit): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: typings.puppeteer.anon.Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setPageerror(value: Error): Self = StObject.set(x, "pageerror", value.asInstanceOf[js.Any])
    
    inline def setPopup(value: Page): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestfailed(value: Request): Self = StObject.set(x, "requestfailed", value.asInstanceOf[js.Any])
    
    inline def setRequestfinished(value: Request): Self = StObject.set(x, "requestfinished", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setWorkercreated(value: Worker): Self = StObject.set(x, "workercreated", value.asInstanceOf[js.Any])
    
    inline def setWorkerdestroyed(value: Worker): Self = StObject.set(x, "workerdestroyed", value.asInstanceOf[js.Any])
  }
}
