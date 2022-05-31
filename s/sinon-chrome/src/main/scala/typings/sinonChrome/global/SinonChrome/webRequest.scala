package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webRequest {
  
  @JSGlobal("SinonChrome.webRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.webRequest.handlerBehaviorChanged")
  @js.native
  def handlerBehaviorChanged: SinonChromeStub = js.native
  inline def handlerBehaviorChanged_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handlerBehaviorChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onAuthRequired")
  @js.native
  def onAuthRequired: Event = js.native
  inline def onAuthRequired_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAuthRequired")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onBeforeRedirect")
  @js.native
  def onBeforeRedirect: Event = js.native
  inline def onBeforeRedirect_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRedirect")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onBeforeRequest")
  @js.native
  def onBeforeRequest: Event = js.native
  inline def onBeforeRequest_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRequest")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onBeforeSendHeaders")
  @js.native
  def onBeforeSendHeaders: Event = js.native
  inline def onBeforeSendHeaders_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSendHeaders")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onCompleted")
  @js.native
  def onCompleted: Event = js.native
  inline def onCompleted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onErrorOccurred")
  @js.native
  def onErrorOccurred: Event = js.native
  inline def onErrorOccurred_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccurred")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onHeadersReceived")
  @js.native
  def onHeadersReceived: Event = js.native
  inline def onHeadersReceived_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHeadersReceived")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onResponseStarted")
  @js.native
  def onResponseStarted: Event = js.native
  inline def onResponseStarted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponseStarted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.webRequest.onSendHeaders")
  @js.native
  def onSendHeaders: Event = js.native
  inline def onSendHeaders_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSendHeaders")(x.asInstanceOf[js.Any])
}
