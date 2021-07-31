package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcm {
  
  @JSImport("sinon-chrome", "gcm")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "gcm.onMessage")
  @js.native
  def onMessage: Event = js.native
  @scala.inline
  def onMessage_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "gcm.onMessagesDeleted")
  @js.native
  def onMessagesDeleted: Event = js.native
  @scala.inline
  def onMessagesDeleted_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessagesDeleted")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "gcm.onSendError")
  @js.native
  def onSendError: Event = js.native
  @scala.inline
  def onSendError_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSendError")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "gcm.register")
  @js.native
  def register: SinonChromeStub = js.native
  @scala.inline
  def register_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "gcm.send")
  @js.native
  def send: SinonChromeStub = js.native
  @scala.inline
  def send_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("send")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "gcm.unregister")
  @js.native
  def unregister: SinonChromeStub = js.native
  @scala.inline
  def unregister_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unregister")(x.asInstanceOf[js.Any])
}
