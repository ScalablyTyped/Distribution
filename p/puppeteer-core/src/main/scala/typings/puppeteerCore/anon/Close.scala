package typings.puppeteerCore.anon

import typings.puppeteerCore.puppeteerCoreStrings.close
import typings.puppeteerCore.puppeteerCoreStrings.console
import typings.puppeteerCore.puppeteerCoreStrings.dialog
import typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
import typings.puppeteerCore.puppeteerCoreStrings.error
import typings.puppeteerCore.puppeteerCoreStrings.frameattached
import typings.puppeteerCore.puppeteerCoreStrings.framedetached
import typings.puppeteerCore.puppeteerCoreStrings.framenavigated
import typings.puppeteerCore.puppeteerCoreStrings.load
import typings.puppeteerCore.puppeteerCoreStrings.metrics
import typings.puppeteerCore.puppeteerCoreStrings.pageerror
import typings.puppeteerCore.puppeteerCoreStrings.popup
import typings.puppeteerCore.puppeteerCoreStrings.request
import typings.puppeteerCore.puppeteerCoreStrings.requestfailed
import typings.puppeteerCore.puppeteerCoreStrings.requestfinished
import typings.puppeteerCore.puppeteerCoreStrings.response
import typings.puppeteerCore.puppeteerCoreStrings.workercreated
import typings.puppeteerCore.puppeteerCoreStrings.workerdestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  val Close: close
  
  val Console: console
  
  val DOMContentLoaded: domcontentloaded_
  
  val Dialog: dialog
  
  val Error: error
  
  val FrameAttached: frameattached
  
  val FrameDetached: framedetached
  
  val FrameNavigated: framenavigated
  
  val Load: load
  
  val Metrics: metrics
  
  val PageError: pageerror
  
  val Popup: popup
  
  val Request: request
  
  val RequestFailed: requestfailed
  
  val RequestFinished: requestfinished
  
  val Response: response
  
  val WorkerCreated: workercreated
  
  val WorkerDestroyed: workerdestroyed
}
object Close {
  
  @scala.inline
  def apply(): Close = {
    val __obj = js.Dynamic.literal(Close = "close", Console = "console", DOMContentLoaded = "domcontentloaded", Dialog = "dialog", Error = "error", FrameAttached = "frameattached", FrameDetached = "framedetached", FrameNavigated = "framenavigated", Load = "load", Metrics = "metrics", PageError = "pageerror", Popup = "popup", Request = "request", RequestFailed = "requestfailed", RequestFinished = "requestfinished", Response = "response", WorkerCreated = "workercreated", WorkerDestroyed = "workerdestroyed")
    __obj.asInstanceOf[Close]
  }
  
  @scala.inline
  implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: close): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsole(value: console): Self = StObject.set(x, "Console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMContentLoaded(value: domcontentloaded_): Self = StObject.set(x, "DOMContentLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog(value: dialog): Self = StObject.set(x, "Dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: error): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameAttached(value: frameattached): Self = StObject.set(x, "FrameAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameDetached(value: framedetached): Self = StObject.set(x, "FrameDetached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameNavigated(value: framenavigated): Self = StObject.set(x, "FrameNavigated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: load): Self = StObject.set(x, "Load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageError(value: pageerror): Self = StObject.set(x, "PageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: popup): Self = StObject.set(x, "Popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: request): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFailed(value: requestfailed): Self = StObject.set(x, "RequestFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFinished(value: requestfinished): Self = StObject.set(x, "RequestFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: response): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerCreated(value: workercreated): Self = StObject.set(x, "WorkerCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerDestroyed(value: workerdestroyed): Self = StObject.set(x, "WorkerDestroyed", value.asInstanceOf[js.Any])
  }
}
