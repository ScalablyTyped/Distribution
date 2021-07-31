package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushMessaging {
  
  @JSImport("sinon-chrome", "pushMessaging")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "pushMessaging.getChannelId")
  @js.native
  def getChannelId: SinonChromeStub = js.native
  @scala.inline
  def getChannelId_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getChannelId")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "pushMessaging.onMessage")
  @js.native
  def onMessage: Event = js.native
  @scala.inline
  def onMessage_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
}
