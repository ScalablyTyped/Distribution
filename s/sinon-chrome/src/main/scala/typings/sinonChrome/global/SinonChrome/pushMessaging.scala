package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushMessaging {
  
  @JSGlobal("SinonChrome.pushMessaging")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.pushMessaging.getChannelId")
  @js.native
  def getChannelId: SinonChromeStub = js.native
  inline def getChannelId_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getChannelId")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.pushMessaging.onMessage")
  @js.native
  def onMessage: Event = js.native
  inline def onMessage_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
}
