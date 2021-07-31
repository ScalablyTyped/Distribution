package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webRequest {
  
  @JSImport("sinon-chrome", "webRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "webRequest.handlerBehaviorChanged")
  @js.native
  def handlerBehaviorChanged: SinonChromeStub = js.native
  @scala.inline
  def handlerBehaviorChanged_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handlerBehaviorChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onAuthRequired")
  @js.native
  def onAuthRequired: Event = js.native
  @scala.inline
  def onAuthRequired_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAuthRequired")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onBeforeRedirect")
  @js.native
  def onBeforeRedirect: Event = js.native
  @scala.inline
  def onBeforeRedirect_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRedirect")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onBeforeRequest")
  @js.native
  def onBeforeRequest: Event = js.native
  @scala.inline
  def onBeforeRequest_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRequest")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onBeforeSendHeaders")
  @js.native
  def onBeforeSendHeaders: Event = js.native
  @scala.inline
  def onBeforeSendHeaders_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSendHeaders")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onCompleted")
  @js.native
  def onCompleted: Event = js.native
  @scala.inline
  def onCompleted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onErrorOccurred")
  @js.native
  def onErrorOccurred: Event = js.native
  @scala.inline
  def onErrorOccurred_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccurred")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onHeadersReceived")
  @js.native
  def onHeadersReceived: Event = js.native
  @scala.inline
  def onHeadersReceived_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHeadersReceived")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onResponseStarted")
  @js.native
  def onResponseStarted: Event = js.native
  @scala.inline
  def onResponseStarted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponseStarted")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "webRequest.onSendHeaders")
  @js.native
  def onSendHeaders: Event = js.native
  @scala.inline
  def onSendHeaders_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSendHeaders")(x.asInstanceOf[js.Any])
}
