package typings.puppeteer.mod

import typings.puppeteer.anon.MetricsTitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageEventObject extends StObject {
  
  var console: ConsoleMessage
  
  var dialog: Dialog
  
  var error: js.Error
  
  var frameattached: Frame
  
  var framedetached: Frame
  
  var framenavigated: Frame
  
  var metrics: MetricsTitle
  
  var pageerror: js.Error
  
  var popup: Page
  
  var request: HTTPRequest
  
  var requestfailed: HTTPRequest
  
  var requestfinished: HTTPRequest
  
  var requestservedfromcache: HTTPRequest
  
  var response: HTTPResponse
  
  var workercreated: WebWorker
  
  var workerdestroyed: WebWorker
}
object PageEventObject {
  
  inline def apply(
    console: ConsoleMessage,
    dialog: Dialog,
    error: js.Error,
    frameattached: Frame,
    framedetached: Frame,
    framenavigated: Frame,
    metrics: MetricsTitle,
    pageerror: js.Error,
    popup: Page,
    request: HTTPRequest,
    requestfailed: HTTPRequest,
    requestfinished: HTTPRequest,
    requestservedfromcache: HTTPRequest,
    response: HTTPResponse,
    workercreated: WebWorker,
    workerdestroyed: WebWorker
  ): PageEventObject = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], frameattached = frameattached.asInstanceOf[js.Any], framedetached = framedetached.asInstanceOf[js.Any], framenavigated = framenavigated.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], pageerror = pageerror.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestfailed = requestfailed.asInstanceOf[js.Any], requestfinished = requestfinished.asInstanceOf[js.Any], requestservedfromcache = requestservedfromcache.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], workercreated = workercreated.asInstanceOf[js.Any], workerdestroyed = workerdestroyed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageEventObject]
  }
  
  extension [Self <: PageEventObject](x: Self) {
    
    inline def setConsole(value: ConsoleMessage): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFrameattached(value: Frame): Self = StObject.set(x, "frameattached", value.asInstanceOf[js.Any])
    
    inline def setFramedetached(value: Frame): Self = StObject.set(x, "framedetached", value.asInstanceOf[js.Any])
    
    inline def setFramenavigated(value: Frame): Self = StObject.set(x, "framenavigated", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: MetricsTitle): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setPageerror(value: js.Error): Self = StObject.set(x, "pageerror", value.asInstanceOf[js.Any])
    
    inline def setPopup(value: Page): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: HTTPRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestfailed(value: HTTPRequest): Self = StObject.set(x, "requestfailed", value.asInstanceOf[js.Any])
    
    inline def setRequestfinished(value: HTTPRequest): Self = StObject.set(x, "requestfinished", value.asInstanceOf[js.Any])
    
    inline def setRequestservedfromcache(value: HTTPRequest): Self = StObject.set(x, "requestservedfromcache", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: HTTPResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setWorkercreated(value: WebWorker): Self = StObject.set(x, "workercreated", value.asInstanceOf[js.Any])
    
    inline def setWorkerdestroyed(value: WebWorker): Self = StObject.set(x, "workerdestroyed", value.asInstanceOf[js.Any])
  }
}
