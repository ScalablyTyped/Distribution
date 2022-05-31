package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcm {
  
  @JSGlobal("SinonChrome.gcm")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.gcm.onMessage")
  @js.native
  def onMessage: Event = js.native
  inline def onMessage_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.gcm.onMessagesDeleted")
  @js.native
  def onMessagesDeleted: Event = js.native
  inline def onMessagesDeleted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessagesDeleted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.gcm.onSendError")
  @js.native
  def onSendError: Event = js.native
  inline def onSendError_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSendError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.gcm.register")
  @js.native
  def register: SinonChromeStub = js.native
  inline def register_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.gcm.send")
  @js.native
  def send: SinonChromeStub = js.native
  inline def send_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("send")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.gcm.unregister")
  @js.native
  def unregister: SinonChromeStub = js.native
  inline def unregister_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unregister")(x.asInstanceOf[js.Any])
}
