package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.SinonChromeStub
import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessions {
  
  @JSGlobal("SinonChrome.sessions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.sessions.getDevices")
  @js.native
  def getDevices: SinonChromeStub = js.native
  inline def getDevices_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDevices")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.sessions.getRecentlyClosed")
  @js.native
  def getRecentlyClosed: SinonChromeStub = js.native
  inline def getRecentlyClosed_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRecentlyClosed")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.sessions.onChanged")
  @js.native
  def onChanged: Event = js.native
  inline def onChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.sessions.restore")
  @js.native
  def restore: SinonChromeStub = js.native
  inline def restore_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restore")(x.asInstanceOf[js.Any])
}
